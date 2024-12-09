package org.openapitools.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.openapitools.model.DataSubTypeRequest;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;


@JsonTypeName("DataTypeRequest")
@jakarta.annotation.Generated(value = "nablarch.tool.openapi.codegen.JavaNablarchJaxrsServerCodegen", date = "2024-12-09T21:43:48.837689355+09:00[Asia/Tokyo]", comments = "Generator version: 7.10.0")
public class DataTypeRequest   {
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
  private DataSubTypeRequest objectProperty;
  private List<DataSubTypeRequest> arrayObjectProperty = new ArrayList<>();

    /**
     */
    public DataTypeRequest integerProperty(String integerProperty) {
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
    public DataTypeRequest integerInt32Property(String integerInt32Property) {
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
    public DataTypeRequest integerInt64Property(String integerInt64Property) {
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
    public DataTypeRequest numberProperty(String numberProperty) {
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
    public DataTypeRequest numberFloatProperty(String numberFloatProperty) {
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
    public DataTypeRequest numberDoubleProperty(String numberDoubleProperty) {
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
    public DataTypeRequest booleanProperty(String booleanProperty) {
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
    public DataTypeRequest stringProperty(String stringProperty) {
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
    public DataTypeRequest stringByteArrayProperty(String stringByteArrayProperty) {
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
    public DataTypeRequest stringDateProperty(String stringDateProperty) {
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
    public DataTypeRequest stringDateTimeProperty(String stringDateTimeProperty) {
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
    public DataTypeRequest stringNumberProperty(String stringNumberProperty) {
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
    public DataTypeRequest stringUuidProperty(String stringUuidProperty) {
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
    public DataTypeRequest stringUriProperty(String stringUriProperty) {
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
    public DataTypeRequest arrayProperty(List<String> arrayProperty) {
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

    public DataTypeRequest addArrayPropertyItem(String arrayPropertyItem) {
        if (this.arrayProperty == null) {
            this.arrayProperty = new ArrayList<>();
        }

        this.arrayProperty.add(arrayPropertyItem);
        return this;
    }

    public DataTypeRequest removeArrayPropertyItem(String arrayPropertyItem) {
        if (arrayPropertyItem != null && this.arrayProperty != null) {
            this.arrayProperty.remove(arrayPropertyItem);
        }

        return this;
    }
    /**
     */
    public DataTypeRequest arrayUniqueItemsConstraintProperty(Set<String> arrayUniqueItemsConstraintProperty) {
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

    public DataTypeRequest addArrayUniqueItemsConstraintPropertyItem(String arrayUniqueItemsConstraintPropertyItem) {
        if (this.arrayUniqueItemsConstraintProperty == null) {
            this.arrayUniqueItemsConstraintProperty = new LinkedHashSet<>();
        }

        this.arrayUniqueItemsConstraintProperty.add(arrayUniqueItemsConstraintPropertyItem);
        return this;
    }

    public DataTypeRequest removeArrayUniqueItemsConstraintPropertyItem(String arrayUniqueItemsConstraintPropertyItem) {
        if (arrayUniqueItemsConstraintPropertyItem != null && this.arrayUniqueItemsConstraintProperty != null) {
            this.arrayUniqueItemsConstraintProperty.remove(arrayUniqueItemsConstraintPropertyItem);
        }

        return this;
    }
    /**
     */
    public DataTypeRequest objectProperty(DataSubTypeRequest objectProperty) {
        this.objectProperty = objectProperty;
        return this;
    }

    
    @JsonProperty("objectProperty")
    public DataSubTypeRequest getObjectProperty() {
        return objectProperty;
    }

    @JsonProperty("objectProperty")
    public void setObjectProperty(DataSubTypeRequest objectProperty) {
        this.objectProperty = objectProperty;
    }

    /**
     */
    public DataTypeRequest arrayObjectProperty(List<DataSubTypeRequest> arrayObjectProperty) {
        this.arrayObjectProperty = arrayObjectProperty;
        return this;
    }

    
    @JsonProperty("arrayObjectProperty")
    public List<DataSubTypeRequest> getArrayObjectProperty() {
        return arrayObjectProperty;
    }

    @JsonProperty("arrayObjectProperty")
    public void setArrayObjectProperty(List<DataSubTypeRequest> arrayObjectProperty) {
        this.arrayObjectProperty = arrayObjectProperty;
    }

    public DataTypeRequest addArrayObjectPropertyItem(DataSubTypeRequest arrayObjectPropertyItem) {
        if (this.arrayObjectProperty == null) {
            this.arrayObjectProperty = new ArrayList<>();
        }

        this.arrayObjectProperty.add(arrayObjectPropertyItem);
        return this;
    }

    public DataTypeRequest removeArrayObjectPropertyItem(DataSubTypeRequest arrayObjectPropertyItem) {
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
        DataTypeRequest dataTypeRequest = (DataTypeRequest) o;
        return Objects.equals(this.integerProperty, dataTypeRequest.integerProperty) &&
            Objects.equals(this.integerInt32Property, dataTypeRequest.integerInt32Property) &&
            Objects.equals(this.integerInt64Property, dataTypeRequest.integerInt64Property) &&
            Objects.equals(this.numberProperty, dataTypeRequest.numberProperty) &&
            Objects.equals(this.numberFloatProperty, dataTypeRequest.numberFloatProperty) &&
            Objects.equals(this.numberDoubleProperty, dataTypeRequest.numberDoubleProperty) &&
            Objects.equals(this.booleanProperty, dataTypeRequest.booleanProperty) &&
            Objects.equals(this.stringProperty, dataTypeRequest.stringProperty) &&
            Arrays.equals(this.stringByteArrayProperty, dataTypeRequest.stringByteArrayProperty) &&
            Objects.equals(this.stringDateProperty, dataTypeRequest.stringDateProperty) &&
            Objects.equals(this.stringDateTimeProperty, dataTypeRequest.stringDateTimeProperty) &&
            Objects.equals(this.stringNumberProperty, dataTypeRequest.stringNumberProperty) &&
            Objects.equals(this.stringUuidProperty, dataTypeRequest.stringUuidProperty) &&
            Objects.equals(this.stringUriProperty, dataTypeRequest.stringUriProperty) &&
            Objects.equals(this.arrayProperty, dataTypeRequest.arrayProperty) &&
            Objects.equals(this.arrayUniqueItemsConstraintProperty, dataTypeRequest.arrayUniqueItemsConstraintProperty) &&
            Objects.equals(this.objectProperty, dataTypeRequest.objectProperty) &&
            Objects.equals(this.arrayObjectProperty, dataTypeRequest.arrayObjectProperty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(integerProperty, integerInt32Property, integerInt64Property, numberProperty, numberFloatProperty, numberDoubleProperty, booleanProperty, stringProperty, Arrays.hashCode(stringByteArrayProperty), stringDateProperty, stringDateTimeProperty, stringNumberProperty, stringUuidProperty, stringUriProperty, arrayProperty, arrayUniqueItemsConstraintProperty, objectProperty, arrayObjectProperty);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataTypeRequest {\n");
        
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

