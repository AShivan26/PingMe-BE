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
 * UpdateCorporateDetailsResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class UpdateCorporateDetailsResponse {

  private Boolean isSuccess;

  public UpdateCorporateDetailsResponse isSuccess(Boolean isSuccess) {
    this.isSuccess = isSuccess;
    return this;
  }

  /**
   * boolean value that confirms if update was successful or not in rental-activity.
   * @return isSuccess
  */
  
  @Schema(name = "isSuccess", example = "false", description = "boolean value that confirms if update was successful or not in rental-activity.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isSuccess")
  public Boolean isIsSuccess() {
    return isSuccess;
  }

  public void setIsSuccess(Boolean isSuccess) {
    this.isSuccess = isSuccess;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateCorporateDetailsResponse updateCorporateDetailsResponse = (UpdateCorporateDetailsResponse) o;
    return Objects.equals(this.isSuccess, updateCorporateDetailsResponse.isSuccess);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isSuccess);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateCorporateDetailsResponse {\n");
    sb.append("    isSuccess: ").append(toIndentedString(isSuccess)).append("\n");
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

