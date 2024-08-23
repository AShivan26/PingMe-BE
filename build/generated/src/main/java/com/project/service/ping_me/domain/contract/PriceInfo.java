package com.project.service.ping_me.domain.contract;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.project.service.ping_me.domain.contract.BillingSection;
import com.project.service.ping_me.domain.contract.PriceBreakdown;
import com.project.service.ping_me.domain.contract.Pricing;
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
 * PriceInfo
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class PriceInfo {

  private Pricing totalPrice;

  private Pricing deposit;

  private PriceBreakdown priceBreakdown;

  private Pricing blockedAmount;

  private Pricing discount;

  @Valid
  private List<@Valid BillingSection> priceBreakdownSummary;

  private Pricing totalPayablePrice;

  public PriceInfo() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PriceInfo(Pricing totalPrice) {
    this.totalPrice = totalPrice;
  }

  public PriceInfo totalPrice(Pricing totalPrice) {
    this.totalPrice = totalPrice;
    return this;
  }

  /**
   * Get totalPrice
   * @return totalPrice
  */
  @NotNull @Valid 
  @Schema(name = "totalPrice", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("totalPrice")
  public Pricing getTotalPrice() {
    return totalPrice;
  }

  public void setTotalPrice(Pricing totalPrice) {
    this.totalPrice = totalPrice;
  }

  public PriceInfo deposit(Pricing deposit) {
    this.deposit = deposit;
    return this;
  }

  /**
   * Get deposit
   * @return deposit
  */
  @Valid 
  @Schema(name = "deposit", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deposit")
  public Pricing getDeposit() {
    return deposit;
  }

  public void setDeposit(Pricing deposit) {
    this.deposit = deposit;
  }

  public PriceInfo priceBreakdown(PriceBreakdown priceBreakdown) {
    this.priceBreakdown = priceBreakdown;
    return this;
  }

  /**
   * Get priceBreakdown
   * @return priceBreakdown
  */
  @Valid 
  @Schema(name = "priceBreakdown", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("priceBreakdown")
  public PriceBreakdown getPriceBreakdown() {
    return priceBreakdown;
  }

  public void setPriceBreakdown(PriceBreakdown priceBreakdown) {
    this.priceBreakdown = priceBreakdown;
  }

  public PriceInfo blockedAmount(Pricing blockedAmount) {
    this.blockedAmount = blockedAmount;
    return this;
  }

  /**
   * Get blockedAmount
   * @return blockedAmount
  */
  @Valid 
  @Schema(name = "blockedAmount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("blockedAmount")
  public Pricing getBlockedAmount() {
    return blockedAmount;
  }

  public void setBlockedAmount(Pricing blockedAmount) {
    this.blockedAmount = blockedAmount;
  }

  public PriceInfo discount(Pricing discount) {
    this.discount = discount;
    return this;
  }

  /**
   * Get discount
   * @return discount
  */
  @Valid 
  @Schema(name = "discount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("discount")
  public Pricing getDiscount() {
    return discount;
  }

  public void setDiscount(Pricing discount) {
    this.discount = discount;
  }

  public PriceInfo priceBreakdownSummary(List<@Valid BillingSection> priceBreakdownSummary) {
    this.priceBreakdownSummary = priceBreakdownSummary;
    return this;
  }

  public PriceInfo addPriceBreakdownSummaryItem(BillingSection priceBreakdownSummaryItem) {
    if (this.priceBreakdownSummary == null) {
      this.priceBreakdownSummary = new ArrayList<>();
    }
    this.priceBreakdownSummary.add(priceBreakdownSummaryItem);
    return this;
  }

  /**
   * Same price information object as breakdown but here parent object to be of time single and not items in array
   * @return priceBreakdownSummary
  */
  @Valid 
  @Schema(name = "priceBreakdownSummary", description = "Same price information object as breakdown but here parent object to be of time single and not items in array", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("priceBreakdownSummary")
  public List<@Valid BillingSection> getPriceBreakdownSummary() {
    return priceBreakdownSummary;
  }

  public void setPriceBreakdownSummary(List<@Valid BillingSection> priceBreakdownSummary) {
    this.priceBreakdownSummary = priceBreakdownSummary;
  }

  public PriceInfo totalPayablePrice(Pricing totalPayablePrice) {
    this.totalPayablePrice = totalPayablePrice;
    return this;
  }

  /**
   * Get totalPayablePrice
   * @return totalPayablePrice
  */
  @Valid 
  @Schema(name = "totalPayablePrice", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalPayablePrice")
  public Pricing getTotalPayablePrice() {
    return totalPayablePrice;
  }

  public void setTotalPayablePrice(Pricing totalPayablePrice) {
    this.totalPayablePrice = totalPayablePrice;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PriceInfo priceInfo = (PriceInfo) o;
    return Objects.equals(this.totalPrice, priceInfo.totalPrice) &&
        Objects.equals(this.deposit, priceInfo.deposit) &&
        Objects.equals(this.priceBreakdown, priceInfo.priceBreakdown) &&
        Objects.equals(this.blockedAmount, priceInfo.blockedAmount) &&
        Objects.equals(this.discount, priceInfo.discount) &&
        Objects.equals(this.priceBreakdownSummary, priceInfo.priceBreakdownSummary) &&
        Objects.equals(this.totalPayablePrice, priceInfo.totalPayablePrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalPrice, deposit, priceBreakdown, blockedAmount, discount, priceBreakdownSummary, totalPayablePrice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceInfo {\n");
    sb.append("    totalPrice: ").append(toIndentedString(totalPrice)).append("\n");
    sb.append("    deposit: ").append(toIndentedString(deposit)).append("\n");
    sb.append("    priceBreakdown: ").append(toIndentedString(priceBreakdown)).append("\n");
    sb.append("    blockedAmount: ").append(toIndentedString(blockedAmount)).append("\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
    sb.append("    priceBreakdownSummary: ").append(toIndentedString(priceBreakdownSummary)).append("\n");
    sb.append("    totalPayablePrice: ").append(toIndentedString(totalPayablePrice)).append("\n");
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

