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
 * SecondaryFilterAttribute
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class SecondaryFilterAttribute {

  private String icon;

  private String name;

  public SecondaryFilterAttribute() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SecondaryFilterAttribute(String icon, String name) {
    this.icon = icon;
    this.name = name;
  }

  public SecondaryFilterAttribute icon(String icon) {
    this.icon = icon;
    return this;
  }

  /**
   * Get icon
   * @return icon
  */
  @NotNull 
  @Schema(name = "icon", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("icon")
  public String getIcon() {
    return icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }

  public SecondaryFilterAttribute name(String name) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecondaryFilterAttribute secondaryFilterAttribute = (SecondaryFilterAttribute) o;
    return Objects.equals(this.icon, secondaryFilterAttribute.icon) &&
        Objects.equals(this.name, secondaryFilterAttribute.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(icon, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecondaryFilterAttribute {\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
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
}

