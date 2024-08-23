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
 * PriceDetails
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class PriceDetails {

  private String currency;

  private Double amount;

  private String prefix;

  private String suffix;

  public PriceDetails() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PriceDetails(String currency, Double amount) {
    this.currency = currency;
    this.amount = amount;
  }

  public PriceDetails currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * the ISO currency code
   * @return currency
  */
  @NotNull 
  @Schema(name = "currency", example = "USD", description = "the ISO currency code", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("currency")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public PriceDetails amount(Double amount) {
    this.amount = amount;
    return this;
  }

  /**
   * eg 12.55
   * @return amount
  */
  @NotNull 
  @Schema(name = "amount", description = "eg 12.55", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("amount")
  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public PriceDetails prefix(String prefix) {
    this.prefix = prefix;
    return this;
  }

  /**
   * a prefix which can be displayed before the price
   * @return prefix
  */
  
  @Schema(name = "prefix", example = "add", description = "a prefix which can be displayed before the price", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("prefix")
  public String getPrefix() {
    return prefix;
  }

  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }

  public PriceDetails suffix(String suffix) {
    this.suffix = suffix;
    return this;
  }

  /**
   * a suffix which can be displayed after the price
   * @return suffix
  */
  
  @Schema(name = "suffix", example = "/day", description = "a suffix which can be displayed after the price", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("suffix")
  public String getSuffix() {
    return suffix;
  }

  public void setSuffix(String suffix) {
    this.suffix = suffix;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PriceDetails priceDetails = (PriceDetails) o;
    return Objects.equals(this.currency, priceDetails.currency) &&
        Objects.equals(this.amount, priceDetails.amount) &&
        Objects.equals(this.prefix, priceDetails.prefix) &&
        Objects.equals(this.suffix, priceDetails.suffix);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, amount, prefix, suffix);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceDetails {\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    suffix: ").append(toIndentedString(suffix)).append("\n");
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

