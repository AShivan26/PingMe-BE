package com.project.service.ping_me.domain.contract;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.project.service.ping_me.domain.contract.PaymentInstrumentInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * PaymentRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class PaymentRequest {

  private String paymentInstrumentId;

  private PaymentInstrumentInfo paymentInstrumentInfo;

  public PaymentRequest paymentInstrumentId(String paymentInstrumentId) {
    this.paymentInstrumentId = paymentInstrumentId;
    return this;
  }

  /**
   * Get paymentInstrumentId
   * @return paymentInstrumentId
  */
  
  @Schema(name = "paymentInstrumentId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("paymentInstrumentId")
  public String getPaymentInstrumentId() {
    return paymentInstrumentId;
  }

  public void setPaymentInstrumentId(String paymentInstrumentId) {
    this.paymentInstrumentId = paymentInstrumentId;
  }

  public PaymentRequest paymentInstrumentInfo(PaymentInstrumentInfo paymentInstrumentInfo) {
    this.paymentInstrumentInfo = paymentInstrumentInfo;
    return this;
  }

  /**
   * Get paymentInstrumentInfo
   * @return paymentInstrumentInfo
  */
  @Valid 
  @Schema(name = "paymentInstrumentInfo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("paymentInstrumentInfo")
  public PaymentInstrumentInfo getPaymentInstrumentInfo() {
    return paymentInstrumentInfo;
  }

  public void setPaymentInstrumentInfo(PaymentInstrumentInfo paymentInstrumentInfo) {
    this.paymentInstrumentInfo = paymentInstrumentInfo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentRequest paymentRequest = (PaymentRequest) o;
    return Objects.equals(this.paymentInstrumentId, paymentRequest.paymentInstrumentId) &&
        Objects.equals(this.paymentInstrumentInfo, paymentRequest.paymentInstrumentInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentInstrumentId, paymentInstrumentInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentRequest {\n");
    sb.append("    paymentInstrumentId: ").append(toIndentedString(paymentInstrumentId)).append("\n");
    sb.append("    paymentInstrumentInfo: ").append(toIndentedString(paymentInstrumentInfo)).append("\n");
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

