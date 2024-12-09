package org.openapitools.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Pattern;
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
import nablarch.core.validation.ee.DecimalRange;
import nablarch.core.validation.ee.Length;
import nablarch.core.validation.ee.NumberRange;
import nablarch.core.validation.ee.Required;
import nablarch.core.validation.ee.Size;
import org.openapitools.model.ValidationSubRequest;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;


@JsonTypeName("ValidationRequest")
@jakarta.annotation.Generated(value = "nablarch.tool.openapi.codegen.JavaNablarchJaxrsServerCodegen", date = "2024-12-09T21:40:02.319711249+09:00[Asia/Tokyo]", comments = "Generator version: 7.10.0")
public class ValidationRequest   {
  private Integer integerPlainProperty;
  private Integer integerRequiredProperty;
  private Integer integerMinimumProperty;
  private Integer integerMaximumProperty;
  private Integer integerMinimumMaximumProperty;
  private Integer integerRequiredMinimumMaximumProperty;
  private Integer integerInt32PlainProperty;
  private Integer integerInt32RequiredProperty;
  private Integer integerInt32MinimumProperty;
  private Integer integerInt32MaximumProperty;
  private Integer integerInt32MinimumMaximumProperty;
  private Integer integerInt32RequiredMinimumMaximumProperty;
  private Long integerInt64PlainProperty;
  private Long integerInt64RequiredProperty;
  private Long integerInt64MinimumProperty;
  private Long integerInt64MaximumProperty;
  private Long integerInt64MinimumMaximumProperty;
  private Long integerInt64RequiredMinimumMaximumProperty;
  private BigDecimal numberPlainProperty;
  private BigDecimal numberRequiredProperty;
  private BigDecimal numberMinimumProperty;
  private BigDecimal numberMaximumProperty;
  private BigDecimal numberMinimumMaximumProperty;
  private BigDecimal numberRequiredMinimumMaximumProperty;
  private Float numberFloatPlainProperty;
  private Float numberFloatRequiredProperty;
  private Float numberFloatMinimumProperty;
  private Float numberFloatMaximumProperty;
  private Float numberFloatMinimumMaximumProperty;
  private Float numberFloatRequiredMinimumMaximumProperty;
  private Double numberDoublePlainProperty;
  private Double numberDoubleRequiredProperty;
  private Double numberDoubleMinimumProperty;
  private Double numberDoubleMaximumProperty;
  private Double numberDoubleMinimumMaximumProperty;
  private Double numberDoubleRequiredMinimumMaximumProperty;
  private Boolean booleanPlainProperty;
  private Boolean booleanRequiredProperty;
  private String stringPlainProperty;
  private String stringRequiredProperty;
  private String stringMinLengthProperty;
  private String stringMaxLengthProperty;
  private String stringMinLengthMaxLengthProperty;
  private String stringPatternProperty;
  private String stringRequiredMinLengthMaxLengthPatternProperty;
  private byte[] stringByteArrayProperty;
  private byte[] stringByteArrayMinLengthProperty;
  private byte[] stringByteArrayMaxLengthProperty;
  private byte[] stringByteArrayMinLengthMaxLengthProperty;
  private byte[] stringByteArrayRequiredMinLengthMaxLengthProperty;
  private LocalDate stringDatePlainProperty;
  private LocalDate stringDateRequiredProperty;
  private OffsetDateTime stringDateTimePlainProperty;
  private OffsetDateTime stringDateTimeRequiredProperty;
  private String stringPasswordPlainProperty;
  private String stringPasswordRequiredProperty;
  private String stringPasswordMinLengthProperty;
  private String stringPasswordMaxLengthProperty;
  private String stringPasswordMinLengthMaxLengthProperty;
  private String stringPasswordPatternProperty;
  private String stringPasswordRequiredMinLengthMaxLengthPatternProperty;
  private BigDecimal stringNumberPlainProperty;
  private BigDecimal stringNumberRequiredProperty;
  private URI stringUriPlainProperty;
  private URI stringUriRequiredProperty;
  private UUID stringUuidPlainProperty;
  private UUID stringUuidRequiredProperty;
  private String stringRegexPlainProperty;
  private String stringRegexRequiredProperty;
  private String stringRegexMinLengthProperty;
  private String stringRegexMaxLengthProperty;
  private String stringRegexMinLengthMaxLengthProperty;
  private String stringRegexRequiredMinLengthMaxLengthProperty;
  private @Valid List<String> arrayStringPlainProperty = new ArrayList<>();
  private @Valid List<String> arrayStringRequiredProperty = new ArrayList<>();
  private @Valid List<String> arrayStringMinItemsProperty = new ArrayList<>();
  private @Valid List<String> arrayStringMaxItemsProperty = new ArrayList<>();
  private @Valid List<String> arrayStringMinItemsMaxItemsProperty = new ArrayList<>();
  private @Valid List<String> arrayStringRequiredMinItemsMaxItemsProperty = new ArrayList<>();
  private @Valid List<@Valid ValidationSubRequest> arrayObjectPlainProperty = new ArrayList<>();
  private @Valid List<@Valid ValidationSubRequest> arrayObjectRequiredProperty = new ArrayList<>();
  private @Valid List<@Valid ValidationSubRequest> arrayObjectMinItemsProperty = new ArrayList<>();
  private @Valid List<@Valid ValidationSubRequest> arrayObjectMaxItemsProperty = new ArrayList<>();
  private @Valid List<@Valid ValidationSubRequest> arrayObjectMinItemsMaxItemsProperty = new ArrayList<>();
  private @Valid List<@Valid ValidationSubRequest> arrayObjectRequiredMinItemsMaxItemsProperty = new ArrayList<>();
  private @Valid Set<String> arrayStringUniqueItemsPlainProperty = new LinkedHashSet<>();
  private @Valid Set<String> arrayStringUniqueItemsRequiredProperty = new LinkedHashSet<>();
  private @Valid Set<String> arrayStringUniqueItemsMinItemsProperty = new LinkedHashSet<>();
  private @Valid Set<String> arrayStringUniqueItemsMaxItemsProperty = new LinkedHashSet<>();
  private @Valid Set<String> arrayStringUniqueItemsMinItemsMaxItemsProperty = new LinkedHashSet<>();
  private @Valid Set<String> arrayStringUniqueItemsRequiredMinItemsMaxItemsProperty = new LinkedHashSet<>();
  private @Valid Set<@Valid ValidationSubRequest> arrayObjectUniqueItemsPlainProperty = new LinkedHashSet<>();
  private @Valid Set<@Valid ValidationSubRequest> arrayObjectUniqueItemsRequiredProperty = new LinkedHashSet<>();
  private @Valid Set<@Valid ValidationSubRequest> arrayObjectUniqueItemsMinItemsProperty = new LinkedHashSet<>();
  private @Valid Set<@Valid ValidationSubRequest> arrayObjectUniqueItemsMaxItemsProperty = new LinkedHashSet<>();
  private @Valid Set<@Valid ValidationSubRequest> arrayObjectUniqueItemsMinItemsMaxItemsProperty = new LinkedHashSet<>();
  private @Valid Set<@Valid ValidationSubRequest> arrayObjectUniqueItemsRequiredMinItemsMaxItemsProperty = new LinkedHashSet<>();
  private ValidationSubRequest objectPlainProperty;
  private ValidationSubRequest objectRequiredProperty;
  public enum EnumPlainPropertyEnum {

    ACTIVE(String.valueOf("active")), INACTIVE(String.valueOf("inactive"));


    private String value;

    EnumPlainPropertyEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static EnumPlainPropertyEnum fromValue(String value) {
        for (EnumPlainPropertyEnum b : EnumPlainPropertyEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private EnumPlainPropertyEnum enumPlainProperty;
  public enum EnumRequiredPropertyEnum {

    ACTIVE(String.valueOf("active")), INACTIVE(String.valueOf("inactive"));


    private String value;

    EnumRequiredPropertyEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static EnumRequiredPropertyEnum fromValue(String value) {
        for (EnumRequiredPropertyEnum b : EnumRequiredPropertyEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private EnumRequiredPropertyEnum enumRequiredProperty;

    /**
     */
    public ValidationRequest integerPlainProperty(Integer integerPlainProperty) {
        this.integerPlainProperty = integerPlainProperty;
        return this;
    }

    
    @JsonProperty("integerPlainProperty")
    
    public Integer getIntegerPlainProperty() {
        return integerPlainProperty;
    }

    @JsonProperty("integerPlainProperty")
    public void setIntegerPlainProperty(Integer integerPlainProperty) {
        this.integerPlainProperty = integerPlainProperty;
    }

    /**
     */
    public ValidationRequest integerRequiredProperty(Integer integerRequiredProperty) {
        this.integerRequiredProperty = integerRequiredProperty;
        return this;
    }

    
    @JsonProperty("integerRequiredProperty")
    @Required 
    public Integer getIntegerRequiredProperty() {
        return integerRequiredProperty;
    }

    @JsonProperty("integerRequiredProperty")
    public void setIntegerRequiredProperty(Integer integerRequiredProperty) {
        this.integerRequiredProperty = integerRequiredProperty;
    }

    /**
     * minimum: 3
     */
    public ValidationRequest integerMinimumProperty(Integer integerMinimumProperty) {
        this.integerMinimumProperty = integerMinimumProperty;
        return this;
    }

    
    @JsonProperty("integerMinimumProperty")
    @NumberRange(min = 3) 
    public Integer getIntegerMinimumProperty() {
        return integerMinimumProperty;
    }

    @JsonProperty("integerMinimumProperty")
    public void setIntegerMinimumProperty(Integer integerMinimumProperty) {
        this.integerMinimumProperty = integerMinimumProperty;
    }

    /**
     * maximum: 7
     */
    public ValidationRequest integerMaximumProperty(Integer integerMaximumProperty) {
        this.integerMaximumProperty = integerMaximumProperty;
        return this;
    }

    
    @JsonProperty("integerMaximumProperty")
    @NumberRange(max = 7) 
    public Integer getIntegerMaximumProperty() {
        return integerMaximumProperty;
    }

    @JsonProperty("integerMaximumProperty")
    public void setIntegerMaximumProperty(Integer integerMaximumProperty) {
        this.integerMaximumProperty = integerMaximumProperty;
    }

    /**
     * minimum: 3
     * maximum: 7
     */
    public ValidationRequest integerMinimumMaximumProperty(Integer integerMinimumMaximumProperty) {
        this.integerMinimumMaximumProperty = integerMinimumMaximumProperty;
        return this;
    }

    
    @JsonProperty("integerMinimumMaximumProperty")
    @NumberRange(min = 3, max = 7) 
    public Integer getIntegerMinimumMaximumProperty() {
        return integerMinimumMaximumProperty;
    }

    @JsonProperty("integerMinimumMaximumProperty")
    public void setIntegerMinimumMaximumProperty(Integer integerMinimumMaximumProperty) {
        this.integerMinimumMaximumProperty = integerMinimumMaximumProperty;
    }

    /**
     * minimum: 3
     * maximum: 7
     */
    public ValidationRequest integerRequiredMinimumMaximumProperty(Integer integerRequiredMinimumMaximumProperty) {
        this.integerRequiredMinimumMaximumProperty = integerRequiredMinimumMaximumProperty;
        return this;
    }

    
    @JsonProperty("integerRequiredMinimumMaximumProperty")
    @Required @NumberRange(min = 3, max = 7) 
    public Integer getIntegerRequiredMinimumMaximumProperty() {
        return integerRequiredMinimumMaximumProperty;
    }

    @JsonProperty("integerRequiredMinimumMaximumProperty")
    public void setIntegerRequiredMinimumMaximumProperty(Integer integerRequiredMinimumMaximumProperty) {
        this.integerRequiredMinimumMaximumProperty = integerRequiredMinimumMaximumProperty;
    }

    /**
     */
    public ValidationRequest integerInt32PlainProperty(Integer integerInt32PlainProperty) {
        this.integerInt32PlainProperty = integerInt32PlainProperty;
        return this;
    }

    
    @JsonProperty("integerInt32PlainProperty")
    
    public Integer getIntegerInt32PlainProperty() {
        return integerInt32PlainProperty;
    }

    @JsonProperty("integerInt32PlainProperty")
    public void setIntegerInt32PlainProperty(Integer integerInt32PlainProperty) {
        this.integerInt32PlainProperty = integerInt32PlainProperty;
    }

    /**
     */
    public ValidationRequest integerInt32RequiredProperty(Integer integerInt32RequiredProperty) {
        this.integerInt32RequiredProperty = integerInt32RequiredProperty;
        return this;
    }

    
    @JsonProperty("integerInt32RequiredProperty")
    @Required 
    public Integer getIntegerInt32RequiredProperty() {
        return integerInt32RequiredProperty;
    }

    @JsonProperty("integerInt32RequiredProperty")
    public void setIntegerInt32RequiredProperty(Integer integerInt32RequiredProperty) {
        this.integerInt32RequiredProperty = integerInt32RequiredProperty;
    }

    /**
     * minimum: 3
     */
    public ValidationRequest integerInt32MinimumProperty(Integer integerInt32MinimumProperty) {
        this.integerInt32MinimumProperty = integerInt32MinimumProperty;
        return this;
    }

    
    @JsonProperty("integerInt32MinimumProperty")
    @NumberRange(min = 3) 
    public Integer getIntegerInt32MinimumProperty() {
        return integerInt32MinimumProperty;
    }

    @JsonProperty("integerInt32MinimumProperty")
    public void setIntegerInt32MinimumProperty(Integer integerInt32MinimumProperty) {
        this.integerInt32MinimumProperty = integerInt32MinimumProperty;
    }

    /**
     * maximum: 7
     */
    public ValidationRequest integerInt32MaximumProperty(Integer integerInt32MaximumProperty) {
        this.integerInt32MaximumProperty = integerInt32MaximumProperty;
        return this;
    }

    
    @JsonProperty("integerInt32MaximumProperty")
    @NumberRange(max = 7) 
    public Integer getIntegerInt32MaximumProperty() {
        return integerInt32MaximumProperty;
    }

    @JsonProperty("integerInt32MaximumProperty")
    public void setIntegerInt32MaximumProperty(Integer integerInt32MaximumProperty) {
        this.integerInt32MaximumProperty = integerInt32MaximumProperty;
    }

    /**
     * minimum: 3
     * maximum: 7
     */
    public ValidationRequest integerInt32MinimumMaximumProperty(Integer integerInt32MinimumMaximumProperty) {
        this.integerInt32MinimumMaximumProperty = integerInt32MinimumMaximumProperty;
        return this;
    }

    
    @JsonProperty("integerInt32MinimumMaximumProperty")
    @NumberRange(min = 3, max = 7) 
    public Integer getIntegerInt32MinimumMaximumProperty() {
        return integerInt32MinimumMaximumProperty;
    }

    @JsonProperty("integerInt32MinimumMaximumProperty")
    public void setIntegerInt32MinimumMaximumProperty(Integer integerInt32MinimumMaximumProperty) {
        this.integerInt32MinimumMaximumProperty = integerInt32MinimumMaximumProperty;
    }

    /**
     * minimum: 3
     * maximum: 7
     */
    public ValidationRequest integerInt32RequiredMinimumMaximumProperty(Integer integerInt32RequiredMinimumMaximumProperty) {
        this.integerInt32RequiredMinimumMaximumProperty = integerInt32RequiredMinimumMaximumProperty;
        return this;
    }

    
    @JsonProperty("integerInt32RequiredMinimumMaximumProperty")
    @Required @NumberRange(min = 3, max = 7) 
    public Integer getIntegerInt32RequiredMinimumMaximumProperty() {
        return integerInt32RequiredMinimumMaximumProperty;
    }

    @JsonProperty("integerInt32RequiredMinimumMaximumProperty")
    public void setIntegerInt32RequiredMinimumMaximumProperty(Integer integerInt32RequiredMinimumMaximumProperty) {
        this.integerInt32RequiredMinimumMaximumProperty = integerInt32RequiredMinimumMaximumProperty;
    }

    /**
     */
    public ValidationRequest integerInt64PlainProperty(Long integerInt64PlainProperty) {
        this.integerInt64PlainProperty = integerInt64PlainProperty;
        return this;
    }

    
    @JsonProperty("integerInt64PlainProperty")
    
    public Long getIntegerInt64PlainProperty() {
        return integerInt64PlainProperty;
    }

    @JsonProperty("integerInt64PlainProperty")
    public void setIntegerInt64PlainProperty(Long integerInt64PlainProperty) {
        this.integerInt64PlainProperty = integerInt64PlainProperty;
    }

    /**
     */
    public ValidationRequest integerInt64RequiredProperty(Long integerInt64RequiredProperty) {
        this.integerInt64RequiredProperty = integerInt64RequiredProperty;
        return this;
    }

    
    @JsonProperty("integerInt64RequiredProperty")
    @Required 
    public Long getIntegerInt64RequiredProperty() {
        return integerInt64RequiredProperty;
    }

    @JsonProperty("integerInt64RequiredProperty")
    public void setIntegerInt64RequiredProperty(Long integerInt64RequiredProperty) {
        this.integerInt64RequiredProperty = integerInt64RequiredProperty;
    }

    /**
     * minimum: 3
     */
    public ValidationRequest integerInt64MinimumProperty(Long integerInt64MinimumProperty) {
        this.integerInt64MinimumProperty = integerInt64MinimumProperty;
        return this;
    }

    
    @JsonProperty("integerInt64MinimumProperty")
    @NumberRange(min = 3) 
    public Long getIntegerInt64MinimumProperty() {
        return integerInt64MinimumProperty;
    }

    @JsonProperty("integerInt64MinimumProperty")
    public void setIntegerInt64MinimumProperty(Long integerInt64MinimumProperty) {
        this.integerInt64MinimumProperty = integerInt64MinimumProperty;
    }

    /**
     * maximum: 7
     */
    public ValidationRequest integerInt64MaximumProperty(Long integerInt64MaximumProperty) {
        this.integerInt64MaximumProperty = integerInt64MaximumProperty;
        return this;
    }

    
    @JsonProperty("integerInt64MaximumProperty")
    @NumberRange(max = 7) 
    public Long getIntegerInt64MaximumProperty() {
        return integerInt64MaximumProperty;
    }

    @JsonProperty("integerInt64MaximumProperty")
    public void setIntegerInt64MaximumProperty(Long integerInt64MaximumProperty) {
        this.integerInt64MaximumProperty = integerInt64MaximumProperty;
    }

    /**
     * minimum: 3
     * maximum: 7
     */
    public ValidationRequest integerInt64MinimumMaximumProperty(Long integerInt64MinimumMaximumProperty) {
        this.integerInt64MinimumMaximumProperty = integerInt64MinimumMaximumProperty;
        return this;
    }

    
    @JsonProperty("integerInt64MinimumMaximumProperty")
    @NumberRange(min = 3, max = 7) 
    public Long getIntegerInt64MinimumMaximumProperty() {
        return integerInt64MinimumMaximumProperty;
    }

    @JsonProperty("integerInt64MinimumMaximumProperty")
    public void setIntegerInt64MinimumMaximumProperty(Long integerInt64MinimumMaximumProperty) {
        this.integerInt64MinimumMaximumProperty = integerInt64MinimumMaximumProperty;
    }

    /**
     * minimum: 3
     * maximum: 7
     */
    public ValidationRequest integerInt64RequiredMinimumMaximumProperty(Long integerInt64RequiredMinimumMaximumProperty) {
        this.integerInt64RequiredMinimumMaximumProperty = integerInt64RequiredMinimumMaximumProperty;
        return this;
    }

    
    @JsonProperty("integerInt64RequiredMinimumMaximumProperty")
    @Required @NumberRange(min = 3, max = 7) 
    public Long getIntegerInt64RequiredMinimumMaximumProperty() {
        return integerInt64RequiredMinimumMaximumProperty;
    }

    @JsonProperty("integerInt64RequiredMinimumMaximumProperty")
    public void setIntegerInt64RequiredMinimumMaximumProperty(Long integerInt64RequiredMinimumMaximumProperty) {
        this.integerInt64RequiredMinimumMaximumProperty = integerInt64RequiredMinimumMaximumProperty;
    }

    /**
     */
    public ValidationRequest numberPlainProperty(BigDecimal numberPlainProperty) {
        this.numberPlainProperty = numberPlainProperty;
        return this;
    }

    
    @JsonProperty("numberPlainProperty")
    @Valid 
    public BigDecimal getNumberPlainProperty() {
        return numberPlainProperty;
    }

    @JsonProperty("numberPlainProperty")
    public void setNumberPlainProperty(BigDecimal numberPlainProperty) {
        this.numberPlainProperty = numberPlainProperty;
    }

    /**
     */
    public ValidationRequest numberRequiredProperty(BigDecimal numberRequiredProperty) {
        this.numberRequiredProperty = numberRequiredProperty;
        return this;
    }

    
    @JsonProperty("numberRequiredProperty")
    @Required @Valid 
    public BigDecimal getNumberRequiredProperty() {
        return numberRequiredProperty;
    }

    @JsonProperty("numberRequiredProperty")
    public void setNumberRequiredProperty(BigDecimal numberRequiredProperty) {
        this.numberRequiredProperty = numberRequiredProperty;
    }

    /**
     * minimum: 3.2
     */
    public ValidationRequest numberMinimumProperty(BigDecimal numberMinimumProperty) {
        this.numberMinimumProperty = numberMinimumProperty;
        return this;
    }

    
    @JsonProperty("numberMinimumProperty")
    @Valid @DecimalRange(min = "3.2") 
    public BigDecimal getNumberMinimumProperty() {
        return numberMinimumProperty;
    }

    @JsonProperty("numberMinimumProperty")
    public void setNumberMinimumProperty(BigDecimal numberMinimumProperty) {
        this.numberMinimumProperty = numberMinimumProperty;
    }

    /**
     * maximum: 7.5
     */
    public ValidationRequest numberMaximumProperty(BigDecimal numberMaximumProperty) {
        this.numberMaximumProperty = numberMaximumProperty;
        return this;
    }

    
    @JsonProperty("numberMaximumProperty")
    @Valid @DecimalRange(max = "7.5") 
    public BigDecimal getNumberMaximumProperty() {
        return numberMaximumProperty;
    }

    @JsonProperty("numberMaximumProperty")
    public void setNumberMaximumProperty(BigDecimal numberMaximumProperty) {
        this.numberMaximumProperty = numberMaximumProperty;
    }

    /**
     * minimum: 3.2
     * maximum: 7.5
     */
    public ValidationRequest numberMinimumMaximumProperty(BigDecimal numberMinimumMaximumProperty) {
        this.numberMinimumMaximumProperty = numberMinimumMaximumProperty;
        return this;
    }

    
    @JsonProperty("numberMinimumMaximumProperty")
    @Valid @DecimalRange(min = "3.2", max = "7.5") 
    public BigDecimal getNumberMinimumMaximumProperty() {
        return numberMinimumMaximumProperty;
    }

    @JsonProperty("numberMinimumMaximumProperty")
    public void setNumberMinimumMaximumProperty(BigDecimal numberMinimumMaximumProperty) {
        this.numberMinimumMaximumProperty = numberMinimumMaximumProperty;
    }

    /**
     * minimum: 3.2
     * maximum: 7.5
     */
    public ValidationRequest numberRequiredMinimumMaximumProperty(BigDecimal numberRequiredMinimumMaximumProperty) {
        this.numberRequiredMinimumMaximumProperty = numberRequiredMinimumMaximumProperty;
        return this;
    }

    
    @JsonProperty("numberRequiredMinimumMaximumProperty")
    @Required @Valid @DecimalRange(min = "3.2", max = "7.5") 
    public BigDecimal getNumberRequiredMinimumMaximumProperty() {
        return numberRequiredMinimumMaximumProperty;
    }

    @JsonProperty("numberRequiredMinimumMaximumProperty")
    public void setNumberRequiredMinimumMaximumProperty(BigDecimal numberRequiredMinimumMaximumProperty) {
        this.numberRequiredMinimumMaximumProperty = numberRequiredMinimumMaximumProperty;
    }

    /**
     */
    public ValidationRequest numberFloatPlainProperty(Float numberFloatPlainProperty) {
        this.numberFloatPlainProperty = numberFloatPlainProperty;
        return this;
    }

    
    @JsonProperty("numberFloatPlainProperty")
    
    public Float getNumberFloatPlainProperty() {
        return numberFloatPlainProperty;
    }

    @JsonProperty("numberFloatPlainProperty")
    public void setNumberFloatPlainProperty(Float numberFloatPlainProperty) {
        this.numberFloatPlainProperty = numberFloatPlainProperty;
    }

    /**
     */
    public ValidationRequest numberFloatRequiredProperty(Float numberFloatRequiredProperty) {
        this.numberFloatRequiredProperty = numberFloatRequiredProperty;
        return this;
    }

    
    @JsonProperty("numberFloatRequiredProperty")
    @Required 
    public Float getNumberFloatRequiredProperty() {
        return numberFloatRequiredProperty;
    }

    @JsonProperty("numberFloatRequiredProperty")
    public void setNumberFloatRequiredProperty(Float numberFloatRequiredProperty) {
        this.numberFloatRequiredProperty = numberFloatRequiredProperty;
    }

    /**
     * minimum: 3.2
     */
    public ValidationRequest numberFloatMinimumProperty(Float numberFloatMinimumProperty) {
        this.numberFloatMinimumProperty = numberFloatMinimumProperty;
        return this;
    }

    
    @JsonProperty("numberFloatMinimumProperty")
    @DecimalRange(min = "3.2") 
    public Float getNumberFloatMinimumProperty() {
        return numberFloatMinimumProperty;
    }

    @JsonProperty("numberFloatMinimumProperty")
    public void setNumberFloatMinimumProperty(Float numberFloatMinimumProperty) {
        this.numberFloatMinimumProperty = numberFloatMinimumProperty;
    }

    /**
     * maximum: 7.5
     */
    public ValidationRequest numberFloatMaximumProperty(Float numberFloatMaximumProperty) {
        this.numberFloatMaximumProperty = numberFloatMaximumProperty;
        return this;
    }

    
    @JsonProperty("numberFloatMaximumProperty")
    @DecimalRange(max = "7.5") 
    public Float getNumberFloatMaximumProperty() {
        return numberFloatMaximumProperty;
    }

    @JsonProperty("numberFloatMaximumProperty")
    public void setNumberFloatMaximumProperty(Float numberFloatMaximumProperty) {
        this.numberFloatMaximumProperty = numberFloatMaximumProperty;
    }

    /**
     * minimum: 3.2
     * maximum: 7.5
     */
    public ValidationRequest numberFloatMinimumMaximumProperty(Float numberFloatMinimumMaximumProperty) {
        this.numberFloatMinimumMaximumProperty = numberFloatMinimumMaximumProperty;
        return this;
    }

    
    @JsonProperty("numberFloatMinimumMaximumProperty")
    @DecimalRange(min = "3.2", max = "7.5") 
    public Float getNumberFloatMinimumMaximumProperty() {
        return numberFloatMinimumMaximumProperty;
    }

    @JsonProperty("numberFloatMinimumMaximumProperty")
    public void setNumberFloatMinimumMaximumProperty(Float numberFloatMinimumMaximumProperty) {
        this.numberFloatMinimumMaximumProperty = numberFloatMinimumMaximumProperty;
    }

    /**
     * minimum: 3.2
     * maximum: 7.5
     */
    public ValidationRequest numberFloatRequiredMinimumMaximumProperty(Float numberFloatRequiredMinimumMaximumProperty) {
        this.numberFloatRequiredMinimumMaximumProperty = numberFloatRequiredMinimumMaximumProperty;
        return this;
    }

    
    @JsonProperty("numberFloatRequiredMinimumMaximumProperty")
    @Required @DecimalRange(min = "3.2", max = "7.5") 
    public Float getNumberFloatRequiredMinimumMaximumProperty() {
        return numberFloatRequiredMinimumMaximumProperty;
    }

    @JsonProperty("numberFloatRequiredMinimumMaximumProperty")
    public void setNumberFloatRequiredMinimumMaximumProperty(Float numberFloatRequiredMinimumMaximumProperty) {
        this.numberFloatRequiredMinimumMaximumProperty = numberFloatRequiredMinimumMaximumProperty;
    }

    /**
     */
    public ValidationRequest numberDoublePlainProperty(Double numberDoublePlainProperty) {
        this.numberDoublePlainProperty = numberDoublePlainProperty;
        return this;
    }

    
    @JsonProperty("numberDoublePlainProperty")
    
    public Double getNumberDoublePlainProperty() {
        return numberDoublePlainProperty;
    }

    @JsonProperty("numberDoublePlainProperty")
    public void setNumberDoublePlainProperty(Double numberDoublePlainProperty) {
        this.numberDoublePlainProperty = numberDoublePlainProperty;
    }

    /**
     */
    public ValidationRequest numberDoubleRequiredProperty(Double numberDoubleRequiredProperty) {
        this.numberDoubleRequiredProperty = numberDoubleRequiredProperty;
        return this;
    }

    
    @JsonProperty("numberDoubleRequiredProperty")
    @Required 
    public Double getNumberDoubleRequiredProperty() {
        return numberDoubleRequiredProperty;
    }

    @JsonProperty("numberDoubleRequiredProperty")
    public void setNumberDoubleRequiredProperty(Double numberDoubleRequiredProperty) {
        this.numberDoubleRequiredProperty = numberDoubleRequiredProperty;
    }

    /**
     * minimum: 3.2
     */
    public ValidationRequest numberDoubleMinimumProperty(Double numberDoubleMinimumProperty) {
        this.numberDoubleMinimumProperty = numberDoubleMinimumProperty;
        return this;
    }

    
    @JsonProperty("numberDoubleMinimumProperty")
    @DecimalRange(min = "3.2") 
    public Double getNumberDoubleMinimumProperty() {
        return numberDoubleMinimumProperty;
    }

    @JsonProperty("numberDoubleMinimumProperty")
    public void setNumberDoubleMinimumProperty(Double numberDoubleMinimumProperty) {
        this.numberDoubleMinimumProperty = numberDoubleMinimumProperty;
    }

    /**
     * maximum: 7.5
     */
    public ValidationRequest numberDoubleMaximumProperty(Double numberDoubleMaximumProperty) {
        this.numberDoubleMaximumProperty = numberDoubleMaximumProperty;
        return this;
    }

    
    @JsonProperty("numberDoubleMaximumProperty")
    @DecimalRange(max = "7.5") 
    public Double getNumberDoubleMaximumProperty() {
        return numberDoubleMaximumProperty;
    }

    @JsonProperty("numberDoubleMaximumProperty")
    public void setNumberDoubleMaximumProperty(Double numberDoubleMaximumProperty) {
        this.numberDoubleMaximumProperty = numberDoubleMaximumProperty;
    }

    /**
     * minimum: 3.2
     * maximum: 7.5
     */
    public ValidationRequest numberDoubleMinimumMaximumProperty(Double numberDoubleMinimumMaximumProperty) {
        this.numberDoubleMinimumMaximumProperty = numberDoubleMinimumMaximumProperty;
        return this;
    }

    
    @JsonProperty("numberDoubleMinimumMaximumProperty")
    @DecimalRange(min = "3.2", max = "7.5") 
    public Double getNumberDoubleMinimumMaximumProperty() {
        return numberDoubleMinimumMaximumProperty;
    }

    @JsonProperty("numberDoubleMinimumMaximumProperty")
    public void setNumberDoubleMinimumMaximumProperty(Double numberDoubleMinimumMaximumProperty) {
        this.numberDoubleMinimumMaximumProperty = numberDoubleMinimumMaximumProperty;
    }

    /**
     * minimum: 3.2
     * maximum: 7.5
     */
    public ValidationRequest numberDoubleRequiredMinimumMaximumProperty(Double numberDoubleRequiredMinimumMaximumProperty) {
        this.numberDoubleRequiredMinimumMaximumProperty = numberDoubleRequiredMinimumMaximumProperty;
        return this;
    }

    
    @JsonProperty("numberDoubleRequiredMinimumMaximumProperty")
    @Required @DecimalRange(min = "3.2", max = "7.5") 
    public Double getNumberDoubleRequiredMinimumMaximumProperty() {
        return numberDoubleRequiredMinimumMaximumProperty;
    }

    @JsonProperty("numberDoubleRequiredMinimumMaximumProperty")
    public void setNumberDoubleRequiredMinimumMaximumProperty(Double numberDoubleRequiredMinimumMaximumProperty) {
        this.numberDoubleRequiredMinimumMaximumProperty = numberDoubleRequiredMinimumMaximumProperty;
    }

    /**
     */
    public ValidationRequest booleanPlainProperty(Boolean booleanPlainProperty) {
        this.booleanPlainProperty = booleanPlainProperty;
        return this;
    }

    
    @JsonProperty("booleanPlainProperty")
    
    public Boolean getBooleanPlainProperty() {
        return booleanPlainProperty;
    }

    @JsonProperty("booleanPlainProperty")
    public void setBooleanPlainProperty(Boolean booleanPlainProperty) {
        this.booleanPlainProperty = booleanPlainProperty;
    }

    /**
     */
    public ValidationRequest booleanRequiredProperty(Boolean booleanRequiredProperty) {
        this.booleanRequiredProperty = booleanRequiredProperty;
        return this;
    }

    
    @JsonProperty("booleanRequiredProperty")
    @Required 
    public Boolean getBooleanRequiredProperty() {
        return booleanRequiredProperty;
    }

    @JsonProperty("booleanRequiredProperty")
    public void setBooleanRequiredProperty(Boolean booleanRequiredProperty) {
        this.booleanRequiredProperty = booleanRequiredProperty;
    }

    /**
     */
    public ValidationRequest stringPlainProperty(String stringPlainProperty) {
        this.stringPlainProperty = stringPlainProperty;
        return this;
    }

    
    @JsonProperty("stringPlainProperty")
    
    public String getStringPlainProperty() {
        return stringPlainProperty;
    }

    @JsonProperty("stringPlainProperty")
    public void setStringPlainProperty(String stringPlainProperty) {
        this.stringPlainProperty = stringPlainProperty;
    }

    /**
     */
    public ValidationRequest stringRequiredProperty(String stringRequiredProperty) {
        this.stringRequiredProperty = stringRequiredProperty;
        return this;
    }

    
    @JsonProperty("stringRequiredProperty")
    @Required 
    public String getStringRequiredProperty() {
        return stringRequiredProperty;
    }

    @JsonProperty("stringRequiredProperty")
    public void setStringRequiredProperty(String stringRequiredProperty) {
        this.stringRequiredProperty = stringRequiredProperty;
    }

    /**
     */
    public ValidationRequest stringMinLengthProperty(String stringMinLengthProperty) {
        this.stringMinLengthProperty = stringMinLengthProperty;
        return this;
    }

    
    @JsonProperty("stringMinLengthProperty")
    @Length(min = 3) 
    public String getStringMinLengthProperty() {
        return stringMinLengthProperty;
    }

    @JsonProperty("stringMinLengthProperty")
    public void setStringMinLengthProperty(String stringMinLengthProperty) {
        this.stringMinLengthProperty = stringMinLengthProperty;
    }

    /**
     */
    public ValidationRequest stringMaxLengthProperty(String stringMaxLengthProperty) {
        this.stringMaxLengthProperty = stringMaxLengthProperty;
        return this;
    }

    
    @JsonProperty("stringMaxLengthProperty")
    @Length(max = 7) 
    public String getStringMaxLengthProperty() {
        return stringMaxLengthProperty;
    }

    @JsonProperty("stringMaxLengthProperty")
    public void setStringMaxLengthProperty(String stringMaxLengthProperty) {
        this.stringMaxLengthProperty = stringMaxLengthProperty;
    }

    /**
     */
    public ValidationRequest stringMinLengthMaxLengthProperty(String stringMinLengthMaxLengthProperty) {
        this.stringMinLengthMaxLengthProperty = stringMinLengthMaxLengthProperty;
        return this;
    }

    
    @JsonProperty("stringMinLengthMaxLengthProperty")
    @Length(min = 3, max = 7) 
    public String getStringMinLengthMaxLengthProperty() {
        return stringMinLengthMaxLengthProperty;
    }

    @JsonProperty("stringMinLengthMaxLengthProperty")
    public void setStringMinLengthMaxLengthProperty(String stringMinLengthMaxLengthProperty) {
        this.stringMinLengthMaxLengthProperty = stringMinLengthMaxLengthProperty;
    }

    /**
     */
    public ValidationRequest stringPatternProperty(String stringPatternProperty) {
        this.stringPatternProperty = stringPatternProperty;
        return this;
    }

    
    @JsonProperty("stringPatternProperty")
    @Pattern(regexp = "[a-z]+") 
    public String getStringPatternProperty() {
        return stringPatternProperty;
    }

    @JsonProperty("stringPatternProperty")
    public void setStringPatternProperty(String stringPatternProperty) {
        this.stringPatternProperty = stringPatternProperty;
    }

    /**
     */
    public ValidationRequest stringRequiredMinLengthMaxLengthPatternProperty(String stringRequiredMinLengthMaxLengthPatternProperty) {
        this.stringRequiredMinLengthMaxLengthPatternProperty = stringRequiredMinLengthMaxLengthPatternProperty;
        return this;
    }

    
    @JsonProperty("stringRequiredMinLengthMaxLengthPatternProperty")
    @Required @Pattern(regexp = "[a-z]+") @Length(min = 3, max = 7) 
    public String getStringRequiredMinLengthMaxLengthPatternProperty() {
        return stringRequiredMinLengthMaxLengthPatternProperty;
    }

    @JsonProperty("stringRequiredMinLengthMaxLengthPatternProperty")
    public void setStringRequiredMinLengthMaxLengthPatternProperty(String stringRequiredMinLengthMaxLengthPatternProperty) {
        this.stringRequiredMinLengthMaxLengthPatternProperty = stringRequiredMinLengthMaxLengthPatternProperty;
    }

    /**
     */
    public ValidationRequest stringByteArrayProperty(byte[] stringByteArrayProperty) {
        this.stringByteArrayProperty = stringByteArrayProperty;
        return this;
    }

    
    @JsonProperty("stringByteArrayProperty")
    @Required 
    public byte[] getStringByteArrayProperty() {
        return stringByteArrayProperty;
    }

    @JsonProperty("stringByteArrayProperty")
    public void setStringByteArrayProperty(byte[] stringByteArrayProperty) {
        this.stringByteArrayProperty = stringByteArrayProperty;
    }

    /**
     */
    public ValidationRequest stringByteArrayMinLengthProperty(byte[] stringByteArrayMinLengthProperty) {
        this.stringByteArrayMinLengthProperty = stringByteArrayMinLengthProperty;
        return this;
    }

    
    @JsonProperty("stringByteArrayMinLengthProperty")
    @Size(min = 3) 
    public byte[] getStringByteArrayMinLengthProperty() {
        return stringByteArrayMinLengthProperty;
    }

    @JsonProperty("stringByteArrayMinLengthProperty")
    public void setStringByteArrayMinLengthProperty(byte[] stringByteArrayMinLengthProperty) {
        this.stringByteArrayMinLengthProperty = stringByteArrayMinLengthProperty;
    }

    /**
     */
    public ValidationRequest stringByteArrayMaxLengthProperty(byte[] stringByteArrayMaxLengthProperty) {
        this.stringByteArrayMaxLengthProperty = stringByteArrayMaxLengthProperty;
        return this;
    }

    
    @JsonProperty("stringByteArrayMaxLengthProperty")
    @Size(max = 7) 
    public byte[] getStringByteArrayMaxLengthProperty() {
        return stringByteArrayMaxLengthProperty;
    }

    @JsonProperty("stringByteArrayMaxLengthProperty")
    public void setStringByteArrayMaxLengthProperty(byte[] stringByteArrayMaxLengthProperty) {
        this.stringByteArrayMaxLengthProperty = stringByteArrayMaxLengthProperty;
    }

    /**
     */
    public ValidationRequest stringByteArrayMinLengthMaxLengthProperty(byte[] stringByteArrayMinLengthMaxLengthProperty) {
        this.stringByteArrayMinLengthMaxLengthProperty = stringByteArrayMinLengthMaxLengthProperty;
        return this;
    }

    
    @JsonProperty("stringByteArrayMinLengthMaxLengthProperty")
    @Size(min = 3, max = 7) 
    public byte[] getStringByteArrayMinLengthMaxLengthProperty() {
        return stringByteArrayMinLengthMaxLengthProperty;
    }

    @JsonProperty("stringByteArrayMinLengthMaxLengthProperty")
    public void setStringByteArrayMinLengthMaxLengthProperty(byte[] stringByteArrayMinLengthMaxLengthProperty) {
        this.stringByteArrayMinLengthMaxLengthProperty = stringByteArrayMinLengthMaxLengthProperty;
    }

    /**
     */
    public ValidationRequest stringByteArrayRequiredMinLengthMaxLengthProperty(byte[] stringByteArrayRequiredMinLengthMaxLengthProperty) {
        this.stringByteArrayRequiredMinLengthMaxLengthProperty = stringByteArrayRequiredMinLengthMaxLengthProperty;
        return this;
    }

    
    @JsonProperty("stringByteArrayRequiredMinLengthMaxLengthProperty")
    @Required @Size(min = 3, max = 7) 
    public byte[] getStringByteArrayRequiredMinLengthMaxLengthProperty() {
        return stringByteArrayRequiredMinLengthMaxLengthProperty;
    }

    @JsonProperty("stringByteArrayRequiredMinLengthMaxLengthProperty")
    public void setStringByteArrayRequiredMinLengthMaxLengthProperty(byte[] stringByteArrayRequiredMinLengthMaxLengthProperty) {
        this.stringByteArrayRequiredMinLengthMaxLengthProperty = stringByteArrayRequiredMinLengthMaxLengthProperty;
    }

    /**
     */
    public ValidationRequest stringDatePlainProperty(LocalDate stringDatePlainProperty) {
        this.stringDatePlainProperty = stringDatePlainProperty;
        return this;
    }

    
    @JsonProperty("stringDatePlainProperty")
    
    public LocalDate getStringDatePlainProperty() {
        return stringDatePlainProperty;
    }

    @JsonProperty("stringDatePlainProperty")
    public void setStringDatePlainProperty(LocalDate stringDatePlainProperty) {
        this.stringDatePlainProperty = stringDatePlainProperty;
    }

    /**
     */
    public ValidationRequest stringDateRequiredProperty(LocalDate stringDateRequiredProperty) {
        this.stringDateRequiredProperty = stringDateRequiredProperty;
        return this;
    }

    
    @JsonProperty("stringDateRequiredProperty")
    @Required 
    public LocalDate getStringDateRequiredProperty() {
        return stringDateRequiredProperty;
    }

    @JsonProperty("stringDateRequiredProperty")
    public void setStringDateRequiredProperty(LocalDate stringDateRequiredProperty) {
        this.stringDateRequiredProperty = stringDateRequiredProperty;
    }

    /**
     */
    public ValidationRequest stringDateTimePlainProperty(OffsetDateTime stringDateTimePlainProperty) {
        this.stringDateTimePlainProperty = stringDateTimePlainProperty;
        return this;
    }

    
    @JsonProperty("stringDateTimePlainProperty")
    
    public OffsetDateTime getStringDateTimePlainProperty() {
        return stringDateTimePlainProperty;
    }

    @JsonProperty("stringDateTimePlainProperty")
    public void setStringDateTimePlainProperty(OffsetDateTime stringDateTimePlainProperty) {
        this.stringDateTimePlainProperty = stringDateTimePlainProperty;
    }

    /**
     */
    public ValidationRequest stringDateTimeRequiredProperty(OffsetDateTime stringDateTimeRequiredProperty) {
        this.stringDateTimeRequiredProperty = stringDateTimeRequiredProperty;
        return this;
    }

    
    @JsonProperty("stringDateTimeRequiredProperty")
    @Required 
    public OffsetDateTime getStringDateTimeRequiredProperty() {
        return stringDateTimeRequiredProperty;
    }

    @JsonProperty("stringDateTimeRequiredProperty")
    public void setStringDateTimeRequiredProperty(OffsetDateTime stringDateTimeRequiredProperty) {
        this.stringDateTimeRequiredProperty = stringDateTimeRequiredProperty;
    }

    /**
     */
    public ValidationRequest stringPasswordPlainProperty(String stringPasswordPlainProperty) {
        this.stringPasswordPlainProperty = stringPasswordPlainProperty;
        return this;
    }

    
    @JsonProperty("stringPasswordPlainProperty")
    
    public String getStringPasswordPlainProperty() {
        return stringPasswordPlainProperty;
    }

    @JsonProperty("stringPasswordPlainProperty")
    public void setStringPasswordPlainProperty(String stringPasswordPlainProperty) {
        this.stringPasswordPlainProperty = stringPasswordPlainProperty;
    }

    /**
     */
    public ValidationRequest stringPasswordRequiredProperty(String stringPasswordRequiredProperty) {
        this.stringPasswordRequiredProperty = stringPasswordRequiredProperty;
        return this;
    }

    
    @JsonProperty("stringPasswordRequiredProperty")
    @Required 
    public String getStringPasswordRequiredProperty() {
        return stringPasswordRequiredProperty;
    }

    @JsonProperty("stringPasswordRequiredProperty")
    public void setStringPasswordRequiredProperty(String stringPasswordRequiredProperty) {
        this.stringPasswordRequiredProperty = stringPasswordRequiredProperty;
    }

    /**
     */
    public ValidationRequest stringPasswordMinLengthProperty(String stringPasswordMinLengthProperty) {
        this.stringPasswordMinLengthProperty = stringPasswordMinLengthProperty;
        return this;
    }

    
    @JsonProperty("stringPasswordMinLengthProperty")
    @Length(min = 3) 
    public String getStringPasswordMinLengthProperty() {
        return stringPasswordMinLengthProperty;
    }

    @JsonProperty("stringPasswordMinLengthProperty")
    public void setStringPasswordMinLengthProperty(String stringPasswordMinLengthProperty) {
        this.stringPasswordMinLengthProperty = stringPasswordMinLengthProperty;
    }

    /**
     */
    public ValidationRequest stringPasswordMaxLengthProperty(String stringPasswordMaxLengthProperty) {
        this.stringPasswordMaxLengthProperty = stringPasswordMaxLengthProperty;
        return this;
    }

    
    @JsonProperty("stringPasswordMaxLengthProperty")
    @Length(max = 7) 
    public String getStringPasswordMaxLengthProperty() {
        return stringPasswordMaxLengthProperty;
    }

    @JsonProperty("stringPasswordMaxLengthProperty")
    public void setStringPasswordMaxLengthProperty(String stringPasswordMaxLengthProperty) {
        this.stringPasswordMaxLengthProperty = stringPasswordMaxLengthProperty;
    }

    /**
     */
    public ValidationRequest stringPasswordMinLengthMaxLengthProperty(String stringPasswordMinLengthMaxLengthProperty) {
        this.stringPasswordMinLengthMaxLengthProperty = stringPasswordMinLengthMaxLengthProperty;
        return this;
    }

    
    @JsonProperty("stringPasswordMinLengthMaxLengthProperty")
    @Length(min = 3, max = 7) 
    public String getStringPasswordMinLengthMaxLengthProperty() {
        return stringPasswordMinLengthMaxLengthProperty;
    }

    @JsonProperty("stringPasswordMinLengthMaxLengthProperty")
    public void setStringPasswordMinLengthMaxLengthProperty(String stringPasswordMinLengthMaxLengthProperty) {
        this.stringPasswordMinLengthMaxLengthProperty = stringPasswordMinLengthMaxLengthProperty;
    }

    /**
     */
    public ValidationRequest stringPasswordPatternProperty(String stringPasswordPatternProperty) {
        this.stringPasswordPatternProperty = stringPasswordPatternProperty;
        return this;
    }

    
    @JsonProperty("stringPasswordPatternProperty")
    @Pattern(regexp = "[a-z]+") 
    public String getStringPasswordPatternProperty() {
        return stringPasswordPatternProperty;
    }

    @JsonProperty("stringPasswordPatternProperty")
    public void setStringPasswordPatternProperty(String stringPasswordPatternProperty) {
        this.stringPasswordPatternProperty = stringPasswordPatternProperty;
    }

    /**
     */
    public ValidationRequest stringPasswordRequiredMinLengthMaxLengthPatternProperty(String stringPasswordRequiredMinLengthMaxLengthPatternProperty) {
        this.stringPasswordRequiredMinLengthMaxLengthPatternProperty = stringPasswordRequiredMinLengthMaxLengthPatternProperty;
        return this;
    }

    
    @JsonProperty("stringPasswordRequiredMinLengthMaxLengthPatternProperty")
    @Required @Pattern(regexp = "[a-z]+") @Length(min = 3, max = 7) 
    public String getStringPasswordRequiredMinLengthMaxLengthPatternProperty() {
        return stringPasswordRequiredMinLengthMaxLengthPatternProperty;
    }

    @JsonProperty("stringPasswordRequiredMinLengthMaxLengthPatternProperty")
    public void setStringPasswordRequiredMinLengthMaxLengthPatternProperty(String stringPasswordRequiredMinLengthMaxLengthPatternProperty) {
        this.stringPasswordRequiredMinLengthMaxLengthPatternProperty = stringPasswordRequiredMinLengthMaxLengthPatternProperty;
    }

    /**
     */
    public ValidationRequest stringNumberPlainProperty(BigDecimal stringNumberPlainProperty) {
        this.stringNumberPlainProperty = stringNumberPlainProperty;
        return this;
    }

    
    @JsonProperty("stringNumberPlainProperty")
    @Valid 
    public BigDecimal getStringNumberPlainProperty() {
        return stringNumberPlainProperty;
    }

    @JsonProperty("stringNumberPlainProperty")
    public void setStringNumberPlainProperty(BigDecimal stringNumberPlainProperty) {
        this.stringNumberPlainProperty = stringNumberPlainProperty;
    }

    /**
     */
    public ValidationRequest stringNumberRequiredProperty(BigDecimal stringNumberRequiredProperty) {
        this.stringNumberRequiredProperty = stringNumberRequiredProperty;
        return this;
    }

    
    @JsonProperty("stringNumberRequiredProperty")
    @Required @Valid 
    public BigDecimal getStringNumberRequiredProperty() {
        return stringNumberRequiredProperty;
    }

    @JsonProperty("stringNumberRequiredProperty")
    public void setStringNumberRequiredProperty(BigDecimal stringNumberRequiredProperty) {
        this.stringNumberRequiredProperty = stringNumberRequiredProperty;
    }

    /**
     */
    public ValidationRequest stringUriPlainProperty(URI stringUriPlainProperty) {
        this.stringUriPlainProperty = stringUriPlainProperty;
        return this;
    }

    
    @JsonProperty("stringUriPlainProperty")
    
    public URI getStringUriPlainProperty() {
        return stringUriPlainProperty;
    }

    @JsonProperty("stringUriPlainProperty")
    public void setStringUriPlainProperty(URI stringUriPlainProperty) {
        this.stringUriPlainProperty = stringUriPlainProperty;
    }

    /**
     */
    public ValidationRequest stringUriRequiredProperty(URI stringUriRequiredProperty) {
        this.stringUriRequiredProperty = stringUriRequiredProperty;
        return this;
    }

    
    @JsonProperty("stringUriRequiredProperty")
    @Required 
    public URI getStringUriRequiredProperty() {
        return stringUriRequiredProperty;
    }

    @JsonProperty("stringUriRequiredProperty")
    public void setStringUriRequiredProperty(URI stringUriRequiredProperty) {
        this.stringUriRequiredProperty = stringUriRequiredProperty;
    }

    /**
     */
    public ValidationRequest stringUuidPlainProperty(UUID stringUuidPlainProperty) {
        this.stringUuidPlainProperty = stringUuidPlainProperty;
        return this;
    }

    
    @JsonProperty("stringUuidPlainProperty")
    
    public UUID getStringUuidPlainProperty() {
        return stringUuidPlainProperty;
    }

    @JsonProperty("stringUuidPlainProperty")
    public void setStringUuidPlainProperty(UUID stringUuidPlainProperty) {
        this.stringUuidPlainProperty = stringUuidPlainProperty;
    }

    /**
     */
    public ValidationRequest stringUuidRequiredProperty(UUID stringUuidRequiredProperty) {
        this.stringUuidRequiredProperty = stringUuidRequiredProperty;
        return this;
    }

    
    @JsonProperty("stringUuidRequiredProperty")
    @Required 
    public UUID getStringUuidRequiredProperty() {
        return stringUuidRequiredProperty;
    }

    @JsonProperty("stringUuidRequiredProperty")
    public void setStringUuidRequiredProperty(UUID stringUuidRequiredProperty) {
        this.stringUuidRequiredProperty = stringUuidRequiredProperty;
    }

    /**
     */
    public ValidationRequest stringRegexPlainProperty(String stringRegexPlainProperty) {
        this.stringRegexPlainProperty = stringRegexPlainProperty;
        return this;
    }

    
    @JsonProperty("stringRegexPlainProperty")
    
    public String getStringRegexPlainProperty() {
        return stringRegexPlainProperty;
    }

    @JsonProperty("stringRegexPlainProperty")
    public void setStringRegexPlainProperty(String stringRegexPlainProperty) {
        this.stringRegexPlainProperty = stringRegexPlainProperty;
    }

    /**
     */
    public ValidationRequest stringRegexRequiredProperty(String stringRegexRequiredProperty) {
        this.stringRegexRequiredProperty = stringRegexRequiredProperty;
        return this;
    }

    
    @JsonProperty("stringRegexRequiredProperty")
    @Required @Pattern(regexp = "[a-z]+") 
    public String getStringRegexRequiredProperty() {
        return stringRegexRequiredProperty;
    }

    @JsonProperty("stringRegexRequiredProperty")
    public void setStringRegexRequiredProperty(String stringRegexRequiredProperty) {
        this.stringRegexRequiredProperty = stringRegexRequiredProperty;
    }

    /**
     */
    public ValidationRequest stringRegexMinLengthProperty(String stringRegexMinLengthProperty) {
        this.stringRegexMinLengthProperty = stringRegexMinLengthProperty;
        return this;
    }

    
    @JsonProperty("stringRegexMinLengthProperty")
    @Pattern(regexp = "[a-z]+") @Length(min = 3) 
    public String getStringRegexMinLengthProperty() {
        return stringRegexMinLengthProperty;
    }

    @JsonProperty("stringRegexMinLengthProperty")
    public void setStringRegexMinLengthProperty(String stringRegexMinLengthProperty) {
        this.stringRegexMinLengthProperty = stringRegexMinLengthProperty;
    }

    /**
     */
    public ValidationRequest stringRegexMaxLengthProperty(String stringRegexMaxLengthProperty) {
        this.stringRegexMaxLengthProperty = stringRegexMaxLengthProperty;
        return this;
    }

    
    @JsonProperty("stringRegexMaxLengthProperty")
    @Pattern(regexp = "[a-z]+") @Length(max = 7) 
    public String getStringRegexMaxLengthProperty() {
        return stringRegexMaxLengthProperty;
    }

    @JsonProperty("stringRegexMaxLengthProperty")
    public void setStringRegexMaxLengthProperty(String stringRegexMaxLengthProperty) {
        this.stringRegexMaxLengthProperty = stringRegexMaxLengthProperty;
    }

    /**
     */
    public ValidationRequest stringRegexMinLengthMaxLengthProperty(String stringRegexMinLengthMaxLengthProperty) {
        this.stringRegexMinLengthMaxLengthProperty = stringRegexMinLengthMaxLengthProperty;
        return this;
    }

    
    @JsonProperty("stringRegexMinLengthMaxLengthProperty")
    @Pattern(regexp = "[a-z]+") @Length(min = 3, max = 7) 
    public String getStringRegexMinLengthMaxLengthProperty() {
        return stringRegexMinLengthMaxLengthProperty;
    }

    @JsonProperty("stringRegexMinLengthMaxLengthProperty")
    public void setStringRegexMinLengthMaxLengthProperty(String stringRegexMinLengthMaxLengthProperty) {
        this.stringRegexMinLengthMaxLengthProperty = stringRegexMinLengthMaxLengthProperty;
    }

    /**
     */
    public ValidationRequest stringRegexRequiredMinLengthMaxLengthProperty(String stringRegexRequiredMinLengthMaxLengthProperty) {
        this.stringRegexRequiredMinLengthMaxLengthProperty = stringRegexRequiredMinLengthMaxLengthProperty;
        return this;
    }

    
    @JsonProperty("stringRegexRequiredMinLengthMaxLengthProperty")
    @Required @Pattern(regexp = "[a-z]+") @Length(min = 3, max = 7) 
    public String getStringRegexRequiredMinLengthMaxLengthProperty() {
        return stringRegexRequiredMinLengthMaxLengthProperty;
    }

    @JsonProperty("stringRegexRequiredMinLengthMaxLengthProperty")
    public void setStringRegexRequiredMinLengthMaxLengthProperty(String stringRegexRequiredMinLengthMaxLengthProperty) {
        this.stringRegexRequiredMinLengthMaxLengthProperty = stringRegexRequiredMinLengthMaxLengthProperty;
    }

    /**
     */
    public ValidationRequest arrayStringPlainProperty(List<String> arrayStringPlainProperty) {
        this.arrayStringPlainProperty = arrayStringPlainProperty;
        return this;
    }

    
    @JsonProperty("arrayStringPlainProperty")
    
    public List<String> getArrayStringPlainProperty() {
        return arrayStringPlainProperty;
    }

    @JsonProperty("arrayStringPlainProperty")
    public void setArrayStringPlainProperty(List<String> arrayStringPlainProperty) {
        this.arrayStringPlainProperty = arrayStringPlainProperty;
    }

    public ValidationRequest addArrayStringPlainPropertyItem(String arrayStringPlainPropertyItem) {
        if (this.arrayStringPlainProperty == null) {
            this.arrayStringPlainProperty = new ArrayList<>();
        }

        this.arrayStringPlainProperty.add(arrayStringPlainPropertyItem);
        return this;
    }

    public ValidationRequest removeArrayStringPlainPropertyItem(String arrayStringPlainPropertyItem) {
        if (arrayStringPlainPropertyItem != null && this.arrayStringPlainProperty != null) {
            this.arrayStringPlainProperty.remove(arrayStringPlainPropertyItem);
        }

        return this;
    }
    /**
     */
    public ValidationRequest arrayStringRequiredProperty(List<String> arrayStringRequiredProperty) {
        this.arrayStringRequiredProperty = arrayStringRequiredProperty;
        return this;
    }

    
    @JsonProperty("arrayStringRequiredProperty")
    @Required 
    public List<String> getArrayStringRequiredProperty() {
        return arrayStringRequiredProperty;
    }

    @JsonProperty("arrayStringRequiredProperty")
    public void setArrayStringRequiredProperty(List<String> arrayStringRequiredProperty) {
        this.arrayStringRequiredProperty = arrayStringRequiredProperty;
    }

    public ValidationRequest addArrayStringRequiredPropertyItem(String arrayStringRequiredPropertyItem) {
        if (this.arrayStringRequiredProperty == null) {
            this.arrayStringRequiredProperty = new ArrayList<>();
        }

        this.arrayStringRequiredProperty.add(arrayStringRequiredPropertyItem);
        return this;
    }

    public ValidationRequest removeArrayStringRequiredPropertyItem(String arrayStringRequiredPropertyItem) {
        if (arrayStringRequiredPropertyItem != null && this.arrayStringRequiredProperty != null) {
            this.arrayStringRequiredProperty.remove(arrayStringRequiredPropertyItem);
        }

        return this;
    }
    /**
     */
    public ValidationRequest arrayStringMinItemsProperty(List<String> arrayStringMinItemsProperty) {
        this.arrayStringMinItemsProperty = arrayStringMinItemsProperty;
        return this;
    }

    
    @JsonProperty("arrayStringMinItemsProperty")
    @Size(min = 3) 
    public List<String> getArrayStringMinItemsProperty() {
        return arrayStringMinItemsProperty;
    }

    @JsonProperty("arrayStringMinItemsProperty")
    public void setArrayStringMinItemsProperty(List<String> arrayStringMinItemsProperty) {
        this.arrayStringMinItemsProperty = arrayStringMinItemsProperty;
    }

    public ValidationRequest addArrayStringMinItemsPropertyItem(String arrayStringMinItemsPropertyItem) {
        if (this.arrayStringMinItemsProperty == null) {
            this.arrayStringMinItemsProperty = new ArrayList<>();
        }

        this.arrayStringMinItemsProperty.add(arrayStringMinItemsPropertyItem);
        return this;
    }

    public ValidationRequest removeArrayStringMinItemsPropertyItem(String arrayStringMinItemsPropertyItem) {
        if (arrayStringMinItemsPropertyItem != null && this.arrayStringMinItemsProperty != null) {
            this.arrayStringMinItemsProperty.remove(arrayStringMinItemsPropertyItem);
        }

        return this;
    }
    /**
     */
    public ValidationRequest arrayStringMaxItemsProperty(List<String> arrayStringMaxItemsProperty) {
        this.arrayStringMaxItemsProperty = arrayStringMaxItemsProperty;
        return this;
    }

    
    @JsonProperty("arrayStringMaxItemsProperty")
    @Size(max = 7) 
    public List<String> getArrayStringMaxItemsProperty() {
        return arrayStringMaxItemsProperty;
    }

    @JsonProperty("arrayStringMaxItemsProperty")
    public void setArrayStringMaxItemsProperty(List<String> arrayStringMaxItemsProperty) {
        this.arrayStringMaxItemsProperty = arrayStringMaxItemsProperty;
    }

    public ValidationRequest addArrayStringMaxItemsPropertyItem(String arrayStringMaxItemsPropertyItem) {
        if (this.arrayStringMaxItemsProperty == null) {
            this.arrayStringMaxItemsProperty = new ArrayList<>();
        }

        this.arrayStringMaxItemsProperty.add(arrayStringMaxItemsPropertyItem);
        return this;
    }

    public ValidationRequest removeArrayStringMaxItemsPropertyItem(String arrayStringMaxItemsPropertyItem) {
        if (arrayStringMaxItemsPropertyItem != null && this.arrayStringMaxItemsProperty != null) {
            this.arrayStringMaxItemsProperty.remove(arrayStringMaxItemsPropertyItem);
        }

        return this;
    }
    /**
     */
    public ValidationRequest arrayStringMinItemsMaxItemsProperty(List<String> arrayStringMinItemsMaxItemsProperty) {
        this.arrayStringMinItemsMaxItemsProperty = arrayStringMinItemsMaxItemsProperty;
        return this;
    }

    
    @JsonProperty("arrayStringMinItemsMaxItemsProperty")
    @Size(min = 3, max = 7) 
    public List<String> getArrayStringMinItemsMaxItemsProperty() {
        return arrayStringMinItemsMaxItemsProperty;
    }

    @JsonProperty("arrayStringMinItemsMaxItemsProperty")
    public void setArrayStringMinItemsMaxItemsProperty(List<String> arrayStringMinItemsMaxItemsProperty) {
        this.arrayStringMinItemsMaxItemsProperty = arrayStringMinItemsMaxItemsProperty;
    }

    public ValidationRequest addArrayStringMinItemsMaxItemsPropertyItem(String arrayStringMinItemsMaxItemsPropertyItem) {
        if (this.arrayStringMinItemsMaxItemsProperty == null) {
            this.arrayStringMinItemsMaxItemsProperty = new ArrayList<>();
        }

        this.arrayStringMinItemsMaxItemsProperty.add(arrayStringMinItemsMaxItemsPropertyItem);
        return this;
    }

    public ValidationRequest removeArrayStringMinItemsMaxItemsPropertyItem(String arrayStringMinItemsMaxItemsPropertyItem) {
        if (arrayStringMinItemsMaxItemsPropertyItem != null && this.arrayStringMinItemsMaxItemsProperty != null) {
            this.arrayStringMinItemsMaxItemsProperty.remove(arrayStringMinItemsMaxItemsPropertyItem);
        }

        return this;
    }
    /**
     */
    public ValidationRequest arrayStringRequiredMinItemsMaxItemsProperty(List<String> arrayStringRequiredMinItemsMaxItemsProperty) {
        this.arrayStringRequiredMinItemsMaxItemsProperty = arrayStringRequiredMinItemsMaxItemsProperty;
        return this;
    }

    
    @JsonProperty("arrayStringRequiredMinItemsMaxItemsProperty")
    @Required @Size(min = 3, max = 7) 
    public List<String> getArrayStringRequiredMinItemsMaxItemsProperty() {
        return arrayStringRequiredMinItemsMaxItemsProperty;
    }

    @JsonProperty("arrayStringRequiredMinItemsMaxItemsProperty")
    public void setArrayStringRequiredMinItemsMaxItemsProperty(List<String> arrayStringRequiredMinItemsMaxItemsProperty) {
        this.arrayStringRequiredMinItemsMaxItemsProperty = arrayStringRequiredMinItemsMaxItemsProperty;
    }

    public ValidationRequest addArrayStringRequiredMinItemsMaxItemsPropertyItem(String arrayStringRequiredMinItemsMaxItemsPropertyItem) {
        if (this.arrayStringRequiredMinItemsMaxItemsProperty == null) {
            this.arrayStringRequiredMinItemsMaxItemsProperty = new ArrayList<>();
        }

        this.arrayStringRequiredMinItemsMaxItemsProperty.add(arrayStringRequiredMinItemsMaxItemsPropertyItem);
        return this;
    }

    public ValidationRequest removeArrayStringRequiredMinItemsMaxItemsPropertyItem(String arrayStringRequiredMinItemsMaxItemsPropertyItem) {
        if (arrayStringRequiredMinItemsMaxItemsPropertyItem != null && this.arrayStringRequiredMinItemsMaxItemsProperty != null) {
            this.arrayStringRequiredMinItemsMaxItemsProperty.remove(arrayStringRequiredMinItemsMaxItemsPropertyItem);
        }

        return this;
    }
    /**
     */
    public ValidationRequest arrayObjectPlainProperty(List<@Valid ValidationSubRequest> arrayObjectPlainProperty) {
        this.arrayObjectPlainProperty = arrayObjectPlainProperty;
        return this;
    }

    
    @JsonProperty("arrayObjectPlainProperty")
    @Valid 
    public List<@Valid ValidationSubRequest> getArrayObjectPlainProperty() {
        return arrayObjectPlainProperty;
    }

    @JsonProperty("arrayObjectPlainProperty")
    public void setArrayObjectPlainProperty(List<@Valid ValidationSubRequest> arrayObjectPlainProperty) {
        this.arrayObjectPlainProperty = arrayObjectPlainProperty;
    }

    public ValidationRequest addArrayObjectPlainPropertyItem(ValidationSubRequest arrayObjectPlainPropertyItem) {
        if (this.arrayObjectPlainProperty == null) {
            this.arrayObjectPlainProperty = new ArrayList<>();
        }

        this.arrayObjectPlainProperty.add(arrayObjectPlainPropertyItem);
        return this;
    }

    public ValidationRequest removeArrayObjectPlainPropertyItem(ValidationSubRequest arrayObjectPlainPropertyItem) {
        if (arrayObjectPlainPropertyItem != null && this.arrayObjectPlainProperty != null) {
            this.arrayObjectPlainProperty.remove(arrayObjectPlainPropertyItem);
        }

        return this;
    }
    /**
     */
    public ValidationRequest arrayObjectRequiredProperty(List<@Valid ValidationSubRequest> arrayObjectRequiredProperty) {
        this.arrayObjectRequiredProperty = arrayObjectRequiredProperty;
        return this;
    }

    
    @JsonProperty("arrayObjectRequiredProperty")
    @Required @Valid 
    public List<@Valid ValidationSubRequest> getArrayObjectRequiredProperty() {
        return arrayObjectRequiredProperty;
    }

    @JsonProperty("arrayObjectRequiredProperty")
    public void setArrayObjectRequiredProperty(List<@Valid ValidationSubRequest> arrayObjectRequiredProperty) {
        this.arrayObjectRequiredProperty = arrayObjectRequiredProperty;
    }

    public ValidationRequest addArrayObjectRequiredPropertyItem(ValidationSubRequest arrayObjectRequiredPropertyItem) {
        if (this.arrayObjectRequiredProperty == null) {
            this.arrayObjectRequiredProperty = new ArrayList<>();
        }

        this.arrayObjectRequiredProperty.add(arrayObjectRequiredPropertyItem);
        return this;
    }

    public ValidationRequest removeArrayObjectRequiredPropertyItem(ValidationSubRequest arrayObjectRequiredPropertyItem) {
        if (arrayObjectRequiredPropertyItem != null && this.arrayObjectRequiredProperty != null) {
            this.arrayObjectRequiredProperty.remove(arrayObjectRequiredPropertyItem);
        }

        return this;
    }
    /**
     */
    public ValidationRequest arrayObjectMinItemsProperty(List<@Valid ValidationSubRequest> arrayObjectMinItemsProperty) {
        this.arrayObjectMinItemsProperty = arrayObjectMinItemsProperty;
        return this;
    }

    
    @JsonProperty("arrayObjectMinItemsProperty")
    @Valid @Size(min = 3) 
    public List<@Valid ValidationSubRequest> getArrayObjectMinItemsProperty() {
        return arrayObjectMinItemsProperty;
    }

    @JsonProperty("arrayObjectMinItemsProperty")
    public void setArrayObjectMinItemsProperty(List<@Valid ValidationSubRequest> arrayObjectMinItemsProperty) {
        this.arrayObjectMinItemsProperty = arrayObjectMinItemsProperty;
    }

    public ValidationRequest addArrayObjectMinItemsPropertyItem(ValidationSubRequest arrayObjectMinItemsPropertyItem) {
        if (this.arrayObjectMinItemsProperty == null) {
            this.arrayObjectMinItemsProperty = new ArrayList<>();
        }

        this.arrayObjectMinItemsProperty.add(arrayObjectMinItemsPropertyItem);
        return this;
    }

    public ValidationRequest removeArrayObjectMinItemsPropertyItem(ValidationSubRequest arrayObjectMinItemsPropertyItem) {
        if (arrayObjectMinItemsPropertyItem != null && this.arrayObjectMinItemsProperty != null) {
            this.arrayObjectMinItemsProperty.remove(arrayObjectMinItemsPropertyItem);
        }

        return this;
    }
    /**
     */
    public ValidationRequest arrayObjectMaxItemsProperty(List<@Valid ValidationSubRequest> arrayObjectMaxItemsProperty) {
        this.arrayObjectMaxItemsProperty = arrayObjectMaxItemsProperty;
        return this;
    }

    
    @JsonProperty("arrayObjectMaxItemsProperty")
    @Valid @Size(max = 7) 
    public List<@Valid ValidationSubRequest> getArrayObjectMaxItemsProperty() {
        return arrayObjectMaxItemsProperty;
    }

    @JsonProperty("arrayObjectMaxItemsProperty")
    public void setArrayObjectMaxItemsProperty(List<@Valid ValidationSubRequest> arrayObjectMaxItemsProperty) {
        this.arrayObjectMaxItemsProperty = arrayObjectMaxItemsProperty;
    }

    public ValidationRequest addArrayObjectMaxItemsPropertyItem(ValidationSubRequest arrayObjectMaxItemsPropertyItem) {
        if (this.arrayObjectMaxItemsProperty == null) {
            this.arrayObjectMaxItemsProperty = new ArrayList<>();
        }

        this.arrayObjectMaxItemsProperty.add(arrayObjectMaxItemsPropertyItem);
        return this;
    }

    public ValidationRequest removeArrayObjectMaxItemsPropertyItem(ValidationSubRequest arrayObjectMaxItemsPropertyItem) {
        if (arrayObjectMaxItemsPropertyItem != null && this.arrayObjectMaxItemsProperty != null) {
            this.arrayObjectMaxItemsProperty.remove(arrayObjectMaxItemsPropertyItem);
        }

        return this;
    }
    /**
     */
    public ValidationRequest arrayObjectMinItemsMaxItemsProperty(List<@Valid ValidationSubRequest> arrayObjectMinItemsMaxItemsProperty) {
        this.arrayObjectMinItemsMaxItemsProperty = arrayObjectMinItemsMaxItemsProperty;
        return this;
    }

    
    @JsonProperty("arrayObjectMinItemsMaxItemsProperty")
    @Valid @Size(min = 3, max = 7) 
    public List<@Valid ValidationSubRequest> getArrayObjectMinItemsMaxItemsProperty() {
        return arrayObjectMinItemsMaxItemsProperty;
    }

    @JsonProperty("arrayObjectMinItemsMaxItemsProperty")
    public void setArrayObjectMinItemsMaxItemsProperty(List<@Valid ValidationSubRequest> arrayObjectMinItemsMaxItemsProperty) {
        this.arrayObjectMinItemsMaxItemsProperty = arrayObjectMinItemsMaxItemsProperty;
    }

    public ValidationRequest addArrayObjectMinItemsMaxItemsPropertyItem(ValidationSubRequest arrayObjectMinItemsMaxItemsPropertyItem) {
        if (this.arrayObjectMinItemsMaxItemsProperty == null) {
            this.arrayObjectMinItemsMaxItemsProperty = new ArrayList<>();
        }

        this.arrayObjectMinItemsMaxItemsProperty.add(arrayObjectMinItemsMaxItemsPropertyItem);
        return this;
    }

    public ValidationRequest removeArrayObjectMinItemsMaxItemsPropertyItem(ValidationSubRequest arrayObjectMinItemsMaxItemsPropertyItem) {
        if (arrayObjectMinItemsMaxItemsPropertyItem != null && this.arrayObjectMinItemsMaxItemsProperty != null) {
            this.arrayObjectMinItemsMaxItemsProperty.remove(arrayObjectMinItemsMaxItemsPropertyItem);
        }

        return this;
    }
    /**
     */
    public ValidationRequest arrayObjectRequiredMinItemsMaxItemsProperty(List<@Valid ValidationSubRequest> arrayObjectRequiredMinItemsMaxItemsProperty) {
        this.arrayObjectRequiredMinItemsMaxItemsProperty = arrayObjectRequiredMinItemsMaxItemsProperty;
        return this;
    }

    
    @JsonProperty("arrayObjectRequiredMinItemsMaxItemsProperty")
    @Required @Valid @Size(min = 3, max = 7) 
    public List<@Valid ValidationSubRequest> getArrayObjectRequiredMinItemsMaxItemsProperty() {
        return arrayObjectRequiredMinItemsMaxItemsProperty;
    }

    @JsonProperty("arrayObjectRequiredMinItemsMaxItemsProperty")
    public void setArrayObjectRequiredMinItemsMaxItemsProperty(List<@Valid ValidationSubRequest> arrayObjectRequiredMinItemsMaxItemsProperty) {
        this.arrayObjectRequiredMinItemsMaxItemsProperty = arrayObjectRequiredMinItemsMaxItemsProperty;
    }

    public ValidationRequest addArrayObjectRequiredMinItemsMaxItemsPropertyItem(ValidationSubRequest arrayObjectRequiredMinItemsMaxItemsPropertyItem) {
        if (this.arrayObjectRequiredMinItemsMaxItemsProperty == null) {
            this.arrayObjectRequiredMinItemsMaxItemsProperty = new ArrayList<>();
        }

        this.arrayObjectRequiredMinItemsMaxItemsProperty.add(arrayObjectRequiredMinItemsMaxItemsPropertyItem);
        return this;
    }

    public ValidationRequest removeArrayObjectRequiredMinItemsMaxItemsPropertyItem(ValidationSubRequest arrayObjectRequiredMinItemsMaxItemsPropertyItem) {
        if (arrayObjectRequiredMinItemsMaxItemsPropertyItem != null && this.arrayObjectRequiredMinItemsMaxItemsProperty != null) {
            this.arrayObjectRequiredMinItemsMaxItemsProperty.remove(arrayObjectRequiredMinItemsMaxItemsPropertyItem);
        }

        return this;
    }
    /**
     */
    public ValidationRequest arrayStringUniqueItemsPlainProperty(Set<String> arrayStringUniqueItemsPlainProperty) {
        this.arrayStringUniqueItemsPlainProperty = arrayStringUniqueItemsPlainProperty;
        return this;
    }

    
    @JsonProperty("arrayStringUniqueItemsPlainProperty")
    
    public Set<String> getArrayStringUniqueItemsPlainProperty() {
        return arrayStringUniqueItemsPlainProperty;
    }

    @JsonProperty("arrayStringUniqueItemsPlainProperty")
    @JsonDeserialize(as = LinkedHashSet.class)
    public void setArrayStringUniqueItemsPlainProperty(Set<String> arrayStringUniqueItemsPlainProperty) {
        this.arrayStringUniqueItemsPlainProperty = arrayStringUniqueItemsPlainProperty;
    }

    public ValidationRequest addArrayStringUniqueItemsPlainPropertyItem(String arrayStringUniqueItemsPlainPropertyItem) {
        if (this.arrayStringUniqueItemsPlainProperty == null) {
            this.arrayStringUniqueItemsPlainProperty = new LinkedHashSet<>();
        }

        this.arrayStringUniqueItemsPlainProperty.add(arrayStringUniqueItemsPlainPropertyItem);
        return this;
    }

    public ValidationRequest removeArrayStringUniqueItemsPlainPropertyItem(String arrayStringUniqueItemsPlainPropertyItem) {
        if (arrayStringUniqueItemsPlainPropertyItem != null && this.arrayStringUniqueItemsPlainProperty != null) {
            this.arrayStringUniqueItemsPlainProperty.remove(arrayStringUniqueItemsPlainPropertyItem);
        }

        return this;
    }
    /**
     */
    public ValidationRequest arrayStringUniqueItemsRequiredProperty(Set<String> arrayStringUniqueItemsRequiredProperty) {
        this.arrayStringUniqueItemsRequiredProperty = arrayStringUniqueItemsRequiredProperty;
        return this;
    }

    
    @JsonProperty("arrayStringUniqueItemsRequiredProperty")
    @Required 
    public Set<String> getArrayStringUniqueItemsRequiredProperty() {
        return arrayStringUniqueItemsRequiredProperty;
    }

    @JsonProperty("arrayStringUniqueItemsRequiredProperty")
    @JsonDeserialize(as = LinkedHashSet.class)
    public void setArrayStringUniqueItemsRequiredProperty(Set<String> arrayStringUniqueItemsRequiredProperty) {
        this.arrayStringUniqueItemsRequiredProperty = arrayStringUniqueItemsRequiredProperty;
    }

    public ValidationRequest addArrayStringUniqueItemsRequiredPropertyItem(String arrayStringUniqueItemsRequiredPropertyItem) {
        if (this.arrayStringUniqueItemsRequiredProperty == null) {
            this.arrayStringUniqueItemsRequiredProperty = new LinkedHashSet<>();
        }

        this.arrayStringUniqueItemsRequiredProperty.add(arrayStringUniqueItemsRequiredPropertyItem);
        return this;
    }

    public ValidationRequest removeArrayStringUniqueItemsRequiredPropertyItem(String arrayStringUniqueItemsRequiredPropertyItem) {
        if (arrayStringUniqueItemsRequiredPropertyItem != null && this.arrayStringUniqueItemsRequiredProperty != null) {
            this.arrayStringUniqueItemsRequiredProperty.remove(arrayStringUniqueItemsRequiredPropertyItem);
        }

        return this;
    }
    /**
     */
    public ValidationRequest arrayStringUniqueItemsMinItemsProperty(Set<String> arrayStringUniqueItemsMinItemsProperty) {
        this.arrayStringUniqueItemsMinItemsProperty = arrayStringUniqueItemsMinItemsProperty;
        return this;
    }

    
    @JsonProperty("arrayStringUniqueItemsMinItemsProperty")
    @Size(min = 3) 
    public Set<String> getArrayStringUniqueItemsMinItemsProperty() {
        return arrayStringUniqueItemsMinItemsProperty;
    }

    @JsonProperty("arrayStringUniqueItemsMinItemsProperty")
    @JsonDeserialize(as = LinkedHashSet.class)
    public void setArrayStringUniqueItemsMinItemsProperty(Set<String> arrayStringUniqueItemsMinItemsProperty) {
        this.arrayStringUniqueItemsMinItemsProperty = arrayStringUniqueItemsMinItemsProperty;
    }

    public ValidationRequest addArrayStringUniqueItemsMinItemsPropertyItem(String arrayStringUniqueItemsMinItemsPropertyItem) {
        if (this.arrayStringUniqueItemsMinItemsProperty == null) {
            this.arrayStringUniqueItemsMinItemsProperty = new LinkedHashSet<>();
        }

        this.arrayStringUniqueItemsMinItemsProperty.add(arrayStringUniqueItemsMinItemsPropertyItem);
        return this;
    }

    public ValidationRequest removeArrayStringUniqueItemsMinItemsPropertyItem(String arrayStringUniqueItemsMinItemsPropertyItem) {
        if (arrayStringUniqueItemsMinItemsPropertyItem != null && this.arrayStringUniqueItemsMinItemsProperty != null) {
            this.arrayStringUniqueItemsMinItemsProperty.remove(arrayStringUniqueItemsMinItemsPropertyItem);
        }

        return this;
    }
    /**
     */
    public ValidationRequest arrayStringUniqueItemsMaxItemsProperty(Set<String> arrayStringUniqueItemsMaxItemsProperty) {
        this.arrayStringUniqueItemsMaxItemsProperty = arrayStringUniqueItemsMaxItemsProperty;
        return this;
    }

    
    @JsonProperty("arrayStringUniqueItemsMaxItemsProperty")
    @Size(max = 7) 
    public Set<String> getArrayStringUniqueItemsMaxItemsProperty() {
        return arrayStringUniqueItemsMaxItemsProperty;
    }

    @JsonProperty("arrayStringUniqueItemsMaxItemsProperty")
    @JsonDeserialize(as = LinkedHashSet.class)
    public void setArrayStringUniqueItemsMaxItemsProperty(Set<String> arrayStringUniqueItemsMaxItemsProperty) {
        this.arrayStringUniqueItemsMaxItemsProperty = arrayStringUniqueItemsMaxItemsProperty;
    }

    public ValidationRequest addArrayStringUniqueItemsMaxItemsPropertyItem(String arrayStringUniqueItemsMaxItemsPropertyItem) {
        if (this.arrayStringUniqueItemsMaxItemsProperty == null) {
            this.arrayStringUniqueItemsMaxItemsProperty = new LinkedHashSet<>();
        }

        this.arrayStringUniqueItemsMaxItemsProperty.add(arrayStringUniqueItemsMaxItemsPropertyItem);
        return this;
    }

    public ValidationRequest removeArrayStringUniqueItemsMaxItemsPropertyItem(String arrayStringUniqueItemsMaxItemsPropertyItem) {
        if (arrayStringUniqueItemsMaxItemsPropertyItem != null && this.arrayStringUniqueItemsMaxItemsProperty != null) {
            this.arrayStringUniqueItemsMaxItemsProperty.remove(arrayStringUniqueItemsMaxItemsPropertyItem);
        }

        return this;
    }
    /**
     */
    public ValidationRequest arrayStringUniqueItemsMinItemsMaxItemsProperty(Set<String> arrayStringUniqueItemsMinItemsMaxItemsProperty) {
        this.arrayStringUniqueItemsMinItemsMaxItemsProperty = arrayStringUniqueItemsMinItemsMaxItemsProperty;
        return this;
    }

    
    @JsonProperty("arrayStringUniqueItemsMinItemsMaxItemsProperty")
    @Size(min = 3, max = 7) 
    public Set<String> getArrayStringUniqueItemsMinItemsMaxItemsProperty() {
        return arrayStringUniqueItemsMinItemsMaxItemsProperty;
    }

    @JsonProperty("arrayStringUniqueItemsMinItemsMaxItemsProperty")
    @JsonDeserialize(as = LinkedHashSet.class)
    public void setArrayStringUniqueItemsMinItemsMaxItemsProperty(Set<String> arrayStringUniqueItemsMinItemsMaxItemsProperty) {
        this.arrayStringUniqueItemsMinItemsMaxItemsProperty = arrayStringUniqueItemsMinItemsMaxItemsProperty;
    }

    public ValidationRequest addArrayStringUniqueItemsMinItemsMaxItemsPropertyItem(String arrayStringUniqueItemsMinItemsMaxItemsPropertyItem) {
        if (this.arrayStringUniqueItemsMinItemsMaxItemsProperty == null) {
            this.arrayStringUniqueItemsMinItemsMaxItemsProperty = new LinkedHashSet<>();
        }

        this.arrayStringUniqueItemsMinItemsMaxItemsProperty.add(arrayStringUniqueItemsMinItemsMaxItemsPropertyItem);
        return this;
    }

    public ValidationRequest removeArrayStringUniqueItemsMinItemsMaxItemsPropertyItem(String arrayStringUniqueItemsMinItemsMaxItemsPropertyItem) {
        if (arrayStringUniqueItemsMinItemsMaxItemsPropertyItem != null && this.arrayStringUniqueItemsMinItemsMaxItemsProperty != null) {
            this.arrayStringUniqueItemsMinItemsMaxItemsProperty.remove(arrayStringUniqueItemsMinItemsMaxItemsPropertyItem);
        }

        return this;
    }
    /**
     */
    public ValidationRequest arrayStringUniqueItemsRequiredMinItemsMaxItemsProperty(Set<String> arrayStringUniqueItemsRequiredMinItemsMaxItemsProperty) {
        this.arrayStringUniqueItemsRequiredMinItemsMaxItemsProperty = arrayStringUniqueItemsRequiredMinItemsMaxItemsProperty;
        return this;
    }

    
    @JsonProperty("arrayStringUniqueItemsRequiredMinItemsMaxItemsProperty")
    @Required @Size(min = 3, max = 7) 
    public Set<String> getArrayStringUniqueItemsRequiredMinItemsMaxItemsProperty() {
        return arrayStringUniqueItemsRequiredMinItemsMaxItemsProperty;
    }

    @JsonProperty("arrayStringUniqueItemsRequiredMinItemsMaxItemsProperty")
    @JsonDeserialize(as = LinkedHashSet.class)
    public void setArrayStringUniqueItemsRequiredMinItemsMaxItemsProperty(Set<String> arrayStringUniqueItemsRequiredMinItemsMaxItemsProperty) {
        this.arrayStringUniqueItemsRequiredMinItemsMaxItemsProperty = arrayStringUniqueItemsRequiredMinItemsMaxItemsProperty;
    }

    public ValidationRequest addArrayStringUniqueItemsRequiredMinItemsMaxItemsPropertyItem(String arrayStringUniqueItemsRequiredMinItemsMaxItemsPropertyItem) {
        if (this.arrayStringUniqueItemsRequiredMinItemsMaxItemsProperty == null) {
            this.arrayStringUniqueItemsRequiredMinItemsMaxItemsProperty = new LinkedHashSet<>();
        }

        this.arrayStringUniqueItemsRequiredMinItemsMaxItemsProperty.add(arrayStringUniqueItemsRequiredMinItemsMaxItemsPropertyItem);
        return this;
    }

    public ValidationRequest removeArrayStringUniqueItemsRequiredMinItemsMaxItemsPropertyItem(String arrayStringUniqueItemsRequiredMinItemsMaxItemsPropertyItem) {
        if (arrayStringUniqueItemsRequiredMinItemsMaxItemsPropertyItem != null && this.arrayStringUniqueItemsRequiredMinItemsMaxItemsProperty != null) {
            this.arrayStringUniqueItemsRequiredMinItemsMaxItemsProperty.remove(arrayStringUniqueItemsRequiredMinItemsMaxItemsPropertyItem);
        }

        return this;
    }
    /**
     */
    public ValidationRequest arrayObjectUniqueItemsPlainProperty(Set<@Valid ValidationSubRequest> arrayObjectUniqueItemsPlainProperty) {
        this.arrayObjectUniqueItemsPlainProperty = arrayObjectUniqueItemsPlainProperty;
        return this;
    }

    
    @JsonProperty("arrayObjectUniqueItemsPlainProperty")
    @Valid 
    public Set<@Valid ValidationSubRequest> getArrayObjectUniqueItemsPlainProperty() {
        return arrayObjectUniqueItemsPlainProperty;
    }

    @JsonProperty("arrayObjectUniqueItemsPlainProperty")
    @JsonDeserialize(as = LinkedHashSet.class)
    public void setArrayObjectUniqueItemsPlainProperty(Set<@Valid ValidationSubRequest> arrayObjectUniqueItemsPlainProperty) {
        this.arrayObjectUniqueItemsPlainProperty = arrayObjectUniqueItemsPlainProperty;
    }

    public ValidationRequest addArrayObjectUniqueItemsPlainPropertyItem(ValidationSubRequest arrayObjectUniqueItemsPlainPropertyItem) {
        if (this.arrayObjectUniqueItemsPlainProperty == null) {
            this.arrayObjectUniqueItemsPlainProperty = new LinkedHashSet<>();
        }

        this.arrayObjectUniqueItemsPlainProperty.add(arrayObjectUniqueItemsPlainPropertyItem);
        return this;
    }

    public ValidationRequest removeArrayObjectUniqueItemsPlainPropertyItem(ValidationSubRequest arrayObjectUniqueItemsPlainPropertyItem) {
        if (arrayObjectUniqueItemsPlainPropertyItem != null && this.arrayObjectUniqueItemsPlainProperty != null) {
            this.arrayObjectUniqueItemsPlainProperty.remove(arrayObjectUniqueItemsPlainPropertyItem);
        }

        return this;
    }
    /**
     */
    public ValidationRequest arrayObjectUniqueItemsRequiredProperty(Set<@Valid ValidationSubRequest> arrayObjectUniqueItemsRequiredProperty) {
        this.arrayObjectUniqueItemsRequiredProperty = arrayObjectUniqueItemsRequiredProperty;
        return this;
    }

    
    @JsonProperty("arrayObjectUniqueItemsRequiredProperty")
    @Required @Valid 
    public Set<@Valid ValidationSubRequest> getArrayObjectUniqueItemsRequiredProperty() {
        return arrayObjectUniqueItemsRequiredProperty;
    }

    @JsonProperty("arrayObjectUniqueItemsRequiredProperty")
    @JsonDeserialize(as = LinkedHashSet.class)
    public void setArrayObjectUniqueItemsRequiredProperty(Set<@Valid ValidationSubRequest> arrayObjectUniqueItemsRequiredProperty) {
        this.arrayObjectUniqueItemsRequiredProperty = arrayObjectUniqueItemsRequiredProperty;
    }

    public ValidationRequest addArrayObjectUniqueItemsRequiredPropertyItem(ValidationSubRequest arrayObjectUniqueItemsRequiredPropertyItem) {
        if (this.arrayObjectUniqueItemsRequiredProperty == null) {
            this.arrayObjectUniqueItemsRequiredProperty = new LinkedHashSet<>();
        }

        this.arrayObjectUniqueItemsRequiredProperty.add(arrayObjectUniqueItemsRequiredPropertyItem);
        return this;
    }

    public ValidationRequest removeArrayObjectUniqueItemsRequiredPropertyItem(ValidationSubRequest arrayObjectUniqueItemsRequiredPropertyItem) {
        if (arrayObjectUniqueItemsRequiredPropertyItem != null && this.arrayObjectUniqueItemsRequiredProperty != null) {
            this.arrayObjectUniqueItemsRequiredProperty.remove(arrayObjectUniqueItemsRequiredPropertyItem);
        }

        return this;
    }
    /**
     */
    public ValidationRequest arrayObjectUniqueItemsMinItemsProperty(Set<@Valid ValidationSubRequest> arrayObjectUniqueItemsMinItemsProperty) {
        this.arrayObjectUniqueItemsMinItemsProperty = arrayObjectUniqueItemsMinItemsProperty;
        return this;
    }

    
    @JsonProperty("arrayObjectUniqueItemsMinItemsProperty")
    @Valid @Size(min = 3) 
    public Set<@Valid ValidationSubRequest> getArrayObjectUniqueItemsMinItemsProperty() {
        return arrayObjectUniqueItemsMinItemsProperty;
    }

    @JsonProperty("arrayObjectUniqueItemsMinItemsProperty")
    @JsonDeserialize(as = LinkedHashSet.class)
    public void setArrayObjectUniqueItemsMinItemsProperty(Set<@Valid ValidationSubRequest> arrayObjectUniqueItemsMinItemsProperty) {
        this.arrayObjectUniqueItemsMinItemsProperty = arrayObjectUniqueItemsMinItemsProperty;
    }

    public ValidationRequest addArrayObjectUniqueItemsMinItemsPropertyItem(ValidationSubRequest arrayObjectUniqueItemsMinItemsPropertyItem) {
        if (this.arrayObjectUniqueItemsMinItemsProperty == null) {
            this.arrayObjectUniqueItemsMinItemsProperty = new LinkedHashSet<>();
        }

        this.arrayObjectUniqueItemsMinItemsProperty.add(arrayObjectUniqueItemsMinItemsPropertyItem);
        return this;
    }

    public ValidationRequest removeArrayObjectUniqueItemsMinItemsPropertyItem(ValidationSubRequest arrayObjectUniqueItemsMinItemsPropertyItem) {
        if (arrayObjectUniqueItemsMinItemsPropertyItem != null && this.arrayObjectUniqueItemsMinItemsProperty != null) {
            this.arrayObjectUniqueItemsMinItemsProperty.remove(arrayObjectUniqueItemsMinItemsPropertyItem);
        }

        return this;
    }
    /**
     */
    public ValidationRequest arrayObjectUniqueItemsMaxItemsProperty(Set<@Valid ValidationSubRequest> arrayObjectUniqueItemsMaxItemsProperty) {
        this.arrayObjectUniqueItemsMaxItemsProperty = arrayObjectUniqueItemsMaxItemsProperty;
        return this;
    }

    
    @JsonProperty("arrayObjectUniqueItemsMaxItemsProperty")
    @Valid @Size(max = 7) 
    public Set<@Valid ValidationSubRequest> getArrayObjectUniqueItemsMaxItemsProperty() {
        return arrayObjectUniqueItemsMaxItemsProperty;
    }

    @JsonProperty("arrayObjectUniqueItemsMaxItemsProperty")
    @JsonDeserialize(as = LinkedHashSet.class)
    public void setArrayObjectUniqueItemsMaxItemsProperty(Set<@Valid ValidationSubRequest> arrayObjectUniqueItemsMaxItemsProperty) {
        this.arrayObjectUniqueItemsMaxItemsProperty = arrayObjectUniqueItemsMaxItemsProperty;
    }

    public ValidationRequest addArrayObjectUniqueItemsMaxItemsPropertyItem(ValidationSubRequest arrayObjectUniqueItemsMaxItemsPropertyItem) {
        if (this.arrayObjectUniqueItemsMaxItemsProperty == null) {
            this.arrayObjectUniqueItemsMaxItemsProperty = new LinkedHashSet<>();
        }

        this.arrayObjectUniqueItemsMaxItemsProperty.add(arrayObjectUniqueItemsMaxItemsPropertyItem);
        return this;
    }

    public ValidationRequest removeArrayObjectUniqueItemsMaxItemsPropertyItem(ValidationSubRequest arrayObjectUniqueItemsMaxItemsPropertyItem) {
        if (arrayObjectUniqueItemsMaxItemsPropertyItem != null && this.arrayObjectUniqueItemsMaxItemsProperty != null) {
            this.arrayObjectUniqueItemsMaxItemsProperty.remove(arrayObjectUniqueItemsMaxItemsPropertyItem);
        }

        return this;
    }
    /**
     */
    public ValidationRequest arrayObjectUniqueItemsMinItemsMaxItemsProperty(Set<@Valid ValidationSubRequest> arrayObjectUniqueItemsMinItemsMaxItemsProperty) {
        this.arrayObjectUniqueItemsMinItemsMaxItemsProperty = arrayObjectUniqueItemsMinItemsMaxItemsProperty;
        return this;
    }

    
    @JsonProperty("arrayObjectUniqueItemsMinItemsMaxItemsProperty")
    @Valid @Size(min = 3, max = 7) 
    public Set<@Valid ValidationSubRequest> getArrayObjectUniqueItemsMinItemsMaxItemsProperty() {
        return arrayObjectUniqueItemsMinItemsMaxItemsProperty;
    }

    @JsonProperty("arrayObjectUniqueItemsMinItemsMaxItemsProperty")
    @JsonDeserialize(as = LinkedHashSet.class)
    public void setArrayObjectUniqueItemsMinItemsMaxItemsProperty(Set<@Valid ValidationSubRequest> arrayObjectUniqueItemsMinItemsMaxItemsProperty) {
        this.arrayObjectUniqueItemsMinItemsMaxItemsProperty = arrayObjectUniqueItemsMinItemsMaxItemsProperty;
    }

    public ValidationRequest addArrayObjectUniqueItemsMinItemsMaxItemsPropertyItem(ValidationSubRequest arrayObjectUniqueItemsMinItemsMaxItemsPropertyItem) {
        if (this.arrayObjectUniqueItemsMinItemsMaxItemsProperty == null) {
            this.arrayObjectUniqueItemsMinItemsMaxItemsProperty = new LinkedHashSet<>();
        }

        this.arrayObjectUniqueItemsMinItemsMaxItemsProperty.add(arrayObjectUniqueItemsMinItemsMaxItemsPropertyItem);
        return this;
    }

    public ValidationRequest removeArrayObjectUniqueItemsMinItemsMaxItemsPropertyItem(ValidationSubRequest arrayObjectUniqueItemsMinItemsMaxItemsPropertyItem) {
        if (arrayObjectUniqueItemsMinItemsMaxItemsPropertyItem != null && this.arrayObjectUniqueItemsMinItemsMaxItemsProperty != null) {
            this.arrayObjectUniqueItemsMinItemsMaxItemsProperty.remove(arrayObjectUniqueItemsMinItemsMaxItemsPropertyItem);
        }

        return this;
    }
    /**
     */
    public ValidationRequest arrayObjectUniqueItemsRequiredMinItemsMaxItemsProperty(Set<@Valid ValidationSubRequest> arrayObjectUniqueItemsRequiredMinItemsMaxItemsProperty) {
        this.arrayObjectUniqueItemsRequiredMinItemsMaxItemsProperty = arrayObjectUniqueItemsRequiredMinItemsMaxItemsProperty;
        return this;
    }

    
    @JsonProperty("arrayObjectUniqueItemsRequiredMinItemsMaxItemsProperty")
    @Required @Valid @Size(min = 3, max = 7) 
    public Set<@Valid ValidationSubRequest> getArrayObjectUniqueItemsRequiredMinItemsMaxItemsProperty() {
        return arrayObjectUniqueItemsRequiredMinItemsMaxItemsProperty;
    }

    @JsonProperty("arrayObjectUniqueItemsRequiredMinItemsMaxItemsProperty")
    @JsonDeserialize(as = LinkedHashSet.class)
    public void setArrayObjectUniqueItemsRequiredMinItemsMaxItemsProperty(Set<@Valid ValidationSubRequest> arrayObjectUniqueItemsRequiredMinItemsMaxItemsProperty) {
        this.arrayObjectUniqueItemsRequiredMinItemsMaxItemsProperty = arrayObjectUniqueItemsRequiredMinItemsMaxItemsProperty;
    }

    public ValidationRequest addArrayObjectUniqueItemsRequiredMinItemsMaxItemsPropertyItem(ValidationSubRequest arrayObjectUniqueItemsRequiredMinItemsMaxItemsPropertyItem) {
        if (this.arrayObjectUniqueItemsRequiredMinItemsMaxItemsProperty == null) {
            this.arrayObjectUniqueItemsRequiredMinItemsMaxItemsProperty = new LinkedHashSet<>();
        }

        this.arrayObjectUniqueItemsRequiredMinItemsMaxItemsProperty.add(arrayObjectUniqueItemsRequiredMinItemsMaxItemsPropertyItem);
        return this;
    }

    public ValidationRequest removeArrayObjectUniqueItemsRequiredMinItemsMaxItemsPropertyItem(ValidationSubRequest arrayObjectUniqueItemsRequiredMinItemsMaxItemsPropertyItem) {
        if (arrayObjectUniqueItemsRequiredMinItemsMaxItemsPropertyItem != null && this.arrayObjectUniqueItemsRequiredMinItemsMaxItemsProperty != null) {
            this.arrayObjectUniqueItemsRequiredMinItemsMaxItemsProperty.remove(arrayObjectUniqueItemsRequiredMinItemsMaxItemsPropertyItem);
        }

        return this;
    }
    /**
     */
    public ValidationRequest objectPlainProperty(ValidationSubRequest objectPlainProperty) {
        this.objectPlainProperty = objectPlainProperty;
        return this;
    }

    
    @JsonProperty("objectPlainProperty")
    @Valid 
    public ValidationSubRequest getObjectPlainProperty() {
        return objectPlainProperty;
    }

    @JsonProperty("objectPlainProperty")
    public void setObjectPlainProperty(ValidationSubRequest objectPlainProperty) {
        this.objectPlainProperty = objectPlainProperty;
    }

    /**
     */
    public ValidationRequest objectRequiredProperty(ValidationSubRequest objectRequiredProperty) {
        this.objectRequiredProperty = objectRequiredProperty;
        return this;
    }

    
    @JsonProperty("objectRequiredProperty")
    @Required @Valid 
    public ValidationSubRequest getObjectRequiredProperty() {
        return objectRequiredProperty;
    }

    @JsonProperty("objectRequiredProperty")
    public void setObjectRequiredProperty(ValidationSubRequest objectRequiredProperty) {
        this.objectRequiredProperty = objectRequiredProperty;
    }

    /**
     */
    public ValidationRequest enumPlainProperty(EnumPlainPropertyEnum enumPlainProperty) {
        this.enumPlainProperty = enumPlainProperty;
        return this;
    }

    
    @JsonProperty("enumPlainProperty")
    
    public EnumPlainPropertyEnum getEnumPlainProperty() {
        return enumPlainProperty;
    }

    @JsonProperty("enumPlainProperty")
    public void setEnumPlainProperty(EnumPlainPropertyEnum enumPlainProperty) {
        this.enumPlainProperty = enumPlainProperty;
    }

    /**
     */
    public ValidationRequest enumRequiredProperty(EnumRequiredPropertyEnum enumRequiredProperty) {
        this.enumRequiredProperty = enumRequiredProperty;
        return this;
    }

    
    @JsonProperty("enumRequiredProperty")
    @Required 
    public EnumRequiredPropertyEnum getEnumRequiredProperty() {
        return enumRequiredProperty;
    }

    @JsonProperty("enumRequiredProperty")
    public void setEnumRequiredProperty(EnumRequiredPropertyEnum enumRequiredProperty) {
        this.enumRequiredProperty = enumRequiredProperty;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ValidationRequest validationRequest = (ValidationRequest) o;
        return Objects.equals(this.integerPlainProperty, validationRequest.integerPlainProperty) &&
            Objects.equals(this.integerRequiredProperty, validationRequest.integerRequiredProperty) &&
            Objects.equals(this.integerMinimumProperty, validationRequest.integerMinimumProperty) &&
            Objects.equals(this.integerMaximumProperty, validationRequest.integerMaximumProperty) &&
            Objects.equals(this.integerMinimumMaximumProperty, validationRequest.integerMinimumMaximumProperty) &&
            Objects.equals(this.integerRequiredMinimumMaximumProperty, validationRequest.integerRequiredMinimumMaximumProperty) &&
            Objects.equals(this.integerInt32PlainProperty, validationRequest.integerInt32PlainProperty) &&
            Objects.equals(this.integerInt32RequiredProperty, validationRequest.integerInt32RequiredProperty) &&
            Objects.equals(this.integerInt32MinimumProperty, validationRequest.integerInt32MinimumProperty) &&
            Objects.equals(this.integerInt32MaximumProperty, validationRequest.integerInt32MaximumProperty) &&
            Objects.equals(this.integerInt32MinimumMaximumProperty, validationRequest.integerInt32MinimumMaximumProperty) &&
            Objects.equals(this.integerInt32RequiredMinimumMaximumProperty, validationRequest.integerInt32RequiredMinimumMaximumProperty) &&
            Objects.equals(this.integerInt64PlainProperty, validationRequest.integerInt64PlainProperty) &&
            Objects.equals(this.integerInt64RequiredProperty, validationRequest.integerInt64RequiredProperty) &&
            Objects.equals(this.integerInt64MinimumProperty, validationRequest.integerInt64MinimumProperty) &&
            Objects.equals(this.integerInt64MaximumProperty, validationRequest.integerInt64MaximumProperty) &&
            Objects.equals(this.integerInt64MinimumMaximumProperty, validationRequest.integerInt64MinimumMaximumProperty) &&
            Objects.equals(this.integerInt64RequiredMinimumMaximumProperty, validationRequest.integerInt64RequiredMinimumMaximumProperty) &&
            Objects.equals(this.numberPlainProperty, validationRequest.numberPlainProperty) &&
            Objects.equals(this.numberRequiredProperty, validationRequest.numberRequiredProperty) &&
            Objects.equals(this.numberMinimumProperty, validationRequest.numberMinimumProperty) &&
            Objects.equals(this.numberMaximumProperty, validationRequest.numberMaximumProperty) &&
            Objects.equals(this.numberMinimumMaximumProperty, validationRequest.numberMinimumMaximumProperty) &&
            Objects.equals(this.numberRequiredMinimumMaximumProperty, validationRequest.numberRequiredMinimumMaximumProperty) &&
            Objects.equals(this.numberFloatPlainProperty, validationRequest.numberFloatPlainProperty) &&
            Objects.equals(this.numberFloatRequiredProperty, validationRequest.numberFloatRequiredProperty) &&
            Objects.equals(this.numberFloatMinimumProperty, validationRequest.numberFloatMinimumProperty) &&
            Objects.equals(this.numberFloatMaximumProperty, validationRequest.numberFloatMaximumProperty) &&
            Objects.equals(this.numberFloatMinimumMaximumProperty, validationRequest.numberFloatMinimumMaximumProperty) &&
            Objects.equals(this.numberFloatRequiredMinimumMaximumProperty, validationRequest.numberFloatRequiredMinimumMaximumProperty) &&
            Objects.equals(this.numberDoublePlainProperty, validationRequest.numberDoublePlainProperty) &&
            Objects.equals(this.numberDoubleRequiredProperty, validationRequest.numberDoubleRequiredProperty) &&
            Objects.equals(this.numberDoubleMinimumProperty, validationRequest.numberDoubleMinimumProperty) &&
            Objects.equals(this.numberDoubleMaximumProperty, validationRequest.numberDoubleMaximumProperty) &&
            Objects.equals(this.numberDoubleMinimumMaximumProperty, validationRequest.numberDoubleMinimumMaximumProperty) &&
            Objects.equals(this.numberDoubleRequiredMinimumMaximumProperty, validationRequest.numberDoubleRequiredMinimumMaximumProperty) &&
            Objects.equals(this.booleanPlainProperty, validationRequest.booleanPlainProperty) &&
            Objects.equals(this.booleanRequiredProperty, validationRequest.booleanRequiredProperty) &&
            Objects.equals(this.stringPlainProperty, validationRequest.stringPlainProperty) &&
            Objects.equals(this.stringRequiredProperty, validationRequest.stringRequiredProperty) &&
            Objects.equals(this.stringMinLengthProperty, validationRequest.stringMinLengthProperty) &&
            Objects.equals(this.stringMaxLengthProperty, validationRequest.stringMaxLengthProperty) &&
            Objects.equals(this.stringMinLengthMaxLengthProperty, validationRequest.stringMinLengthMaxLengthProperty) &&
            Objects.equals(this.stringPatternProperty, validationRequest.stringPatternProperty) &&
            Objects.equals(this.stringRequiredMinLengthMaxLengthPatternProperty, validationRequest.stringRequiredMinLengthMaxLengthPatternProperty) &&
            Arrays.equals(this.stringByteArrayProperty, validationRequest.stringByteArrayProperty) &&
            Arrays.equals(this.stringByteArrayMinLengthProperty, validationRequest.stringByteArrayMinLengthProperty) &&
            Arrays.equals(this.stringByteArrayMaxLengthProperty, validationRequest.stringByteArrayMaxLengthProperty) &&
            Arrays.equals(this.stringByteArrayMinLengthMaxLengthProperty, validationRequest.stringByteArrayMinLengthMaxLengthProperty) &&
            Arrays.equals(this.stringByteArrayRequiredMinLengthMaxLengthProperty, validationRequest.stringByteArrayRequiredMinLengthMaxLengthProperty) &&
            Objects.equals(this.stringDatePlainProperty, validationRequest.stringDatePlainProperty) &&
            Objects.equals(this.stringDateRequiredProperty, validationRequest.stringDateRequiredProperty) &&
            Objects.equals(this.stringDateTimePlainProperty, validationRequest.stringDateTimePlainProperty) &&
            Objects.equals(this.stringDateTimeRequiredProperty, validationRequest.stringDateTimeRequiredProperty) &&
            Objects.equals(this.stringPasswordPlainProperty, validationRequest.stringPasswordPlainProperty) &&
            Objects.equals(this.stringPasswordRequiredProperty, validationRequest.stringPasswordRequiredProperty) &&
            Objects.equals(this.stringPasswordMinLengthProperty, validationRequest.stringPasswordMinLengthProperty) &&
            Objects.equals(this.stringPasswordMaxLengthProperty, validationRequest.stringPasswordMaxLengthProperty) &&
            Objects.equals(this.stringPasswordMinLengthMaxLengthProperty, validationRequest.stringPasswordMinLengthMaxLengthProperty) &&
            Objects.equals(this.stringPasswordPatternProperty, validationRequest.stringPasswordPatternProperty) &&
            Objects.equals(this.stringPasswordRequiredMinLengthMaxLengthPatternProperty, validationRequest.stringPasswordRequiredMinLengthMaxLengthPatternProperty) &&
            Objects.equals(this.stringNumberPlainProperty, validationRequest.stringNumberPlainProperty) &&
            Objects.equals(this.stringNumberRequiredProperty, validationRequest.stringNumberRequiredProperty) &&
            Objects.equals(this.stringUriPlainProperty, validationRequest.stringUriPlainProperty) &&
            Objects.equals(this.stringUriRequiredProperty, validationRequest.stringUriRequiredProperty) &&
            Objects.equals(this.stringUuidPlainProperty, validationRequest.stringUuidPlainProperty) &&
            Objects.equals(this.stringUuidRequiredProperty, validationRequest.stringUuidRequiredProperty) &&
            Objects.equals(this.stringRegexPlainProperty, validationRequest.stringRegexPlainProperty) &&
            Objects.equals(this.stringRegexRequiredProperty, validationRequest.stringRegexRequiredProperty) &&
            Objects.equals(this.stringRegexMinLengthProperty, validationRequest.stringRegexMinLengthProperty) &&
            Objects.equals(this.stringRegexMaxLengthProperty, validationRequest.stringRegexMaxLengthProperty) &&
            Objects.equals(this.stringRegexMinLengthMaxLengthProperty, validationRequest.stringRegexMinLengthMaxLengthProperty) &&
            Objects.equals(this.stringRegexRequiredMinLengthMaxLengthProperty, validationRequest.stringRegexRequiredMinLengthMaxLengthProperty) &&
            Objects.equals(this.arrayStringPlainProperty, validationRequest.arrayStringPlainProperty) &&
            Objects.equals(this.arrayStringRequiredProperty, validationRequest.arrayStringRequiredProperty) &&
            Objects.equals(this.arrayStringMinItemsProperty, validationRequest.arrayStringMinItemsProperty) &&
            Objects.equals(this.arrayStringMaxItemsProperty, validationRequest.arrayStringMaxItemsProperty) &&
            Objects.equals(this.arrayStringMinItemsMaxItemsProperty, validationRequest.arrayStringMinItemsMaxItemsProperty) &&
            Objects.equals(this.arrayStringRequiredMinItemsMaxItemsProperty, validationRequest.arrayStringRequiredMinItemsMaxItemsProperty) &&
            Objects.equals(this.arrayObjectPlainProperty, validationRequest.arrayObjectPlainProperty) &&
            Objects.equals(this.arrayObjectRequiredProperty, validationRequest.arrayObjectRequiredProperty) &&
            Objects.equals(this.arrayObjectMinItemsProperty, validationRequest.arrayObjectMinItemsProperty) &&
            Objects.equals(this.arrayObjectMaxItemsProperty, validationRequest.arrayObjectMaxItemsProperty) &&
            Objects.equals(this.arrayObjectMinItemsMaxItemsProperty, validationRequest.arrayObjectMinItemsMaxItemsProperty) &&
            Objects.equals(this.arrayObjectRequiredMinItemsMaxItemsProperty, validationRequest.arrayObjectRequiredMinItemsMaxItemsProperty) &&
            Objects.equals(this.arrayStringUniqueItemsPlainProperty, validationRequest.arrayStringUniqueItemsPlainProperty) &&
            Objects.equals(this.arrayStringUniqueItemsRequiredProperty, validationRequest.arrayStringUniqueItemsRequiredProperty) &&
            Objects.equals(this.arrayStringUniqueItemsMinItemsProperty, validationRequest.arrayStringUniqueItemsMinItemsProperty) &&
            Objects.equals(this.arrayStringUniqueItemsMaxItemsProperty, validationRequest.arrayStringUniqueItemsMaxItemsProperty) &&
            Objects.equals(this.arrayStringUniqueItemsMinItemsMaxItemsProperty, validationRequest.arrayStringUniqueItemsMinItemsMaxItemsProperty) &&
            Objects.equals(this.arrayStringUniqueItemsRequiredMinItemsMaxItemsProperty, validationRequest.arrayStringUniqueItemsRequiredMinItemsMaxItemsProperty) &&
            Objects.equals(this.arrayObjectUniqueItemsPlainProperty, validationRequest.arrayObjectUniqueItemsPlainProperty) &&
            Objects.equals(this.arrayObjectUniqueItemsRequiredProperty, validationRequest.arrayObjectUniqueItemsRequiredProperty) &&
            Objects.equals(this.arrayObjectUniqueItemsMinItemsProperty, validationRequest.arrayObjectUniqueItemsMinItemsProperty) &&
            Objects.equals(this.arrayObjectUniqueItemsMaxItemsProperty, validationRequest.arrayObjectUniqueItemsMaxItemsProperty) &&
            Objects.equals(this.arrayObjectUniqueItemsMinItemsMaxItemsProperty, validationRequest.arrayObjectUniqueItemsMinItemsMaxItemsProperty) &&
            Objects.equals(this.arrayObjectUniqueItemsRequiredMinItemsMaxItemsProperty, validationRequest.arrayObjectUniqueItemsRequiredMinItemsMaxItemsProperty) &&
            Objects.equals(this.objectPlainProperty, validationRequest.objectPlainProperty) &&
            Objects.equals(this.objectRequiredProperty, validationRequest.objectRequiredProperty) &&
            Objects.equals(this.enumPlainProperty, validationRequest.enumPlainProperty) &&
            Objects.equals(this.enumRequiredProperty, validationRequest.enumRequiredProperty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(integerPlainProperty, integerRequiredProperty, integerMinimumProperty, integerMaximumProperty, integerMinimumMaximumProperty, integerRequiredMinimumMaximumProperty, integerInt32PlainProperty, integerInt32RequiredProperty, integerInt32MinimumProperty, integerInt32MaximumProperty, integerInt32MinimumMaximumProperty, integerInt32RequiredMinimumMaximumProperty, integerInt64PlainProperty, integerInt64RequiredProperty, integerInt64MinimumProperty, integerInt64MaximumProperty, integerInt64MinimumMaximumProperty, integerInt64RequiredMinimumMaximumProperty, numberPlainProperty, numberRequiredProperty, numberMinimumProperty, numberMaximumProperty, numberMinimumMaximumProperty, numberRequiredMinimumMaximumProperty, numberFloatPlainProperty, numberFloatRequiredProperty, numberFloatMinimumProperty, numberFloatMaximumProperty, numberFloatMinimumMaximumProperty, numberFloatRequiredMinimumMaximumProperty, numberDoublePlainProperty, numberDoubleRequiredProperty, numberDoubleMinimumProperty, numberDoubleMaximumProperty, numberDoubleMinimumMaximumProperty, numberDoubleRequiredMinimumMaximumProperty, booleanPlainProperty, booleanRequiredProperty, stringPlainProperty, stringRequiredProperty, stringMinLengthProperty, stringMaxLengthProperty, stringMinLengthMaxLengthProperty, stringPatternProperty, stringRequiredMinLengthMaxLengthPatternProperty, Arrays.hashCode(stringByteArrayProperty), Arrays.hashCode(stringByteArrayMinLengthProperty), Arrays.hashCode(stringByteArrayMaxLengthProperty), Arrays.hashCode(stringByteArrayMinLengthMaxLengthProperty), Arrays.hashCode(stringByteArrayRequiredMinLengthMaxLengthProperty), stringDatePlainProperty, stringDateRequiredProperty, stringDateTimePlainProperty, stringDateTimeRequiredProperty, stringPasswordPlainProperty, stringPasswordRequiredProperty, stringPasswordMinLengthProperty, stringPasswordMaxLengthProperty, stringPasswordMinLengthMaxLengthProperty, stringPasswordPatternProperty, stringPasswordRequiredMinLengthMaxLengthPatternProperty, stringNumberPlainProperty, stringNumberRequiredProperty, stringUriPlainProperty, stringUriRequiredProperty, stringUuidPlainProperty, stringUuidRequiredProperty, stringRegexPlainProperty, stringRegexRequiredProperty, stringRegexMinLengthProperty, stringRegexMaxLengthProperty, stringRegexMinLengthMaxLengthProperty, stringRegexRequiredMinLengthMaxLengthProperty, arrayStringPlainProperty, arrayStringRequiredProperty, arrayStringMinItemsProperty, arrayStringMaxItemsProperty, arrayStringMinItemsMaxItemsProperty, arrayStringRequiredMinItemsMaxItemsProperty, arrayObjectPlainProperty, arrayObjectRequiredProperty, arrayObjectMinItemsProperty, arrayObjectMaxItemsProperty, arrayObjectMinItemsMaxItemsProperty, arrayObjectRequiredMinItemsMaxItemsProperty, arrayStringUniqueItemsPlainProperty, arrayStringUniqueItemsRequiredProperty, arrayStringUniqueItemsMinItemsProperty, arrayStringUniqueItemsMaxItemsProperty, arrayStringUniqueItemsMinItemsMaxItemsProperty, arrayStringUniqueItemsRequiredMinItemsMaxItemsProperty, arrayObjectUniqueItemsPlainProperty, arrayObjectUniqueItemsRequiredProperty, arrayObjectUniqueItemsMinItemsProperty, arrayObjectUniqueItemsMaxItemsProperty, arrayObjectUniqueItemsMinItemsMaxItemsProperty, arrayObjectUniqueItemsRequiredMinItemsMaxItemsProperty, objectPlainProperty, objectRequiredProperty, enumPlainProperty, enumRequiredProperty);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ValidationRequest {\n");
        
        sb.append("    integerPlainProperty: ").append(toIndentedString(integerPlainProperty)).append("\n");
        sb.append("    integerRequiredProperty: ").append(toIndentedString(integerRequiredProperty)).append("\n");
        sb.append("    integerMinimumProperty: ").append(toIndentedString(integerMinimumProperty)).append("\n");
        sb.append("    integerMaximumProperty: ").append(toIndentedString(integerMaximumProperty)).append("\n");
        sb.append("    integerMinimumMaximumProperty: ").append(toIndentedString(integerMinimumMaximumProperty)).append("\n");
        sb.append("    integerRequiredMinimumMaximumProperty: ").append(toIndentedString(integerRequiredMinimumMaximumProperty)).append("\n");
        sb.append("    integerInt32PlainProperty: ").append(toIndentedString(integerInt32PlainProperty)).append("\n");
        sb.append("    integerInt32RequiredProperty: ").append(toIndentedString(integerInt32RequiredProperty)).append("\n");
        sb.append("    integerInt32MinimumProperty: ").append(toIndentedString(integerInt32MinimumProperty)).append("\n");
        sb.append("    integerInt32MaximumProperty: ").append(toIndentedString(integerInt32MaximumProperty)).append("\n");
        sb.append("    integerInt32MinimumMaximumProperty: ").append(toIndentedString(integerInt32MinimumMaximumProperty)).append("\n");
        sb.append("    integerInt32RequiredMinimumMaximumProperty: ").append(toIndentedString(integerInt32RequiredMinimumMaximumProperty)).append("\n");
        sb.append("    integerInt64PlainProperty: ").append(toIndentedString(integerInt64PlainProperty)).append("\n");
        sb.append("    integerInt64RequiredProperty: ").append(toIndentedString(integerInt64RequiredProperty)).append("\n");
        sb.append("    integerInt64MinimumProperty: ").append(toIndentedString(integerInt64MinimumProperty)).append("\n");
        sb.append("    integerInt64MaximumProperty: ").append(toIndentedString(integerInt64MaximumProperty)).append("\n");
        sb.append("    integerInt64MinimumMaximumProperty: ").append(toIndentedString(integerInt64MinimumMaximumProperty)).append("\n");
        sb.append("    integerInt64RequiredMinimumMaximumProperty: ").append(toIndentedString(integerInt64RequiredMinimumMaximumProperty)).append("\n");
        sb.append("    numberPlainProperty: ").append(toIndentedString(numberPlainProperty)).append("\n");
        sb.append("    numberRequiredProperty: ").append(toIndentedString(numberRequiredProperty)).append("\n");
        sb.append("    numberMinimumProperty: ").append(toIndentedString(numberMinimumProperty)).append("\n");
        sb.append("    numberMaximumProperty: ").append(toIndentedString(numberMaximumProperty)).append("\n");
        sb.append("    numberMinimumMaximumProperty: ").append(toIndentedString(numberMinimumMaximumProperty)).append("\n");
        sb.append("    numberRequiredMinimumMaximumProperty: ").append(toIndentedString(numberRequiredMinimumMaximumProperty)).append("\n");
        sb.append("    numberFloatPlainProperty: ").append(toIndentedString(numberFloatPlainProperty)).append("\n");
        sb.append("    numberFloatRequiredProperty: ").append(toIndentedString(numberFloatRequiredProperty)).append("\n");
        sb.append("    numberFloatMinimumProperty: ").append(toIndentedString(numberFloatMinimumProperty)).append("\n");
        sb.append("    numberFloatMaximumProperty: ").append(toIndentedString(numberFloatMaximumProperty)).append("\n");
        sb.append("    numberFloatMinimumMaximumProperty: ").append(toIndentedString(numberFloatMinimumMaximumProperty)).append("\n");
        sb.append("    numberFloatRequiredMinimumMaximumProperty: ").append(toIndentedString(numberFloatRequiredMinimumMaximumProperty)).append("\n");
        sb.append("    numberDoublePlainProperty: ").append(toIndentedString(numberDoublePlainProperty)).append("\n");
        sb.append("    numberDoubleRequiredProperty: ").append(toIndentedString(numberDoubleRequiredProperty)).append("\n");
        sb.append("    numberDoubleMinimumProperty: ").append(toIndentedString(numberDoubleMinimumProperty)).append("\n");
        sb.append("    numberDoubleMaximumProperty: ").append(toIndentedString(numberDoubleMaximumProperty)).append("\n");
        sb.append("    numberDoubleMinimumMaximumProperty: ").append(toIndentedString(numberDoubleMinimumMaximumProperty)).append("\n");
        sb.append("    numberDoubleRequiredMinimumMaximumProperty: ").append(toIndentedString(numberDoubleRequiredMinimumMaximumProperty)).append("\n");
        sb.append("    booleanPlainProperty: ").append(toIndentedString(booleanPlainProperty)).append("\n");
        sb.append("    booleanRequiredProperty: ").append(toIndentedString(booleanRequiredProperty)).append("\n");
        sb.append("    stringPlainProperty: ").append(toIndentedString(stringPlainProperty)).append("\n");
        sb.append("    stringRequiredProperty: ").append(toIndentedString(stringRequiredProperty)).append("\n");
        sb.append("    stringMinLengthProperty: ").append(toIndentedString(stringMinLengthProperty)).append("\n");
        sb.append("    stringMaxLengthProperty: ").append(toIndentedString(stringMaxLengthProperty)).append("\n");
        sb.append("    stringMinLengthMaxLengthProperty: ").append(toIndentedString(stringMinLengthMaxLengthProperty)).append("\n");
        sb.append("    stringPatternProperty: ").append(toIndentedString(stringPatternProperty)).append("\n");
        sb.append("    stringRequiredMinLengthMaxLengthPatternProperty: ").append(toIndentedString(stringRequiredMinLengthMaxLengthPatternProperty)).append("\n");
        sb.append("    stringByteArrayProperty: ").append(toIndentedString(stringByteArrayProperty)).append("\n");
        sb.append("    stringByteArrayMinLengthProperty: ").append(toIndentedString(stringByteArrayMinLengthProperty)).append("\n");
        sb.append("    stringByteArrayMaxLengthProperty: ").append(toIndentedString(stringByteArrayMaxLengthProperty)).append("\n");
        sb.append("    stringByteArrayMinLengthMaxLengthProperty: ").append(toIndentedString(stringByteArrayMinLengthMaxLengthProperty)).append("\n");
        sb.append("    stringByteArrayRequiredMinLengthMaxLengthProperty: ").append(toIndentedString(stringByteArrayRequiredMinLengthMaxLengthProperty)).append("\n");
        sb.append("    stringDatePlainProperty: ").append(toIndentedString(stringDatePlainProperty)).append("\n");
        sb.append("    stringDateRequiredProperty: ").append(toIndentedString(stringDateRequiredProperty)).append("\n");
        sb.append("    stringDateTimePlainProperty: ").append(toIndentedString(stringDateTimePlainProperty)).append("\n");
        sb.append("    stringDateTimeRequiredProperty: ").append(toIndentedString(stringDateTimeRequiredProperty)).append("\n");
        sb.append("    stringPasswordPlainProperty: ").append(toIndentedString(stringPasswordPlainProperty)).append("\n");
        sb.append("    stringPasswordRequiredProperty: ").append(toIndentedString(stringPasswordRequiredProperty)).append("\n");
        sb.append("    stringPasswordMinLengthProperty: ").append(toIndentedString(stringPasswordMinLengthProperty)).append("\n");
        sb.append("    stringPasswordMaxLengthProperty: ").append(toIndentedString(stringPasswordMaxLengthProperty)).append("\n");
        sb.append("    stringPasswordMinLengthMaxLengthProperty: ").append(toIndentedString(stringPasswordMinLengthMaxLengthProperty)).append("\n");
        sb.append("    stringPasswordPatternProperty: ").append(toIndentedString(stringPasswordPatternProperty)).append("\n");
        sb.append("    stringPasswordRequiredMinLengthMaxLengthPatternProperty: ").append(toIndentedString(stringPasswordRequiredMinLengthMaxLengthPatternProperty)).append("\n");
        sb.append("    stringNumberPlainProperty: ").append(toIndentedString(stringNumberPlainProperty)).append("\n");
        sb.append("    stringNumberRequiredProperty: ").append(toIndentedString(stringNumberRequiredProperty)).append("\n");
        sb.append("    stringUriPlainProperty: ").append(toIndentedString(stringUriPlainProperty)).append("\n");
        sb.append("    stringUriRequiredProperty: ").append(toIndentedString(stringUriRequiredProperty)).append("\n");
        sb.append("    stringUuidPlainProperty: ").append(toIndentedString(stringUuidPlainProperty)).append("\n");
        sb.append("    stringUuidRequiredProperty: ").append(toIndentedString(stringUuidRequiredProperty)).append("\n");
        sb.append("    stringRegexPlainProperty: ").append(toIndentedString(stringRegexPlainProperty)).append("\n");
        sb.append("    stringRegexRequiredProperty: ").append(toIndentedString(stringRegexRequiredProperty)).append("\n");
        sb.append("    stringRegexMinLengthProperty: ").append(toIndentedString(stringRegexMinLengthProperty)).append("\n");
        sb.append("    stringRegexMaxLengthProperty: ").append(toIndentedString(stringRegexMaxLengthProperty)).append("\n");
        sb.append("    stringRegexMinLengthMaxLengthProperty: ").append(toIndentedString(stringRegexMinLengthMaxLengthProperty)).append("\n");
        sb.append("    stringRegexRequiredMinLengthMaxLengthProperty: ").append(toIndentedString(stringRegexRequiredMinLengthMaxLengthProperty)).append("\n");
        sb.append("    arrayStringPlainProperty: ").append(toIndentedString(arrayStringPlainProperty)).append("\n");
        sb.append("    arrayStringRequiredProperty: ").append(toIndentedString(arrayStringRequiredProperty)).append("\n");
        sb.append("    arrayStringMinItemsProperty: ").append(toIndentedString(arrayStringMinItemsProperty)).append("\n");
        sb.append("    arrayStringMaxItemsProperty: ").append(toIndentedString(arrayStringMaxItemsProperty)).append("\n");
        sb.append("    arrayStringMinItemsMaxItemsProperty: ").append(toIndentedString(arrayStringMinItemsMaxItemsProperty)).append("\n");
        sb.append("    arrayStringRequiredMinItemsMaxItemsProperty: ").append(toIndentedString(arrayStringRequiredMinItemsMaxItemsProperty)).append("\n");
        sb.append("    arrayObjectPlainProperty: ").append(toIndentedString(arrayObjectPlainProperty)).append("\n");
        sb.append("    arrayObjectRequiredProperty: ").append(toIndentedString(arrayObjectRequiredProperty)).append("\n");
        sb.append("    arrayObjectMinItemsProperty: ").append(toIndentedString(arrayObjectMinItemsProperty)).append("\n");
        sb.append("    arrayObjectMaxItemsProperty: ").append(toIndentedString(arrayObjectMaxItemsProperty)).append("\n");
        sb.append("    arrayObjectMinItemsMaxItemsProperty: ").append(toIndentedString(arrayObjectMinItemsMaxItemsProperty)).append("\n");
        sb.append("    arrayObjectRequiredMinItemsMaxItemsProperty: ").append(toIndentedString(arrayObjectRequiredMinItemsMaxItemsProperty)).append("\n");
        sb.append("    arrayStringUniqueItemsPlainProperty: ").append(toIndentedString(arrayStringUniqueItemsPlainProperty)).append("\n");
        sb.append("    arrayStringUniqueItemsRequiredProperty: ").append(toIndentedString(arrayStringUniqueItemsRequiredProperty)).append("\n");
        sb.append("    arrayStringUniqueItemsMinItemsProperty: ").append(toIndentedString(arrayStringUniqueItemsMinItemsProperty)).append("\n");
        sb.append("    arrayStringUniqueItemsMaxItemsProperty: ").append(toIndentedString(arrayStringUniqueItemsMaxItemsProperty)).append("\n");
        sb.append("    arrayStringUniqueItemsMinItemsMaxItemsProperty: ").append(toIndentedString(arrayStringUniqueItemsMinItemsMaxItemsProperty)).append("\n");
        sb.append("    arrayStringUniqueItemsRequiredMinItemsMaxItemsProperty: ").append(toIndentedString(arrayStringUniqueItemsRequiredMinItemsMaxItemsProperty)).append("\n");
        sb.append("    arrayObjectUniqueItemsPlainProperty: ").append(toIndentedString(arrayObjectUniqueItemsPlainProperty)).append("\n");
        sb.append("    arrayObjectUniqueItemsRequiredProperty: ").append(toIndentedString(arrayObjectUniqueItemsRequiredProperty)).append("\n");
        sb.append("    arrayObjectUniqueItemsMinItemsProperty: ").append(toIndentedString(arrayObjectUniqueItemsMinItemsProperty)).append("\n");
        sb.append("    arrayObjectUniqueItemsMaxItemsProperty: ").append(toIndentedString(arrayObjectUniqueItemsMaxItemsProperty)).append("\n");
        sb.append("    arrayObjectUniqueItemsMinItemsMaxItemsProperty: ").append(toIndentedString(arrayObjectUniqueItemsMinItemsMaxItemsProperty)).append("\n");
        sb.append("    arrayObjectUniqueItemsRequiredMinItemsMaxItemsProperty: ").append(toIndentedString(arrayObjectUniqueItemsRequiredMinItemsMaxItemsProperty)).append("\n");
        sb.append("    objectPlainProperty: ").append(toIndentedString(objectPlainProperty)).append("\n");
        sb.append("    objectRequiredProperty: ").append(toIndentedString(objectRequiredProperty)).append("\n");
        sb.append("    enumPlainProperty: ").append(toIndentedString(enumPlainProperty)).append("\n");
        sb.append("    enumRequiredProperty: ").append(toIndentedString(enumRequiredProperty)).append("\n");
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

