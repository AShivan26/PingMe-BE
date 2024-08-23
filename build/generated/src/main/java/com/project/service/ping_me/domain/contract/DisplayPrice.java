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
 * DisplayPrice
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class DisplayPrice {

  private Double amount;

  private Boolean isTaxIncluded;

  public DisplayPrice() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DisplayPrice(Double amount, Boolean isTaxIncluded) {
    this.amount = amount;
    this.isTaxIncluded = isTaxIncluded;
  }

  public DisplayPrice amount(Double amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
  */
  @NotNull 
  @Schema(name = "amount", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("amount")
  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public DisplayPrice isTaxIncluded(Boolean isTaxIncluded) {
    this.isTaxIncluded = isTaxIncluded;
    return this;
  }

  /**
   * Get isTaxIncluded
   * @return isTaxIncluded
  */
  @NotNull 
  @Schema(name = "isTaxIncluded", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("isTaxIncluded")
  public Boolean isIsTaxIncluded() {
    return isTaxIncluded;
  }

  public void setIsTaxIncluded(Boolean isTaxIncluded) {
    this.isTaxIncluded = isTaxIncluded;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisplayPrice displayPrice = (DisplayPrice) o;
    return Objects.equals(this.amount, displayPrice.amount) &&
        Objects.equals(this.isTaxIncluded, displayPrice.isTaxIncluded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, isTaxIncluded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisplayPrice {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    isTaxIncluded: ").append(toIndentedString(isTaxIncluded)).append("\n");
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

