package com.project.service.ping_me.domain.contract;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.project.service.ping_me.domain.contract.BlockDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * DiscountDetails object
 */

@Schema(name = "DiscountDetails", description = "DiscountDetails object")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class DiscountDetails {

  private Boolean eligible;

  private String discountType;

  private Double discountValue;

  private String incentivizationUseCase;

  private String message;

  private BlockDateTime validityDateTime;

  public DiscountDetails eligible(Boolean eligible) {
    this.eligible = eligible;
    return this;
  }

  /**
   * Get eligible
   * @return eligible
  */
  
  @Schema(name = "eligible", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("eligible")
  public Boolean isEligible() {
    return eligible;
  }

  public void setEligible(Boolean eligible) {
    this.eligible = eligible;
  }

  public DiscountDetails discountType(String discountType) {
    this.discountType = discountType;
    return this;
  }

  /**
   * will indicate The type of discount values from these values[ RATE, AMOUNT]
   * @return discountType
  */
  
  @Schema(name = "discountType", description = "will indicate The type of discount values from these values[ RATE, AMOUNT]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("discountType")
  public String getDiscountType() {
    return discountType;
  }

  public void setDiscountType(String discountType) {
    this.discountType = discountType;
  }

  public DiscountDetails discountValue(Double discountValue) {
    this.discountValue = discountValue;
    return this;
  }

  /**
   * Get discountValue
   * @return discountValue
  */
  
  @Schema(name = "discountValue", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("discountValue")
  public Double getDiscountValue() {
    return discountValue;
  }

  public void setDiscountValue(Double discountValue) {
    this.discountValue = discountValue;
  }

  public DiscountDetails incentivizationUseCase(String incentivizationUseCase) {
    this.incentivizationUseCase = incentivizationUseCase;
    return this;
  }

  /**
   * will indicate The type of discounts  from these values [ VOUCHER, DISCOUNT]
   * @return incentivizationUseCase
  */
  
  @Schema(name = "incentivizationUseCase", description = "will indicate The type of discounts  from these values [ VOUCHER, DISCOUNT]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("incentivizationUseCase")
  public String getIncentivizationUseCase() {
    return incentivizationUseCase;
  }

  public void setIncentivizationUseCase(String incentivizationUseCase) {
    this.incentivizationUseCase = incentivizationUseCase;
  }

  public DiscountDetails message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
  */
  
  @Schema(name = "message", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public DiscountDetails validityDateTime(BlockDateTime validityDateTime) {
    this.validityDateTime = validityDateTime;
    return this;
  }

  /**
   * Get validityDateTime
   * @return validityDateTime
  */
  @Valid 
  @Schema(name = "validityDateTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("validityDateTime")
  public BlockDateTime getValidityDateTime() {
    return validityDateTime;
  }

  public void setValidityDateTime(BlockDateTime validityDateTime) {
    this.validityDateTime = validityDateTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiscountDetails discountDetails = (DiscountDetails) o;
    return Objects.equals(this.eligible, discountDetails.eligible) &&
        Objects.equals(this.discountType, discountDetails.discountType) &&
        Objects.equals(this.discountValue, discountDetails.discountValue) &&
        Objects.equals(this.incentivizationUseCase, discountDetails.incentivizationUseCase) &&
        Objects.equals(this.message, discountDetails.message) &&
        Objects.equals(this.validityDateTime, discountDetails.validityDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eligible, discountType, discountValue, incentivizationUseCase, message, validityDateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiscountDetails {\n");
    sb.append("    eligible: ").append(toIndentedString(eligible)).append("\n");
    sb.append("    discountType: ").append(toIndentedString(discountType)).append("\n");
    sb.append("    discountValue: ").append(toIndentedString(discountValue)).append("\n");
    sb.append("    incentivizationUseCase: ").append(toIndentedString(incentivizationUseCase)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    validityDateTime: ").append(toIndentedString(validityDateTime)).append("\n");
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

