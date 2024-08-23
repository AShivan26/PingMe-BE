package com.project.service.ping_me.domain.contract;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.project.service.ping_me.domain.contract.InstructionDetailItem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * InstructionDetails
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class InstructionDetails {

  private String title;

  @Valid
  private List<@Valid InstructionDetailItem> details = new ArrayList<>();

  public InstructionDetails() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public InstructionDetails(String title, List<@Valid InstructionDetailItem> details) {
    this.title = title;
    this.details = details;
  }

  public InstructionDetails title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  */
  @NotNull 
  @Schema(name = "title", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public InstructionDetails details(List<@Valid InstructionDetailItem> details) {
    this.details = details;
    return this;
  }

  public InstructionDetails addDetailsItem(InstructionDetailItem detailsItem) {
    if (this.details == null) {
      this.details = new ArrayList<>();
    }
    this.details.add(detailsItem);
    return this;
  }

  /**
   * Get details
   * @return details
  */
  @NotNull @Valid 
  @Schema(name = "details", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("details")
  public List<@Valid InstructionDetailItem> getDetails() {
    return details;
  }

  public void setDetails(List<@Valid InstructionDetailItem> details) {
    this.details = details;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstructionDetails instructionDetails = (InstructionDetails) o;
    return Objects.equals(this.title, instructionDetails.title) &&
        Objects.equals(this.details, instructionDetails.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, details);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstructionDetails {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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

