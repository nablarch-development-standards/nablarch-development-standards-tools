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
@jakarta.annotation.Generated(value = "nablarch.tool.openapi.codegen.JavaNablarchJaxrsServerCodegen", date = "2024-12-09T21:43:48.220276849+09:00[Asia/Tokyo]", comments = "Generator version: 7.10.0")
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
  private String stringTimeProperty;
  private OffsetDateTime stringDateTimeProperty;
  private String stringDurationProperty;
  private String stringPasswordProperty;
  private BigDecimal stringNumberProperty;
  private String stringEmailProperty;
  private String stringIdnEmailProperty;
  private String stringHostnameProperty;
  private String stringIdnHostnameProperty;
  private String stringIpv4Property;
  private String stringIpv6Property;
  private UUID stringUuidProperty;
  private URI stringUriProperty;
  private String stringUriReferenceProperty;
  private String stringUriTemplateProperty;
  private String stringIriProperty;
  private String stringIriReferenceProperty;
  private String stringJsonPointerProperty;
  private String stringRelativeJsonPointerProperty;
  private String stringRegexProperty;
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
    public DataTypeResponse stringTimeProperty(String stringTimeProperty) {
        this.stringTimeProperty = stringTimeProperty;
        return this;
    }

    
    @JsonProperty("stringTimeProperty")
    public String getStringTimeProperty() {
        return stringTimeProperty;
    }

    @JsonProperty("stringTimeProperty")
    public void setStringTimeProperty(String stringTimeProperty) {
        this.stringTimeProperty = stringTimeProperty;
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
    public DataTypeResponse stringDurationProperty(String stringDurationProperty) {
        this.stringDurationProperty = stringDurationProperty;
        return this;
    }

    
    @JsonProperty("stringDurationProperty")
    public String getStringDurationProperty() {
        return stringDurationProperty;
    }

    @JsonProperty("stringDurationProperty")
    public void setStringDurationProperty(String stringDurationProperty) {
        this.stringDurationProperty = stringDurationProperty;
    }

    /**
     */
    public DataTypeResponse stringPasswordProperty(String stringPasswordProperty) {
        this.stringPasswordProperty = stringPasswordProperty;
        return this;
    }

    
    @JsonProperty("stringPasswordProperty")
    public String getStringPasswordProperty() {
        return stringPasswordProperty;
    }

    @JsonProperty("stringPasswordProperty")
    public void setStringPasswordProperty(String stringPasswordProperty) {
        this.stringPasswordProperty = stringPasswordProperty;
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
    public DataTypeResponse stringEmailProperty(String stringEmailProperty) {
        this.stringEmailProperty = stringEmailProperty;
        return this;
    }

    
    @JsonProperty("stringEmailProperty")
    public String getStringEmailProperty() {
        return stringEmailProperty;
    }

    @JsonProperty("stringEmailProperty")
    public void setStringEmailProperty(String stringEmailProperty) {
        this.stringEmailProperty = stringEmailProperty;
    }

    /**
     */
    public DataTypeResponse stringIdnEmailProperty(String stringIdnEmailProperty) {
        this.stringIdnEmailProperty = stringIdnEmailProperty;
        return this;
    }

    
    @JsonProperty("stringIdnEmailProperty")
    public String getStringIdnEmailProperty() {
        return stringIdnEmailProperty;
    }

    @JsonProperty("stringIdnEmailProperty")
    public void setStringIdnEmailProperty(String stringIdnEmailProperty) {
        this.stringIdnEmailProperty = stringIdnEmailProperty;
    }

    /**
     */
    public DataTypeResponse stringHostnameProperty(String stringHostnameProperty) {
        this.stringHostnameProperty = stringHostnameProperty;
        return this;
    }

    
    @JsonProperty("stringHostnameProperty")
    public String getStringHostnameProperty() {
        return stringHostnameProperty;
    }

    @JsonProperty("stringHostnameProperty")
    public void setStringHostnameProperty(String stringHostnameProperty) {
        this.stringHostnameProperty = stringHostnameProperty;
    }

    /**
     */
    public DataTypeResponse stringIdnHostnameProperty(String stringIdnHostnameProperty) {
        this.stringIdnHostnameProperty = stringIdnHostnameProperty;
        return this;
    }

    
    @JsonProperty("stringIdnHostnameProperty")
    public String getStringIdnHostnameProperty() {
        return stringIdnHostnameProperty;
    }

    @JsonProperty("stringIdnHostnameProperty")
    public void setStringIdnHostnameProperty(String stringIdnHostnameProperty) {
        this.stringIdnHostnameProperty = stringIdnHostnameProperty;
    }

    /**
     */
    public DataTypeResponse stringIpv4Property(String stringIpv4Property) {
        this.stringIpv4Property = stringIpv4Property;
        return this;
    }

    
    @JsonProperty("stringIpv4Property")
    public String getStringIpv4Property() {
        return stringIpv4Property;
    }

    @JsonProperty("stringIpv4Property")
    public void setStringIpv4Property(String stringIpv4Property) {
        this.stringIpv4Property = stringIpv4Property;
    }

    /**
     */
    public DataTypeResponse stringIpv6Property(String stringIpv6Property) {
        this.stringIpv6Property = stringIpv6Property;
        return this;
    }

    
    @JsonProperty("stringIpv6Property")
    public String getStringIpv6Property() {
        return stringIpv6Property;
    }

    @JsonProperty("stringIpv6Property")
    public void setStringIpv6Property(String stringIpv6Property) {
        this.stringIpv6Property = stringIpv6Property;
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
    public DataTypeResponse stringUriReferenceProperty(String stringUriReferenceProperty) {
        this.stringUriReferenceProperty = stringUriReferenceProperty;
        return this;
    }

    
    @JsonProperty("stringUriReferenceProperty")
    public String getStringUriReferenceProperty() {
        return stringUriReferenceProperty;
    }

    @JsonProperty("stringUriReferenceProperty")
    public void setStringUriReferenceProperty(String stringUriReferenceProperty) {
        this.stringUriReferenceProperty = stringUriReferenceProperty;
    }

    /**
     */
    public DataTypeResponse stringUriTemplateProperty(String stringUriTemplateProperty) {
        this.stringUriTemplateProperty = stringUriTemplateProperty;
        return this;
    }

    
    @JsonProperty("stringUriTemplateProperty")
    public String getStringUriTemplateProperty() {
        return stringUriTemplateProperty;
    }

    @JsonProperty("stringUriTemplateProperty")
    public void setStringUriTemplateProperty(String stringUriTemplateProperty) {
        this.stringUriTemplateProperty = stringUriTemplateProperty;
    }

    /**
     */
    public DataTypeResponse stringIriProperty(String stringIriProperty) {
        this.stringIriProperty = stringIriProperty;
        return this;
    }

    
    @JsonProperty("stringIriProperty")
    public String getStringIriProperty() {
        return stringIriProperty;
    }

    @JsonProperty("stringIriProperty")
    public void setStringIriProperty(String stringIriProperty) {
        this.stringIriProperty = stringIriProperty;
    }

    /**
     */
    public DataTypeResponse stringIriReferenceProperty(String stringIriReferenceProperty) {
        this.stringIriReferenceProperty = stringIriReferenceProperty;
        return this;
    }

    
    @JsonProperty("stringIriReferenceProperty")
    public String getStringIriReferenceProperty() {
        return stringIriReferenceProperty;
    }

    @JsonProperty("stringIriReferenceProperty")
    public void setStringIriReferenceProperty(String stringIriReferenceProperty) {
        this.stringIriReferenceProperty = stringIriReferenceProperty;
    }

    /**
     */
    public DataTypeResponse stringJsonPointerProperty(String stringJsonPointerProperty) {
        this.stringJsonPointerProperty = stringJsonPointerProperty;
        return this;
    }

    
    @JsonProperty("stringJsonPointerProperty")
    public String getStringJsonPointerProperty() {
        return stringJsonPointerProperty;
    }

    @JsonProperty("stringJsonPointerProperty")
    public void setStringJsonPointerProperty(String stringJsonPointerProperty) {
        this.stringJsonPointerProperty = stringJsonPointerProperty;
    }

    /**
     */
    public DataTypeResponse stringRelativeJsonPointerProperty(String stringRelativeJsonPointerProperty) {
        this.stringRelativeJsonPointerProperty = stringRelativeJsonPointerProperty;
        return this;
    }

    
    @JsonProperty("stringRelativeJsonPointerProperty")
    public String getStringRelativeJsonPointerProperty() {
        return stringRelativeJsonPointerProperty;
    }

    @JsonProperty("stringRelativeJsonPointerProperty")
    public void setStringRelativeJsonPointerProperty(String stringRelativeJsonPointerProperty) {
        this.stringRelativeJsonPointerProperty = stringRelativeJsonPointerProperty;
    }

    /**
     */
    public DataTypeResponse stringRegexProperty(String stringRegexProperty) {
        this.stringRegexProperty = stringRegexProperty;
        return this;
    }

    
    @JsonProperty("stringRegexProperty")
    public String getStringRegexProperty() {
        return stringRegexProperty;
    }

    @JsonProperty("stringRegexProperty")
    public void setStringRegexProperty(String stringRegexProperty) {
        this.stringRegexProperty = stringRegexProperty;
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
            Objects.equals(this.stringTimeProperty, dataTypeResponse.stringTimeProperty) &&
            Objects.equals(this.stringDateTimeProperty, dataTypeResponse.stringDateTimeProperty) &&
            Objects.equals(this.stringDurationProperty, dataTypeResponse.stringDurationProperty) &&
            Objects.equals(this.stringPasswordProperty, dataTypeResponse.stringPasswordProperty) &&
            Objects.equals(this.stringNumberProperty, dataTypeResponse.stringNumberProperty) &&
            Objects.equals(this.stringEmailProperty, dataTypeResponse.stringEmailProperty) &&
            Objects.equals(this.stringIdnEmailProperty, dataTypeResponse.stringIdnEmailProperty) &&
            Objects.equals(this.stringHostnameProperty, dataTypeResponse.stringHostnameProperty) &&
            Objects.equals(this.stringIdnHostnameProperty, dataTypeResponse.stringIdnHostnameProperty) &&
            Objects.equals(this.stringIpv4Property, dataTypeResponse.stringIpv4Property) &&
            Objects.equals(this.stringIpv6Property, dataTypeResponse.stringIpv6Property) &&
            Objects.equals(this.stringUuidProperty, dataTypeResponse.stringUuidProperty) &&
            Objects.equals(this.stringUriProperty, dataTypeResponse.stringUriProperty) &&
            Objects.equals(this.stringUriReferenceProperty, dataTypeResponse.stringUriReferenceProperty) &&
            Objects.equals(this.stringUriTemplateProperty, dataTypeResponse.stringUriTemplateProperty) &&
            Objects.equals(this.stringIriProperty, dataTypeResponse.stringIriProperty) &&
            Objects.equals(this.stringIriReferenceProperty, dataTypeResponse.stringIriReferenceProperty) &&
            Objects.equals(this.stringJsonPointerProperty, dataTypeResponse.stringJsonPointerProperty) &&
            Objects.equals(this.stringRelativeJsonPointerProperty, dataTypeResponse.stringRelativeJsonPointerProperty) &&
            Objects.equals(this.stringRegexProperty, dataTypeResponse.stringRegexProperty) &&
            Objects.equals(this.arrayProperty, dataTypeResponse.arrayProperty) &&
            Objects.equals(this.arrayUniqueItemsConstraintProperty, dataTypeResponse.arrayUniqueItemsConstraintProperty) &&
            Objects.equals(this.objectProperty, dataTypeResponse.objectProperty) &&
            Objects.equals(this.arrayObjectProperty, dataTypeResponse.arrayObjectProperty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(integerProperty, integerInt32Property, integerInt64Property, numberProperty, numberFloatProperty, numberDoubleProperty, booleanProperty, stringProperty, Arrays.hashCode(stringByteArrayProperty), stringDateProperty, stringTimeProperty, stringDateTimeProperty, stringDurationProperty, stringPasswordProperty, stringNumberProperty, stringEmailProperty, stringIdnEmailProperty, stringHostnameProperty, stringIdnHostnameProperty, stringIpv4Property, stringIpv6Property, stringUuidProperty, stringUriProperty, stringUriReferenceProperty, stringUriTemplateProperty, stringIriProperty, stringIriReferenceProperty, stringJsonPointerProperty, stringRelativeJsonPointerProperty, stringRegexProperty, arrayProperty, arrayUniqueItemsConstraintProperty, objectProperty, arrayObjectProperty);
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
        sb.append("    stringTimeProperty: ").append(toIndentedString(stringTimeProperty)).append("\n");
        sb.append("    stringDateTimeProperty: ").append(toIndentedString(stringDateTimeProperty)).append("\n");
        sb.append("    stringDurationProperty: ").append(toIndentedString(stringDurationProperty)).append("\n");
        sb.append("    stringPasswordProperty: ").append("*").append("\n");
        sb.append("    stringNumberProperty: ").append(toIndentedString(stringNumberProperty)).append("\n");
        sb.append("    stringEmailProperty: ").append(toIndentedString(stringEmailProperty)).append("\n");
        sb.append("    stringIdnEmailProperty: ").append(toIndentedString(stringIdnEmailProperty)).append("\n");
        sb.append("    stringHostnameProperty: ").append(toIndentedString(stringHostnameProperty)).append("\n");
        sb.append("    stringIdnHostnameProperty: ").append(toIndentedString(stringIdnHostnameProperty)).append("\n");
        sb.append("    stringIpv4Property: ").append(toIndentedString(stringIpv4Property)).append("\n");
        sb.append("    stringIpv6Property: ").append(toIndentedString(stringIpv6Property)).append("\n");
        sb.append("    stringUuidProperty: ").append(toIndentedString(stringUuidProperty)).append("\n");
        sb.append("    stringUriProperty: ").append(toIndentedString(stringUriProperty)).append("\n");
        sb.append("    stringUriReferenceProperty: ").append(toIndentedString(stringUriReferenceProperty)).append("\n");
        sb.append("    stringUriTemplateProperty: ").append(toIndentedString(stringUriTemplateProperty)).append("\n");
        sb.append("    stringIriProperty: ").append(toIndentedString(stringIriProperty)).append("\n");
        sb.append("    stringIriReferenceProperty: ").append(toIndentedString(stringIriReferenceProperty)).append("\n");
        sb.append("    stringJsonPointerProperty: ").append(toIndentedString(stringJsonPointerProperty)).append("\n");
        sb.append("    stringRelativeJsonPointerProperty: ").append(toIndentedString(stringRelativeJsonPointerProperty)).append("\n");
        sb.append("    stringRegexProperty: ").append(toIndentedString(stringRegexProperty)).append("\n");
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

