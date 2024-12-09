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


@JsonTypeName("ValidationSubRequest")
@jakarta.annotation.Generated(value = "nablarch.tool.openapi.codegen.JavaNablarchJaxrsServerCodegen", date = "2024-12-09T21:40:02.319711249+09:00[Asia/Tokyo]", comments = "Generator version: 7.10.0")
public class ValidationSubRequest   {
  private String name;

    /**
     */
    public ValidationSubRequest name(String name) {
        this.name = name;
        return this;
    }

    
    @JsonProperty("name")
    @Required 
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ValidationSubRequest validationSubRequest = (ValidationSubRequest) o;
        return Objects.equals(this.name, validationSubRequest.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ValidationSubRequest {\n");
        
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

