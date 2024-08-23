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
 * TrackingPrice
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class TrackingPrice {

  private String currency;

  private Double gross;

  private Double net;

  public TrackingPrice() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TrackingPrice(String currency, Double gross, Double net) {
    this.currency = currency;
    this.gross = gross;
    this.net = net;
  }

  public TrackingPrice currency(String currency) {
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

  public TrackingPrice gross(Double gross) {
    this.gross = gross;
    return this;
  }

  /**
   * the gross price (with tax)
   * @return gross
  */
  @NotNull 
  @Schema(name = "gross", description = "the gross price (with tax)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("gross")
  public Double getGross() {
    return gross;
  }

  public void setGross(Double gross) {
    this.gross = gross;
  }

  public TrackingPrice net(Double net) {
    this.net = net;
    return this;
  }

  /**
   * the net price (without tax)
   * @return net
  */
  @NotNull 
  @Schema(name = "net", example = "12.34", description = "the net price (without tax)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("net")
  public Double getNet() {
    return net;
  }

  public void setNet(Double net) {
    this.net = net;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrackingPrice trackingPrice = (TrackingPrice) o;
    return Objects.equals(this.currency, trackingPrice.currency) &&
        Objects.equals(this.gross, trackingPrice.gross) &&
        Objects.equals(this.net, trackingPrice.net);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, gross, net);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackingPrice {\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    gross: ").append(toIndentedString(gross)).append("\n");
    sb.append("    net: ").append(toIndentedString(net)).append("\n");
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

