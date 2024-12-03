package nablarch.tool.openapi.codegen.test;

import java.io.File;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import nablarch.tool.openapi.codegen.JavaNablarchJaxrsServerCodegen;
import org.junit.Rule;
import org.junit.rules.TestName;

/**
 * Nablarch JAX-RS用のGeneratorのテストの基底クラス
 */
public abstract class JavaNablarchJaxrsServerCodegenTestSupport {
    protected static final String GENERATOR_NAME = JavaNablarchJaxrsServerCodegen.GENERATOR_NAME;

    // @Generatedアノテーションを無視するための正規表現
    protected static final String IGNORE_GENERATED_ANNOTATION_PATTERN = "^@jakarta\\.annotation\\.Generated\\(value = \"nablarch\\.tool\\.openapi\\.codegen\\.JavaNablarchJaxrsServerCodegen\",.+";

    // Generatorにより自動で生成されるサポートファイル
    protected static final List<String> ALWAYS_GENERATE_SUPPORT_FILES = List.of(
            ".openapi-generator-ignore",
            ".openapi-generator/FILES",
            ".openapi-generator/VERSION"
    );

    @Rule
    public TestName testName = new TestName();

    /**
     * テストクラスが対象とするOpenAPIのバージョンを返却する。テストクラスが使用するリソースを配置するディレクトリパスの一部になる。
     *
     * @return テストクラスが対象とするOpenAPIのバージョン
     */
    public abstract String getVersion();

    /**
     * Generatorの実行結果を出力するディレクトリを作成する。
     *
     * @return Generatorの出力先ディレクトリ
     */
    protected File createGeneratorOutputDirectory() {
        try {
            Path outputDirectoryPath = Path.of("target/oai-gen-test-sources");
            Files.createDirectories(outputDirectoryPath);
            return Files
                    .createTempDirectory(
                            outputDirectoryPath,
                            getClass().getSimpleName() + "-" + testName.getMethodName() + "-"
                    ).toFile();
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    /**
     * パスをプラットフォーム非依存の表現に変換する。
     *
     * @param path パス
     * @return 変換後のパス
     */
    private String toPlatformIndependentPath(String path) {
        return path.replace("\\", "/");
    }

    /**
     * 指定されたファイルのリストから、サポートファイルを除いたリストを作成する。
     *
     * @param files ファイルのリスト
     * @return サポートファイルを除いたファイルのリスト
     */
    protected List<File> excludeSupportFiles(List<File> files) {
        return files.stream()
                .filter(file -> {
                    for (String supportFile : ALWAYS_GENERATE_SUPPORT_FILES) {
                        if (toPlatformIndependentPath(file.getPath()).endsWith(supportFile)) {
                            return false;
                        }
                    }

                    return true;
                })
                .toList();
    }

    /**
     * Generatorで生成したファイルの中から、Api用のファイルのみを抽出する
     *
     * @param generatedFiles Generatorで生成したファイルのリスト
     * @param apiPath Api用のファイルのパス
     * @return Api用のファイルのリスト
     */
    protected List<File> filterApiFiles(List<File> generatedFiles, String apiPath) {
        return generatedFiles
                .stream()
                .filter(file -> toPlatformIndependentPath(file.getPath()).contains(apiPath))
                .toList();
    }

    /**
     * Generatorで生成したファイルの中から、モデル用のファイルのみを抽出する
     *
     * @param generatedFiles Generatorで生成したファイルのリスト
     * @param modelPath モデル用のファイルのパス
     * @return モデル用のファイルのリスト
     */
    protected List<File> filterModelFiles(List<File> generatedFiles, String modelPath) {
        return generatedFiles
                .stream()
                .filter(file -> toPlatformIndependentPath(file.getPath()).contains(modelPath))
                .toList();
    }

    /**
     * Generatorで生成したファイルの中から、指定されたパスに含まれるファイルのみを抽出する
     *
     * @param generatedFiles Generatorで生成したファイルのリスト
     * @param paths 抽出するファイルのパス
     * @return 抽出されたファイルのリスト
     */
    protected List<File> filterFiles(List<File> generatedFiles, String... paths) {
        return generatedFiles
                .stream()
                .filter(file -> {
                    String platformIndependentGeneratedPath = toPlatformIndependentPath(file.getPath());

                    for (String path : paths) {
                        String platformIndependentPath = toPlatformIndependentPath(path);
                        if (platformIndependentGeneratedPath.contains(platformIndependentPath)) {
                            return true;
                        }
                    }

                    return false;
                })
                .toList();
    }

    /**
     * テストクラスに対応するリソースパスを取得する。
     *
     * @param path リソースパス
     * @return テストクラスに対応するリソースパス
     */
    protected String getTestClassResourcePath(String path) {
        return String.format("src/test/resources/%s/%s/%s", getVersion(), getClass().getSimpleName(), path);
    }

    /**
     * 相対パス{@code path}を指定して、テストメソッドに対応する期待値となるファイルを配置したパスに変換する。
     *
     * @param path パス
     * @return 期待値となるファイルを配置したパス
     */
    protected String getExpectedResourcePath(String path) {
        return String.format("src/test/resources/%s/%s/%s/expected/%s", getVersion(), getClass().getSimpleName(), testName.getMethodName(), path);
    }

    /**
     * 出力先ディレクトリとGeneratorで生成したファイルから、対応する期待値となるファイルのパスに変換する
     *
     * @param output 出力先ディレクトリ
     * @param generatedFile Generatorで生成したファイル
     * @return 期待値となるファイルのパス
     */
    protected File getExpectedResourceFile(File output, File generatedFile) {
        String path = output.toPath().toAbsolutePath().relativize(generatedFile.toPath()).toString();
        return new File(String.format("src/test/resources/%s/%s/%s/expected/%s", getVersion(), getClass().getSimpleName(), testName.getMethodName(), path));
    }

    /**
     * 指定されたファイルリストと、常に生成されるサポートファイルをマージする。
     *
     * @param files ファイルリスト
     * @return マージされたファイルリスト
     */
    protected String[] mergeSupportFilesDocumentSpecifiedFiles(String... files) {
        return Stream.concat(
                ALWAYS_GENERATE_SUPPORT_FILES.stream(),
                Arrays.stream(files)
        ).toArray(String[]::new);
    }
}
