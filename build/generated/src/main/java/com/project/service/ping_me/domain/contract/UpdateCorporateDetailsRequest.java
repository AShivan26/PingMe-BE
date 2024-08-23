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
 * UpdateCorporateDetailsRequest represents the request payload for updating a reservation with user details.
 */

@Schema(name = "UpdateCorporateDetailsRequest", description = "UpdateCorporateDetailsRequest represents the request payload for updating a reservation with user details.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class UpdateCorporateDetailsRequest {

  private String corporateTaxId;

  public UpdateCorporateDetailsRequest corporateTaxId(String corporateTaxId) {
    this.corporateTaxId = corporateTaxId;
    return this;
  }

  /**
   * Get corporateTaxId
   * @return corporateTaxId
  */
  
  @Schema(name = "corporateTaxId", example = "123456789", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("corporateTaxId")
  public String getCorporateTaxId() {
    return corporateTaxId;
  }

  public void setCorporateTaxId(String corporateTaxId) {
    this.corporateTaxId = corporateTaxId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateCorporateDetailsRequest updateCorporateDetailsRequest = (UpdateCorporateDetailsRequest) o;
    return Objects.equals(this.corporateTaxId, updateCorporateDetailsRequest.corporateTaxId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(corporateTaxId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateCorporateDetailsRequest {\n");
    sb.append("    corporateTaxId: ").append(toIndentedString(corporateTaxId)).append("\n");
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

