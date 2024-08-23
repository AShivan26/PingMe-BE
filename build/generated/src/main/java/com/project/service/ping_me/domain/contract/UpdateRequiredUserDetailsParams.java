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
 * UpdateRequiredUserDetailsParams
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class UpdateRequiredUserDetailsParams {

  private Boolean isResidentialAddressUpdated;

  private Boolean isIDCardDetailsUpdated;

  private Boolean isTaxIdUpdated;

  private Boolean isDvlaDetailsUpdated = false;

  public UpdateRequiredUserDetailsParams() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UpdateRequiredUserDetailsParams(Boolean isResidentialAddressUpdated, Boolean isIDCardDetailsUpdated, Boolean isTaxIdUpdated, Boolean isDvlaDetailsUpdated) {
    this.isResidentialAddressUpdated = isResidentialAddressUpdated;
    this.isIDCardDetailsUpdated = isIDCardDetailsUpdated;
    this.isTaxIdUpdated = isTaxIdUpdated;
    this.isDvlaDetailsUpdated = isDvlaDetailsUpdated;
  }

  public UpdateRequiredUserDetailsParams isResidentialAddressUpdated(Boolean isResidentialAddressUpdated) {
    this.isResidentialAddressUpdated = isResidentialAddressUpdated;
    return this;
  }

  /**
   * if true backend will update the residential address feild present in the request to RA.
   * @return isResidentialAddressUpdated
  */
  @NotNull 
  @Schema(name = "isResidentialAddressUpdated", example = "false", description = "if true backend will update the residential address feild present in the request to RA.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("isResidentialAddressUpdated")
  public Boolean isIsResidentialAddressUpdated() {
    return isResidentialAddressUpdated;
  }

  public void setIsResidentialAddressUpdated(Boolean isResidentialAddressUpdated) {
    this.isResidentialAddressUpdated = isResidentialAddressUpdated;
  }

  public UpdateRequiredUserDetailsParams isIDCardDetailsUpdated(Boolean isIDCardDetailsUpdated) {
    this.isIDCardDetailsUpdated = isIDCardDetailsUpdated;
    return this;
  }

  /**
   * if true backend will update all the feilds of ID card present in the request to RA.
   * @return isIDCardDetailsUpdated
  */
  @NotNull 
  @Schema(name = "isIDCardDetailsUpdated", example = "false", description = "if true backend will update all the feilds of ID card present in the request to RA.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("isIDCardDetailsUpdated")
  public Boolean isIsIDCardDetailsUpdated() {
    return isIDCardDetailsUpdated;
  }

  public void setIsIDCardDetailsUpdated(Boolean isIDCardDetailsUpdated) {
    this.isIDCardDetailsUpdated = isIDCardDetailsUpdated;
  }

  public UpdateRequiredUserDetailsParams isTaxIdUpdated(Boolean isTaxIdUpdated) {
    this.isTaxIdUpdated = isTaxIdUpdated;
    return this;
  }

  /**
   * if true backend will update the tax ID present in the request to RA.
   * @return isTaxIdUpdated
  */
  @NotNull 
  @Schema(name = "isTaxIdUpdated", example = "false", description = "if true backend will update the tax ID present in the request to RA.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("isTaxIdUpdated")
  public Boolean isIsTaxIdUpdated() {
    return isTaxIdUpdated;
  }

  public void setIsTaxIdUpdated(Boolean isTaxIdUpdated) {
    this.isTaxIdUpdated = isTaxIdUpdated;
  }

  public UpdateRequiredUserDetailsParams isDvlaDetailsUpdated(Boolean isDvlaDetailsUpdated) {
    this.isDvlaDetailsUpdated = isDvlaDetailsUpdated;
    return this;
  }

  /**
   * if true backend will update the dvla code present in the request to RA.
   * @return isDvlaDetailsUpdated
  */
  @NotNull 
  @Schema(name = "isDvlaDetailsUpdated", example = "false", description = "if true backend will update the dvla code present in the request to RA.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("isDvlaDetailsUpdated")
  public Boolean isIsDvlaDetailsUpdated() {
    return isDvlaDetailsUpdated;
  }

  public void setIsDvlaDetailsUpdated(Boolean isDvlaDetailsUpdated) {
    this.isDvlaDetailsUpdated = isDvlaDetailsUpdated;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateRequiredUserDetailsParams updateRequiredUserDetailsParams = (UpdateRequiredUserDetailsParams) o;
    return Objects.equals(this.isResidentialAddressUpdated, updateRequiredUserDetailsParams.isResidentialAddressUpdated) &&
        Objects.equals(this.isIDCardDetailsUpdated, updateRequiredUserDetailsParams.isIDCardDetailsUpdated) &&
        Objects.equals(this.isTaxIdUpdated, updateRequiredUserDetailsParams.isTaxIdUpdated) &&
        Objects.equals(this.isDvlaDetailsUpdated, updateRequiredUserDetailsParams.isDvlaDetailsUpdated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isResidentialAddressUpdated, isIDCardDetailsUpdated, isTaxIdUpdated, isDvlaDetailsUpdated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateRequiredUserDetailsParams {\n");
    sb.append("    isResidentialAddressUpdated: ").append(toIndentedString(isResidentialAddressUpdated)).append("\n");
    sb.append("    isIDCardDetailsUpdated: ").append(toIndentedString(isIDCardDetailsUpdated)).append("\n");
    sb.append("    isTaxIdUpdated: ").append(toIndentedString(isTaxIdUpdated)).append("\n");
    sb.append("    isDvlaDetailsUpdated: ").append(toIndentedString(isDvlaDetailsUpdated)).append("\n");
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

