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
 * DvlaDetails
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class DvlaDetails {

  private String dvlaCode;

  private String penaltyPoint;

  public DvlaDetails dvlaCode(String dvlaCode) {
    this.dvlaCode = dvlaCode;
    return this;
  }

  /**
   * Get dvlaCode
   * @return dvlaCode
  */
  
  @Schema(name = "dvlaCode", example = "rGJ7m2nq", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dvlaCode")
  public String getDvlaCode() {
    return dvlaCode;
  }

  public void setDvlaCode(String dvlaCode) {
    this.dvlaCode = dvlaCode;
  }

  public DvlaDetails penaltyPoint(String penaltyPoint) {
    this.penaltyPoint = penaltyPoint;
    return this;
  }

  /**
   * Get penaltyPoint
   * @return penaltyPoint
  */
  
  @Schema(name = "penaltyPoint", example = "5", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("penaltyPoint")
  public String getPenaltyPoint() {
    return penaltyPoint;
  }

  public void setPenaltyPoint(String penaltyPoint) {
    this.penaltyPoint = penaltyPoint;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DvlaDetails dvlaDetails = (DvlaDetails) o;
    return Objects.equals(this.dvlaCode, dvlaDetails.dvlaCode) &&
        Objects.equals(this.penaltyPoint, dvlaDetails.penaltyPoint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dvlaCode, penaltyPoint);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DvlaDetails {\n");
    sb.append("    dvlaCode: ").append(toIndentedString(dvlaCode)).append("\n");
    sb.append("    penaltyPoint: ").append(toIndentedString(penaltyPoint)).append("\n");
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

