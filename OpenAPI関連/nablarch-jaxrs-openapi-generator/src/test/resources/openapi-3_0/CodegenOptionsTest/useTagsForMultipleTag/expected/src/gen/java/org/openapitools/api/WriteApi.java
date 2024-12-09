package org.openapitools.api;

import nablarch.fw.jaxrs.EntityResponse;
import org.openapitools.model.ErrorResponse;
import nablarch.fw.ExecutionContext;
import nablarch.fw.web.HttpResponse;
import nablarch.fw.jaxrs.JaxRsHttpRequest;
import org.openapitools.model.ProjectRequest;
import org.openapitools.model.ProjectResponse;
import org.openapitools.model.UserRequest;
import org.openapitools.model.UserResponse;

import jakarta.ws.rs.*;

@Path("")
@jakarta.annotation.Generated(value = "nablarch.tool.openapi.codegen.JavaNablarchJaxrsServerCodegen", date = "2024-12-09T21:46:07.682898951+09:00[Asia/Tokyo]", comments = "Generator version: 7.10.0")
public interface WriteApi {
    /**
     * POST /projects : プロジェクトを作成する
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
    @Path("/projects")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    EntityResponse<ProjectResponse> createProject(ProjectRequest projectRequest, JaxRsHttpRequest jaxRsHttpRequest, ExecutionContext context);

    /**
     * POST /users : ユーザを作成する
     *
     * 情報を指定してユーザを作成する
     *
     * @param userRequest ユーザ登録情報
     * @param jaxRsHttpRequest HTTPリクエスト
     * @param context ハンドラ実行コンテキスト
     * @return user created
     * @return request invalid
     */
    @POST
    @Path("/users")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    EntityResponse<UserResponse> createUser(UserRequest userRequest, JaxRsHttpRequest jaxRsHttpRequest, ExecutionContext context);

    /**
     * DELETE /projects/{id} : プロジェクトを削除する
     *
     * IDを指定してプロジェクトを削除する
     *
     * @param jaxRsHttpRequest HTTPリクエスト
     * @param context ハンドラ実行コンテキスト
     * @return project deleted
     * @return not found project
     */
    @DELETE
    @Path("/projects/{id}")
    HttpResponse deleteProject(JaxRsHttpRequest jaxRsHttpRequest, ExecutionContext context);

    /**
     * DELETE /users/{id} : ユーザを削除する
     *
     * IDを指定してユーザを削除する
     *
     * @param jaxRsHttpRequest HTTPリクエスト
     * @param context ハンドラ実行コンテキスト
     * @return user deleted
     * @return not found user
     */
    @DELETE
    @Path("/users/{id}")
    HttpResponse deleteUser(JaxRsHttpRequest jaxRsHttpRequest, ExecutionContext context);

    /**
     * PUT /projects/{id} : プロジェクトを更新する
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
    @Path("/projects/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    HttpResponse updateProject(ProjectRequest projectRequest, JaxRsHttpRequest jaxRsHttpRequest, ExecutionContext context);

    /**
     * PUT /users/{id} : ユーザを更新する
     *
     * IDを指定してユーザを更新する
     *
     * @param userRequest ユーザ更新情報
     * @param jaxRsHttpRequest HTTPリクエスト
     * @param context ハンドラ実行コンテキスト
     * @return user updated
     * @return request invalid
     */
    @PUT
    @Path("/users/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    HttpResponse updateUser(UserRequest userRequest, JaxRsHttpRequest jaxRsHttpRequest, ExecutionContext context);

}
