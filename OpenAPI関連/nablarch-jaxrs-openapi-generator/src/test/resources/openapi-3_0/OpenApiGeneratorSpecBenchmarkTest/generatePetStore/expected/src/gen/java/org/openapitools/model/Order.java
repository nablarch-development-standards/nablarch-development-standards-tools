package org.openapitools.model;

import java.time.OffsetDateTime;
import java.util.Arrays;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * An order for a pets from the pet store
 */
@JsonTypeName("Order")
@jakarta.annotation.Generated(value = "nablarch.tool.openapi.codegen.JavaNablarchJaxrsServerCodegen", date = "2024-12-09T21:42:16.980474344+09:00[Asia/Tokyo]", comments = "Generator version: 7.10.0")
public class Order   {
  private Long id;
  private Long petId;
  private Integer quantity;
  private OffsetDateTime shipDate;
  public enum StatusEnum {

    PLACED(String.valueOf("placed")), APPROVED(String.valueOf("approved")), DELIVERED(String.valueOf("delivered"));


    private String value;

    StatusEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
        for (StatusEnum b : StatusEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private StatusEnum status;
  private Boolean complete = false;

    /**
     */
    public Order id(Long id) {
        this.id = id;
        return this;
    }

    
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Long id) {
        this.id = id;
    }

    /**
     */
    public Order petId(Long petId) {
        this.petId = petId;
        return this;
    }

    
    @JsonProperty("petId")
    public Long getPetId() {
        return petId;
    }

    @JsonProperty("petId")
    public void setPetId(Long petId) {
        this.petId = petId;
    }

    /**
     */
    public Order quantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    
    @JsonProperty("quantity")
    public Integer getQuantity() {
        return quantity;
    }

    @JsonProperty("quantity")
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     */
    public Order shipDate(OffsetDateTime shipDate) {
        this.shipDate = shipDate;
        return this;
    }

    
    @JsonProperty("shipDate")
    public OffsetDateTime getShipDate() {
        return shipDate;
    }

    @JsonProperty("shipDate")
    public void setShipDate(OffsetDateTime shipDate) {
        this.shipDate = shipDate;
    }

    /**
     * Order Status
     */
    public Order status(StatusEnum status) {
        this.status = status;
        return this;
    }

    
    @JsonProperty("status")
    public StatusEnum getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    /**
     */
    public Order complete(Boolean complete) {
        this.complete = complete;
        return this;
    }

    
    @JsonProperty("complete")
    public Boolean getComplete() {
        return complete;
    }

    @JsonProperty("complete")
    public void setComplete(Boolean complete) {
        this.complete = complete;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Order order = (Order) o;
        return Objects.equals(this.id, order.id) &&
            Objects.equals(this.petId, order.petId) &&
            Objects.equals(this.quantity, order.quantity) &&
            Objects.equals(this.shipDate, order.shipDate) &&
            Objects.equals(this.status, order.status) &&
            Objects.equals(this.complete, order.complete);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, petId, quantity, shipDate, status, complete);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Order {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    petId: ").append(toIndentedString(petId)).append("\n");
        sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
        sb.append("    shipDate: ").append(toIndentedString(shipDate)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    complete: ").append(toIndentedString(complete)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }


}

