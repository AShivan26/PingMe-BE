package com.project.service.ping_me.domain.contract;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.project.service.ping_me.domain.contract.DiscountDetails;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * DiscountEligibility response object
 */

@Schema(name = "EligibleDiscount", description = "DiscountEligibility response object")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class EligibleDiscount {

  private Boolean isBookingDigitalCheckoutEligible;

  private DiscountDetails discount;

  public EligibleDiscount isBookingDigitalCheckoutEligible(Boolean isBookingDigitalCheckoutEligible) {
    this.isBookingDigitalCheckoutEligible = isBookingDigitalCheckoutEligible;
    return this;
  }

  /**
   * Get isBookingDigitalCheckoutEligible
   * @return isBookingDigitalCheckoutEligible
  */
  
  @Schema(name = "isBookingDigitalCheckoutEligible", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isBookingDigitalCheckoutEligible")
  public Boolean isIsBookingDigitalCheckoutEligible() {
    return isBookingDigitalCheckoutEligible;
  }

  public void setIsBookingDigitalCheckoutEligible(Boolean isBookingDigitalCheckoutEligible) {
    this.isBookingDigitalCheckoutEligible = isBookingDigitalCheckoutEligible;
  }

  public EligibleDiscount discount(DiscountDetails discount) {
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
  public DiscountDetails getDiscount() {
    return discount;
  }

  public void setDiscount(DiscountDetails discount) {
    this.discount = discount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EligibleDiscount eligibleDiscount = (EligibleDiscount) o;
    return Objects.equals(this.isBookingDigitalCheckoutEligible, eligibleDiscount.isBookingDigitalCheckoutEligible) &&
        Objects.equals(this.discount, eligibleDiscount.discount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isBookingDigitalCheckoutEligible, discount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EligibleDiscount {\n");
    sb.append("    isBookingDigitalCheckoutEligible: ").append(toIndentedString(isBookingDigitalCheckoutEligible)).append("\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
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

