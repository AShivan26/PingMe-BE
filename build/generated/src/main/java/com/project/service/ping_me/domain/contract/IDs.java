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
 * Reservation ID, rental activity ID for the booking
 */

@Schema(name = "IDs", description = "Reservation ID, rental activity ID for the booking")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class IDs {

  private String reservationId;

  public IDs() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public IDs(String reservationId) {
    this.reservationId = reservationId;
  }

  public IDs reservationId(String reservationId) {
    this.reservationId = reservationId;
    return this;
  }

  /**
   * Get reservationId
   * @return reservationId
  */
  @NotNull 
  @Schema(name = "reservationId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("reservationId")
  public String getReservationId() {
    return reservationId;
  }

  public void setReservationId(String reservationId) {
    this.reservationId = reservationId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IDs ids = (IDs) o;
    return Objects.equals(this.reservationId, ids.reservationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reservationId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IDs {\n");
    sb.append("    reservationId: ").append(toIndentedString(reservationId)).append("\n");
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

