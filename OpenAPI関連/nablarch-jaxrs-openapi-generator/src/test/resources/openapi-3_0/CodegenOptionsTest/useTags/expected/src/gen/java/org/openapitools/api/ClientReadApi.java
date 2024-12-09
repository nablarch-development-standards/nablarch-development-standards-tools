package org.openapitools.api;

import org.openapitools.model.Client;
import nablarch.fw.jaxrs.EntityResponse;
import nablarch.fw.ExecutionContext;
import nablarch.fw.web.HttpResponse;
import nablarch.fw.jaxrs.JaxRsHttpRequest;
import java.util.List;

import jakarta.ws.rs.*;

@Path("/projects/{projectId}/clients")
@jakarta.annotation.Generated(value = "nablarch.tool.openapi.codegen.JavaNablarchJaxrsServerCodegen", date = "2024-12-09T21:55:14.862304511+09:00[Asia/Tokyo]", comments = "Generator version: 7.10.0")
public interface ClientReadApi {
    /**
     * GET  : プロジェクト内のクライアント一覧取得
     *
     * プロジェクト内のクライアント一覧を取得する
     *
     * @param jaxRsHttpRequest HTTPリクエスト
     * @param context ハンドラ実行コンテキスト
     * @return プロジェクト内のクライアント一覧
     */
    @GET
    @Produces({ "application/json" })
    EntityResponse<List<Client>> findAllClientsInProject(JaxRsHttpRequest jaxRsHttpRequest, ExecutionContext context);

}
