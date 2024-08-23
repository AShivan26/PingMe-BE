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
 * TermsAndConditionsUrls
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class TermsAndConditionsUrls {

  private String rentalInfo;

  private String termsAndConditions;

  public TermsAndConditionsUrls() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TermsAndConditionsUrls(String rentalInfo, String termsAndConditions) {
    this.rentalInfo = rentalInfo;
    this.termsAndConditions = termsAndConditions;
  }

  public TermsAndConditionsUrls rentalInfo(String rentalInfo) {
    this.rentalInfo = rentalInfo;
    return this;
  }

  /**
   * Get rentalInfo
   * @return rentalInfo
  */
  @NotNull 
  @Schema(name = "rentalInfo", example = "https://www.sixt.com/php/terms/view?liso=US&rtar=000&view=EPP&tlang=en_US", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("rentalInfo")
  public String getRentalInfo() {
    return rentalInfo;
  }

  public void setRentalInfo(String rentalInfo) {
    this.rentalInfo = rentalInfo;
  }

  public TermsAndConditionsUrls termsAndConditions(String termsAndConditions) {
    this.termsAndConditions = termsAndConditions;
    return this;
  }

  /**
   * Get termsAndConditions
   * @return termsAndConditions
  */
  @NotNull 
  @Schema(name = "termsAndConditions", example = "https://www.sixt.de/fileadmin/sys/agb/sixt_US_en.pdf", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("termsAndConditions")
  public String getTermsAndConditions() {
    return termsAndConditions;
  }

  public void setTermsAndConditions(String termsAndConditions) {
    this.termsAndConditions = termsAndConditions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TermsAndConditionsUrls termsAndConditionsUrls = (TermsAndConditionsUrls) o;
    return Objects.equals(this.rentalInfo, termsAndConditionsUrls.rentalInfo) &&
        Objects.equals(this.termsAndConditions, termsAndConditionsUrls.termsAndConditions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rentalInfo, termsAndConditions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TermsAndConditionsUrls {\n");
    sb.append("    rentalInfo: ").append(toIndentedString(rentalInfo)).append("\n");
    sb.append("    termsAndConditions: ").append(toIndentedString(termsAndConditions)).append("\n");
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

