package com.project.service.ping_me.domain.contract;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * AttributeV2
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AttributeV2 {

  private String key;

  private String title;

  private String value;

  private String attributeType;

  public AttributeV2 key(String key) {
    this.key = key;
    return this;
  }

  /**
   * Get key
   * @return key
  */
  
  @Schema(name = "key", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("key")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public AttributeV2 title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  */
  
  @Schema(name = "title", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public AttributeV2 value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
  */
  
  @Schema(name = "value", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public AttributeV2 attributeType(String attributeType) {
    this.attributeType = attributeType;
    return this;
  }

  /**
   * used to differentiate between types of attributes shown on vehicle card, possible  value CARD_ATTRIBUTE, UPSELL_ATTRIBUTE, DETAILED_ATTRIBUTE
   * @return attributeType
  */
  
  @Schema(name = "attributeType", description = "used to differentiate between types of attributes shown on vehicle card, possible  value CARD_ATTRIBUTE, UPSELL_ATTRIBUTE, DETAILED_ATTRIBUTE", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("attributeType")
  public String getAttributeType() {
    return attributeType;
  }

  public void setAttributeType(String attributeType) {
    this.attributeType = attributeType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttributeV2 attributeV2 = (AttributeV2) o;
    return Objects.equals(this.key, attributeV2.key) &&
        Objects.equals(this.title, attributeV2.title) &&
        Objects.equals(this.value, attributeV2.value) &&
        Objects.equals(this.attributeType, attributeV2.attributeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, title, value, attributeType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttributeV2 {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    attributeType: ").append(toIndentedString(attributeType)).append("\n");
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

