package com.project.service.ping_me.domain.contract;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.project.service.ping_me.domain.contract.AttributeV2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * AttributeCategoryV2
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AttributeCategoryV2 {

  private String key;

  private String name;

  @Valid
  private List<@Valid AttributeV2> attributes = new ArrayList<>();

  public AttributeCategoryV2() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AttributeCategoryV2(String name, List<@Valid AttributeV2> attributes) {
    this.name = name;
    this.attributes = attributes;
  }

  public AttributeCategoryV2 key(String key) {
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

  public AttributeCategoryV2 name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @NotNull 
  @Schema(name = "name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AttributeCategoryV2 attributes(List<@Valid AttributeV2> attributes) {
    this.attributes = attributes;
    return this;
  }

  public AttributeCategoryV2 addAttributesItem(AttributeV2 attributesItem) {
    if (this.attributes == null) {
      this.attributes = new ArrayList<>();
    }
    this.attributes.add(attributesItem);
    return this;
  }

  /**
   * Get attributes
   * @return attributes
  */
  @NotNull @Valid 
  @Schema(name = "attributes", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("attributes")
  public List<@Valid AttributeV2> getAttributes() {
    return attributes;
  }

  public void setAttributes(List<@Valid AttributeV2> attributes) {
    this.attributes = attributes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttributeCategoryV2 attributeCategoryV2 = (AttributeCategoryV2) o;
    return Objects.equals(this.key, attributeCategoryV2.key) &&
        Objects.equals(this.name, attributeCategoryV2.name) &&
        Objects.equals(this.attributes, attributeCategoryV2.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, name, attributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttributeCategoryV2 {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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

