package org.openapitools.api;

import org.openapitools.model.DataTypeRequest;
import org.openapitools.model.DataTypeResponse;
import nablarch.fw.jaxrs.EntityResponse;
import nablarch.fw.ExecutionContext;
import nablarch.fw.web.HttpResponse;
import nablarch.fw.jaxrs.JaxRsHttpRequest;
import java.util.List;

import jakarta.ws.rs.*;

@Path("/data-types")
@jakarta.annotation.Generated(value = "nablarch.tool.openapi.codegen.JavaNablarchJaxrsServerCodegen", date = "2024-12-09T21:43:48.220276849+09:00[Asia/Tokyo]", comments = "Generator version: 7.10.0")
public interface DataTypesApi {
    /**
     * GET 
     *
     *
     * @param jaxRsHttpRequest HTTPリクエスト
     * @param context ハンドラ実行コンテキスト
     * @return OK
     */
    @GET
    @Produces({ "application/json" })
    EntityResponse<List<DataTypeResponse>> dataTypesGet(JaxRsHttpRequest jaxRsHttpRequest, ExecutionContext context);

    /**
     * POST 
     *
     *
     * @param dataTypeRequest 
     * @param jaxRsHttpRequest HTTPリクエスト
     * @param context ハンドラ実行コンテキスト
     * @return OK
     */
    @POST
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    EntityResponse<DataTypeResponse> dataTypesPost(DataTypeRequest dataTypeRequest, JaxRsHttpRequest jaxRsHttpRequest, ExecutionContext context);

}
