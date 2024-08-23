package com.project.service.ping_me.domain.contract;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.project.service.ping_me.domain.contract.PaymentInstrument;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Payment
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class Payment {

  private String errorMessage;

  private String profileId;

  private String corporateReferenceId;

  private PaymentInstrument paymentInstrument;

  public Payment() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Payment(PaymentInstrument paymentInstrument) {
    this.paymentInstrument = paymentInstrument;
  }

  public Payment errorMessage(String errorMessage) {
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

  public Payment profileId(String profileId) {
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

  public Payment corporateReferenceId(String corporateReferenceId) {
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

  public Payment paymentInstrument(PaymentInstrument paymentInstrument) {
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
  public PaymentInstrument getPaymentInstrument() {
    return paymentInstrument;
  }

  public void setPaymentInstrument(PaymentInstrument paymentInstrument) {
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
    Payment payment = (Payment) o;
    return Objects.equals(this.errorMessage, payment.errorMessage) &&
        Objects.equals(this.profileId, payment.profileId) &&
        Objects.equals(this.corporateReferenceId, payment.corporateReferenceId) &&
        Objects.equals(this.paymentInstrument, payment.paymentInstrument);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorMessage, profileId, corporateReferenceId, paymentInstrument);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Payment {\n");
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

