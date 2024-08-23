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
 * Location
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class Location {

  private String branchId;

  private String branchName;

  private String countryCode;

  public Location() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Location(String branchId, String branchName, String countryCode) {
    this.branchId = branchId;
    this.branchName = branchName;
    this.countryCode = countryCode;
  }

  public Location branchId(String branchId) {
    this.branchId = branchId;
    return this;
  }

  /**
   * the location id
   * @return branchId
  */
  @NotNull 
  @Schema(name = "branchId", example = "11", description = "the location id", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("branchId")
  public String getBranchId() {
    return branchId;
  }

  public void setBranchId(String branchId) {
    this.branchId = branchId;
  }

  public Location branchName(String branchName) {
    this.branchName = branchName;
    return this;
  }

  /**
   * the location name
   * @return branchName
  */
  @NotNull 
  @Schema(name = "branchName", example = "Munich Airport", description = "the location name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("branchName")
  public String getBranchName() {
    return branchName;
  }

  public void setBranchName(String branchName) {
    this.branchName = branchName;
  }

  public Location countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * countryCode of the Address, Ex:- DE, NL, IN
   * @return countryCode
  */
  @NotNull 
  @Schema(name = "countryCode", example = "DE", description = "countryCode of the Address, Ex:- DE, NL, IN", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("countryCode")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Location location = (Location) o;
    return Objects.equals(this.branchId, location.branchId) &&
        Objects.equals(this.branchName, location.branchName) &&
        Objects.equals(this.countryCode, location.countryCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branchId, branchName, countryCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Location {\n");
    sb.append("    branchId: ").append(toIndentedString(branchId)).append("\n");
    sb.append("    branchName: ").append(toIndentedString(branchName)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
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

