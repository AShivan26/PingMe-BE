package com.project.service.ping_me.domain.contract;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.project.service.ping_me.domain.contract.PaymentProviderSdkVersion;
import com.project.service.ping_me.domain.contract.RedirectResponse;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * PaymentActionResult
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class PaymentActionResult {

  private String transactionId;

  private String type;

  private PaymentProviderSdkVersion paymentProviderSdkVersion;

  private String flowResult;

  private RedirectResponse redirect;

  public PaymentActionResult() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PaymentActionResult(String transactionId, String type) {
    this.transactionId = transactionId;
    this.type = type;
  }

  public PaymentActionResult transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

  /**
   * Get transactionId
   * @return transactionId
  */
  @NotNull 
  @Schema(name = "transactionId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("transactionId")
  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  public PaymentActionResult type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @NotNull 
  @Schema(name = "type", example = "Possible values are ['REDIRECT_SHOPPER', 'IDENTIFY_SHOPPER', 'CHALLENGE_SHOPPER'].", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public PaymentActionResult paymentProviderSdkVersion(PaymentProviderSdkVersion paymentProviderSdkVersion) {
    this.paymentProviderSdkVersion = paymentProviderSdkVersion;
    return this;
  }

  /**
   * Get paymentProviderSdkVersion
   * @return paymentProviderSdkVersion
  */
  @Valid 
  @Schema(name = "paymentProviderSdkVersion", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("paymentProviderSdkVersion")
  public PaymentProviderSdkVersion getPaymentProviderSdkVersion() {
    return paymentProviderSdkVersion;
  }

  public void setPaymentProviderSdkVersion(PaymentProviderSdkVersion paymentProviderSdkVersion) {
    this.paymentProviderSdkVersion = paymentProviderSdkVersion;
  }

  public PaymentActionResult flowResult(String flowResult) {
    this.flowResult = flowResult;
    return this;
  }

  /**
   * Get flowResult
   * @return flowResult
  */
  
  @Schema(name = "flowResult", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("flowResult")
  public String getFlowResult() {
    return flowResult;
  }

  public void setFlowResult(String flowResult) {
    this.flowResult = flowResult;
  }

  public PaymentActionResult redirect(RedirectResponse redirect) {
    this.redirect = redirect;
    return this;
  }

  /**
   * Get redirect
   * @return redirect
  */
  @Valid 
  @Schema(name = "redirect", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("redirect")
  public RedirectResponse getRedirect() {
    return redirect;
  }

  public void setRedirect(RedirectResponse redirect) {
    this.redirect = redirect;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentActionResult paymentActionResult = (PaymentActionResult) o;
    return Objects.equals(this.transactionId, paymentActionResult.transactionId) &&
        Objects.equals(this.type, paymentActionResult.type) &&
        Objects.equals(this.paymentProviderSdkVersion, paymentActionResult.paymentProviderSdkVersion) &&
        Objects.equals(this.flowResult, paymentActionResult.flowResult) &&
        Objects.equals(this.redirect, paymentActionResult.redirect);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionId, type, paymentProviderSdkVersion, flowResult, redirect);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentActionResult {\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    paymentProviderSdkVersion: ").append(toIndentedString(paymentProviderSdkVersion)).append("\n");
    sb.append("    flowResult: ").append(toIndentedString(flowResult)).append("\n");
    sb.append("    redirect: ").append(toIndentedString(redirect)).append("\n");
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

