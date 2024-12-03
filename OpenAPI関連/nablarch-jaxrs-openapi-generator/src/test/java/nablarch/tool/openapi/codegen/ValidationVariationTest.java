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

public class ValidationVariationTest extends JavaNablarchJaxrsServerCodegenOpenApi30TestSupport {
    @Test
    public void allSupportedValidations() {
        Map<String, Object> properties = new HashMap<>();
        properties.put("useBeanValidation", true);

        File output = createGeneratorOutputDirectory();

        CodegenConfigurator configurator = new CodegenConfigurator()
                .setGeneratorName(GENERATOR_NAME)
                .setAdditionalProperties(properties)
                .setInputSpec(getTestClassResourcePath("validations.yaml"))
                .setOutputDir(output.getAbsolutePath());

        ClientOptInput clientOptInput = configurator.toClientOptInput();
        DefaultGenerator generator = new DefaultGenerator();
        List<File> generatedFiles = generator.opts(clientOptInput).generate();

        String[] expectedGenerateFiles = {
                "src/gen/java/org/openapitools/api/ValidationsApi.java",
                "src/gen/java/org/openapitools/model/ValidationRequest.java",
                "src/gen/java/org/openapitools/model/ValidationSubRequest.java",
                "src/gen/java/org/openapitools/model/ValidationResponse.java"
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
