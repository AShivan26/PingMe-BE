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
 * Corporate details object
 */

@Schema(name = "CorporateDetails", description = "Corporate details object")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CorporateDetails {

  private String companyName;

  private String corporateTaxId;

  public CorporateDetails companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

  /**
   * Get companyName
   * @return companyName
  */
  
  @Schema(name = "companyName", example = "LCT SPA", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("companyName")
  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public CorporateDetails corporateTaxId(String corporateTaxId) {
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
    CorporateDetails corporateDetails = (CorporateDetails) o;
    return Objects.equals(this.companyName, corporateDetails.companyName) &&
        Objects.equals(this.corporateTaxId, corporateDetails.corporateTaxId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyName, corporateTaxId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CorporateDetails {\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
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

