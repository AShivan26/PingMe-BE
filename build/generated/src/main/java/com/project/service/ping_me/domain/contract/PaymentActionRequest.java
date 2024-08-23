package com.project.service.ping_me.domain.contract;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.project.service.ping_me.domain.contract.BlockDateTime;
import com.project.service.ping_me.domain.contract.RedirectRequest;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * PaymentActionRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class PaymentActionRequest {

  private String transactionId;

  private String type;

  private String token;

  private RedirectRequest redirect;

  private BlockDateTime vehicleBlockDateTime;

  public PaymentActionRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PaymentActionRequest(String transactionId, String type, BlockDateTime vehicleBlockDateTime) {
    this.transactionId = transactionId;
    this.type = type;
    this.vehicleBlockDateTime = vehicleBlockDateTime;
  }

  public PaymentActionRequest transactionId(String transactionId) {
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

  public PaymentActionRequest type(String type) {
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

  public PaymentActionRequest token(String token) {
    this.token = token;
    return this;
  }

  /**
   * Get token
   * @return token
  */
  
  @Schema(name = "token", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("token")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public PaymentActionRequest redirect(RedirectRequest redirect) {
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
  public RedirectRequest getRedirect() {
    return redirect;
  }

  public void setRedirect(RedirectRequest redirect) {
    this.redirect = redirect;
  }

  public PaymentActionRequest vehicleBlockDateTime(BlockDateTime vehicleBlockDateTime) {
    this.vehicleBlockDateTime = vehicleBlockDateTime;
    return this;
  }

  /**
   * Get vehicleBlockDateTime
   * @return vehicleBlockDateTime
  */
  @NotNull @Valid 
  @Schema(name = "vehicleBlockDateTime", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("vehicleBlockDateTime")
  public BlockDateTime getVehicleBlockDateTime() {
    return vehicleBlockDateTime;
  }

  public void setVehicleBlockDateTime(BlockDateTime vehicleBlockDateTime) {
    this.vehicleBlockDateTime = vehicleBlockDateTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentActionRequest paymentActionRequest = (PaymentActionRequest) o;
    return Objects.equals(this.transactionId, paymentActionRequest.transactionId) &&
        Objects.equals(this.type, paymentActionRequest.type) &&
        Objects.equals(this.token, paymentActionRequest.token) &&
        Objects.equals(this.redirect, paymentActionRequest.redirect) &&
        Objects.equals(this.vehicleBlockDateTime, paymentActionRequest.vehicleBlockDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionId, type, token, redirect, vehicleBlockDateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentActionRequest {\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    redirect: ").append(toIndentedString(redirect)).append("\n");
    sb.append("    vehicleBlockDateTime: ").append(toIndentedString(vehicleBlockDateTime)).append("\n");
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

