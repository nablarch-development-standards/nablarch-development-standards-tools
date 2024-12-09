package org.openapitools.api;

import java.math.BigDecimal;
import org.openapitools.model.DataSubTypeRequest;
import org.openapitools.model.DataTypeResponse;
import nablarch.fw.jaxrs.EntityResponse;
import nablarch.fw.ExecutionContext;
import java.io.File;
import nablarch.fw.web.HttpResponse;
import nablarch.fw.jaxrs.JaxRsHttpRequest;
import java.util.List;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.net.URI;
import java.util.UUID;

import jakarta.ws.rs.*;

@Path("/data-types")
@jakarta.annotation.Generated(value = "nablarch.tool.openapi.codegen.JavaNablarchJaxrsServerCodegen", date = "2024-12-09T21:43:46.796582783+09:00[Asia/Tokyo]", comments = "Generator version: 7.10.0")
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
     * @param jaxRsHttpRequest HTTPリクエスト
     * @param context ハンドラ実行コンテキスト
     * @return OK
     */
    @POST
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/json" })
    EntityResponse<DataTypeResponse> dataTypesPost(JaxRsHttpRequest jaxRsHttpRequest, ExecutionContext context);

}
