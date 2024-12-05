package nablarch.tool.openapi.codegen;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import nablarch.tool.openapi.codegen.test.GeneratorAssertions;
import nablarch.tool.openapi.codegen.test.JavaNablarchJaxrsServerCodegenOpenApi30TestSupport;
import org.junit.Test;
import org.openapitools.codegen.ClientOptInput;
import org.openapitools.codegen.DefaultGenerator;
import org.openapitools.codegen.config.CodegenConfigurator;

/**
 * OpenAPIで利用可能なデータ型、フォーマットに対する{@link JavaNablarchJaxrsServerCodegen}の振る舞いを確認するテストクラス。
 */
public class DataTypeVariationTest extends JavaNablarchJaxrsServerCodegenOpenApi30TestSupport {
    /**
     * 明示的にサポートする全データ型、フォーマットの組み合わせの出力結果を確認する
     */
    @Test
    public void allDataTypes() {
        Map<String, Object> properties = new HashMap<>();

        File output = createGeneratorOutputDirectory();

        CodegenConfigurator configurator = new CodegenConfigurator()
                .setGeneratorName(GENERATOR_NAME)
                .setAdditionalProperties(properties)
                .setInputSpec(getTestClassResourcePath("all_data_types.yaml"))
                .setOutputDir(output.getAbsolutePath());

        ClientOptInput clientOptInput = configurator.toClientOptInput();
        DefaultGenerator generator = new DefaultGenerator();
        List<File> generatedFiles = generator.opts(clientOptInput).generate();

        String[] expectedGenerateFiles = {
                "src/gen/java/org/openapitools/api/DataTypesApi.java",
                "src/gen/java/org/openapitools/model/DataTypeRequest.java",
                "src/gen/java/org/openapitools/model/DataSubTypeRequest.java",
                "src/gen/java/org/openapitools/model/DataTypeResponse.java",
                "src/gen/java/org/openapitools/model/DataSubTypeResponse.java"
        };

        // 生成されたファイルが存在することを確認
        GeneratorAssertions.assertExistsFiles(
                output,
                generatedFiles,
                mergeSupportFilesDocumentSpecifiedFiles(expectedGenerateFiles)
        );
        // 生成されたJavaソースコードが正しい構文であることを確認
        GeneratorAssertions.assertValidJavaSourceSyntax(generatedFiles);

        // サポートファイルを除いた生成されたファイルのリストを作成
        List<File> generatedFilesExcludeSupportFiles = excludeSupportFiles(generatedFiles);

        // 生成されたファイルと期待値を比較して、内容が一致することを確認
        for (File generateFile : generatedFilesExcludeSupportFiles) {
            GeneratorAssertions.assertEqualsFileContents(
                    generateFile,
                    getExpectedResourceFile(output, generateFile),
                    IGNORE_GENERATED_ANNOTATION_PATTERN
            );
        }
    }

    /**
     * 明示的にサポートすることも謳わないデータ型、フォーマットも含めて、全データ型、フォーマットの組み合わせの出力結果を確認する。
     * <p>
     * ただしデータ型が{@code string}、フォーマットが{@code binary}の場合は明確に未サポートなので除く。
     */
    @Test
    public void allDataTypesIncludedUnofficialSupportedTypes() {
        Map<String, Object> properties = new HashMap<>();

        File output = createGeneratorOutputDirectory();

        CodegenConfigurator configurator = new CodegenConfigurator()
                .setGeneratorName(GENERATOR_NAME)
                .setAdditionalProperties(properties)
                .setInputSpec(getTestClassResourcePath("all_data_types_included_unofficial_supported_types.yaml"))
                .setOutputDir(output.getAbsolutePath());

        ClientOptInput clientOptInput = configurator.toClientOptInput();
        DefaultGenerator generator = new DefaultGenerator();
        List<File> generatedFiles = generator.opts(clientOptInput).generate();

        String[] expectedGenerateFiles = {
                "src/gen/java/org/openapitools/api/DataTypesApi.java",
                "src/gen/java/org/openapitools/model/DataTypeRequest.java",
                "src/gen/java/org/openapitools/model/DataSubTypeRequest.java",
                "src/gen/java/org/openapitools/model/DataTypeResponse.java",
                "src/gen/java/org/openapitools/model/DataSubTypeResponse.java"
        };

        // 生成されたファイルが存在することを確認
        GeneratorAssertions.assertExistsFiles(
                output,
                generatedFiles,
                mergeSupportFilesDocumentSpecifiedFiles(expectedGenerateFiles)
        );
        // 生成されたJavaソースコードが正しい構文であることを確認
        GeneratorAssertions.assertValidJavaSourceSyntax(generatedFiles);

        // サポートファイルを除いた生成されたファイルのリストを作成
        List<File> generatedFilesExcludeSupportFiles = excludeSupportFiles(generatedFiles);

        // 生成されたファイルと期待値を比較して、内容が一致することを確認
        for (File generateFile : generatedFilesExcludeSupportFiles) {
            GeneratorAssertions.assertEqualsFileContents(
                    generateFile,
                    getExpectedResourceFile(output, generateFile),
                    IGNORE_GENERATED_ANNOTATION_PATTERN
            );
        }
    }

    /**
     * プリミティブ型のプロパティを文字列型として扱う設定でサポートする全データ型、フォーマットの組み合わせの出力結果を確認する。
     */
    @Test
    public void allDataTypesPrimitivePropertiesAsString() {
        Map<String, Object> properties = new HashMap<>();
        properties.put("primitivePropertiesAsString", true);

        File output = createGeneratorOutputDirectory();

        CodegenConfigurator configurator = new CodegenConfigurator()
                .setGeneratorName(GENERATOR_NAME)
                .setAdditionalProperties(properties)
                .setInputSpec(getTestClassResourcePath("all_data_types.yaml"))
                .setOutputDir(output.getAbsolutePath());

        ClientOptInput clientOptInput = configurator.toClientOptInput();
        DefaultGenerator generator = new DefaultGenerator();
        List<File> generatedFiles = generator.opts(clientOptInput).generate();

        String[] expectedGenerateFiles = {
                "src/gen/java/org/openapitools/api/DataTypesApi.java",
                "src/gen/java/org/openapitools/model/DataTypeRequest.java",
                "src/gen/java/org/openapitools/model/DataSubTypeRequest.java",
                "src/gen/java/org/openapitools/model/DataTypeResponse.java",
                "src/gen/java/org/openapitools/model/DataSubTypeResponse.java"
        };

        // 生成されたファイルが存在することを確認
        GeneratorAssertions.assertExistsFiles(
                output,
                generatedFiles,
                mergeSupportFilesDocumentSpecifiedFiles(expectedGenerateFiles)
        );
        // 生成されたJavaソースコードが正しい構文であることを確認
        GeneratorAssertions.assertValidJavaSourceSyntax(generatedFiles);

        // サポートファイルを除いた生成されたファイルのリストを作成
        List<File> generatedFilesExcludeSupportFiles = excludeSupportFiles(generatedFiles);

        // 生成されたファイルと期待値を比較して、内容が一致することを確認
        for (File generateFile : generatedFilesExcludeSupportFiles) {
            GeneratorAssertions.assertEqualsFileContents(
                    generateFile,
                    getExpectedResourceFile(output, generateFile),
                    IGNORE_GENERATED_ANNOTATION_PATTERN
            );
        }
    }

    /**
     * メディアタイプがmultipart/form-dataではなく、リクエスト内にデータ型が{@code string}、フォーマットが{@code binary}のフィールドを含む場合、
     * 生成に失敗することを確認する
     */
    @Test
    public void unsupportedBinaryFormatRequest() {
        Map<String, Object> properties = new HashMap<>();

        File output = createGeneratorOutputDirectory();

        CodegenConfigurator configurator = new CodegenConfigurator()
                .setGeneratorName(GENERATOR_NAME)
                .setAdditionalProperties(properties)
                .setInputSpec(getTestClassResourcePath("all_data_types_with_binary_request.yaml"))
                .setOutputDir(output.getAbsolutePath());

        ClientOptInput clientOptInput = configurator.toClientOptInput();
        DefaultGenerator generator = new DefaultGenerator();

        try {
            generator.opts(clientOptInput).generate();

            fail();
        } catch (RuntimeException e) {
            assertTrue(e.getMessage().contains("Please make sure that your schema is correct!"));

            assertTrue(e.getCause() instanceof UnsupportedOperationException);
            assertEquals("property type: string and format: binary are not supported", e.getCause().getMessage());
        }
    }

    /**
     * レスポンス内にデータ型が{@code string}、フォーマットが{@code binary}のフィールドを含む場合、生成に失敗することを確認する。
     */
    @Test
    public void unsupportedBinaryFormatResponse() {
        Map<String, Object> properties = new HashMap<>();

        File output = createGeneratorOutputDirectory();

        CodegenConfigurator configurator = new CodegenConfigurator()
                .setGeneratorName(GENERATOR_NAME)
                .setAdditionalProperties(properties)
                .setInputSpec(getTestClassResourcePath("all_data_types_with_binary_response.yaml"))
                .setOutputDir(output.getAbsolutePath());

        ClientOptInput clientOptInput = configurator.toClientOptInput();
        DefaultGenerator generator = new DefaultGenerator();

        try {
            generator.opts(clientOptInput).generate();

            fail();
        } catch (RuntimeException e) {
            assertTrue(e.getMessage().contains("Please make sure that your schema is correct!"));

            assertTrue(e.getCause() instanceof UnsupportedOperationException);
            assertEquals("property type: string and format: binary are not supported", e.getCause().getMessage());
        }
    }

    /**
     * リクエストでフォーマットが{@code binary}のフィールドを指定してもエラーにならないことを確認する。
     * <p>
     * なお、モデルは生成されない。
     */
    @Test
    public void includeMultipartBinaryFormatRequest() {
        Map<String, Object> properties = new HashMap<>();

        File output = createGeneratorOutputDirectory();

        CodegenConfigurator configurator = new CodegenConfigurator()
                .setGeneratorName(GENERATOR_NAME)
                .setAdditionalProperties(properties)
                .setInputSpec(getTestClassResourcePath("all_data_types_with_multipart_binary_request.yaml"))
                .setOutputDir(output.getAbsolutePath());

        ClientOptInput clientOptInput = configurator.toClientOptInput();
        DefaultGenerator generator = new DefaultGenerator();
        List<File> generatedFiles = generator.opts(clientOptInput).generate();

        String[] expectedGenerateFiles = {
                "src/gen/java/org/openapitools/api/DataTypesApi.java",
                // multipart/form-dataのみで設定されたモデルは生成されなくなる
                // "src/gen/java/org/openapitools/model/DataTypeRequest.java",
                "src/gen/java/org/openapitools/model/DataSubTypeRequest.java",
                "src/gen/java/org/openapitools/model/DataTypeResponse.java",
                "src/gen/java/org/openapitools/model/DataSubTypeResponse.java"
        };

        // 生成されたファイルが存在することを確認
        GeneratorAssertions.assertExistsFiles(
                output,
                generatedFiles,
                mergeSupportFilesDocumentSpecifiedFiles(expectedGenerateFiles)
        );
        // 生成されたJavaソースコードが正しい構文であることを確認
        GeneratorAssertions.assertValidJavaSourceSyntax(generatedFiles);

        // サポートファイルを除いた生成されたファイルのリストを作成
        List<File> generatedFilesExcludeSupportFiles = excludeSupportFiles(generatedFiles);

        // 生成されたファイルと期待値を比較して、内容が一致することを確認
        for (File generateFile : generatedFilesExcludeSupportFiles) {
            GeneratorAssertions.assertEqualsFileContents(
                    generateFile,
                    getExpectedResourceFile(output, generateFile),
                    IGNORE_GENERATED_ANNOTATION_PATTERN
            );
        }
    }

    /**
     * メディアタイプに明示的に{@code multipart/form-data}を指定した場合、データ型が{@code string}、フォーマットに
     * {@code binary}のフィールドを指定してもエラーになることを確認する。
     * <p>
     * リクエストと異なり、レスポンスでのマルチパートはサポートしない。
     */
    @Test
    public void unsupportedMultipartWithBinaryFormatResponse() {
        Map<String, Object> properties = new HashMap<>();

        File output = createGeneratorOutputDirectory();

        CodegenConfigurator configurator = new CodegenConfigurator()
                .setGeneratorName(GENERATOR_NAME)
                .setAdditionalProperties(properties)
                .setInputSpec(getTestClassResourcePath("all_data_types_with_multipart_binary_response.yaml"))
                .setOutputDir(output.getAbsolutePath());

        ClientOptInput clientOptInput = configurator.toClientOptInput();
        DefaultGenerator generator = new DefaultGenerator();

        try {
            generator.opts(clientOptInput).generate();

            fail();
        } catch (RuntimeException e) {
            System.out.println((e.getMessage()));
            assertTrue(e.getMessage().contains("Could not process operation"));

            assertTrue(e.getCause() instanceof UnsupportedOperationException);
            assertEquals("property type: string and format: binary are not supported", e.getCause().getMessage());
        }
    }

    /**
     * ファイルダウンロード向けのレスポンス定義を処理できることを確認する。
     */
    @Test
    public void supportFileDownload() {
        Map<String, Object> properties = new HashMap<>();

        File output = createGeneratorOutputDirectory();

        CodegenConfigurator configurator = new CodegenConfigurator()
                .setGeneratorName(GENERATOR_NAME)
                .setAdditionalProperties(properties)
                .setInputSpec(getTestClassResourcePath("file_download.yaml"))
                .setOutputDir(output.getAbsolutePath());

        ClientOptInput clientOptInput = configurator.toClientOptInput();
        DefaultGenerator generator = new DefaultGenerator();
        List<File> generatedFiles = generator.opts(clientOptInput).generate();

        String[] expectedGenerateFiles = {
                "src/gen/java/org/openapitools/api/DataTypesApi.java"
        };

        // 生成されたファイルが存在することを確認
        GeneratorAssertions.assertExistsFiles(
                output,
                generatedFiles,
                mergeSupportFilesDocumentSpecifiedFiles(expectedGenerateFiles)
        );
        // 生成されたJavaソースコードが正しい構文であることを確認
        GeneratorAssertions.assertValidJavaSourceSyntax(generatedFiles);

        // サポートファイルを除いた生成されたファイルのリストを作成
        List<File> generatedFilesExcludeSupportFiles = excludeSupportFiles(generatedFiles);

        // 生成されたファイルと期待値を比較して、内容が一致することを確認
        for (File generateFile : generatedFilesExcludeSupportFiles) {
            GeneratorAssertions.assertEqualsFileContents(
                    generateFile,
                    getExpectedResourceFile(output, generateFile),
                    IGNORE_GENERATED_ANNOTATION_PATTERN
            );
        }

        List<File> generatedApiFiles = filterApiFiles(generatedFiles, "src/gen/java/org/openapitools/api");

        for (File generatedApiFile : generatedApiFiles) {
            GeneratorAssertions.assertContainsPatterns(
                    generatedApiFile,
                    // メソッドの戻り値がHttpResponseになっている
                    "^    HttpResponse"
            );

            GeneratorAssertions.assertNotContainsPatterns(
                    generatedApiFile,
                    // @Producesアノテーションは出力されない
                    "^    @Produces"
            );
        }
    }
}
