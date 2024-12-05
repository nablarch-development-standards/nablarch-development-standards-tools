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
 * {@link JavaNablarchJaxrsServerCodegen}でサポートするオプションをテストするクラス。
 */
public class CodegenOptionsTest extends JavaNablarchJaxrsServerCodegenOpenApi30TestSupport {
    /**
     * ヘルプメッセージの確認
     */
    @Test
    public void help() {
        JavaNablarchJaxrsServerCodegen codegen = new JavaNablarchJaxrsServerCodegen();
        assertEquals("Generates a nablarch-jaxrs server library.", codegen.getHelp());
    }

    /**
     * デフォルトのオプションで実行して生成結果を確認する
     */
    @Test
    public void defaultOptions() {
        Map<String, Object> properties = new HashMap<>();

        File output = createGeneratorOutputDirectory();

        CodegenConfigurator configurator = new CodegenConfigurator()
                .setGeneratorName(GENERATOR_NAME)
                .setAdditionalProperties(properties)
                .setInputSpec(getTestClassResourcePath("projects.yaml"))
                .setOutputDir(output.getAbsolutePath());

        ClientOptInput clientOptInput = configurator.toClientOptInput();
        DefaultGenerator generator = new DefaultGenerator();
        List<File> generatedFiles = generator.opts(clientOptInput).generate();

        String[] expectedGenerateFiles = {
                // パッケージはデフォルト
                "src/gen/java/org/openapitools/api/ProjectsApi.java",
                "src/gen/java/org/openapitools/api/UsersApi.java",
                "src/gen/java/org/openapitools/model/ProjectRequest.java",
                "src/gen/java/org/openapitools/model/ProjectResponse.java",
                "src/gen/java/org/openapitools/model/Client.java",
                "src/gen/java/org/openapitools/model/UserRequest.java",
                "src/gen/java/org/openapitools/model/UserResponse.java",
                "src/gen/java/org/openapitools/model/ErrorResponse.java"
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
     * APIとモデルの出力先パッケージを指定
     */
    @Test
    public void apiAndModelPackage() {
        Map<String, Object> properties = new HashMap<>();
        properties.put("apiPackage", "com.example.someservice.api");
        properties.put("modelPackage", "org.example.testservice.model");

        File output = createGeneratorOutputDirectory();

        CodegenConfigurator configurator = new CodegenConfigurator()
                .setGeneratorName(GENERATOR_NAME)
                .setAdditionalProperties(properties)
                .setInputSpec(getTestClassResourcePath("projects.yaml"))
                .setOutputDir(output.getAbsolutePath());

        ClientOptInput clientOptInput = configurator.toClientOptInput();
        DefaultGenerator generator = new DefaultGenerator();
        List<File> generatedFiles = generator.opts(clientOptInput).generate();

        String[] expectedGenerateFiles = {
                // APIのパッケージが変更されている
                "src/gen/java/com/example/someservice/api/ProjectsApi.java",
                "src/gen/java/com/example/someservice/api/UsersApi.java",
                // モデルのパッケージが変更されている
                "src/gen/java/org/example/testservice/model/ProjectRequest.java",
                "src/gen/java/org/example/testservice/model/ProjectResponse.java",
                "src/gen/java/org/example/testservice/model/Client.java",
                "src/gen/java/org/example/testservice/model/UserRequest.java",
                "src/gen/java/org/example/testservice/model/UserResponse.java",
                "src/gen/java/org/example/testservice/model/ErrorResponse.java"
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
     * {@code @Generated}の{@code date}属性（生成日時）の出力を抑制
     */
    @Test
    public void hideGenerationTimestamp() {
        Map<String, Object> properties = new HashMap<>();
        properties.put("hideGenerationTimestamp", true);

        File output = createGeneratorOutputDirectory();

        CodegenConfigurator configurator = new CodegenConfigurator()
                .setGeneratorName(GENERATOR_NAME)
                .setAdditionalProperties(properties)
                .setInputSpec(getTestClassResourcePath("projects.yaml"))
                .setOutputDir(output.getAbsolutePath());

        ClientOptInput clientOptInput = configurator.toClientOptInput();
        DefaultGenerator generator = new DefaultGenerator();
        List<File> generatedFiles = generator.opts(clientOptInput).generate();

        String[] expectedGenerateFiles = {
                "src/gen/java/org/openapitools/api/ProjectsApi.java",
                "src/gen/java/org/openapitools/api/UsersApi.java",
                "src/gen/java/org/openapitools/model/ProjectRequest.java",
                "src/gen/java/org/openapitools/model/ProjectResponse.java",
                "src/gen/java/org/openapitools/model/Client.java",
                "src/gen/java/org/openapitools/model/UserRequest.java",
                "src/gen/java/org/openapitools/model/UserResponse.java",
                "src/gen/java/org/openapitools/model/ErrorResponse.java"
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

            GeneratorAssertions.assertNotContainsPatterns(
                    generateFile,
                    // @Generatedのdate属性は出力されなくなる
                    "^@jakarta\\.annotation\\.Generated\\(.+ date = \".+\".+, .+"
            );
        }
    }

    /**
     * 出力先のフォルダを指定
     */
    @Test
    public void sourceFolder() {
        Map<String, Object> properties = new HashMap<>();
        properties.put("sourceFolder", "src/oai-gen/main/java");

        File output = createGeneratorOutputDirectory();

        CodegenConfigurator configurator = new CodegenConfigurator()
                .setGeneratorName(GENERATOR_NAME)
                .setAdditionalProperties(properties)
                .setInputSpec(getTestClassResourcePath("projects.yaml"))
                .setOutputDir(output.getAbsolutePath());

        ClientOptInput clientOptInput = configurator.toClientOptInput();
        DefaultGenerator generator = new DefaultGenerator();
        List<File> generatedFiles = generator.opts(clientOptInput).generate();

        String[] expectedGenerateFiles = {
                // パッケージはデフォルトで、出力先のフォルダが変更されている
                "src/oai-gen/main/java/org/openapitools/api/ProjectsApi.java",
                "src/oai-gen/main/java/org/openapitools/api/UsersApi.java",
                "src/oai-gen/main/java/org/openapitools/model/ProjectRequest.java",
                "src/oai-gen/main/java/org/openapitools/model/ProjectResponse.java",
                "src/oai-gen/main/java/org/openapitools/model/Client.java",
                "src/oai-gen/main/java/org/openapitools/model/UserRequest.java",
                "src/oai-gen/main/java/org/openapitools/model/UserResponse.java",
                "src/oai-gen/main/java/org/openapitools/model/ErrorResponse.java"
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
     * Apiの生成単位をパスではなくタグにする
     */
    @Test
    public void useTags() {
        Map<String, Object> properties = new HashMap<>();
        properties.put("useTags", true);

        File output = createGeneratorOutputDirectory();

        CodegenConfigurator configurator = new CodegenConfigurator()
                .setGeneratorName(GENERATOR_NAME)
                .setAdditionalProperties(properties)
                .setInputSpec(getTestClassResourcePath("projects.yaml"))
                .setOutputDir(output.getAbsolutePath());

        ClientOptInput clientOptInput = configurator.toClientOptInput();
        DefaultGenerator generator = new DefaultGenerator();
        List<File> generatedFiles = generator.opts(clientOptInput).generate();

        String[] expectedGenerateFiles = {
                // 生成されるApiがタグで分かれるようになる
                "src/gen/java/org/openapitools/api/ProjectReadApi.java",
                "src/gen/java/org/openapitools/api/ProjectWriteApi.java",
                "src/gen/java/org/openapitools/api/ClientReadApi.java",
                "src/gen/java/org/openapitools/api/UserReadApi.java",
                "src/gen/java/org/openapitools/api/UserWriteApi.java",
                // モデルは変化なし
                "src/gen/java/org/openapitools/model/ProjectRequest.java",
                "src/gen/java/org/openapitools/model/ProjectResponse.java",
                "src/gen/java/org/openapitools/model/Client.java",
                "src/gen/java/org/openapitools/model/UserRequest.java",
                "src/gen/java/org/openapitools/model/UserResponse.java",
                "src/gen/java/org/openapitools/model/ErrorResponse.java"
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
     * Apiの生成単位をパスではなくタグにする。エンドポイントには複数のタグを付与している
     */
    @Test
    public void useTagsForMultipleTag() {
        Map<String, Object> properties = new HashMap<>();
        properties.put("useTags", true);

        File output = createGeneratorOutputDirectory();

        CodegenConfigurator configurator = new CodegenConfigurator()
                .setGeneratorName(GENERATOR_NAME)
                .setAdditionalProperties(properties)
                .setInputSpec(getTestClassResourcePath("projects_multiple_tags.yaml"))
                .setOutputDir(output.getAbsolutePath());

        ClientOptInput clientOptInput = configurator.toClientOptInput();
        DefaultGenerator generator = new DefaultGenerator();
        List<File> generatedFiles = generator.opts(clientOptInput).generate();

        String[] expectedGenerateFiles = {
                // 生成されるApiがタグで分かれるようになり、最初に付与したタグでまとめられる
                "src/gen/java/org/openapitools/api/ReadApi.java",
                "src/gen/java/org/openapitools/api/WriteApi.java",
                // モデルは変化なし
                "src/gen/java/org/openapitools/model/ProjectRequest.java",
                "src/gen/java/org/openapitools/model/ProjectResponse.java",
                "src/gen/java/org/openapitools/model/Client.java",
                "src/gen/java/org/openapitools/model/UserRequest.java",
                "src/gen/java/org/openapitools/model/UserResponse.java",
                "src/gen/java/org/openapitools/model/ErrorResponse.java"
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
     * モデルにSerializableインターフェースを実装する。
     */
    @Test
    public void serializableModel() {
        Map<String, Object> properties = new HashMap<>();
        properties.put("serializableModel", true);

        File output = createGeneratorOutputDirectory();

        CodegenConfigurator configurator = new CodegenConfigurator()
                .setGeneratorName(GENERATOR_NAME)
                .setAdditionalProperties(properties)
                .setInputSpec(getTestClassResourcePath("projects.yaml"))
                .setOutputDir(output.getAbsolutePath());

        ClientOptInput clientOptInput = configurator.toClientOptInput();
        DefaultGenerator generator = new DefaultGenerator();
        List<File> generatedFiles = generator.opts(clientOptInput).generate();

        String[] expectedGenerateFiles = {
                "src/gen/java/org/openapitools/api/ProjectsApi.java",
                "src/gen/java/org/openapitools/api/UsersApi.java",
                "src/gen/java/org/openapitools/model/ProjectRequest.java",
                "src/gen/java/org/openapitools/model/ProjectResponse.java",
                "src/gen/java/org/openapitools/model/Client.java",
                "src/gen/java/org/openapitools/model/UserRequest.java",
                "src/gen/java/org/openapitools/model/UserResponse.java",
                "src/gen/java/org/openapitools/model/ErrorResponse.java"
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

        // モデルにSerializableインターフェースが実装されていることを確認
        List<File> generatedModelFiles = filterModelFiles(generatedFiles, "src/gen/java/org/openapitools/model");

        for (File generatedModelFile : generatedModelFiles) {
            GeneratorAssertions.assertContainsPatterns(
                    generatedModelFile,
                    "^import java\\.io\\.Serializable;",
                    ".*implements Serializable"
            );
        }
    }

    /**
     * モデルにビルダーを生成する
     */
    @Test
    public void generateBuilders() {
        Map<String, Object> properties = new HashMap<>();
        properties.put("generateBuilders", true);

        File output = createGeneratorOutputDirectory();

        CodegenConfigurator configurator = new CodegenConfigurator()
                .setGeneratorName(GENERATOR_NAME)
                .setAdditionalProperties(properties)
                .setInputSpec(getTestClassResourcePath("projects.yaml"))
                .setOutputDir(output.getAbsolutePath());

        ClientOptInput clientOptInput = configurator.toClientOptInput();
        DefaultGenerator generator = new DefaultGenerator();
        List<File> generatedFiles = generator.opts(clientOptInput).generate();

        String[] expectedGenerateFiles = {
                "src/gen/java/org/openapitools/api/ProjectsApi.java",
                "src/gen/java/org/openapitools/api/UsersApi.java",
                "src/gen/java/org/openapitools/model/ProjectRequest.java",
                "src/gen/java/org/openapitools/model/ProjectResponse.java",
                "src/gen/java/org/openapitools/model/Client.java",
                "src/gen/java/org/openapitools/model/UserRequest.java",
                "src/gen/java/org/openapitools/model/UserResponse.java",
                "src/gen/java/org/openapitools/model/ErrorResponse.java"
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

        // モデルにビルダーが生成されていることを確認
        List<File> generatedModelFiles = filterModelFiles(generatedFiles, "src/gen/java/org/openapitools/model");

        for (File generatedModelFile : generatedModelFiles) {
            GeneratorAssertions.assertContainsPatterns(
                    generatedModelFile,
                    "\\s+private static class .+BuilderImpl extends .+Builder"
            );
        }
    }

    /**
     * Bean Validationを有効にする
     */
    @Test
    public void useBeanValidation() {
        Map<String, Object> properties = new HashMap<>();
        properties.put("useBeanValidation", true);

        File output = createGeneratorOutputDirectory();

        CodegenConfigurator configurator = new CodegenConfigurator()
                .setGeneratorName(GENERATOR_NAME)
                .setAdditionalProperties(properties)
                .setInputSpec(getTestClassResourcePath("projects.yaml"))
                .setOutputDir(output.getAbsolutePath());

        ClientOptInput clientOptInput = configurator.toClientOptInput();
        DefaultGenerator generator = new DefaultGenerator();
        List<File> generatedFiles = generator.opts(clientOptInput).generate();

        String[] expectedGenerateFiles = {
                "src/gen/java/org/openapitools/api/ProjectsApi.java",
                "src/gen/java/org/openapitools/api/UsersApi.java",
                "src/gen/java/org/openapitools/model/ProjectRequest.java",
                "src/gen/java/org/openapitools/model/ProjectResponse.java",
                "src/gen/java/org/openapitools/model/Client.java",
                "src/gen/java/org/openapitools/model/UserRequest.java",
                "src/gen/java/org/openapitools/model/UserResponse.java",
                "src/gen/java/org/openapitools/model/ErrorResponse.java"
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

        // Apiに@Validアノテーションが使用されていることを確認
        List<File> generatedApiFiles = filterApiFiles(generatedFiles, "src/gen/java/org/openapitools/api");

        for (File generatedApiFile : generatedApiFiles) {
            GeneratorAssertions.assertContainsPatterns(
                    generatedApiFile,
                    "^import jakarta.validation.Valid;"
            );
        }

        // モデルにBean Validationのアノテーションが使用されていることを確認
        List<File> generatedModelFiles = filterModelFiles(generatedFiles, "src/gen/java/org/openapitools/model");

        for (File generatedModelFile : generatedModelFiles) {
            GeneratorAssertions.assertContainsPatterns(
                    generatedModelFile,
                    "^import jakarta.validation.constraints",
                    "^import nablarch.core.validation.ee"
            );
        }
    }

    /**
     * モデルに追加のアノテーションを付与する
     */
    @Test
    public void additionalModelTypeAnnotations() {
        Map<String, Object> properties = new HashMap<>();
        properties.put("additionalModelTypeAnnotations", "@jakarta.enterprise.context.SessionScoped;@jakarta.enterprise.context.RequestScoped;");

        File output = createGeneratorOutputDirectory();

        CodegenConfigurator configurator = new CodegenConfigurator()
                .setGeneratorName(GENERATOR_NAME)
                .setAdditionalProperties(properties)
                .setInputSpec(getTestClassResourcePath("projects.yaml"))
                .setOutputDir(output.getAbsolutePath());

        ClientOptInput clientOptInput = configurator.toClientOptInput();
        DefaultGenerator generator = new DefaultGenerator();
        List<File> generatedFiles = generator.opts(clientOptInput).generate();

        String[] expectedGenerateFiles = {
                "src/gen/java/org/openapitools/api/ProjectsApi.java",
                "src/gen/java/org/openapitools/api/UsersApi.java",
                "src/gen/java/org/openapitools/model/ProjectRequest.java",
                "src/gen/java/org/openapitools/model/ProjectResponse.java",
                "src/gen/java/org/openapitools/model/Client.java",
                "src/gen/java/org/openapitools/model/UserRequest.java",
                "src/gen/java/org/openapitools/model/UserResponse.java",
                "src/gen/java/org/openapitools/model/ErrorResponse.java"
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

        // モデルに追加のアノテーションが付与されていることを確認
        List<File> generatedModelFiles = filterModelFiles(generatedFiles, "src/gen/java/org/openapitools/model");

        for (File generatedModelFile : generatedModelFiles) {
            GeneratorAssertions.assertContainsPatterns(
                    generatedModelFile,
                    "^@jakarta.enterprise.context.SessionScoped$",
                    "^@jakarta.enterprise.context.RequestScoped$"
            );
        }
    }

    /**
     * enumに追加のアノテーションを付与する
     */
    @Test
    public void additionalEnumTypeAnnotations() {
        Map<String, Object> properties = new HashMap<>();
        properties.put("additionalEnumTypeAnnotations", "@jakarta.enterprise.context.SessionScoped;@jakarta.enterprise.context.RequestScoped;");

        File output = createGeneratorOutputDirectory();

        CodegenConfigurator configurator = new CodegenConfigurator()
                .setGeneratorName(GENERATOR_NAME)
                .setAdditionalProperties(properties)
                .setInputSpec(getTestClassResourcePath("projects_with_enum.yaml"))
                .setOutputDir(output.getAbsolutePath());

        ClientOptInput clientOptInput = configurator.toClientOptInput();
        DefaultGenerator generator = new DefaultGenerator();
        List<File> generatedFiles = generator.opts(clientOptInput).generate();

        String[] expectedGenerateFiles = {
                "src/gen/java/org/openapitools/api/ProjectsApi.java",
                "src/gen/java/org/openapitools/api/UsersApi.java",
                "src/gen/java/org/openapitools/model/ProjectRequest.java",
                "src/gen/java/org/openapitools/model/ProjectResponse.java",
                "src/gen/java/org/openapitools/model/Client.java",
                "src/gen/java/org/openapitools/model/UserRequest.java",
                "src/gen/java/org/openapitools/model/UserResponse.java",
                "src/gen/java/org/openapitools/model/ErrorResponse.java"
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

        // enumを持つモデルに追加のアノテーションが付与されていることを確認
        List<File> generatedModelFiles = filterFiles(generatedFiles, "src/gen/java/org/openapitools/model/Client.java");

        for (File generatedModelFile : generatedModelFiles) {
            GeneratorAssertions.assertContainsPatterns(
                    generatedModelFile,
                    "^\\s*@jakarta.enterprise.context.SessionScoped$",
                    "^\\s*@jakarta.enterprise.context.RequestScoped$"
            );
        }
    }

    /**
     * プロパティをStringとして出力する
     */
    @Test
    public void primitivePropertiesAsString() {
        Map<String, Object> properties = new HashMap<>();
        properties.put("primitivePropertiesAsString", true);

        File output = createGeneratorOutputDirectory();

        CodegenConfigurator configurator = new CodegenConfigurator()
                .setGeneratorName(GENERATOR_NAME)
                .setAdditionalProperties(properties)
                .setInputSpec(getTestClassResourcePath("projects_with_enum.yaml"))
                .setOutputDir(output.getAbsolutePath());

        ClientOptInput clientOptInput = configurator.toClientOptInput();
        DefaultGenerator generator = new DefaultGenerator();
        List<File> generatedFiles = generator.opts(clientOptInput).generate();

        String[] expectedGenerateFiles = {
                // パッケージはデフォルト
                "src/gen/java/org/openapitools/api/ProjectsApi.java",
                "src/gen/java/org/openapitools/api/UsersApi.java",
                "src/gen/java/org/openapitools/model/ProjectRequest.java",
                "src/gen/java/org/openapitools/model/ProjectResponse.java",
                "src/gen/java/org/openapitools/model/Client.java",
                "src/gen/java/org/openapitools/model/UserRequest.java",
                "src/gen/java/org/openapitools/model/UserResponse.java",
                "src/gen/java/org/openapitools/model/ErrorResponse.java"
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

        // IntegerやLongのようなプリミティブ型が出現しないことを確認
        for (File generatedFile : generatedFilesExcludeSupportFiles) {
            GeneratorAssertions.assertNotContainsPatterns(
                    generatedFile,
                    "Integer",
                    "Long",
                    "Float",
                    "Double",
                    "BigDecimal",
                    "Boolean",
                    "byte\\[\\]",
                    "File",
                    "LocalDate",
                    "OffsetDateTime",
                    "UUID",
                    "URI"
            );
        }
    }

    /**
     * サポートしていないリクエストのメディアタイプを指定した場合
     */
    @Test
    public void unsupportedConsumesMediaTypes() {
        Map<String, Object> properties = new HashMap<>();

        File output = createGeneratorOutputDirectory();

        CodegenConfigurator configurator = new CodegenConfigurator()
                .setGeneratorName(GENERATOR_NAME)
                .setAdditionalProperties(properties)
                .setInputSpec(getTestClassResourcePath("projects_consumes_media_types.yaml"))
                .setOutputDir(output.getAbsolutePath());

        ClientOptInput clientOptInput = configurator.toClientOptInput();
        DefaultGenerator generator = new DefaultGenerator();

        try {
            // デフォルトではapplication/jsonのみ受け付ける
            generator.opts(clientOptInput).generate();

            fail();
        } catch (RuntimeException e) {
            assertTrue(e.getMessage().contains("Could not process operation"));

            assertTrue(e.getCause() instanceof UnsupportedOperationException);
            assertEquals("Unsupported consumes media types: [application/xml]", e.getCause().getMessage());
        }
    }

    /**
     * サポートするリクエストのメディアタイプを設定する
     */
    @Test
    public void supportConsumesMediaTypes() {
        Map<String, Object> properties = new HashMap<>();
        properties.put("supportConsumesMediaTypes", "application/json,application/xml");

        File output = createGeneratorOutputDirectory();

        CodegenConfigurator configurator = new CodegenConfigurator()
                .setGeneratorName(GENERATOR_NAME)
                .setAdditionalProperties(properties)
                .setInputSpec(getTestClassResourcePath("projects_consumes_media_types.yaml"))
                .setOutputDir(output.getAbsolutePath());

        ClientOptInput clientOptInput = configurator.toClientOptInput();
        DefaultGenerator generator = new DefaultGenerator();
        List<File> generatedFiles = generator.opts(clientOptInput).generate();

        String[] expectedGenerateFiles = {
                "src/gen/java/org/openapitools/api/ProjectsApi.java",
                "src/gen/java/org/openapitools/api/UsersApi.java",
                "src/gen/java/org/openapitools/model/ProjectRequest.java",
                "src/gen/java/org/openapitools/model/ProjectResponse.java",
                "src/gen/java/org/openapitools/model/Client.java",
                "src/gen/java/org/openapitools/model/UserRequest.java",
                "src/gen/java/org/openapitools/model/UserResponse.java",
                "src/gen/java/org/openapitools/model/ErrorResponse.java"
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

        // リクエストのメディアタイプがapplication/jsonとapplication/xmlに対応していることを確認
        List<File> generatedApiFiles = filterApiFiles(generatedFiles, "src/gen/java/org/openapitools/api");

        for (File generatedApiFile : generatedApiFiles) {
            GeneratorAssertions.assertContainsPatterns(
                    generatedApiFile,
                    "@Consumes\\(\\{ \"application/json\", \"application/xml\" \\}\\)"
            );
        }
    }

    /**
     * サポートしていないレスポンスのメディアタイプを指定した場合
     */
    @Test
    public void unsupportedProducesMediaTypes() {
        Map<String, Object> properties = new HashMap<>();

        File output = createGeneratorOutputDirectory();

        CodegenConfigurator configurator = new CodegenConfigurator()
                .setGeneratorName(GENERATOR_NAME)
                .setAdditionalProperties(properties)
                .setInputSpec(getTestClassResourcePath("projects_produces_media_types.yaml"))
                .setOutputDir(output.getAbsolutePath());

        ClientOptInput clientOptInput = configurator.toClientOptInput();
        DefaultGenerator generator = new DefaultGenerator();

        try {
            // デフォルトではapplication/jsonのみ受け付ける
            generator.opts(clientOptInput).generate();

            fail();
        } catch (RuntimeException e) {
            assertTrue(e.getMessage().contains("Could not process operation"));

            assertTrue(e.getCause() instanceof UnsupportedOperationException);
            assertEquals("Unsupported produces media types: [application/xml]", e.getCause().getMessage());
        }
    }

    /**
     * サポートするレスポンスのメディアタイプを設定する
     */
    @Test
    public void supportProducesMediaTypes() {
        Map<String, Object> properties = new HashMap<>();
        properties.put("supportProducesMediaTypes", "application/json,application/xml");

        File output = createGeneratorOutputDirectory();

        CodegenConfigurator configurator = new CodegenConfigurator()
                .setGeneratorName(GENERATOR_NAME)
                .setAdditionalProperties(properties)
                .setInputSpec(getTestClassResourcePath("projects_produces_media_types.yaml"))
                .setOutputDir(output.getAbsolutePath());

        ClientOptInput clientOptInput = configurator.toClientOptInput();
        DefaultGenerator generator = new DefaultGenerator();
        List<File> generatedFiles = generator.opts(clientOptInput).generate();

        String[] expectedGenerateFiles = {
                "src/gen/java/org/openapitools/api/ProjectsApi.java",
                "src/gen/java/org/openapitools/api/UsersApi.java",
                "src/gen/java/org/openapitools/model/ProjectRequest.java",
                "src/gen/java/org/openapitools/model/ProjectResponse.java",
                "src/gen/java/org/openapitools/model/Client.java",
                "src/gen/java/org/openapitools/model/UserRequest.java",
                "src/gen/java/org/openapitools/model/UserResponse.java",
                "src/gen/java/org/openapitools/model/ErrorResponse.java"
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

        // レスポンスのメディアタイプがapplication/jsonとapplication/xmlに対応していることを確認
        List<File> generatedApiFiles = filterApiFiles(generatedFiles, "src/gen/java/org/openapitools/api");

        for (File generatedApiFile : generatedApiFiles) {
            GeneratorAssertions.assertContainsPatterns(
                    generatedApiFile,
                    "@Produces\\(\\{ \"application/json\", \"application/xml\" \\}\\)"
            );
        }
    }
}
