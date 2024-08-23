package com.project.service.ping_me.domain.contract;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.project.service.ping_me.domain.contract.Discount;
import com.project.service.ping_me.domain.contract.LocalizedPrice;
import com.project.service.ping_me.domain.contract.Price;
import com.project.service.ping_me.domain.contract.TrackingPrice;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Pricing
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class Pricing {

  private Discount appliedDiscount;

  private Price listPrice;

  @Valid
  private Map<String, LocalizedPrice> localizedPrices = new HashMap<>();

  private Price price;

  private String prefix;

  private String suffix;

  private TrackingPrice tracking;

  private String unit;

  private String messageInfo;

  public Pricing() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Pricing(Price listPrice, Price price) {
    this.listPrice = listPrice;
    this.price = price;
  }

  public Pricing appliedDiscount(Discount appliedDiscount) {
    this.appliedDiscount = appliedDiscount;
    return this;
  }

  /**
   * Get appliedDiscount
   * @return appliedDiscount
  */
  @Valid 
  @Schema(name = "appliedDiscount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("appliedDiscount")
  public Discount getAppliedDiscount() {
    return appliedDiscount;
  }

  public void setAppliedDiscount(Discount appliedDiscount) {
    this.appliedDiscount = appliedDiscount;
  }

  public Pricing listPrice(Price listPrice) {
    this.listPrice = listPrice;
    return this;
  }

  /**
   * Get listPrice
   * @return listPrice
  */
  @NotNull @Valid 
  @Schema(name = "listPrice", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("listPrice")
  public Price getListPrice() {
    return listPrice;
  }

  public void setListPrice(Price listPrice) {
    this.listPrice = listPrice;
  }

  public Pricing localizedPrices(Map<String, LocalizedPrice> localizedPrices) {
    this.localizedPrices = localizedPrices;
    return this;
  }

  public Pricing putLocalizedPricesItem(String key, LocalizedPrice localizedPricesItem) {
    if (this.localizedPrices == null) {
      this.localizedPrices = new HashMap<>();
    }
    this.localizedPrices.put(key, localizedPricesItem);
    return this;
  }

  /**
   * a map of currency code to converted price
   * @return localizedPrices
  */
  @Valid 
  @Schema(name = "localizedPrices", description = "a map of currency code to converted price", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("localizedPrices")
  public Map<String, LocalizedPrice> getLocalizedPrices() {
    return localizedPrices;
  }

  public void setLocalizedPrices(Map<String, LocalizedPrice> localizedPrices) {
    this.localizedPrices = localizedPrices;
  }

  public Pricing price(Price price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
  */
  @NotNull @Valid 
  @Schema(name = "price", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("price")
  public Price getPrice() {
    return price;
  }

  public void setPrice(Price price) {
    this.price = price;
  }

  public Pricing prefix(String prefix) {
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

  public Pricing suffix(String suffix) {
    this.suffix = suffix;
    return this;
  }

  /**
   * a suffix which can be displayed after the price
   * @return suffix
  */
  
  @Schema(name = "suffix", example = "more", description = "a suffix which can be displayed after the price", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("suffix")
  public String getSuffix() {
    return suffix;
  }

  public void setSuffix(String suffix) {
    this.suffix = suffix;
  }

  public Pricing tracking(TrackingPrice tracking) {
    this.tracking = tracking;
    return this;
  }

  /**
   * Get tracking
   * @return tracking
  */
  @Valid 
  @Schema(name = "tracking", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tracking")
  public TrackingPrice getTracking() {
    return tracking;
  }

  public void setTracking(TrackingPrice tracking) {
    this.tracking = tracking;
  }

  public Pricing unit(String unit) {
    this.unit = unit;
    return this;
  }

  /**
   * the timespan for which the price is applied
   * @return unit
  */
  
  @Schema(name = "unit", example = "day", description = "the timespan for which the price is applied", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("unit")
  public String getUnit() {
    return unit;
  }

  public void setUnit(String unit) {
    this.unit = unit;
  }

  public Pricing messageInfo(String messageInfo) {
    this.messageInfo = messageInfo;
    return this;
  }

  /**
   * a placeholder for displaying additional info like refundable deposit message
   * @return messageInfo
  */
  
  @Schema(name = "messageInfo", example = "refundable deposit info button", description = "a placeholder for displaying additional info like refundable deposit message", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("messageInfo")
  public String getMessageInfo() {
    return messageInfo;
  }

  public void setMessageInfo(String messageInfo) {
    this.messageInfo = messageInfo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pricing pricing = (Pricing) o;
    return Objects.equals(this.appliedDiscount, pricing.appliedDiscount) &&
        Objects.equals(this.listPrice, pricing.listPrice) &&
        Objects.equals(this.localizedPrices, pricing.localizedPrices) &&
        Objects.equals(this.price, pricing.price) &&
        Objects.equals(this.prefix, pricing.prefix) &&
        Objects.equals(this.suffix, pricing.suffix) &&
        Objects.equals(this.tracking, pricing.tracking) &&
        Objects.equals(this.unit, pricing.unit) &&
        Objects.equals(this.messageInfo, pricing.messageInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appliedDiscount, listPrice, localizedPrices, price, prefix, suffix, tracking, unit, messageInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pricing {\n");
    sb.append("    appliedDiscount: ").append(toIndentedString(appliedDiscount)).append("\n");
    sb.append("    listPrice: ").append(toIndentedString(listPrice)).append("\n");
    sb.append("    localizedPrices: ").append(toIndentedString(localizedPrices)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    suffix: ").append(toIndentedString(suffix)).append("\n");
    sb.append("    tracking: ").append(toIndentedString(tracking)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    messageInfo: ").append(toIndentedString(messageInfo)).append("\n");
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

