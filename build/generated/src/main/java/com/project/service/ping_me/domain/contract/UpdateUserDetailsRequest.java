package com.project.service.ping_me.domain.contract;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.project.service.ping_me.domain.contract.DriverInfo;
import com.project.service.ping_me.domain.contract.UpdateRequiredUserDetailsParams;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * UpdateBookingDetailsRequest represents the request payload for updating a reservation with user details.
 */

@Schema(name = "UpdateUserDetailsRequest", description = "UpdateBookingDetailsRequest represents the request payload for updating a reservation with user details.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class UpdateUserDetailsRequest {

  private UpdateRequiredUserDetailsParams updateRequiredUserDetailsParams;

  private DriverInfo driverInfo;

  public UpdateUserDetailsRequest updateRequiredUserDetailsParams(UpdateRequiredUserDetailsParams updateRequiredUserDetailsParams) {
    this.updateRequiredUserDetailsParams = updateRequiredUserDetailsParams;
    return this;
  }

  /**
   * Get updateRequiredUserDetailsParams
   * @return updateRequiredUserDetailsParams
  */
  @Valid 
  @Schema(name = "updateRequiredUserDetailsParams", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updateRequiredUserDetailsParams")
  public UpdateRequiredUserDetailsParams getUpdateRequiredUserDetailsParams() {
    return updateRequiredUserDetailsParams;
  }

  public void setUpdateRequiredUserDetailsParams(UpdateRequiredUserDetailsParams updateRequiredUserDetailsParams) {
    this.updateRequiredUserDetailsParams = updateRequiredUserDetailsParams;
  }

  public UpdateUserDetailsRequest driverInfo(DriverInfo driverInfo) {
    this.driverInfo = driverInfo;
    return this;
  }

  /**
   * Get driverInfo
   * @return driverInfo
  */
  @Valid 
  @Schema(name = "driverInfo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("driverInfo")
  public DriverInfo getDriverInfo() {
    return driverInfo;
  }

  public void setDriverInfo(DriverInfo driverInfo) {
    this.driverInfo = driverInfo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateUserDetailsRequest updateUserDetailsRequest = (UpdateUserDetailsRequest) o;
    return Objects.equals(this.updateRequiredUserDetailsParams, updateUserDetailsRequest.updateRequiredUserDetailsParams) &&
        Objects.equals(this.driverInfo, updateUserDetailsRequest.driverInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(updateRequiredUserDetailsParams, driverInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateUserDetailsRequest {\n");
    sb.append("    updateRequiredUserDetailsParams: ").append(toIndentedString(updateRequiredUserDetailsParams)).append("\n");
    sb.append("    driverInfo: ").append(toIndentedString(driverInfo)).append("\n");
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

