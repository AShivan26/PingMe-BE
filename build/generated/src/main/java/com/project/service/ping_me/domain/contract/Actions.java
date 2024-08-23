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
 * Actions
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class Actions {

  private Boolean updateReservation;

  public Actions() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Actions(Boolean updateReservation) {
    this.updateReservation = updateReservation;
  }

  public Actions updateReservation(Boolean updateReservation) {
    this.updateReservation = updateReservation;
    return this;
  }

  /**
   * tells whether to update a reservation is possible or not
   * @return updateReservation
  */
  @NotNull 
  @Schema(name = "updateReservation", description = "tells whether to update a reservation is possible or not", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("updateReservation")
  public Boolean isUpdateReservation() {
    return updateReservation;
  }

  public void setUpdateReservation(Boolean updateReservation) {
    this.updateReservation = updateReservation;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Actions actions = (Actions) o;
    return Objects.equals(this.updateReservation, actions.updateReservation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(updateReservation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Actions {\n");
    sb.append("    updateReservation: ").append(toIndentedString(updateReservation)).append("\n");
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

