package com.project.service.ping_me.domain.contract;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * PassportOrIDCardDetails
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class PassportOrIDCardDetails {

  private String idNumber;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate dateOfIssue;

  private String issuingCountryCode;

  public PassportOrIDCardDetails idNumber(String idNumber) {
    this.idNumber = idNumber;
    return this;
  }

  /**
   * Get idNumber
   * @return idNumber
  */
  
  @Schema(name = "idNumber", example = "AF 2637468", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("idNumber")
  public String getIdNumber() {
    return idNumber;
  }

  public void setIdNumber(String idNumber) {
    this.idNumber = idNumber;
  }

  public PassportOrIDCardDetails dateOfIssue(LocalDate dateOfIssue) {
    this.dateOfIssue = dateOfIssue;
    return this;
  }

  /**
   * the date of the passport issue.
   * @return dateOfIssue
  */
  @Valid 
  @Schema(name = "dateOfIssue", example = "Sun Mar 26 20:00:00 EDT 2023", description = "the date of the passport issue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dateOfIssue")
  public LocalDate getDateOfIssue() {
    return dateOfIssue;
  }

  public void setDateOfIssue(LocalDate dateOfIssue) {
    this.dateOfIssue = dateOfIssue;
  }

  public PassportOrIDCardDetails issuingCountryCode(String issuingCountryCode) {
    this.issuingCountryCode = issuingCountryCode;
    return this;
  }

  /**
   * Get issuingCountryCode
   * @return issuingCountryCode
  */
  @Pattern(regexp = "^.{2}$") 
  @Schema(name = "issuingCountryCode", example = "ES", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("issuingCountryCode")
  public String getIssuingCountryCode() {
    return issuingCountryCode;
  }

  public void setIssuingCountryCode(String issuingCountryCode) {
    this.issuingCountryCode = issuingCountryCode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PassportOrIDCardDetails passportOrIDCardDetails = (PassportOrIDCardDetails) o;
    return Objects.equals(this.idNumber, passportOrIDCardDetails.idNumber) &&
        Objects.equals(this.dateOfIssue, passportOrIDCardDetails.dateOfIssue) &&
        Objects.equals(this.issuingCountryCode, passportOrIDCardDetails.issuingCountryCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idNumber, dateOfIssue, issuingCountryCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PassportOrIDCardDetails {\n");
    sb.append("    idNumber: ").append(toIndentedString(idNumber)).append("\n");
    sb.append("    dateOfIssue: ").append(toIndentedString(dateOfIssue)).append("\n");
    sb.append("    issuingCountryCode: ").append(toIndentedString(issuingCountryCode)).append("\n");
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

