package org.openapitools.api;

import nablarch.fw.jaxrs.EntityResponse;
import nablarch.fw.ExecutionContext;
import nablarch.fw.web.HttpResponse;
import nablarch.fw.jaxrs.JaxRsHttpRequest;
import java.util.List;
import org.openapitools.model.ProjectResponse;

import jakarta.ws.rs.*;

@Path("/projects")
@jakarta.annotation.Generated(value = "nablarch.tool.openapi.codegen.JavaNablarchJaxrsServerCodegen", date = "2024-12-09T21:55:14.862304511+09:00[Asia/Tokyo]", comments = "Generator version: 7.10.0")
public interface ProjectReadApi {
    /**
     * GET  : すべてのプロジェクトを取得する
     *
     * すべてのプロジェクトを取得する。タグとソート順を指定できる
     *
     * @param jaxRsHttpRequest HTTPリクエスト
     * @param context ハンドラ実行コンテキスト
     * @return find all projects
     */
    @GET
    @Produces({ "application/json" })
    EntityResponse<List<ProjectResponse>> findAllProjects(JaxRsHttpRequest jaxRsHttpRequest, ExecutionContext context);

    /**
     * GET /{id} : プロジェクトを取得する
     *
     * IDを指定してプロジェクトを取得する
     *
     * @param jaxRsHttpRequest HTTPリクエスト
     * @param context ハンドラ実行コンテキスト
     * @return find project by id
     * @return not found project
     */
    @GET
    @Path("/{id}")
    @Produces({ "application/json" })
    EntityResponse<ProjectResponse> findProjectById(JaxRsHttpRequest jaxRsHttpRequest, ExecutionContext context);

}
