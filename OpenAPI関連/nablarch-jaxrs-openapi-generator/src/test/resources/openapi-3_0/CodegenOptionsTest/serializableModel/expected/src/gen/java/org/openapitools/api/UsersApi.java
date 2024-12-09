package org.openapitools.api;

import nablarch.fw.jaxrs.EntityResponse;
import org.openapitools.model.ErrorResponse;
import nablarch.fw.ExecutionContext;
import nablarch.fw.web.HttpResponse;
import nablarch.fw.jaxrs.JaxRsHttpRequest;
import java.util.List;
import org.openapitools.model.UserRequest;
import org.openapitools.model.UserResponse;

import jakarta.ws.rs.*;

@Path("/users")
@jakarta.annotation.Generated(value = "nablarch.tool.openapi.codegen.JavaNablarchJaxrsServerCodegen", date = "2024-12-09T21:46:05.399151358+09:00[Asia/Tokyo]", comments = "Generator version: 7.10.0")
public interface UsersApi {
    /**
     * POST  : ユーザを作成する
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
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    EntityResponse<UserResponse> createUser(UserRequest userRequest, JaxRsHttpRequest jaxRsHttpRequest, ExecutionContext context);

    /**
     * DELETE /{id} : ユーザを削除する
     *
     * IDを指定してユーザを削除する
     *
     * @param jaxRsHttpRequest HTTPリクエスト
     * @param context ハンドラ実行コンテキスト
     * @return user deleted
     * @return not found user
     */
    @DELETE
    @Path("/{id}")
    HttpResponse deleteUser(JaxRsHttpRequest jaxRsHttpRequest, ExecutionContext context);

    /**
     * GET  : すべてのユーザを取得する
     *
     * すべてのユーザを取得する。ソート順を指定できる
     *
     * @param jaxRsHttpRequest HTTPリクエスト
     * @param context ハンドラ実行コンテキスト
     * @return find all users
     */
    @GET
    @Produces({ "application/json" })
    EntityResponse<List<UserResponse>> findAllUsers(JaxRsHttpRequest jaxRsHttpRequest, ExecutionContext context);

    /**
     * GET /{id} : ユーザを取得する
     *
     * IDを指定してユーザを取得する
     *
     * @param jaxRsHttpRequest HTTPリクエスト
     * @param context ハンドラ実行コンテキスト
     * @return find user by id
     * @return not found user
     */
    @GET
    @Path("/{id}")
    @Produces({ "application/json" })
    EntityResponse<UserResponse> findUserById(JaxRsHttpRequest jaxRsHttpRequest, ExecutionContext context);

    /**
     * PUT /{id} : ユーザを更新する
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
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    HttpResponse updateUser(UserRequest userRequest, JaxRsHttpRequest jaxRsHttpRequest, ExecutionContext context);

}
