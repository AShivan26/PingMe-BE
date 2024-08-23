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
 * NotificationItem
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class NotificationItem {

  private String category;

  private String message;

  private String reason;

  public NotificationItem category(String category) {
    this.category = category;
    return this;
  }

  /**
   * Probable values are  - ALERT  - WARNING.
   * @return category
  */
  
  @Schema(name = "category", example = "WARNING", description = "Probable values are  - ALERT  - WARNING.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("category")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public NotificationItem message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Possible values - Only credit card accepted for this rental, Additional driver verification will be done at the counter
   * @return message
  */
  
  @Schema(name = "message", example = "Changing card, will initiate complete payment on new card. Prepaid amount will be refunded on card **** **** **** *311", description = "Possible values - Only credit card accepted for this rental, Additional driver verification will be done at the counter", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public NotificationItem reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Probable values are  - DEBIT_CARD_NOT_SUPPORTED(Handles LOCAL_USER and PLXG Checks)  - PAYMENT_NOT_ALLOWED(UI will show CTA button as Proceed at counter).  - CARD_CHANGE/ALTERNATE_PAYMENT_METHOD for prepaid refund message in case user tries to change card. CARD_CHANGE will be deprecated once mweb adopts new reason, so map only ALTERNATE_PAYMENT_METHOD  - CARD_CHANGE_NOT_ALLOWED   - CARD_DETAILS_NOT_NEEDED for AGENCY_FULL_CREDIT booking.  - CHANGE_PAYMENT_METHOD
   * @return reason
  */
  
  @Schema(name = "reason", example = "CARD_CHANGE", description = "Probable values are  - DEBIT_CARD_NOT_SUPPORTED(Handles LOCAL_USER and PLXG Checks)  - PAYMENT_NOT_ALLOWED(UI will show CTA button as Proceed at counter).  - CARD_CHANGE/ALTERNATE_PAYMENT_METHOD for prepaid refund message in case user tries to change card. CARD_CHANGE will be deprecated once mweb adopts new reason, so map only ALTERNATE_PAYMENT_METHOD  - CARD_CHANGE_NOT_ALLOWED   - CARD_DETAILS_NOT_NEEDED for AGENCY_FULL_CREDIT booking.  - CHANGE_PAYMENT_METHOD", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reason")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationItem notificationItem = (NotificationItem) o;
    return Objects.equals(this.category, notificationItem.category) &&
        Objects.equals(this.message, notificationItem.message) &&
        Objects.equals(this.reason, notificationItem.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, message, reason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationItem {\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

