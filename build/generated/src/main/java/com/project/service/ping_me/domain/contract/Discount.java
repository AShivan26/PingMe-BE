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
 * Discount
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class Discount {

  private Integer percentage;

  private String type;

  public Discount() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Discount(Integer percentage, String type) {
    this.percentage = percentage;
    this.type = type;
  }

  public Discount percentage(Integer percentage) {
    this.percentage = percentage;
    return this;
  }

  /**
   * the percentage of discount applied
   * @return percentage
  */
  @NotNull 
  @Schema(name = "percentage", example = "15", description = "the percentage of discount applied", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("percentage")
  public Integer getPercentage() {
    return percentage;
  }

  public void setPercentage(Integer percentage) {
    this.percentage = percentage;
  }

  public Discount type(String type) {
    this.type = type;
    return this;
  }

  /**
   * the type of discount applied
   * @return type
  */
  @NotNull 
  @Schema(name = "type", example = "STANDARD", description = "the type of discount applied", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Discount discount = (Discount) o;
    return Objects.equals(this.percentage, discount.percentage) &&
        Objects.equals(this.type, discount.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(percentage, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Discount {\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

