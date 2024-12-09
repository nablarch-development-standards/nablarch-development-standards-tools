package org.openapitools.api;

import org.openapitools.model.Client;
import nablarch.fw.jaxrs.EntityResponse;
import nablarch.fw.ExecutionContext;
import nablarch.fw.web.HttpResponse;
import nablarch.fw.jaxrs.JaxRsHttpRequest;
import java.util.List;
import org.openapitools.model.ProjectResponse;
import org.openapitools.model.UserResponse;

import jakarta.ws.rs.*;

@Path("")
@jakarta.annotation.Generated(value = "nablarch.tool.openapi.codegen.JavaNablarchJaxrsServerCodegen", date = "2024-12-09T21:46:07.682898951+09:00[Asia/Tokyo]", comments = "Generator version: 7.10.0")
public interface ReadApi {
    /**
     * GET /projects/{projectId}/clients : プロジェクト内のクライアント一覧取得
     *
     * プロジェクト内のクライアント一覧を取得する
     *
     * @param jaxRsHttpRequest HTTPリクエスト
     * @param context ハンドラ実行コンテキスト
     * @return プロジェクト内のクライアント一覧
     */
    @GET
    @Path("/projects/{projectId}/clients")
    @Produces({ "application/json" })
    EntityResponse<List<Client>> findAllClientsInProject(JaxRsHttpRequest jaxRsHttpRequest, ExecutionContext context);

    /**
     * GET /projects : すべてのプロジェクトを取得する
     *
     * すべてのプロジェクトを取得する。タグとソート順を指定できる
     *
     * @param jaxRsHttpRequest HTTPリクエスト
     * @param context ハンドラ実行コンテキスト
     * @return find all projects
     */
    @GET
    @Path("/projects")
    @Produces({ "application/json" })
    EntityResponse<List<ProjectResponse>> findAllProjects(JaxRsHttpRequest jaxRsHttpRequest, ExecutionContext context);

    /**
     * GET /users : すべてのユーザを取得する
     *
     * すべてのユーザを取得する。ソート順を指定できる
     *
     * @param jaxRsHttpRequest HTTPリクエスト
     * @param context ハンドラ実行コンテキスト
     * @return find all users
     */
    @GET
    @Path("/users")
    @Produces({ "application/json" })
    EntityResponse<List<UserResponse>> findAllUsers(JaxRsHttpRequest jaxRsHttpRequest, ExecutionContext context);

    /**
     * GET /projects/{id} : プロジェクトを取得する
     *
     * IDを指定してプロジェクトを取得する
     *
     * @param jaxRsHttpRequest HTTPリクエスト
     * @param context ハンドラ実行コンテキスト
     * @return find project by id
     * @return not found project
     */
    @GET
    @Path("/projects/{id}")
    @Produces({ "application/json" })
    EntityResponse<ProjectResponse> findProjectById(JaxRsHttpRequest jaxRsHttpRequest, ExecutionContext context);

    /**
     * GET /users/{id} : ユーザを取得する
     *
     * IDを指定してユーザを取得する
     *
     * @param jaxRsHttpRequest HTTPリクエスト
     * @param context ハンドラ実行コンテキスト
     * @return find user by id
     * @return not found user
     */
    @GET
    @Path("/users/{id}")
    @Produces({ "application/json" })
    EntityResponse<UserResponse> findUserById(JaxRsHttpRequest jaxRsHttpRequest, ExecutionContext context);

}
