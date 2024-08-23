package com.project.service.ping_me.domain.contract;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.project.service.ping_me.domain.contract.DvlaDetails;
import com.project.service.ping_me.domain.contract.PassportOrIDCardDetails;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Driver info object
 */

@Schema(name = "DriverInfo", description = "Driver info object")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class DriverInfo {

  private PassportOrIDCardDetails passport;

  private String taxId;

  private String otherAddressInfo;

  private String firstName;

  private String lastName;

  private DvlaDetails dvlaDetail;

  public DriverInfo passport(PassportOrIDCardDetails passport) {
    this.passport = passport;
    return this;
  }

  /**
   * Get passport
   * @return passport
  */
  @Valid 
  @Schema(name = "passport", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("passport")
  public PassportOrIDCardDetails getPassport() {
    return passport;
  }

  public void setPassport(PassportOrIDCardDetails passport) {
    this.passport = passport;
  }

  public DriverInfo taxId(String taxId) {
    this.taxId = taxId;
    return this;
  }

  /**
   * Get taxId
   * @return taxId
  */
  
  @Schema(name = "taxId", example = "123456789", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("taxId")
  public String getTaxId() {
    return taxId;
  }

  public void setTaxId(String taxId) {
    this.taxId = taxId;
  }

  public DriverInfo otherAddressInfo(String otherAddressInfo) {
    this.otherAddressInfo = otherAddressInfo;
    return this;
  }

  /**
   * Get otherAddressInfo
   * @return otherAddressInfo
  */
  
  @Schema(name = "otherAddressInfo", example = "Xpress,SIXT R&D Pvt Ltd,Floor 6,Cessna Business Park,Namma Bengaluru", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("otherAddressInfo")
  public String getOtherAddressInfo() {
    return otherAddressInfo;
  }

  public void setOtherAddressInfo(String otherAddressInfo) {
    this.otherAddressInfo = otherAddressInfo;
  }

  public DriverInfo firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
  */
  
  @Schema(name = "firstName", example = "xyz", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("firstName")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public DriverInfo lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
  */
  
  @Schema(name = "lastName", example = "xyz", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastName")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public DriverInfo dvlaDetail(DvlaDetails dvlaDetail) {
    this.dvlaDetail = dvlaDetail;
    return this;
  }

  /**
   * Get dvlaDetail
   * @return dvlaDetail
  */
  @Valid 
  @Schema(name = "dvlaDetail", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dvlaDetail")
  public DvlaDetails getDvlaDetail() {
    return dvlaDetail;
  }

  public void setDvlaDetail(DvlaDetails dvlaDetail) {
    this.dvlaDetail = dvlaDetail;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DriverInfo driverInfo = (DriverInfo) o;
    return Objects.equals(this.passport, driverInfo.passport) &&
        Objects.equals(this.taxId, driverInfo.taxId) &&
        Objects.equals(this.otherAddressInfo, driverInfo.otherAddressInfo) &&
        Objects.equals(this.firstName, driverInfo.firstName) &&
        Objects.equals(this.lastName, driverInfo.lastName) &&
        Objects.equals(this.dvlaDetail, driverInfo.dvlaDetail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(passport, taxId, otherAddressInfo, firstName, lastName, dvlaDetail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DriverInfo {\n");
    sb.append("    passport: ").append(toIndentedString(passport)).append("\n");
    sb.append("    taxId: ").append(toIndentedString(taxId)).append("\n");
    sb.append("    otherAddressInfo: ").append(toIndentedString(otherAddressInfo)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    dvlaDetail: ").append(toIndentedString(dvlaDetail)).append("\n");
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

