package org.openapitools.model;

import java.util.Arrays;
import java.util.UUID;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * クライアント情報
 */
@JsonTypeName("Client")
@jakarta.annotation.Generated(value = "nablarch.tool.openapi.codegen.JavaNablarchJaxrsServerCodegen", date = "2024-12-09T21:46:06.173255034+09:00[Asia/Tokyo]", comments = "Generator version: 7.10.0")
public class Client   {
  private UUID id;
  private String name;

    protected Client(ClientBuilder<?, ?> b) {
        this.id = b.id;
        this.name = b.name;
    }

    public Client() {
    }

    /**
     * クライアントID
     */
    public Client id(UUID id) {
        this.id = id;
        return this;
    }

    
    @JsonProperty("id")
    public UUID getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(UUID id) {
        this.id = id;
    }

    /**
     * クライアント名
     */
    public Client name(String name) {
        this.name = name;
        return this;
    }

    
    @JsonProperty("name")
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
        Client client = (Client) o;
        return Objects.equals(this.id, client.id) &&
            Objects.equals(this.name, client.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Client {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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


    public static ClientBuilder<?, ?> builder() {
        return new ClientBuilderImpl();
    }

    private static class ClientBuilderImpl extends ClientBuilder<Client, ClientBuilderImpl> {

    @Override
    protected ClientBuilderImpl self() {
        return this;
    }

    @Override
    public Client build() {
        return new Client(this);
    }
  }

    public static abstract class ClientBuilder<C extends Client, B extends ClientBuilder<C, B>>  {
        private UUID id;
        private String name;
        protected abstract B self();

        public abstract C build();

        public B id(UUID id) {
            this.id = id;
            return self();
        }
        public B name(String name) {
            this.name = name;
            return self();
        }
    }
}

