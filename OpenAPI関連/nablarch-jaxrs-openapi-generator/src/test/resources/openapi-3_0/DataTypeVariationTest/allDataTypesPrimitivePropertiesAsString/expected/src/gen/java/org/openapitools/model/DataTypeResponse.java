package org.openapitools.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.openapitools.model.DataSubTypeResponse;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;


@JsonTypeName("DataTypeResponse")
@jakarta.annotation.Generated(value = "nablarch.tool.openapi.codegen.JavaNablarchJaxrsServerCodegen", date = "2024-12-09T21:43:48.837689355+09:00[Asia/Tokyo]", comments = "Generator version: 7.10.0")
public class DataTypeResponse   {
  private String integerProperty;
  private String integerInt32Property;
  private String integerInt64Property;
  private String numberProperty;
  private String numberFloatProperty;
  private String numberDoubleProperty;
  private String booleanProperty;
  private String stringProperty;
  private String stringByteArrayProperty;
  private String stringDateProperty;
  private String stringDateTimeProperty;
  private String stringNumberProperty;
  private String stringUuidProperty;
  private String stringUriProperty;
  private List<String> arrayProperty = new ArrayList<>();
  private Set<String> arrayUniqueItemsConstraintProperty = new LinkedHashSet<>();
  private DataSubTypeResponse objectProperty;
  private List<DataSubTypeResponse> arrayObjectProperty = new ArrayList<>();

    /**
     */
    public DataTypeResponse integerProperty(String integerProperty) {
        this.integerProperty = integerProperty;
        return this;
    }

    
    @JsonProperty("integerProperty")
    public String getIntegerProperty() {
        return integerProperty;
    }

    @JsonProperty("integerProperty")
    public void setIntegerProperty(String integerProperty) {
        this.integerProperty = integerProperty;
    }

    /**
     */
    public DataTypeResponse integerInt32Property(String integerInt32Property) {
        this.integerInt32Property = integerInt32Property;
        return this;
    }

    
    @JsonProperty("integerInt32Property")
    public String getIntegerInt32Property() {
        return integerInt32Property;
    }

    @JsonProperty("integerInt32Property")
    public void setIntegerInt32Property(String integerInt32Property) {
        this.integerInt32Property = integerInt32Property;
    }

    /**
     */
    public DataTypeResponse integerInt64Property(String integerInt64Property) {
        this.integerInt64Property = integerInt64Property;
        return this;
    }

    
    @JsonProperty("integerInt64Property")
    public String getIntegerInt64Property() {
        return integerInt64Property;
    }

    @JsonProperty("integerInt64Property")
    public void setIntegerInt64Property(String integerInt64Property) {
        this.integerInt64Property = integerInt64Property;
    }

    /**
     */
    public DataTypeResponse numberProperty(String numberProperty) {
        this.numberProperty = numberProperty;
        return this;
    }

    
    @JsonProperty("numberProperty")
    public String getNumberProperty() {
        return numberProperty;
    }

    @JsonProperty("numberProperty")
    public void setNumberProperty(String numberProperty) {
        this.numberProperty = numberProperty;
    }

    /**
     */
    public DataTypeResponse numberFloatProperty(String numberFloatProperty) {
        this.numberFloatProperty = numberFloatProperty;
        return this;
    }

    
    @JsonProperty("numberFloatProperty")
    public String getNumberFloatProperty() {
        return numberFloatProperty;
    }

    @JsonProperty("numberFloatProperty")
    public void setNumberFloatProperty(String numberFloatProperty) {
        this.numberFloatProperty = numberFloatProperty;
    }

    /**
     */
    public DataTypeResponse numberDoubleProperty(String numberDoubleProperty) {
        this.numberDoubleProperty = numberDoubleProperty;
        return this;
    }

    
    @JsonProperty("numberDoubleProperty")
    public String getNumberDoubleProperty() {
        return numberDoubleProperty;
    }

    @JsonProperty("numberDoubleProperty")
    public void setNumberDoubleProperty(String numberDoubleProperty) {
        this.numberDoubleProperty = numberDoubleProperty;
    }

    /**
     */
    public DataTypeResponse booleanProperty(String booleanProperty) {
        this.booleanProperty = booleanProperty;
        return this;
    }

    
    @JsonProperty("booleanProperty")
    public String getBooleanProperty() {
        return booleanProperty;
    }

    @JsonProperty("booleanProperty")
    public void setBooleanProperty(String booleanProperty) {
        this.booleanProperty = booleanProperty;
    }

    /**
     */
    public DataTypeResponse stringProperty(String stringProperty) {
        this.stringProperty = stringProperty;
        return this;
    }

    
    @JsonProperty("stringProperty")
    public String getStringProperty() {
        return stringProperty;
    }

    @JsonProperty("stringProperty")
    public void setStringProperty(String stringProperty) {
        this.stringProperty = stringProperty;
    }

    /**
     */
    public DataTypeResponse stringByteArrayProperty(String stringByteArrayProperty) {
        this.stringByteArrayProperty = stringByteArrayProperty;
        return this;
    }

    
    @JsonProperty("stringByteArrayProperty")
    public String getStringByteArrayProperty() {
        return stringByteArrayProperty;
    }

    @JsonProperty("stringByteArrayProperty")
    public void setStringByteArrayProperty(String stringByteArrayProperty) {
        this.stringByteArrayProperty = stringByteArrayProperty;
    }

    /**
     */
    public DataTypeResponse stringDateProperty(String stringDateProperty) {
        this.stringDateProperty = stringDateProperty;
        return this;
    }

    
    @JsonProperty("stringDateProperty")
    public String getStringDateProperty() {
        return stringDateProperty;
    }

    @JsonProperty("stringDateProperty")
    public void setStringDateProperty(String stringDateProperty) {
        this.stringDateProperty = stringDateProperty;
    }

    /**
     */
    public DataTypeResponse stringDateTimeProperty(String stringDateTimeProperty) {
        this.stringDateTimeProperty = stringDateTimeProperty;
        return this;
    }

    
    @JsonProperty("stringDateTimeProperty")
    public String getStringDateTimeProperty() {
        return stringDateTimeProperty;
    }

    @JsonProperty("stringDateTimeProperty")
    public void setStringDateTimeProperty(String stringDateTimeProperty) {
        this.stringDateTimeProperty = stringDateTimeProperty;
    }

    /**
     */
    public DataTypeResponse stringNumberProperty(String stringNumberProperty) {
        this.stringNumberProperty = stringNumberProperty;
        return this;
    }

    
    @JsonProperty("stringNumberProperty")
    public String getStringNumberProperty() {
        return stringNumberProperty;
    }

    @JsonProperty("stringNumberProperty")
    public void setStringNumberProperty(String stringNumberProperty) {
        this.stringNumberProperty = stringNumberProperty;
    }

    /**
     */
    public DataTypeResponse stringUuidProperty(String stringUuidProperty) {
        this.stringUuidProperty = stringUuidProperty;
        return this;
    }

    
    @JsonProperty("stringUuidProperty")
    public String getStringUuidProperty() {
        return stringUuidProperty;
    }

    @JsonProperty("stringUuidProperty")
    public void setStringUuidProperty(String stringUuidProperty) {
        this.stringUuidProperty = stringUuidProperty;
    }

    /**
     */
    public DataTypeResponse stringUriProperty(String stringUriProperty) {
        this.stringUriProperty = stringUriProperty;
        return this;
    }

    
    @JsonProperty("stringUriProperty")
    public String getStringUriProperty() {
        return stringUriProperty;
    }

    @JsonProperty("stringUriProperty")
    public void setStringUriProperty(String stringUriProperty) {
        this.stringUriProperty = stringUriProperty;
    }

    /**
     */
    public DataTypeResponse arrayProperty(List<String> arrayProperty) {
        this.arrayProperty = arrayProperty;
        return this;
    }

    
    @JsonProperty("arrayProperty")
    public List<String> getArrayProperty() {
        return arrayProperty;
    }

    @JsonProperty("arrayProperty")
    public void setArrayProperty(List<String> arrayProperty) {
        this.arrayProperty = arrayProperty;
    }

    public DataTypeResponse addArrayPropertyItem(String arrayPropertyItem) {
        if (this.arrayProperty == null) {
            this.arrayProperty = new ArrayList<>();
        }

        this.arrayProperty.add(arrayPropertyItem);
        return this;
    }

    public DataTypeResponse removeArrayPropertyItem(String arrayPropertyItem) {
        if (arrayPropertyItem != null && this.arrayProperty != null) {
            this.arrayProperty.remove(arrayPropertyItem);
        }

        return this;
    }
    /**
     */
    public DataTypeResponse arrayUniqueItemsConstraintProperty(Set<String> arrayUniqueItemsConstraintProperty) {
        this.arrayUniqueItemsConstraintProperty = arrayUniqueItemsConstraintProperty;
        return this;
    }

    
    @JsonProperty("arrayUniqueItemsConstraintProperty")
    public Set<String> getArrayUniqueItemsConstraintProperty() {
        return arrayUniqueItemsConstraintProperty;
    }

    @JsonProperty("arrayUniqueItemsConstraintProperty")
    @JsonDeserialize(as = LinkedHashSet.class)
    public void setArrayUniqueItemsConstraintProperty(Set<String> arrayUniqueItemsConstraintProperty) {
        this.arrayUniqueItemsConstraintProperty = arrayUniqueItemsConstraintProperty;
    }

    public DataTypeResponse addArrayUniqueItemsConstraintPropertyItem(String arrayUniqueItemsConstraintPropertyItem) {
        if (this.arrayUniqueItemsConstraintProperty == null) {
            this.arrayUniqueItemsConstraintProperty = new LinkedHashSet<>();
        }

        this.arrayUniqueItemsConstraintProperty.add(arrayUniqueItemsConstraintPropertyItem);
        return this;
    }

    public DataTypeResponse removeArrayUniqueItemsConstraintPropertyItem(String arrayUniqueItemsConstraintPropertyItem) {
        if (arrayUniqueItemsConstraintPropertyItem != null && this.arrayUniqueItemsConstraintProperty != null) {
            this.arrayUniqueItemsConstraintProperty.remove(arrayUniqueItemsConstraintPropertyItem);
        }

        return this;
    }
    /**
     */
    public DataTypeResponse objectProperty(DataSubTypeResponse objectProperty) {
        this.objectProperty = objectProperty;
        return this;
    }

    
    @JsonProperty("objectProperty")
    public DataSubTypeResponse getObjectProperty() {
        return objectProperty;
    }

    @JsonProperty("objectProperty")
    public void setObjectProperty(DataSubTypeResponse objectProperty) {
        this.objectProperty = objectProperty;
    }

    /**
     */
    public DataTypeResponse arrayObjectProperty(List<DataSubTypeResponse> arrayObjectProperty) {
        this.arrayObjectProperty = arrayObjectProperty;
        return this;
    }

    
    @JsonProperty("arrayObjectProperty")
    public List<DataSubTypeResponse> getArrayObjectProperty() {
        return arrayObjectProperty;
    }

    @JsonProperty("arrayObjectProperty")
    public void setArrayObjectProperty(List<DataSubTypeResponse> arrayObjectProperty) {
        this.arrayObjectProperty = arrayObjectProperty;
    }

    public DataTypeResponse addArrayObjectPropertyItem(DataSubTypeResponse arrayObjectPropertyItem) {
        if (this.arrayObjectProperty == null) {
            this.arrayObjectProperty = new ArrayList<>();
        }

        this.arrayObjectProperty.add(arrayObjectPropertyItem);
        return this;
    }

    public DataTypeResponse removeArrayObjectPropertyItem(DataSubTypeResponse arrayObjectPropertyItem) {
        if (arrayObjectPropertyItem != null && this.arrayObjectProperty != null) {
            this.arrayObjectProperty.remove(arrayObjectPropertyItem);
        }

        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DataTypeResponse dataTypeResponse = (DataTypeResponse) o;
        return Objects.equals(this.integerProperty, dataTypeResponse.integerProperty) &&
            Objects.equals(this.integerInt32Property, dataTypeResponse.integerInt32Property) &&
            Objects.equals(this.integerInt64Property, dataTypeResponse.integerInt64Property) &&
            Objects.equals(this.numberProperty, dataTypeResponse.numberProperty) &&
            Objects.equals(this.numberFloatProperty, dataTypeResponse.numberFloatProperty) &&
            Objects.equals(this.numberDoubleProperty, dataTypeResponse.numberDoubleProperty) &&
            Objects.equals(this.booleanProperty, dataTypeResponse.booleanProperty) &&
            Objects.equals(this.stringProperty, dataTypeResponse.stringProperty) &&
            Arrays.equals(this.stringByteArrayProperty, dataTypeResponse.stringByteArrayProperty) &&
            Objects.equals(this.stringDateProperty, dataTypeResponse.stringDateProperty) &&
            Objects.equals(this.stringDateTimeProperty, dataTypeResponse.stringDateTimeProperty) &&
            Objects.equals(this.stringNumberProperty, dataTypeResponse.stringNumberProperty) &&
            Objects.equals(this.stringUuidProperty, dataTypeResponse.stringUuidProperty) &&
            Objects.equals(this.stringUriProperty, dataTypeResponse.stringUriProperty) &&
            Objects.equals(this.arrayProperty, dataTypeResponse.arrayProperty) &&
            Objects.equals(this.arrayUniqueItemsConstraintProperty, dataTypeResponse.arrayUniqueItemsConstraintProperty) &&
            Objects.equals(this.objectProperty, dataTypeResponse.objectProperty) &&
            Objects.equals(this.arrayObjectProperty, dataTypeResponse.arrayObjectProperty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(integerProperty, integerInt32Property, integerInt64Property, numberProperty, numberFloatProperty, numberDoubleProperty, booleanProperty, stringProperty, Arrays.hashCode(stringByteArrayProperty), stringDateProperty, stringDateTimeProperty, stringNumberProperty, stringUuidProperty, stringUriProperty, arrayProperty, arrayUniqueItemsConstraintProperty, objectProperty, arrayObjectProperty);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataTypeResponse {\n");
        
        sb.append("    integerProperty: ").append(toIndentedString(integerProperty)).append("\n");
        sb.append("    integerInt32Property: ").append(toIndentedString(integerInt32Property)).append("\n");
        sb.append("    integerInt64Property: ").append(toIndentedString(integerInt64Property)).append("\n");
        sb.append("    numberProperty: ").append(toIndentedString(numberProperty)).append("\n");
        sb.append("    numberFloatProperty: ").append(toIndentedString(numberFloatProperty)).append("\n");
        sb.append("    numberDoubleProperty: ").append(toIndentedString(numberDoubleProperty)).append("\n");
        sb.append("    booleanProperty: ").append(toIndentedString(booleanProperty)).append("\n");
        sb.append("    stringProperty: ").append(toIndentedString(stringProperty)).append("\n");
        sb.append("    stringByteArrayProperty: ").append(toIndentedString(stringByteArrayProperty)).append("\n");
        sb.append("    stringDateProperty: ").append(toIndentedString(stringDateProperty)).append("\n");
        sb.append("    stringDateTimeProperty: ").append(toIndentedString(stringDateTimeProperty)).append("\n");
        sb.append("    stringNumberProperty: ").append(toIndentedString(stringNumberProperty)).append("\n");
        sb.append("    stringUuidProperty: ").append(toIndentedString(stringUuidProperty)).append("\n");
        sb.append("    stringUriProperty: ").append(toIndentedString(stringUriProperty)).append("\n");
        sb.append("    arrayProperty: ").append(toIndentedString(arrayProperty)).append("\n");
        sb.append("    arrayUniqueItemsConstraintProperty: ").append(toIndentedString(arrayUniqueItemsConstraintProperty)).append("\n");
        sb.append("    objectProperty: ").append(toIndentedString(objectProperty)).append("\n");
        sb.append("    arrayObjectProperty: ").append(toIndentedString(arrayObjectProperty)).append("\n");
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

