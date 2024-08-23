package com.project.service.ping_me.domain.contract;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.project.service.ping_me.domain.contract.PaymentInstrumentInfo;
import com.project.service.ping_me.domain.contract.ThreeDS;
import com.project.service.ping_me.domain.contract.ThreeDsParams;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Req object to Authorize payment, One and  only one of the following fields should be passed.
 */

@Schema(name = "AuthorizePaymentRequest", description = "Req object to Authorize payment, One and  only one of the following fields should be passed.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AuthorizePaymentRequest {

  private String paymentInstrumentId;

  private PaymentInstrumentInfo paymentInstrument;

  private ThreeDS threeDS;

  private ThreeDsParams threeDSParams;

  public AuthorizePaymentRequest paymentInstrumentId(String paymentInstrumentId) {
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

  public AuthorizePaymentRequest paymentInstrument(PaymentInstrumentInfo paymentInstrument) {
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
  public PaymentInstrumentInfo getPaymentInstrument() {
    return paymentInstrument;
  }

  public void setPaymentInstrument(PaymentInstrumentInfo paymentInstrument) {
    this.paymentInstrument = paymentInstrument;
  }

  public AuthorizePaymentRequest threeDS(ThreeDS threeDS) {
    this.threeDS = threeDS;
    return this;
  }

  /**
   * Get threeDS
   * @return threeDS
  */
  @Valid 
  @Schema(name = "threeDS", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("threeDS")
  public ThreeDS getThreeDS() {
    return threeDS;
  }

  public void setThreeDS(ThreeDS threeDS) {
    this.threeDS = threeDS;
  }

  public AuthorizePaymentRequest threeDSParams(ThreeDsParams threeDSParams) {
    this.threeDSParams = threeDSParams;
    return this;
  }

  /**
   * Get threeDSParams
   * @return threeDSParams
  */
  @Valid 
  @Schema(name = "threeDSParams", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("threeDSParams")
  public ThreeDsParams getThreeDSParams() {
    return threeDSParams;
  }

  public void setThreeDSParams(ThreeDsParams threeDSParams) {
    this.threeDSParams = threeDSParams;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthorizePaymentRequest authorizePaymentRequest = (AuthorizePaymentRequest) o;
    return Objects.equals(this.paymentInstrumentId, authorizePaymentRequest.paymentInstrumentId) &&
        Objects.equals(this.paymentInstrument, authorizePaymentRequest.paymentInstrument) &&
        Objects.equals(this.threeDS, authorizePaymentRequest.threeDS) &&
        Objects.equals(this.threeDSParams, authorizePaymentRequest.threeDSParams);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentInstrumentId, paymentInstrument, threeDS, threeDSParams);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthorizePaymentRequest {\n");
    sb.append("    paymentInstrumentId: ").append(toIndentedString(paymentInstrumentId)).append("\n");
    sb.append("    paymentInstrument: ").append(toIndentedString(paymentInstrument)).append("\n");
    sb.append("    threeDS: ").append(toIndentedString(threeDS)).append("\n");
    sb.append("    threeDSParams: ").append(toIndentedString(threeDSParams)).append("\n");
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

