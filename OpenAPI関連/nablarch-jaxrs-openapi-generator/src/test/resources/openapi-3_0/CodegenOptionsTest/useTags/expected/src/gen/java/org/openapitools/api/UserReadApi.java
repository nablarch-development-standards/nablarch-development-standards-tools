package org.openapitools.api;

import nablarch.fw.jaxrs.EntityResponse;
import nablarch.fw.ExecutionContext;
import nablarch.fw.web.HttpResponse;
import nablarch.fw.jaxrs.JaxRsHttpRequest;
import java.util.List;
import org.openapitools.model.UserResponse;

import jakarta.ws.rs.*;

@Path("/users")
@jakarta.annotation.Generated(value = "nablarch.tool.openapi.codegen.JavaNablarchJaxrsServerCodegen", date = "2024-12-09T21:55:14.862304511+09:00[Asia/Tokyo]", comments = "Generator version: 7.10.0")
public interface UserReadApi {
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

}
