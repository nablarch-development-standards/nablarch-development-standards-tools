package org.openapitools.model;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Pattern;
import java.util.Arrays;
import nablarch.core.validation.ee.DecimalRange;
import nablarch.core.validation.ee.Length;
import nablarch.core.validation.ee.NumberRange;
import nablarch.core.validation.ee.Required;
import nablarch.core.validation.ee.Size;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;


@JsonTypeName("ValidationResponse")
@jakarta.annotation.Generated(value = "nablarch.tool.openapi.codegen.JavaNablarchJaxrsServerCodegen", date = "2024-12-09T21:40:02.319711249+09:00[Asia/Tokyo]", comments = "Generator version: 7.10.0")
public class ValidationResponse   {
  private String message;

    /**
     */
    public ValidationResponse message(String message) {
        this.message = message;
        return this;
    }

    
    @JsonProperty("message")
    
    public String getMessage() {
        return message;
    }

    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ValidationResponse validationResponse = (ValidationResponse) o;
        return Objects.equals(this.message, validationResponse.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ValidationResponse {\n");
        
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

