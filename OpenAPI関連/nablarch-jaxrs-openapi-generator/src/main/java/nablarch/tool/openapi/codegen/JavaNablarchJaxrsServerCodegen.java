package nablarch.tool.openapi.codegen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import io.swagger.v3.oas.models.Operation;
import io.swagger.v3.oas.models.media.Schema;
import io.swagger.v3.oas.models.servers.Server;
import lombok.Getter;
import lombok.Setter;
import org.openapitools.codegen.CliOption;
import org.openapitools.codegen.CodegenConstants;
import org.openapitools.codegen.CodegenModel;
import org.openapitools.codegen.CodegenOperation;
import org.openapitools.codegen.CodegenProperty;
import org.openapitools.codegen.languages.AbstractJavaCodegen;
import org.openapitools.codegen.languages.AbstractJavaJAXRSServerCodegen;
import org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen;

/**
 * Nablarch JAX-RS用のOpenAPI GeneratorのカスタムGenerator。
 * <p>
 * NablarchのRESTful ウェブサービスはJAX-RSのアノテーションを使用しているため、各種JAX-RSのGeneratorの
 * 抽象実装である{@link AbstractJavaJAXRSServerCodegen}を拡張して実装する。また、生成する対象はActionが
 * 実装するAPIのインターフェースとモデル、そして無効化できないサポートファイルのみとする。
 * <p>
 * Mustacheテンプレートはjaxrs-specのものをカスタマイズして使用する。
 *
 * @see <a href="https://github.com/OpenAPITools/openapi-generator/tree/v7.10.0/modules/openapi-generator/src/main/resources/JavaJaxRS/spec">jaxrs-specのMustacheテンプレート</a>
 */
public class JavaNablarchJaxrsServerCodegen extends AbstractJavaJAXRSServerCodegen {
    /**
     * Generator前
     */
    public static final String GENERATOR_NAME = "nablarch-jaxrs";

    // Generatorのオプション名
    /**
     * プリミティブ型のプロパティをすべてString型とする場合のオプション名
     */
    static final String PRIMITIVE_PROPERTIES_AS_STRING = "primitivePropertiesAsString";

    /**
     * サポートするリクエストのメディアタイプのオプション名
     */
    static final String SUPPORT_CONSUMES_MEDIA_TYPES = "supportConsumesMediaTypes";

    /**
     * サポートするレスポンスのメディアタイプのオプション名
     */
    static final String SUPPORT_PRODUCES_MEDIA_TYPES = "supportProducesMediaTypes";

    /**
     * プリミティブ型のプロパティをすべてString型とする場合は{@code true}。
     */
    @Getter
    @Setter
    private boolean primitivePropertiesAsString = false;

    /**
     * Generatorがサポートする、リクエストとして受け付けるメディアタイプ。
     */
    @Getter
    @Setter
    private List<String> supportConsumesMediaTypes = List.of("application/json", "multipart/form-data");

    /**
     * Generatorがサポートする、レスポンスとして返却するメディアタイプ。
     */
    @Getter
    @Setter
    private List<String> supportProducesMediaTypes = List.of("application/json");

    /**
     * Generator名を返却する。
     *
     * @return Generator名
     */
    public String getName() {
        return GENERATOR_NAME;
    }

    /**
     * ヘルプ（Generatorの簡単な説明）を返却する。
     *
     * @return ヘルプ
     */
    public String getHelp() {
        return "Generates a nablarch-jaxrs server library.";
    }

    /**
     * コンストラクタ。Generatorのオプションの設定を行う
     */
    public JavaNablarchJaxrsServerCodegen() {
        // set the output folder here
        outputFolder = "generated-code/nablarch-jaxrs";
        // GeneratorのMustacheテンプレートの配置先
        templateDir = "JavaNablarchJaxRs";

        // 継承したクラスから、サポートしないオプションを削除
        removeOption("title");
        removeOption("groupId");
        removeOption("artifactId");
        removeOption("artifactVersion");
        removeOption("artifactUrl");
        removeOption("artifactDescription");
        removeOption("scmConnection");
        removeOption("scmDeveloperConnection");
        removeOption("scmUrl");
        removeOption("developerName");
        removeOption("developerEmail");
        removeOption("developerOrganization");
        removeOption("developerOrganizationUrl");
        removeOption("licenseName");
        removeOption("licenseUrl");
        removeOption(AbstractJavaCodegen.ADDITIONAL_ONE_OF_TYPE_ANNOTATIONS);
        removeOption(AbstractJavaCodegen.IMPLICIT_HEADERS);
        removeOption(AbstractJavaCodegen.IMPLICIT_HEADERS_REGEX);
        removeOption(AbstractJavaCodegen.OPENAPI_NULLABLE);
        removeOption(CodegenConstants.PARENT_GROUP_ID);
        removeOption(CodegenConstants.PARENT_ARTIFACT_ID);
        removeOption(CodegenConstants.PARENT_VERSION);
        removeOption(CodegenConstants.SNAPSHOT_VERSION);
        removeOption(CodegenConstants.LIBRARY);
        removeOption(CodegenConstants.SORT_PARAMS_BY_REQUIRED_FLAG);
        removeOption(AbstractJavaJAXRSServerCodegen.SERVER_PORT);
        removeOption(JavaJAXRSSpecServerCodegen.GENERATE_POM);
        removeOption(JavaJAXRSSpecServerCodegen.RETURN_RESPONSE);
        removeOption(JavaJAXRSSpecServerCodegen.USE_SWAGGER_ANNOTATIONS);
        removeOption(JavaJAXRSSpecServerCodegen.USE_MICROPROFILE_OPENAPI_ANNOTATIONS);
        removeOption(AbstractJavaCodegen.SUPPORT_ASYNC);
        removeOption(JavaJAXRSSpecServerCodegen.USE_MUTINY);
        removeOption(AbstractJavaCodegen.DISABLE_HTML_ESCAPING);
        removeOption(AbstractJavaCodegen.USE_JAKARTA_EE);
        removeOption(CodegenConstants.WITH_XML);
        removeOption(CodegenConstants.ALLOW_UNICODE_IDENTIFIERS);
        removeOption(CodegenConstants.SERIALIZE_BIG_DECIMAL_AS_STRING);
        removeOption(AbstractJavaCodegen.BOOLEAN_GETTER_PREFIX);
        removeOption(AbstractJavaCodegen.CAMEL_CASE_DOLLAR_SIGN);
        removeOption(AbstractJavaCodegen.CONTAINER_DEFAULT_TO_NULL);
        removeOption(AbstractJavaCodegen.DATE_LIBRARY);
        removeOption(CodegenConstants.DISALLOW_ADDITIONAL_PROPERTIES_IF_NOT_PRESENT);
        removeOption(AbstractJavaCodegen.DISCRIMINATOR_CASE_SENSITIVE);
        removeOption(CodegenConstants.ENSURE_UNIQUE_PARAMS);
        removeOption(AbstractJavaCodegen.IGNORE_ANYOF_IN_ENUM);
        removeOption(CodegenConstants.ENUM_UNKNOWN_DEFAULT_CASE);
        removeOption(CodegenConstants.INVOKER_PACKAGE);
        removeOption(CodegenConstants.IMPL_FOLDER);
        removeOption(CodegenConstants.LEGACY_DISCRIMINATOR_BEHAVIOR);
        removeOption(CodegenConstants.PREPEND_FORM_OR_BODY_PARAMETERS);
        removeOption(CodegenConstants.SORT_MODEL_PROPERTIES_BY_REQUIRED_FLAG);
        removeOption(AbstractJavaCodegen.GENERATE_CONSTRUCTOR_WITH_ALL_ARGS);
        removeOption(AbstractJavaCodegen.TEST_OUTPUT);
        removeOption(AbstractJavaCodegen.USE_ONE_OF_INTERFACES);
        removeOption(USE_BEANVALIDATION);

        // デフォルトでBean Validation用のアノテーションは生成しない
        useBeanValidation = false;

        // オプションのデフォルト値を調整
        // インターフェースのみの生成とする
        updateOption(JavaJAXRSSpecServerCodegen.INTERFACE_ONLY, "true");
        // 生成するコードにSwagger Coreのアノテーションを付与しない
        updateOption(JavaJAXRSSpecServerCodegen.USE_SWAGGER_ANNOTATIONS, "false");
        // ヘルプ表示の際にデフォルト値を false に表示するために再設定
        cliOptions.add(CliOption.newBoolean(USE_BEANVALIDATION, "Use BeanValidation API annotations", useBeanValidation));

        // サポート対象外にしたオプションの値を指定
        setEnsureUniqueParams(true);
        setOpenApiNullable(false);
        setUseJakartaEe(true); // Jakarta EEのみサポート（Java EEはサポートしない）
        setDateLibrary("java8");  // 日付型はJava 8のDate and Time APIのものを使う

        // 固有のオプションを追加
        cliOptions.add(CliOption.newBoolean(PRIMITIVE_PROPERTIES_AS_STRING, "Generate all primitive types such as Integer, Long, and Boolean as String types. (default: false)"));
        cliOptions.add(CliOption.newString(SUPPORT_CONSUMES_MEDIA_TYPES, "Supported consumes media types. List separated by comma(,) or new line (Linux or Windows) (default: application/json)"));
        cliOptions.add(CliOption.newString(SUPPORT_PRODUCES_MEDIA_TYPES, "Supported produces media types. List separated by comma(,) or new line (Linux or Windows) (default: application/json)"));
    }

    /**
     * Generatorに指定されたオプションの処理を行う。
     */
    @Override
    public void processOpts() {
        super.processOpts();

        convertPropertyToBooleanAndWriteBack(PRIMITIVE_PROPERTIES_AS_STRING, this::setPrimitivePropertiesAsString);
        convertPropertyToTypeAndWriteBack(
                SUPPORT_CONSUMES_MEDIA_TYPES,
                mediaTypes -> Arrays.asList(mediaTypes.trim().split("\\s*(,|\\r?\\n)\\s*")),
                this::setSupportConsumesMediaTypes
        );
        convertPropertyToTypeAndWriteBack(
                SUPPORT_PRODUCES_MEDIA_TYPES,
                mediaTypes -> Arrays.asList(mediaTypes.trim().split("\\s*(,|\\r?\\n)\\s*")),
                this::setSupportProducesMediaTypes
        );

        // Generatorで生成しないファイルはクリア
        apiTestTemplateFiles.clear();
        modelTestTemplateFiles.clear();
        apiDocTemplateFiles.clear();
        modelDocTemplateFiles.clear();
        supportingFiles.clear();

        // import文を追加するための変換表
        importMapping.put("ExecutionContext", "nablarch.fw.ExecutionContext");
        importMapping.put("EntityResponse", "nablarch.fw.jaxrs.EntityResponse");
        importMapping.put("JaxRsHttpRequest", "nablarch.fw.jaxrs.JaxRsHttpRequest");
        importMapping.put("HttpResponse", "nablarch.fw.web.HttpResponse");
        importMapping.put("Required", "nablarch.core.validation.ee.Required");
        importMapping.put("Size", "nablarch.core.validation.ee.Size");
        importMapping.put("Length", "nablarch.core.validation.ee.Length");
        importMapping.put("NumberRange", "nablarch.core.validation.ee.NumberRange");
        importMapping.put("DecimalRange", "nablarch.core.validation.ee.DecimalRange");
        importMapping.put("Valid", "jakarta.validation.Valid");
        importMapping.put("Pattern", "jakarta.validation.constraints.Pattern");
        importMapping.put("Serializable", "java.io.Serializable");

        // Bean Validationのimport文はMustacheテンプレートで制御する

        // プリミティブをすべてStringとして扱う場合
        if (primitivePropertiesAsString) {
            typeMapping.put("boolean", "String");
            typeMapping.put("string", "String");
            typeMapping.put("int", "String");
            typeMapping.put("float", "String");
            typeMapping.put("double", "String");
            typeMapping.put("number", "String");
            typeMapping.put("decimal", "String");
            typeMapping.put("date", "String");
            typeMapping.put("DateTime", "String");
            typeMapping.put("long", "String");
            typeMapping.put("short", "String");
            typeMapping.put("integer", "String");
            typeMapping.put("UnsignedInteger", "String");
            typeMapping.put("UnsignedLong", "String");
            typeMapping.put("char", "String");
            typeMapping.put("ByteArray", "String");
            typeMapping.put("binary", "String");
            typeMapping.put("file", "String");
            typeMapping.put("UUID", "String");
            typeMapping.put("URI", "String");
            // array、set、map、objectは対象外
        }
    }

    /**
     * オペレーション（エンドポイントに対応するメソッド）の定義からコード生成用のオペレーションを生成する
     *
     * @param path       オペレーションのパス
     * @param httpMethod オペレーションのHTTPメソッド
     * @param operation  処理対象のオペレーションの定義
     * @param servers    サーバ
     * @return コード生成用のオペレーション
     */
    @Override
    public CodegenOperation fromOperation(String path, String httpMethod, Operation operation, List<Server> servers) {
        // 継承元から、コード生成用のオペレーションを生成
        CodegenOperation op = super.fromOperation(path, httpMethod, operation, servers);

        if (op.hasConsumes) {
            List<Map<String, String>> consumes = op.consumes;

            List<String> unsupportedMediaTypes = new ArrayList<>();

            for (Map<String, String> consume : consumes) {
                String mediaType = consume.get("mediaType");

                boolean supported = false;

                for (String supportMediaType : supportConsumesMediaTypes) {
                    if (supportMediaType.equalsIgnoreCase(mediaType)) {
                        supported = true;
                        break;
                    }
                }

                if (!supported) {
                    unsupportedMediaTypes.add(mediaType);
                }
            }

            if (!unsupportedMediaTypes.isEmpty()) {
                throw new UnsupportedOperationException("Unsupported consumes media types: " + unsupportedMediaTypes);
            }
        }

        if (op.hasProduces) {
            // レスポンスがバイナリの場合は、サポートするメディアタイプのチェックは行わない
            if (!op.isResponseBinary) {

                List<Map<String, String>> produces = op.produces;

                List<String> unsupportedMediaTypes = new ArrayList<>();

                for (Map<String, String> consume : produces) {
                    String mediaType = consume.get("mediaType");

                    boolean supported = false;

                    for (String supportMediaType : supportProducesMediaTypes) {
                        if (supportMediaType.equalsIgnoreCase(mediaType)) {
                            supported = true;
                            break;
                        }
                    }

                    if (!supported) {
                        unsupportedMediaTypes.add(mediaType);
                    }
                }

                if (!unsupportedMediaTypes.isEmpty()) {
                    throw new UnsupportedOperationException("Unsupported produces media types: " + unsupportedMediaTypes);
                }
            }
        }

        // オペレーション（API）に追加するimport
        op.imports.add("ExecutionContext");
        op.imports.add("EntityResponse");
        op.imports.add("JaxRsHttpRequest");
        op.imports.add("HttpResponse");

        if (isUseBeanValidation()) {
            // Bean Validationが有効な場合、Apiのimport文に@Validを追加
            op.imports.add("Valid");
        }

        return op;
    }

    /**
     * モデルに対する後処理
     *
     * @param model    コード生成用のモデル
     * @param property コード生成用のモデルのプロパティ
     */
    @Override
    public void postProcessModelProperty(CodegenModel model, CodegenProperty property) {
        super.postProcessModelProperty(model, property);

        if (getSerializableModel()) {
            model.imports.add("Serializable");
        }

        if (property.isByteArray) {
            model.imports.add("Arrays");
        }

        if (isUseBeanValidation()) {
            model.imports.add("Valid");
            model.imports.add("Pattern");
            model.imports.add("Required");
            model.imports.add("Size");
            model.imports.add("Length");
            model.imports.add("NumberRange");
            model.imports.add("DecimalRange");
        }

        // モデルから不要なimportを削除
        model.imports.remove("ApiModel");
        model.imports.remove("ApiModelProperty");
    }

    /**
     * モデル定義から、コード生成用のモデルを生成する
     *
     * @param name  モデルの名前
     * @param model モデル定義
     * @return コード生成用のモデル
     */
    @Override
    public CodegenModel fromModel(String name, Schema model) {
        CodegenModel codegenModel = super.fromModel(name, model);

        for (CodegenProperty codegenProperty : codegenModel.allVars) {
            // モデルが生成されるパターン（非マルチパート）では、string型、binaryフォーマットはサポートしない
            if (codegenProperty.isBinary) {
                throw new UnsupportedOperationException("property type: string and format: binary are not supported");
            }
        }

        // 必要なimport文を追加
        codegenModel.imports.add("Arrays");

        // モデルから不要なimportを削除
        codegenModel.imports.remove("ApiModel");

        return codegenModel;
    }

}
