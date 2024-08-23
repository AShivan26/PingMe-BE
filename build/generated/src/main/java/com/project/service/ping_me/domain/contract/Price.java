package com.project.service.ping_me.domain.contract;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.project.service.ping_me.domain.contract.DisplayPrice;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Price
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class Price {

  private String currency;

  private Double net;

  private Double gross;

  private Double taxAmount;

  private Double taxRate;

  private DisplayPrice displayPrice;

  public Price() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Price(String currency, Double net, Double gross, Double taxAmount, Double taxRate, DisplayPrice displayPrice) {
    this.currency = currency;
    this.net = net;
    this.gross = gross;
    this.taxAmount = taxAmount;
    this.taxRate = taxRate;
    this.displayPrice = displayPrice;
  }

  public Price currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
  */
  @NotNull 
  @Schema(name = "currency", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("currency")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public Price net(Double net) {
    this.net = net;
    return this;
  }

  /**
   * Get net
   * @return net
  */
  @NotNull 
  @Schema(name = "net", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("net")
  public Double getNet() {
    return net;
  }

  public void setNet(Double net) {
    this.net = net;
  }

  public Price gross(Double gross) {
    this.gross = gross;
    return this;
  }

  /**
   * Get gross
   * @return gross
  */
  @NotNull 
  @Schema(name = "gross", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("gross")
  public Double getGross() {
    return gross;
  }

  public void setGross(Double gross) {
    this.gross = gross;
  }

  public Price taxAmount(Double taxAmount) {
    this.taxAmount = taxAmount;
    return this;
  }

  /**
   * Get taxAmount
   * @return taxAmount
  */
  @NotNull 
  @Schema(name = "taxAmount", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("taxAmount")
  public Double getTaxAmount() {
    return taxAmount;
  }

  public void setTaxAmount(Double taxAmount) {
    this.taxAmount = taxAmount;
  }

  public Price taxRate(Double taxRate) {
    this.taxRate = taxRate;
    return this;
  }

  /**
   * Get taxRate
   * @return taxRate
  */
  @NotNull 
  @Schema(name = "taxRate", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("taxRate")
  public Double getTaxRate() {
    return taxRate;
  }

  public void setTaxRate(Double taxRate) {
    this.taxRate = taxRate;
  }

  public Price displayPrice(DisplayPrice displayPrice) {
    this.displayPrice = displayPrice;
    return this;
  }

  /**
   * Get displayPrice
   * @return displayPrice
  */
  @NotNull @Valid 
  @Schema(name = "displayPrice", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("displayPrice")
  public DisplayPrice getDisplayPrice() {
    return displayPrice;
  }

  public void setDisplayPrice(DisplayPrice displayPrice) {
    this.displayPrice = displayPrice;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Price price = (Price) o;
    return Objects.equals(this.currency, price.currency) &&
        Objects.equals(this.net, price.net) &&
        Objects.equals(this.gross, price.gross) &&
        Objects.equals(this.taxAmount, price.taxAmount) &&
        Objects.equals(this.taxRate, price.taxRate) &&
        Objects.equals(this.displayPrice, price.displayPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, net, gross, taxAmount, taxRate, displayPrice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Price {\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    net: ").append(toIndentedString(net)).append("\n");
    sb.append("    gross: ").append(toIndentedString(gross)).append("\n");
    sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
    sb.append("    taxRate: ").append(toIndentedString(taxRate)).append("\n");
    sb.append("    displayPrice: ").append(toIndentedString(displayPrice)).append("\n");
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

