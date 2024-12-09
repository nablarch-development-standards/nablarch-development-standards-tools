package org.openapitools.api;

import org.openapitools.model.Client;
import nablarch.fw.jaxrs.EntityResponse;
import org.openapitools.model.ErrorResponse;
import nablarch.fw.ExecutionContext;
import nablarch.fw.web.HttpResponse;
import nablarch.fw.jaxrs.JaxRsHttpRequest;
import java.util.List;
import org.openapitools.model.ProjectRequest;
import org.openapitools.model.ProjectResponse;

import jakarta.ws.rs.*;

@Path("/projects")
@jakarta.annotation.Generated(value = "nablarch.tool.openapi.codegen.JavaNablarchJaxrsServerCodegen", date = "2024-12-09T21:46:04.981051647+09:00[Asia/Tokyo]", comments = "Generator version: 7.10.0")
public interface ProjectsApi {
    /**
     * POST  : プロジェクトを作成する
     *
     * 情報を指定してプロジェクトを作成する
     *
     * @param projectRequest プロジェクト登録情報
     * @param jaxRsHttpRequest HTTPリクエスト
     * @param context ハンドラ実行コンテキスト
     * @return project created
     * @return request invalid
     */
    @POST
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    EntityResponse<ProjectResponse> createProject(ProjectRequest projectRequest, JaxRsHttpRequest jaxRsHttpRequest, ExecutionContext context);

    /**
     * DELETE /{id} : プロジェクトを削除する
     *
     * IDを指定してプロジェクトを削除する
     *
     * @param jaxRsHttpRequest HTTPリクエスト
     * @param context ハンドラ実行コンテキスト
     * @return project deleted
     * @return not found project
     */
    @DELETE
    @Path("/{id}")
    HttpResponse deleteProject(JaxRsHttpRequest jaxRsHttpRequest, ExecutionContext context);

    /**
     * GET /{projectId}/clients : プロジェクト内のクライアント一覧取得
     *
     * プロジェクト内のクライアント一覧を取得する
     *
     * @param jaxRsHttpRequest HTTPリクエスト
     * @param context ハンドラ実行コンテキスト
     * @return プロジェクト内のクライアント一覧
     */
    @GET
    @Path("/{projectId}/clients")
    @Produces({ "application/json" })
    EntityResponse<List<Client>> findAllClientsInProject(JaxRsHttpRequest jaxRsHttpRequest, ExecutionContext context);

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

    /**
     * PUT /{id} : プロジェクトを更新する
     *
     * IDを指定してプロジェクトを更新する
     *
     * @param projectRequest プロジェクト更新情報
     * @param jaxRsHttpRequest HTTPリクエスト
     * @param context ハンドラ実行コンテキスト
     * @return project updated
     * @return request invalid
     * @return not found project
     */
    @PUT
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    HttpResponse updateProject(ProjectRequest projectRequest, JaxRsHttpRequest jaxRsHttpRequest, ExecutionContext context);

}
