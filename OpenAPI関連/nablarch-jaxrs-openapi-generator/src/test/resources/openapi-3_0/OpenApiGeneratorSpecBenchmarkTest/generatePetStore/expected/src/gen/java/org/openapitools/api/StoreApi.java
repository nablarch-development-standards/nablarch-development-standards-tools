package org.openapitools.api;

import nablarch.fw.jaxrs.EntityResponse;
import nablarch.fw.ExecutionContext;
import nablarch.fw.web.HttpResponse;
import nablarch.fw.jaxrs.JaxRsHttpRequest;
import java.util.Map;
import org.openapitools.model.Order;

import jakarta.ws.rs.*;

@Path("/store")
@jakarta.annotation.Generated(value = "nablarch.tool.openapi.codegen.JavaNablarchJaxrsServerCodegen", date = "2024-12-09T21:42:16.980474344+09:00[Asia/Tokyo]", comments = "Generator version: 7.10.0")
public interface StoreApi {
    /**
     * DELETE /order/{orderId} : Delete purchase order by ID
     *
     * For valid response try integer IDs with value &lt; 1000. Anything above 1000 or nonintegers will generate API errors
     *
     * @param jaxRsHttpRequest HTTPリクエスト
     * @param context ハンドラ実行コンテキスト
     * @return Invalid ID supplied
     * @return Order not found
     */
    @DELETE
    @Path("/order/{orderId}")
    HttpResponse deleteOrder(JaxRsHttpRequest jaxRsHttpRequest, ExecutionContext context);

    /**
     * GET /inventory : Returns pet inventories by status
     *
     * Returns a map of status codes to quantities
     *
     * @param jaxRsHttpRequest HTTPリクエスト
     * @param context ハンドラ実行コンテキスト
     * @return successful operation
     */
    @GET
    @Path("/inventory")
    @Produces({ "application/json" })
    EntityResponse<Map<String, Integer>> getInventory(JaxRsHttpRequest jaxRsHttpRequest, ExecutionContext context);

    /**
     * GET /order/{orderId} : Find purchase order by ID
     *
     * For valid response try integer IDs with value &lt;&#x3D; 5 or &gt; 10. Other values will generate exceptions
     *
     * @param jaxRsHttpRequest HTTPリクエスト
     * @param context ハンドラ実行コンテキスト
     * @return successful operation
     * @return Invalid ID supplied
     * @return Order not found
     */
    @GET
    @Path("/order/{orderId}")
    @Produces({ "application/xml", "application/json" })
    EntityResponse<Order> getOrderById(JaxRsHttpRequest jaxRsHttpRequest, ExecutionContext context);

    /**
     * POST /order : Place an order for a pet
     *
     * 
     *
     * @param order order placed for purchasing the pet
     * @param jaxRsHttpRequest HTTPリクエスト
     * @param context ハンドラ実行コンテキスト
     * @return successful operation
     * @return Invalid Order
     */
    @POST
    @Path("/order")
    @Consumes({ "application/json" })
    @Produces({ "application/xml", "application/json" })
    EntityResponse<Order> placeOrder(Order order, JaxRsHttpRequest jaxRsHttpRequest, ExecutionContext context);

}
