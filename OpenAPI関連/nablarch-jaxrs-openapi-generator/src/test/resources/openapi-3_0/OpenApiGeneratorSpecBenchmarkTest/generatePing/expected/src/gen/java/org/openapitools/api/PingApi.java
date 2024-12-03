package org.openapitools.api;

import nablarch.fw.jaxrs.EntityResponse;
import nablarch.fw.ExecutionContext;
import nablarch.fw.web.HttpResponse;
import nablarch.fw.jaxrs.JaxRsHttpRequest;

import jakarta.ws.rs.*;

@Path("/ping")
@jakarta.annotation.Generated(value = "nablarch.tool.openapi.codegen.JavaNablarchJaxrsServerCodegen", date = "2024-11-29T21:02:26.826484049+09:00[Asia/Tokyo]", comments = "Generator version: 7.10.0")
public interface PingApi {
    /**
     * GET 
     *
     *
     * @param jaxRsHttpRequest HTTPリクエスト
     * @param context ハンドラ実行コンテキスト
     * @return OK
     */
    @GET
    HttpResponse pingGet(JaxRsHttpRequest jaxRsHttpRequest, ExecutionContext context);

}
