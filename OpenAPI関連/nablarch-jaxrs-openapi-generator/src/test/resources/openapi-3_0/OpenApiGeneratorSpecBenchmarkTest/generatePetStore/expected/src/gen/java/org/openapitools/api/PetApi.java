package org.openapitools.api;

import nablarch.fw.jaxrs.EntityResponse;
import nablarch.fw.ExecutionContext;
import java.io.File;
import nablarch.fw.web.HttpResponse;
import nablarch.fw.jaxrs.JaxRsHttpRequest;
import java.util.List;
import org.openapitools.model.ModelApiResponse;
import org.openapitools.model.Pet;

import jakarta.ws.rs.*;

@Path("/pet")
@jakarta.annotation.Generated(value = "nablarch.tool.openapi.codegen.JavaNablarchJaxrsServerCodegen", date = "2024-12-09T21:42:16.980474344+09:00[Asia/Tokyo]", comments = "Generator version: 7.10.0")
public interface PetApi {
    /**
     * POST  : Add a new pet to the store
     *
     * 
     *
     * @param pet Pet object that needs to be added to the store
     * @param jaxRsHttpRequest HTTPリクエスト
     * @param context ハンドラ実行コンテキスト
     * @return successful operation
     * @return Invalid input
     */
    @POST
    @Consumes({ "application/json", "application/xml" })
    @Produces({ "application/xml", "application/json" })
    EntityResponse<Pet> addPet(Pet pet, JaxRsHttpRequest jaxRsHttpRequest, ExecutionContext context);

    /**
     * DELETE /{petId} : Deletes a pet
     *
     * 
     *
     * @param jaxRsHttpRequest HTTPリクエスト
     * @param context ハンドラ実行コンテキスト
     * @return Invalid pet value
     */
    @DELETE
    @Path("/{petId}")
    HttpResponse deletePet(JaxRsHttpRequest jaxRsHttpRequest, ExecutionContext context);

    /**
     * GET /findByStatus : Finds Pets by status
     *
     * Multiple status values can be provided with comma separated strings
     *
     * @param jaxRsHttpRequest HTTPリクエスト
     * @param context ハンドラ実行コンテキスト
     * @return successful operation
     * @return Invalid status value
     */
    @GET
    @Path("/findByStatus")
    @Produces({ "application/xml", "application/json" })
    EntityResponse<List<Pet>> findPetsByStatus(JaxRsHttpRequest jaxRsHttpRequest, ExecutionContext context);

    /**
     * GET /findByTags : Finds Pets by tags
     *
     * Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.
     *
     * @param jaxRsHttpRequest HTTPリクエスト
     * @param context ハンドラ実行コンテキスト
     * @return successful operation
     * @return Invalid tag value
     */
    @GET
    @Path("/findByTags")
    @Produces({ "application/xml", "application/json" })
    EntityResponse<List<Pet>> findPetsByTags(JaxRsHttpRequest jaxRsHttpRequest, ExecutionContext context);

    /**
     * GET /{petId} : Find pet by ID
     *
     * Returns a single pet
     *
     * @param jaxRsHttpRequest HTTPリクエスト
     * @param context ハンドラ実行コンテキスト
     * @return successful operation
     * @return Invalid ID supplied
     * @return Pet not found
     */
    @GET
    @Path("/{petId}")
    @Produces({ "application/xml", "application/json" })
    EntityResponse<Pet> getPetById(JaxRsHttpRequest jaxRsHttpRequest, ExecutionContext context);

    /**
     * PUT  : Update an existing pet
     *
     * 
     *
     * @param pet Pet object that needs to be added to the store
     * @param jaxRsHttpRequest HTTPリクエスト
     * @param context ハンドラ実行コンテキスト
     * @return successful operation
     * @return Invalid ID supplied
     * @return Pet not found
     * @return Validation exception
     */
    @PUT
    @Consumes({ "application/json", "application/xml" })
    @Produces({ "application/xml", "application/json" })
    EntityResponse<Pet> updatePet(Pet pet, JaxRsHttpRequest jaxRsHttpRequest, ExecutionContext context);

    /**
     * POST /{petId} : Updates a pet in the store with form data
     *
     * 
     *
     * @param jaxRsHttpRequest HTTPリクエスト
     * @param context ハンドラ実行コンテキスト
     * @return Invalid input
     */
    @POST
    @Path("/{petId}")
    @Consumes({ "application/x-www-form-urlencoded" })
    HttpResponse updatePetWithForm(JaxRsHttpRequest jaxRsHttpRequest, ExecutionContext context);

    /**
     * POST /{petId}/uploadImage : uploads an image
     *
     * 
     *
     * @param jaxRsHttpRequest HTTPリクエスト
     * @param context ハンドラ実行コンテキスト
     * @return successful operation
     */
    @POST
    @Path("/{petId}/uploadImage")
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/json" })
    EntityResponse<ModelApiResponse> uploadFile(JaxRsHttpRequest jaxRsHttpRequest, ExecutionContext context);

}
