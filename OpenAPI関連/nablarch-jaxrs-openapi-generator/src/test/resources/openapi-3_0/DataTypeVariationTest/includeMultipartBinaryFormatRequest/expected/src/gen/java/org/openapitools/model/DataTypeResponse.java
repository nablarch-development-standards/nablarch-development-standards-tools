package org.openapitools.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.math.BigDecimal;
import java.net.URI;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import org.openapitools.model.DataSubTypeResponse;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;


@JsonTypeName("DataTypeResponse")
@jakarta.annotation.Generated(value = "nablarch.tool.openapi.codegen.JavaNablarchJaxrsServerCodegen", date = "2024-12-09T21:43:46.796582783+09:00[Asia/Tokyo]", comments = "Generator version: 7.10.0")
public class DataTypeResponse   {
  private Integer integerProperty;
  private Integer integerInt32Property;
  private Long integerInt64Property;
  private BigDecimal numberProperty;
  private Float numberFloatProperty;
  private Double numberDoubleProperty;
  private Boolean booleanProperty;
  private String stringProperty;
  private byte[] stringByteArrayProperty;
  private LocalDate stringDateProperty;
  private OffsetDateTime stringDateTimeProperty;
  private BigDecimal stringNumberProperty;
  private UUID stringUuidProperty;
  private URI stringUriProperty;
  private List<String> arrayProperty = new ArrayList<>();
  private Set<String> arrayUniqueItemsConstraintProperty = new LinkedHashSet<>();
  private DataSubTypeResponse objectProperty;
  private List<DataSubTypeResponse> arrayObjectProperty = new ArrayList<>();

    /**
     */
    public DataTypeResponse integerProperty(Integer integerProperty) {
        this.integerProperty = integerProperty;
        return this;
    }

    
    @JsonProperty("integerProperty")
    public Integer getIntegerProperty() {
        return integerProperty;
    }

    @JsonProperty("integerProperty")
    public void setIntegerProperty(Integer integerProperty) {
        this.integerProperty = integerProperty;
    }

    /**
     */
    public DataTypeResponse integerInt32Property(Integer integerInt32Property) {
        this.integerInt32Property = integerInt32Property;
        return this;
    }

    
    @JsonProperty("integerInt32Property")
    public Integer getIntegerInt32Property() {
        return integerInt32Property;
    }

    @JsonProperty("integerInt32Property")
    public void setIntegerInt32Property(Integer integerInt32Property) {
        this.integerInt32Property = integerInt32Property;
    }

    /**
     */
    public DataTypeResponse integerInt64Property(Long integerInt64Property) {
        this.integerInt64Property = integerInt64Property;
        return this;
    }

    
    @JsonProperty("integerInt64Property")
    public Long getIntegerInt64Property() {
        return integerInt64Property;
    }

    @JsonProperty("integerInt64Property")
    public void setIntegerInt64Property(Long integerInt64Property) {
        this.integerInt64Property = integerInt64Property;
    }

    /**
     */
    public DataTypeResponse numberProperty(BigDecimal numberProperty) {
        this.numberProperty = numberProperty;
        return this;
    }

    
    @JsonProperty("numberProperty")
    public BigDecimal getNumberProperty() {
        return numberProperty;
    }

    @JsonProperty("numberProperty")
    public void setNumberProperty(BigDecimal numberProperty) {
        this.numberProperty = numberProperty;
    }

    /**
     */
    public DataTypeResponse numberFloatProperty(Float numberFloatProperty) {
        this.numberFloatProperty = numberFloatProperty;
        return this;
    }

    
    @JsonProperty("numberFloatProperty")
    public Float getNumberFloatProperty() {
        return numberFloatProperty;
    }

    @JsonProperty("numberFloatProperty")
    public void setNumberFloatProperty(Float numberFloatProperty) {
        this.numberFloatProperty = numberFloatProperty;
    }

    /**
     */
    public DataTypeResponse numberDoubleProperty(Double numberDoubleProperty) {
        this.numberDoubleProperty = numberDoubleProperty;
        return this;
    }

    
    @JsonProperty("numberDoubleProperty")
    public Double getNumberDoubleProperty() {
        return numberDoubleProperty;
    }

    @JsonProperty("numberDoubleProperty")
    public void setNumberDoubleProperty(Double numberDoubleProperty) {
        this.numberDoubleProperty = numberDoubleProperty;
    }

    /**
     */
    public DataTypeResponse booleanProperty(Boolean booleanProperty) {
        this.booleanProperty = booleanProperty;
        return this;
    }

    
    @JsonProperty("booleanProperty")
    public Boolean getBooleanProperty() {
        return booleanProperty;
    }

    @JsonProperty("booleanProperty")
    public void setBooleanProperty(Boolean booleanProperty) {
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
    public DataTypeResponse stringByteArrayProperty(byte[] stringByteArrayProperty) {
        this.stringByteArrayProperty = stringByteArrayProperty;
        return this;
    }

    
    @JsonProperty("stringByteArrayProperty")
    public byte[] getStringByteArrayProperty() {
        return stringByteArrayProperty;
    }

    @JsonProperty("stringByteArrayProperty")
    public void setStringByteArrayProperty(byte[] stringByteArrayProperty) {
        this.stringByteArrayProperty = stringByteArrayProperty;
    }

    /**
     */
    public DataTypeResponse stringDateProperty(LocalDate stringDateProperty) {
        this.stringDateProperty = stringDateProperty;
        return this;
    }

    
    @JsonProperty("stringDateProperty")
    public LocalDate getStringDateProperty() {
        return stringDateProperty;
    }

    @JsonProperty("stringDateProperty")
    public void setStringDateProperty(LocalDate stringDateProperty) {
        this.stringDateProperty = stringDateProperty;
    }

    /**
     */
    public DataTypeResponse stringDateTimeProperty(OffsetDateTime stringDateTimeProperty) {
        this.stringDateTimeProperty = stringDateTimeProperty;
        return this;
    }

    
    @JsonProperty("stringDateTimeProperty")
    public OffsetDateTime getStringDateTimeProperty() {
        return stringDateTimeProperty;
    }

    @JsonProperty("stringDateTimeProperty")
    public void setStringDateTimeProperty(OffsetDateTime stringDateTimeProperty) {
        this.stringDateTimeProperty = stringDateTimeProperty;
    }

    /**
     */
    public DataTypeResponse stringNumberProperty(BigDecimal stringNumberProperty) {
        this.stringNumberProperty = stringNumberProperty;
        return this;
    }

    
    @JsonProperty("stringNumberProperty")
    public BigDecimal getStringNumberProperty() {
        return stringNumberProperty;
    }

    @JsonProperty("stringNumberProperty")
    public void setStringNumberProperty(BigDecimal stringNumberProperty) {
        this.stringNumberProperty = stringNumberProperty;
    }

    /**
     */
    public DataTypeResponse stringUuidProperty(UUID stringUuidProperty) {
        this.stringUuidProperty = stringUuidProperty;
        return this;
    }

    
    @JsonProperty("stringUuidProperty")
    public UUID getStringUuidProperty() {
        return stringUuidProperty;
    }

    @JsonProperty("stringUuidProperty")
    public void setStringUuidProperty(UUID stringUuidProperty) {
        this.stringUuidProperty = stringUuidProperty;
    }

    /**
     */
    public DataTypeResponse stringUriProperty(URI stringUriProperty) {
        this.stringUriProperty = stringUriProperty;
        return this;
    }

    
    @JsonProperty("stringUriProperty")
    public URI getStringUriProperty() {
        return stringUriProperty;
    }

    @JsonProperty("stringUriProperty")
    public void setStringUriProperty(URI stringUriProperty) {
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

