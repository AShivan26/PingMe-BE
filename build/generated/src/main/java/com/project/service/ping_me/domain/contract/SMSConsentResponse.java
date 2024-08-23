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
 * SMSConsentResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class SMSConsentResponse {

  private String mobileNumber;

  private Boolean isSMSOpted;

  public SMSConsentResponse mobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
    return this;
  }

  /**
   * the mobile-number already present in rental-activity
   * @return mobileNumber
  */
  
  @Schema(name = "mobileNumber", example = "+9107*******65", description = "the mobile-number already present in rental-activity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mobileNumber")
  public String getMobileNumber() {
    return mobileNumber;
  }

  public void setMobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
  }

  public SMSConsentResponse isSMSOpted(Boolean isSMSOpted) {
    this.isSMSOpted = isSMSOpted;
    return this;
  }

  /**
   * determines if SMS consent is given or not.
   * @return isSMSOpted
  */
  
  @Schema(name = "isSMSOpted", example = "false", description = "determines if SMS consent is given or not.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isSMSOpted")
  public Boolean isIsSMSOpted() {
    return isSMSOpted;
  }

  public void setIsSMSOpted(Boolean isSMSOpted) {
    this.isSMSOpted = isSMSOpted;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SMSConsentResponse smSConsentResponse = (SMSConsentResponse) o;
    return Objects.equals(this.mobileNumber, smSConsentResponse.mobileNumber) &&
        Objects.equals(this.isSMSOpted, smSConsentResponse.isSMSOpted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mobileNumber, isSMSOpted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SMSConsentResponse {\n");
    sb.append("    mobileNumber: ").append(toIndentedString(mobileNumber)).append("\n");
    sb.append("    isSMSOpted: ").append(toIndentedString(isSMSOpted)).append("\n");
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

