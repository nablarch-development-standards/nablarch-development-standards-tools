package nablarch.tool.openapi.codegen.test;

/**
 * OpenAPI 3.0.x用のNablarch JAX-RS Generatorのテストの基底クラス
 */
public abstract class JavaNablarchJaxrsServerCodegenOpenApi30TestSupport extends JavaNablarchJaxrsServerCodegenTestSupport {
    /**
     * OpenAPI 3.0.x用ののバージョンを返却する。
     *
     * @return OpenAPI 3.0.x用のバージョン
     */
    @Override
    public String getVersion() {
        return "openapi-3_0";
    }
}
