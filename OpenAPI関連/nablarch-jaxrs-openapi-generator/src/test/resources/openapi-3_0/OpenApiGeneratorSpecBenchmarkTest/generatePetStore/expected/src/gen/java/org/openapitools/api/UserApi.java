package org.openapitools.api;

import nablarch.fw.jaxrs.EntityResponse;
import nablarch.fw.ExecutionContext;
import nablarch.fw.web.HttpResponse;
import nablarch.fw.jaxrs.JaxRsHttpRequest;
import java.util.List;
import java.time.OffsetDateTime;
import org.openapitools.model.User;

import jakarta.ws.rs.*;

@Path("/user")
@jakarta.annotation.Generated(value = "nablarch.tool.openapi.codegen.JavaNablarchJaxrsServerCodegen", date = "2024-12-09T21:42:16.980474344+09:00[Asia/Tokyo]", comments = "Generator version: 7.10.0")
public interface UserApi {
    /**
     * POST  : Create user
     *
     * This can only be done by the logged in user.
     *
     * @param user Created user object
     * @param jaxRsHttpRequest HTTPリクエスト
     * @param context ハンドラ実行コンテキスト
     * @return successful operation
     */
    @POST
    @Consumes({ "application/json" })
    HttpResponse createUser(User user, JaxRsHttpRequest jaxRsHttpRequest, ExecutionContext context);

    /**
     * POST /createWithArray : Creates list of users with given input array
     *
     * 
     *
     * @param user List of user object
     * @param jaxRsHttpRequest HTTPリクエスト
     * @param context ハンドラ実行コンテキスト
     * @return successful operation
     */
    @POST
    @Path("/createWithArray")
    @Consumes({ "application/json" })
    HttpResponse createUsersWithArrayInput(List<User> user, JaxRsHttpRequest jaxRsHttpRequest, ExecutionContext context);

    /**
     * POST /createWithList : Creates list of users with given input array
     *
     * 
     *
     * @param user List of user object
     * @param jaxRsHttpRequest HTTPリクエスト
     * @param context ハンドラ実行コンテキスト
     * @return successful operation
     */
    @POST
    @Path("/createWithList")
    @Consumes({ "application/json" })
    HttpResponse createUsersWithListInput(List<User> user, JaxRsHttpRequest jaxRsHttpRequest, ExecutionContext context);

    /**
     * DELETE /{username} : Delete user
     *
     * This can only be done by the logged in user.
     *
     * @param jaxRsHttpRequest HTTPリクエスト
     * @param context ハンドラ実行コンテキスト
     * @return Invalid username supplied
     * @return User not found
     */
    @DELETE
    @Path("/{username}")
    HttpResponse deleteUser(JaxRsHttpRequest jaxRsHttpRequest, ExecutionContext context);

    /**
     * GET /{username} : Get user by user name
     *
     * 
     *
     * @param jaxRsHttpRequest HTTPリクエスト
     * @param context ハンドラ実行コンテキスト
     * @return successful operation
     * @return Invalid username supplied
     * @return User not found
     */
    @GET
    @Path("/{username}")
    @Produces({ "application/xml", "application/json" })
    EntityResponse<User> getUserByName(JaxRsHttpRequest jaxRsHttpRequest, ExecutionContext context);

    /**
     * GET /login : Logs user into the system
     *
     * 
     *
     * @param jaxRsHttpRequest HTTPリクエスト
     * @param context ハンドラ実行コンテキスト
     * @return successful operation
     * @return Invalid username/password supplied
     */
    @GET
    @Path("/login")
    @Produces({ "application/xml", "application/json" })
    EntityResponse<String> loginUser(JaxRsHttpRequest jaxRsHttpRequest, ExecutionContext context);

    /**
     * GET /logout : Logs out current logged in user session
     *
     * 
     *
     * @param jaxRsHttpRequest HTTPリクエスト
     * @param context ハンドラ実行コンテキスト
     * @return successful operation
     */
    @GET
    @Path("/logout")
    HttpResponse logoutUser(JaxRsHttpRequest jaxRsHttpRequest, ExecutionContext context);

    /**
     * PUT /{username} : Updated user
     *
     * This can only be done by the logged in user.
     *
     * @param user Updated user object
     * @param jaxRsHttpRequest HTTPリクエスト
     * @param context ハンドラ実行コンテキスト
     * @return Invalid user supplied
     * @return User not found
     */
    @PUT
    @Path("/{username}")
    @Consumes({ "application/json" })
    HttpResponse updateUser(User user, JaxRsHttpRequest jaxRsHttpRequest, ExecutionContext context);

}
