package org.openapitools.model;

import java.time.LocalDate;
import java.util.Arrays;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ユーザ情報
 */
@JsonTypeName("UserResponse")
@jakarta.annotation.Generated(value = "nablarch.tool.openapi.codegen.JavaNablarchJaxrsServerCodegen", date = "2024-12-09T21:46:04.420411643+09:00[Asia/Tokyo]", comments = "Generator version: 7.10.0")
@jakarta.enterprise.context.SessionScoped
@jakarta.enterprise.context.RequestScoped
public class UserResponse   {
  private String firstName;
  private String lastName;
  private Integer age;
  private LocalDate birthday;

    /**
     * 名
     */
    public UserResponse firstName(String firstName) {
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
    public UserResponse lastName(String lastName) {
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
     */
    public UserResponse age(Integer age) {
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
    public UserResponse birthday(LocalDate birthday) {
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
        UserResponse userResponse = (UserResponse) o;
        return Objects.equals(this.firstName, userResponse.firstName) &&
            Objects.equals(this.lastName, userResponse.lastName) &&
            Objects.equals(this.age, userResponse.age) &&
            Objects.equals(this.birthday, userResponse.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age, birthday);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserResponse {\n");
        
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


}

