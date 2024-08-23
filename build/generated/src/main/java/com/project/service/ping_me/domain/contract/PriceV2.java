package com.project.service.ping_me.domain.contract;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.project.service.ping_me.domain.contract.PriceDetails;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * PriceV2
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class PriceV2 {

  private Integer discountPercentage;

  private PriceDetails displayPrice;

  private PriceDetails listPrice;

  private PriceDetails totalPrice;

  public PriceV2() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PriceV2(PriceDetails displayPrice) {
    this.displayPrice = displayPrice;
  }

  public PriceV2 discountPercentage(Integer discountPercentage) {
    this.discountPercentage = discountPercentage;
    return this;
  }

  /**
   * the percentage of discount applied
   * @return discountPercentage
  */
  
  @Schema(name = "discountPercentage", example = "15", description = "the percentage of discount applied", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("discountPercentage")
  public Integer getDiscountPercentage() {
    return discountPercentage;
  }

  public void setDiscountPercentage(Integer discountPercentage) {
    this.discountPercentage = discountPercentage;
  }

  public PriceV2 displayPrice(PriceDetails displayPrice) {
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
  public PriceDetails getDisplayPrice() {
    return displayPrice;
  }

  public void setDisplayPrice(PriceDetails displayPrice) {
    this.displayPrice = displayPrice;
  }

  public PriceV2 listPrice(PriceDetails listPrice) {
    this.listPrice = listPrice;
    return this;
  }

  /**
   * Get listPrice
   * @return listPrice
  */
  @Valid 
  @Schema(name = "listPrice", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("listPrice")
  public PriceDetails getListPrice() {
    return listPrice;
  }

  public void setListPrice(PriceDetails listPrice) {
    this.listPrice = listPrice;
  }

  public PriceV2 totalPrice(PriceDetails totalPrice) {
    this.totalPrice = totalPrice;
    return this;
  }

  /**
   * Get totalPrice
   * @return totalPrice
  */
  @Valid 
  @Schema(name = "totalPrice", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalPrice")
  public PriceDetails getTotalPrice() {
    return totalPrice;
  }

  public void setTotalPrice(PriceDetails totalPrice) {
    this.totalPrice = totalPrice;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PriceV2 priceV2 = (PriceV2) o;
    return Objects.equals(this.discountPercentage, priceV2.discountPercentage) &&
        Objects.equals(this.displayPrice, priceV2.displayPrice) &&
        Objects.equals(this.listPrice, priceV2.listPrice) &&
        Objects.equals(this.totalPrice, priceV2.totalPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(discountPercentage, displayPrice, listPrice, totalPrice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceV2 {\n");
    sb.append("    discountPercentage: ").append(toIndentedString(discountPercentage)).append("\n");
    sb.append("    displayPrice: ").append(toIndentedString(displayPrice)).append("\n");
    sb.append("    listPrice: ").append(toIndentedString(listPrice)).append("\n");
    sb.append("    totalPrice: ").append(toIndentedString(totalPrice)).append("\n");
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

