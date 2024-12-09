package org.openapitools.model;

import java.util.Arrays;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * エラーレスポンス
 */
@JsonTypeName("ErrorResponse")
@jakarta.annotation.Generated(value = "nablarch.tool.openapi.codegen.JavaNablarchJaxrsServerCodegen", date = "2024-12-09T21:46:06.173255034+09:00[Asia/Tokyo]", comments = "Generator version: 7.10.0")
public class ErrorResponse   {
  private String message;

    protected ErrorResponse(ErrorResponseBuilder<?, ?> b) {
        this.message = b.message;
    }

    public ErrorResponse() {
    }

    /**
     * メッセージ
     */
    public ErrorResponse message(String message) {
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
        ErrorResponse errorResponse = (ErrorResponse) o;
        return Objects.equals(this.message, errorResponse.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ErrorResponse {\n");
        
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


    public static ErrorResponseBuilder<?, ?> builder() {
        return new ErrorResponseBuilderImpl();
    }

    private static class ErrorResponseBuilderImpl extends ErrorResponseBuilder<ErrorResponse, ErrorResponseBuilderImpl> {

    @Override
    protected ErrorResponseBuilderImpl self() {
        return this;
    }

    @Override
    public ErrorResponse build() {
        return new ErrorResponse(this);
    }
  }

    public static abstract class ErrorResponseBuilder<C extends ErrorResponse, B extends ErrorResponseBuilder<C, B>>  {
        private String message;
        protected abstract B self();

        public abstract C build();

        public B message(String message) {
            this.message = message;
            return self();
        }
    }
}

