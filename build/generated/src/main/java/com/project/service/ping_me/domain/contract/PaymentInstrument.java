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
 * PaymentInstrument
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class PaymentInstrument {

  private String id;

  private String publicNumber;

  private String token;

  private Integer validityDateMonth;

  private Integer validityDateYear;

  private String paymentMethod;

  private String paymentSystem;

  public PaymentInstrument() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PaymentInstrument(String publicNumber, String token, String paymentMethod, String paymentSystem) {
    this.publicNumber = publicNumber;
    this.token = token;
    this.paymentMethod = paymentMethod;
    this.paymentSystem = paymentSystem;
  }

  public PaymentInstrument id(String id) {
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

  public PaymentInstrument publicNumber(String publicNumber) {
    this.publicNumber = publicNumber;
    return this;
  }

  /**
   * Get publicNumber
   * @return publicNumber
  */
  @NotNull 
  @Schema(name = "publicNumber", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("publicNumber")
  public String getPublicNumber() {
    return publicNumber;
  }

  public void setPublicNumber(String publicNumber) {
    this.publicNumber = publicNumber;
  }

  public PaymentInstrument token(String token) {
    this.token = token;
    return this;
  }

  /**
   * Get token
   * @return token
  */
  @NotNull 
  @Schema(name = "token", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("token")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public PaymentInstrument validityDateMonth(Integer validityDateMonth) {
    this.validityDateMonth = validityDateMonth;
    return this;
  }

  /**
   * Get validityDateMonth
   * @return validityDateMonth
  */
  
  @Schema(name = "validityDateMonth", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("validityDateMonth")
  public Integer getValidityDateMonth() {
    return validityDateMonth;
  }

  public void setValidityDateMonth(Integer validityDateMonth) {
    this.validityDateMonth = validityDateMonth;
  }

  public PaymentInstrument validityDateYear(Integer validityDateYear) {
    this.validityDateYear = validityDateYear;
    return this;
  }

  /**
   * Get validityDateYear
   * @return validityDateYear
  */
  
  @Schema(name = "validityDateYear", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("validityDateYear")
  public Integer getValidityDateYear() {
    return validityDateYear;
  }

  public void setValidityDateYear(Integer validityDateYear) {
    this.validityDateYear = validityDateYear;
  }

  public PaymentInstrument paymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

  /**
   * Probable values are  - CREDIT_CARD  - SIXT_CORPORATE_CARD  - VIRTUAL_CORPORATE_CARD_AIRPLUS  - DIRECT_DEBIT  - OTHER
   * @return paymentMethod
  */
  @NotNull 
  @Schema(name = "paymentMethod", description = "Probable values are  - CREDIT_CARD  - SIXT_CORPORATE_CARD  - VIRTUAL_CORPORATE_CARD_AIRPLUS  - DIRECT_DEBIT  - OTHER", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("paymentMethod")
  public String getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public PaymentInstrument paymentSystem(String paymentSystem) {
    this.paymentSystem = paymentSystem;
    return this;
  }

  /**
   * Probable values are  - AMERICAN_EXPRESS  - DINERS_CLUB  - DISCOVER  - JCB  - MASTER_CARD  - VISA  - AIR_PLUS  - SIXT_CORPORATE_CARD_UNLIMITED
   * @return paymentSystem
  */
  @NotNull 
  @Schema(name = "paymentSystem", description = "Probable values are  - AMERICAN_EXPRESS  - DINERS_CLUB  - DISCOVER  - JCB  - MASTER_CARD  - VISA  - AIR_PLUS  - SIXT_CORPORATE_CARD_UNLIMITED", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("paymentSystem")
  public String getPaymentSystem() {
    return paymentSystem;
  }

  public void setPaymentSystem(String paymentSystem) {
    this.paymentSystem = paymentSystem;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentInstrument paymentInstrument = (PaymentInstrument) o;
    return Objects.equals(this.id, paymentInstrument.id) &&
        Objects.equals(this.publicNumber, paymentInstrument.publicNumber) &&
        Objects.equals(this.token, paymentInstrument.token) &&
        Objects.equals(this.validityDateMonth, paymentInstrument.validityDateMonth) &&
        Objects.equals(this.validityDateYear, paymentInstrument.validityDateYear) &&
        Objects.equals(this.paymentMethod, paymentInstrument.paymentMethod) &&
        Objects.equals(this.paymentSystem, paymentInstrument.paymentSystem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, publicNumber, token, validityDateMonth, validityDateYear, paymentMethod, paymentSystem);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentInstrument {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    publicNumber: ").append(toIndentedString(publicNumber)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    validityDateMonth: ").append(toIndentedString(validityDateMonth)).append("\n");
    sb.append("    validityDateYear: ").append(toIndentedString(validityDateYear)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    paymentSystem: ").append(toIndentedString(paymentSystem)).append("\n");
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

