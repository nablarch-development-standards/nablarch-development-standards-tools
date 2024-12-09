package org.openapitools.api;

import nablarch.fw.jaxrs.EntityResponse;
import nablarch.fw.ExecutionContext;
import nablarch.fw.web.HttpResponse;
import nablarch.fw.jaxrs.JaxRsHttpRequest;
import java.util.List;
import jakarta.validation.Valid;
import org.openapitools.model.ValidationRequest;
import org.openapitools.model.ValidationResponse;

import jakarta.ws.rs.*;

@Path("/validations")
@jakarta.annotation.Generated(value = "nablarch.tool.openapi.codegen.JavaNablarchJaxrsServerCodegen", date = "2024-12-09T21:40:02.319711249+09:00[Asia/Tokyo]", comments = "Generator version: 7.10.0")
public interface ValidationsApi {
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
    EntityResponse<List<ValidationResponse>> validationsGet(JaxRsHttpRequest jaxRsHttpRequest, ExecutionContext context);

    /**
     * POST 
     *
     *
     * @param validationRequest 
     * @param jaxRsHttpRequest HTTPリクエスト
     * @param context ハンドラ実行コンテキスト
     * @return OK
     */
    @POST
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @Valid
    EntityResponse<ValidationResponse> validationsPost(ValidationRequest validationRequest, JaxRsHttpRequest jaxRsHttpRequest, ExecutionContext context);

}
