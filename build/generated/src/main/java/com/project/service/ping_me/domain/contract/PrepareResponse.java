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
 * PrepareResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class PrepareResponse {

  private String rentalActivityId;

  public PrepareResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PrepareResponse(String rentalActivityId) {
    this.rentalActivityId = rentalActivityId;
  }

  public PrepareResponse rentalActivityId(String rentalActivityId) {
    this.rentalActivityId = rentalActivityId;
    return this;
  }

  /**
   * Get rentalActivityId
   * @return rentalActivityId
  */
  @NotNull 
  @Schema(name = "rentalActivityId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("rentalActivityId")
  public String getRentalActivityId() {
    return rentalActivityId;
  }

  public void setRentalActivityId(String rentalActivityId) {
    this.rentalActivityId = rentalActivityId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrepareResponse prepareResponse = (PrepareResponse) o;
    return Objects.equals(this.rentalActivityId, prepareResponse.rentalActivityId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rentalActivityId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrepareResponse {\n");
    sb.append("    rentalActivityId: ").append(toIndentedString(rentalActivityId)).append("\n");
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

