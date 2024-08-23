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
 * PaymentInstrumentV2
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class PaymentInstrumentV2 {

  private String id;

  private String name;

  private String type;

  private String cardType;

  private String cardBrand;

  private String status;

  private String token;

  private Integer expirationMonth;

  private Integer expirationYear;

  public PaymentInstrumentV2() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PaymentInstrumentV2(String name, String type) {
    this.name = name;
    this.type = type;
  }

  public PaymentInstrumentV2 id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PaymentInstrumentV2 name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @NotNull 
  @Schema(name = "name", example = "**** **** **** *311", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PaymentInstrumentV2 type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Probable values are  - SEPA  - CARD  - PAYPAL
   * @return type
  */
  @NotNull 
  @Schema(name = "type", example = "CARD", description = "Probable values are  - SEPA  - CARD  - PAYPAL", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public PaymentInstrumentV2 cardType(String cardType) {
    this.cardType = cardType;
    return this;
  }

  /**
   * Probable values are  - DEBIT  - CREDIT  - CHARGE
   * @return cardType
  */
  
  @Schema(name = "cardType", example = "CREDIT_CARD", description = "Probable values are  - DEBIT  - CREDIT  - CHARGE", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cardType")
  public String getCardType() {
    return cardType;
  }

  public void setCardType(String cardType) {
    this.cardType = cardType;
  }

  public PaymentInstrumentV2 cardBrand(String cardBrand) {
    this.cardBrand = cardBrand;
    return this;
  }

  /**
   * Probable values are  - CARD_BRAND_UNDEFINED  - VISA  - MASTERCARD  - AMEX  - DINERS  - JCB  - DISCOVER  - AIRPLUS  - MAESTRO  - VPAY  - CUP
   * @return cardBrand
  */
  
  @Schema(name = "cardBrand", example = "MASTER_CARD", description = "Probable values are  - CARD_BRAND_UNDEFINED  - VISA  - MASTERCARD  - AMEX  - DINERS  - JCB  - DISCOVER  - AIRPLUS  - MAESTRO  - VPAY  - CUP", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cardBrand")
  public String getCardBrand() {
    return cardBrand;
  }

  public void setCardBrand(String cardBrand) {
    this.cardBrand = cardBrand;
  }

  public PaymentInstrumentV2 status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Probable values are  - ACTIVE  - BLOCKED  - EXPIRED  - DELETED  - ARCHIVED 
   * @return status
  */
  
  @Schema(name = "status", example = "ACTIVE", description = "Probable values are  - ACTIVE  - BLOCKED  - EXPIRED  - DELETED  - ARCHIVED ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public PaymentInstrumentV2 token(String token) {
    this.token = token;
    return this;
  }

  /**
   * Get token
   * @return token
  */
  
  @Schema(name = "token", example = "520128QkBPadP311", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("token")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public PaymentInstrumentV2 expirationMonth(Integer expirationMonth) {
    this.expirationMonth = expirationMonth;
    return this;
  }

  /**
   * Get expirationMonth
   * @return expirationMonth
  */
  
  @Schema(name = "expirationMonth", example = "3", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expirationMonth")
  public Integer getExpirationMonth() {
    return expirationMonth;
  }

  public void setExpirationMonth(Integer expirationMonth) {
    this.expirationMonth = expirationMonth;
  }

  public PaymentInstrumentV2 expirationYear(Integer expirationYear) {
    this.expirationYear = expirationYear;
    return this;
  }

  /**
   * Get expirationYear
   * @return expirationYear
  */
  
  @Schema(name = "expirationYear", example = "2030", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expirationYear")
  public Integer getExpirationYear() {
    return expirationYear;
  }

  public void setExpirationYear(Integer expirationYear) {
    this.expirationYear = expirationYear;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentInstrumentV2 paymentInstrumentV2 = (PaymentInstrumentV2) o;
    return Objects.equals(this.id, paymentInstrumentV2.id) &&
        Objects.equals(this.name, paymentInstrumentV2.name) &&
        Objects.equals(this.type, paymentInstrumentV2.type) &&
        Objects.equals(this.cardType, paymentInstrumentV2.cardType) &&
        Objects.equals(this.cardBrand, paymentInstrumentV2.cardBrand) &&
        Objects.equals(this.status, paymentInstrumentV2.status) &&
        Objects.equals(this.token, paymentInstrumentV2.token) &&
        Objects.equals(this.expirationMonth, paymentInstrumentV2.expirationMonth) &&
        Objects.equals(this.expirationYear, paymentInstrumentV2.expirationYear);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, type, cardType, cardBrand, status, token, expirationMonth, expirationYear);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentInstrumentV2 {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    cardType: ").append(toIndentedString(cardType)).append("\n");
    sb.append("    cardBrand: ").append(toIndentedString(cardBrand)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    expirationMonth: ").append(toIndentedString(expirationMonth)).append("\n");
    sb.append("    expirationYear: ").append(toIndentedString(expirationYear)).append("\n");
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

