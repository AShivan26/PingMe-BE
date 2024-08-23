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
 * EntryUsecase
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class EntryUsecase {

  private String value;

  private String title;

  private String message;

  public EntryUsecase() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public EntryUsecase(String value) {
    this.value = value;
  }

  public EntryUsecase value(String value) {
    this.value = value;
    return this;
  }

  /**
   * vehicle_selection_not_available should be passed in case no other use case fits
   * @return value
  */
  @NotNull 
  @Schema(name = "value", example = "vehicle_selection_available|time_passed|multiple_active_rentals|age_restriction|long_term|vehicle_selection_not_available|new_user|branch_closed|branch_closing|invalid_corporate_customer|unlimited_corporate_customer", description = "vehicle_selection_not_available should be passed in case no other use case fits", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public EntryUsecase title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  */
  
  @Schema(name = "title", example = "More than 1 active rental", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public EntryUsecase message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
  */
  
  @Schema(name = "message", example = "You already have an active rental with booking ID 7657823", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntryUsecase entryUsecase = (EntryUsecase) o;
    return Objects.equals(this.value, entryUsecase.value) &&
        Objects.equals(this.title, entryUsecase.title) &&
        Objects.equals(this.message, entryUsecase.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, title, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntryUsecase {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

