package nablarch.tool.openapi.codegen;

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
 * OpenAPI Generatorのテストから汎用的なリソースを流用し、基本的な動作確認を行うためのテストクラス
 */
public class OpenApiGeneratorSpecBenchmarkTest extends JavaNablarchJaxrsServerCodegenOpenApi30TestSupport {
    @Test
    public void generatePing() throws Exception {
        Map<String, Object> properties = new HashMap<>();

        File output = createGeneratorOutputDirectory();

        CodegenConfigurator configurator = new CodegenConfigurator()
                .setGeneratorName(GENERATOR_NAME)
                .setAdditionalProperties(properties)
                .setInputSpec(getTestClassResourcePath("ping.yaml"))
                .setOutputDir(output.getAbsolutePath());

        ClientOptInput clientOptInput = configurator.toClientOptInput();
        DefaultGenerator generator = new DefaultGenerator();
        List<File> generatedFiles = generator.opts(clientOptInput).generate();

        String[] expectedGenerateFiles = {
                "src/gen/java/org/openapitools/api/PingApi.java"
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

    @Test
    public void generatePetStore() throws Exception {
        Map<String, Object> properties = new HashMap<>();
        properties.put(JavaNablarchJaxrsServerCodegen.SUPPORT_CONSUMES_MEDIA_TYPES, "application/json, application/xml, application/x-www-form-urlencoded, multipart/form-data");
        properties.put(JavaNablarchJaxrsServerCodegen.SUPPORT_PRODUCES_MEDIA_TYPES, "application/json, application/xml");

        File output = createGeneratorOutputDirectory();

        CodegenConfigurator configurator = new CodegenConfigurator()
                .setGeneratorName(GENERATOR_NAME)
                .setAdditionalProperties(properties)
                .setInputSpec(getTestClassResourcePath("petstore.yaml"))
                .setOutputDir(output.getAbsolutePath());

        ClientOptInput clientOptInput = configurator.toClientOptInput();
        DefaultGenerator generator = new DefaultGenerator();
        List<File> generatedFiles = generator.opts(clientOptInput).generate();

        String[] expectedGenerateFiles = {
                "src/gen/java/org/openapitools/api/PetApi.java",
                "src/gen/java/org/openapitools/api/StoreApi.java",
                "src/gen/java/org/openapitools/api/UserApi.java",
                "src/gen/java/org/openapitools/model/Pet.java",
                "src/gen/java/org/openapitools/model/Tag.java",
                "src/gen/java/org/openapitools/model/Order.java",
                "src/gen/java/org/openapitools/model/User.java",
                "src/gen/java/org/openapitools/model/Category.java",
                // ApiResponseはAbstractJavaCodegenでの予約語のため、先頭に"Model"（生成する種類名）が付与される
                "src/gen/java/org/openapitools/model/ModelApiResponse.java"
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
}