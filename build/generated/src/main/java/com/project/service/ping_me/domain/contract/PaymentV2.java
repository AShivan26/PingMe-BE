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
 * PaymentV2
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class PaymentV2 {

  private String errorMessage;

  private String profileId;

  private String corporateReferenceId;

  private PaymentInstrumentV2 paymentInstrument;

  public PaymentV2() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PaymentV2(PaymentInstrumentV2 paymentInstrument) {
    this.paymentInstrument = paymentInstrument;
  }

  public PaymentV2 errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  /**
   * Get errorMessage
   * @return errorMessage
  */
  
  @Schema(name = "errorMessage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errorMessage")
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public PaymentV2 profileId(String profileId) {
    this.profileId = profileId;
    return this;
  }

  /**
   * Get profileId
   * @return profileId
  */
  
  @Schema(name = "profileId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("profileId")
  public String getProfileId() {
    return profileId;
  }

  public void setProfileId(String profileId) {
    this.profileId = profileId;
  }

  public PaymentV2 corporateReferenceId(String corporateReferenceId) {
    this.corporateReferenceId = corporateReferenceId;
    return this;
  }

  /**
   * Get corporateReferenceId
   * @return corporateReferenceId
  */
  
  @Schema(name = "corporateReferenceId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("corporateReferenceId")
  public String getCorporateReferenceId() {
    return corporateReferenceId;
  }

  public void setCorporateReferenceId(String corporateReferenceId) {
    this.corporateReferenceId = corporateReferenceId;
  }

  public PaymentV2 paymentInstrument(PaymentInstrumentV2 paymentInstrument) {
    this.paymentInstrument = paymentInstrument;
    return this;
  }

  /**
   * Get paymentInstrument
   * @return paymentInstrument
  */
  @NotNull @Valid 
  @Schema(name = "paymentInstrument", requiredMode = Schema.RequiredMode.REQUIRED)
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
    PaymentV2 paymentV2 = (PaymentV2) o;
    return Objects.equals(this.errorMessage, paymentV2.errorMessage) &&
        Objects.equals(this.profileId, paymentV2.profileId) &&
        Objects.equals(this.corporateReferenceId, paymentV2.corporateReferenceId) &&
        Objects.equals(this.paymentInstrument, paymentV2.paymentInstrument);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorMessage, profileId, corporateReferenceId, paymentInstrument);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentV2 {\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
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

