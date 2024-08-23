package com.project.service.ping_me.domain.contract;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.project.service.ping_me.domain.contract.PaymentInstrumentV2;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * PaymentV3
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class PaymentV3 {

  private String profileId;

  private String corporateReferenceId;

  private PaymentInstrumentV2 paymentInstrument;

  public PaymentV3 profileId(String profileId) {
    this.profileId = profileId;
    return this;
  }

  /**
   * Get profileId
   * @return profileId
  */
  
  @Schema(name = "profileId", example = "93944684", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("profileId")
  public String getProfileId() {
    return profileId;
  }

  public void setProfileId(String profileId) {
    this.profileId = profileId;
  }

  public PaymentV3 corporateReferenceId(String corporateReferenceId) {
    this.corporateReferenceId = corporateReferenceId;
    return this;
  }

  /**
   * Get corporateReferenceId
   * @return corporateReferenceId
  */
  
  @Schema(name = "corporateReferenceId", example = "93944684", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("corporateReferenceId")
  public String getCorporateReferenceId() {
    return corporateReferenceId;
  }

  public void setCorporateReferenceId(String corporateReferenceId) {
    this.corporateReferenceId = corporateReferenceId;
  }

  public PaymentV3 paymentInstrument(PaymentInstrumentV2 paymentInstrument) {
    this.paymentInstrument = paymentInstrument;
    return this;
  }

  /**
   * Get paymentInstrument
   * @return paymentInstrument
  */
  @Valid 
  @Schema(name = "paymentInstrument", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("paymentInstrument")
  public PaymentInstrumentV2 getPaymentInstrument() {
    return paymentInstrument;
  }

  public void setPaymentInstrument(PaymentInstrumentV2 paymentInstrument) {
    this.paymentInstrument = paymentInstrument;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentV3 paymentV3 = (PaymentV3) o;
    return Objects.equals(this.profileId, paymentV3.profileId) &&
        Objects.equals(this.corporateReferenceId, paymentV3.corporateReferenceId) &&
        Objects.equals(this.paymentInstrument, paymentV3.paymentInstrument);
  }

  @Override
  public int hashCode() {
    return Objects.hash(profileId, corporateReferenceId, paymentInstrument);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentV3 {\n");
    sb.append("    profileId: ").append(toIndentedString(profileId)).append("\n");
    sb.append("    corporateReferenceId: ").append(toIndentedString(corporateReferenceId)).append("\n");
    sb.append("    paymentInstrument: ").append(toIndentedString(paymentInstrument)).append("\n");
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

