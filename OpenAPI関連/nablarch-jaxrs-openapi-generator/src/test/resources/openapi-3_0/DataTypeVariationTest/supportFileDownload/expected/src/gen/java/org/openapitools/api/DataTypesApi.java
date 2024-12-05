package org.openapitools.api;

import nablarch.fw.jaxrs.EntityResponse;
import nablarch.fw.ExecutionContext;
import java.io.File;
import nablarch.fw.web.HttpResponse;
import nablarch.fw.jaxrs.JaxRsHttpRequest;

import jakarta.ws.rs.*;

@Path("/data-types")
@jakarta.annotation.Generated(value = "nablarch.tool.openapi.codegen.JavaNablarchJaxrsServerCodegen", date = "2024-12-05T14:52:02.759819982+09:00[Asia/Tokyo]", comments = "Generator version: 7.10.0")
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
    HttpResponse dataTypesGet(JaxRsHttpRequest jaxRsHttpRequest, ExecutionContext context);

}
