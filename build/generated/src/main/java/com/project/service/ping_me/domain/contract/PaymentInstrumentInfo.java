package com.project.service.ping_me.domain.contract;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * PaymentInstrumentInfo
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class PaymentInstrumentInfo {

  private String paymentInstrumentToken;

  private String expiryDate;

  private String cardHolderName;

  private String paymentBrand;

  private String cardType;

  public PaymentInstrumentInfo() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PaymentInstrumentInfo(String paymentInstrumentToken, String expiryDate, String cardHolderName, String paymentBrand) {
    this.paymentInstrumentToken = paymentInstrumentToken;
    this.expiryDate = expiryDate;
    this.cardHolderName = cardHolderName;
    this.paymentBrand = paymentBrand;
  }

  public PaymentInstrumentInfo paymentInstrumentToken(String paymentInstrumentToken) {
    this.paymentInstrumentToken = paymentInstrumentToken;
    return this;
  }

  /**
   * Get paymentInstrumentToken
   * @return paymentInstrumentToken
  */
  @NotNull 
  @Schema(name = "paymentInstrumentToken", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("paymentInstrumentToken")
  public String getPaymentInstrumentToken() {
    return paymentInstrumentToken;
  }

  public void setPaymentInstrumentToken(String paymentInstrumentToken) {
    this.paymentInstrumentToken = paymentInstrumentToken;
  }

  public PaymentInstrumentInfo expiryDate(String expiryDate) {
    this.expiryDate = expiryDate;
    return this;
  }

  /**
   * Get expiryDate
   * @return expiryDate
  */
  @NotNull 
  @Schema(name = "expiryDate", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("expiryDate")
  public String getExpiryDate() {
    return expiryDate;
  }

  public void setExpiryDate(String expiryDate) {
    this.expiryDate = expiryDate;
  }

  public PaymentInstrumentInfo cardHolderName(String cardHolderName) {
    this.cardHolderName = cardHolderName;
    return this;
  }

  /**
   * Get cardHolderName
   * @return cardHolderName
  */
  @NotNull 
  @Schema(name = "cardHolderName", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("cardHolderName")
  public String getCardHolderName() {
    return cardHolderName;
  }

  public void setCardHolderName(String cardHolderName) {
    this.cardHolderName = cardHolderName;
  }

  public PaymentInstrumentInfo paymentBrand(String paymentBrand) {
    this.paymentBrand = paymentBrand;
    return this;
  }

  /**
   * Get paymentBrand
   * @return paymentBrand
  */
  @NotNull 
  @Schema(name = "paymentBrand", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("paymentBrand")
  public String getPaymentBrand() {
    return paymentBrand;
  }

  public void setPaymentBrand(String paymentBrand) {
    this.paymentBrand = paymentBrand;
  }

  public PaymentInstrumentInfo cardType(String cardType) {
    this.cardType = cardType;
    return this;
  }

  /**
   * Get cardType
   * @return cardType
  */
  
  @Schema(name = "cardType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cardType")
  public String getCardType() {
    return cardType;
  }

  public void setCardType(String cardType) {
    this.cardType = cardType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentInstrumentInfo paymentInstrumentInfo = (PaymentInstrumentInfo) o;
    return Objects.equals(this.paymentInstrumentToken, paymentInstrumentInfo.paymentInstrumentToken) &&
        Objects.equals(this.expiryDate, paymentInstrumentInfo.expiryDate) &&
        Objects.equals(this.cardHolderName, paymentInstrumentInfo.cardHolderName) &&
        Objects.equals(this.paymentBrand, paymentInstrumentInfo.paymentBrand) &&
        Objects.equals(this.cardType, paymentInstrumentInfo.cardType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentInstrumentToken, expiryDate, cardHolderName, paymentBrand, cardType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentInstrumentInfo {\n");
    sb.append("    paymentInstrumentToken: ").append(toIndentedString(paymentInstrumentToken)).append("\n");
    sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
    sb.append("    cardHolderName: ").append(toIndentedString(cardHolderName)).append("\n");
    sb.append("    paymentBrand: ").append(toIndentedString(paymentBrand)).append("\n");
    sb.append("    cardType: ").append(toIndentedString(cardType)).append("\n");
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

