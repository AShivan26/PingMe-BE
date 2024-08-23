package com.project.service.ping_me.domain.contract;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.project.service.ping_me.domain.contract.DriverInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * UserDetailsResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class UserDetailsResponse {

  private String rentalActivityId;

  private Boolean isResidentialAddressNeeded;

  private Boolean isIDCardDetailsNeeded;

  private DriverInfo driverInfo;

  public UserDetailsResponse rentalActivityId(String rentalActivityId) {
    this.rentalActivityId = rentalActivityId;
    return this;
  }

  /**
   * the id of the rental-activity
   * @return rentalActivityId
  */
  
  @Schema(name = "rentalActivityId", example = "1001987478", description = "the id of the rental-activity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rentalActivityId")
  public String getRentalActivityId() {
    return rentalActivityId;
  }

  public void setRentalActivityId(String rentalActivityId) {
    this.rentalActivityId = rentalActivityId;
  }

  public UserDetailsResponse isResidentialAddressNeeded(Boolean isResidentialAddressNeeded) {
    this.isResidentialAddressNeeded = isResidentialAddressNeeded;
    return this;
  }

  /**
   * if true front-end needs to call residential address update,if false front-end should skip it and call payment page.
   * @return isResidentialAddressNeeded
  */
  
  @Schema(name = "isResidentialAddressNeeded", example = "false", description = "if true front-end needs to call residential address update,if false front-end should skip it and call payment page.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isResidentialAddressNeeded")
  public Boolean isIsResidentialAddressNeeded() {
    return isResidentialAddressNeeded;
  }

  public void setIsResidentialAddressNeeded(Boolean isResidentialAddressNeeded) {
    this.isResidentialAddressNeeded = isResidentialAddressNeeded;
  }

  public UserDetailsResponse isIDCardDetailsNeeded(Boolean isIDCardDetailsNeeded) {
    this.isIDCardDetailsNeeded = isIDCardDetailsNeeded;
    return this;
  }

  /**
   * if true front-end needs to call ID Card update,if false front-end should skip it and call payment page.
   * @return isIDCardDetailsNeeded
  */
  
  @Schema(name = "isIDCardDetailsNeeded", example = "false", description = "if true front-end needs to call ID Card update,if false front-end should skip it and call payment page.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isIDCardDetailsNeeded")
  public Boolean isIsIDCardDetailsNeeded() {
    return isIDCardDetailsNeeded;
  }

  public void setIsIDCardDetailsNeeded(Boolean isIDCardDetailsNeeded) {
    this.isIDCardDetailsNeeded = isIDCardDetailsNeeded;
  }

  public UserDetailsResponse driverInfo(DriverInfo driverInfo) {
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
    UserDetailsResponse userDetailsResponse = (UserDetailsResponse) o;
    return Objects.equals(this.rentalActivityId, userDetailsResponse.rentalActivityId) &&
        Objects.equals(this.isResidentialAddressNeeded, userDetailsResponse.isResidentialAddressNeeded) &&
        Objects.equals(this.isIDCardDetailsNeeded, userDetailsResponse.isIDCardDetailsNeeded) &&
        Objects.equals(this.driverInfo, userDetailsResponse.driverInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rentalActivityId, isResidentialAddressNeeded, isIDCardDetailsNeeded, driverInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserDetailsResponse {\n");
    sb.append("    rentalActivityId: ").append(toIndentedString(rentalActivityId)).append("\n");
    sb.append("    isResidentialAddressNeeded: ").append(toIndentedString(isResidentialAddressNeeded)).append("\n");
    sb.append("    isIDCardDetailsNeeded: ").append(toIndentedString(isIDCardDetailsNeeded)).append("\n");
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

