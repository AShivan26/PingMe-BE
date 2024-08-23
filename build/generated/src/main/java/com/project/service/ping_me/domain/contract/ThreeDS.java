package com.project.service.ping_me.domain.contract;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.project.service.ping_me.domain.contract.PaymentActionResult;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ThreeDS
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ThreeDS {

  private PaymentActionResult paymentActionResult;

  public ThreeDS() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ThreeDS(PaymentActionResult paymentActionResult) {
    this.paymentActionResult = paymentActionResult;
  }

  public ThreeDS paymentActionResult(PaymentActionResult paymentActionResult) {
    this.paymentActionResult = paymentActionResult;
    return this;
  }

  /**
   * Get paymentActionResult
   * @return paymentActionResult
  */
  @NotNull @Valid 
  @Schema(name = "paymentActionResult", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("paymentActionResult")
  public PaymentActionResult getPaymentActionResult() {
    return paymentActionResult;
  }

  public void setPaymentActionResult(PaymentActionResult paymentActionResult) {
    this.paymentActionResult = paymentActionResult;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThreeDS threeDS = (ThreeDS) o;
    return Objects.equals(this.paymentActionResult, threeDS.paymentActionResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentActionResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThreeDS {\n");
    sb.append("    paymentActionResult: ").append(toIndentedString(paymentActionResult)).append("\n");
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

