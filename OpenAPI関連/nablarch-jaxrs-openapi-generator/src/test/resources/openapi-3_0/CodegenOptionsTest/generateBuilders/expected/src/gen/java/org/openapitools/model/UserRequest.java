package org.openapitools.model;

import java.time.LocalDate;
import java.util.Arrays;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ユーザ登録・更新情報
 */
@JsonTypeName("UserRequest")
@jakarta.annotation.Generated(value = "nablarch.tool.openapi.codegen.JavaNablarchJaxrsServerCodegen", date = "2024-12-09T21:46:06.173255034+09:00[Asia/Tokyo]", comments = "Generator version: 7.10.0")
public class UserRequest   {
  private String firstName;
  private String lastName;
  private Integer age;
  private LocalDate birthday;

    protected UserRequest(UserRequestBuilder<?, ?> b) {
        this.firstName = b.firstName;
        this.lastName = b.lastName;
        this.age = b.age;
        this.birthday = b.birthday;
    }

    public UserRequest() {
    }

    /**
     * 名
     */
    public UserRequest firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    
    @JsonProperty("firstName")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("firstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * 姓
     */
    public UserRequest lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    
    @JsonProperty("lastName")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty("lastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * 年齢
     * minimum: 1
     */
    public UserRequest age(Integer age) {
        this.age = age;
        return this;
    }

    
    @JsonProperty("age")
    public Integer getAge() {
        return age;
    }

    @JsonProperty("age")
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * 誕生日
     */
    public UserRequest birthday(LocalDate birthday) {
        this.birthday = birthday;
        return this;
    }

    
    @JsonProperty("birthday")
    public LocalDate getBirthday() {
        return birthday;
    }

    @JsonProperty("birthday")
    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserRequest userRequest = (UserRequest) o;
        return Objects.equals(this.firstName, userRequest.firstName) &&
            Objects.equals(this.lastName, userRequest.lastName) &&
            Objects.equals(this.age, userRequest.age) &&
            Objects.equals(this.birthday, userRequest.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age, birthday);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserRequest {\n");
        
        sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
        sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
        sb.append("    age: ").append(toIndentedString(age)).append("\n");
        sb.append("    birthday: ").append(toIndentedString(birthday)).append("\n");
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


    public static UserRequestBuilder<?, ?> builder() {
        return new UserRequestBuilderImpl();
    }

    private static class UserRequestBuilderImpl extends UserRequestBuilder<UserRequest, UserRequestBuilderImpl> {

    @Override
    protected UserRequestBuilderImpl self() {
        return this;
    }

    @Override
    public UserRequest build() {
        return new UserRequest(this);
    }
  }

    public static abstract class UserRequestBuilder<C extends UserRequest, B extends UserRequestBuilder<C, B>>  {
        private String firstName;
        private String lastName;
        private Integer age;
        private LocalDate birthday;
        protected abstract B self();

        public abstract C build();

        public B firstName(String firstName) {
            this.firstName = firstName;
            return self();
        }
        public B lastName(String lastName) {
            this.lastName = lastName;
            return self();
        }
        public B age(Integer age) {
            this.age = age;
            return self();
        }
        public B birthday(LocalDate birthday) {
            this.birthday = birthday;
            return self();
        }
    }
}

