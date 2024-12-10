package org.openapitools.api;

import nablarch.fw.jaxrs.EntityResponse;
import nablarch.fw.ExecutionContext;
import nablarch.fw.web.HttpResponse;
import nablarch.fw.jaxrs.JaxRsHttpRequest;

import jakarta.ws.rs.*;

@Path("/http-methods")
@jakarta.annotation.Generated(value = "nablarch.tool.openapi.codegen.JavaNablarchJaxrsServerCodegen", date = "2024-12-10T20:39:01.075738570+09:00[Asia/Tokyo]", comments = "Generator version: 7.10.0")
public interface HttpMethodsApi {
    /**
     * GET /get
     *
     *
     * @param jaxRsHttpRequest HTTPリクエスト
     * @param context ハンドラ実行コンテキスト
     * @return OK
     */
    @GET
    @Path("/get")
    @Produces({ "application/json" })
    EntityResponse<String> httpMethodsGetGet(JaxRsHttpRequest jaxRsHttpRequest, ExecutionContext context);

    /**
     * HEAD /head
     *
     *
     * @param jaxRsHttpRequest HTTPリクエスト
     * @param context ハンドラ実行コンテキスト
     * @return head
     */
    @HEAD
    @Path("/head")
    HttpResponse httpMethodsHeadHead(JaxRsHttpRequest jaxRsHttpRequest, ExecutionContext context);

    /**
     * OPTIONS /options
     *
     *
     * @param jaxRsHttpRequest HTTPリクエスト
     * @param context ハンドラ実行コンテキスト
     * @return options
     */
    @OPTIONS
    @Path("/options")
    HttpResponse httpMethodsOptionsOptions(JaxRsHttpRequest jaxRsHttpRequest, ExecutionContext context);

    /**
     * PATCH /patch
     *
     *
     * @param body 
     * @param jaxRsHttpRequest HTTPリクエスト
     * @param context ハンドラ実行コンテキスト
     * @return OK
     */
    @PATCH
    @Path("/patch")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    EntityResponse<String> httpMethodsPatchPatch(String body, JaxRsHttpRequest jaxRsHttpRequest, ExecutionContext context);

    /**
     * POST /post
     *
     *
     * @param body 
     * @param jaxRsHttpRequest HTTPリクエスト
     * @param context ハンドラ実行コンテキスト
     * @return OK
     */
    @POST
    @Path("/post")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    EntityResponse<String> httpMethodsPostPost(String body, JaxRsHttpRequest jaxRsHttpRequest, ExecutionContext context);

    /**
     * PUT /put
     *
     *
     * @param body 
     * @param jaxRsHttpRequest HTTPリクエスト
     * @param context ハンドラ実行コンテキスト
     * @return OK
     */
    @PUT
    @Path("/put")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    EntityResponse<String> httpMethodsPutPut(String body, JaxRsHttpRequest jaxRsHttpRequest, ExecutionContext context);

}
