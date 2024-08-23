package com.project.service.ping_me.domain.contract;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.project.service.ping_me.domain.contract.Location;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Trip
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class Trip {

  private Location pickupBranch;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime pickupDateTime;

  private String pickupTimeZone;

  private Location returnBranch;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime returnDateTime;

  private String returnTimeZone;

  public Trip() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Trip(Location pickupBranch, OffsetDateTime pickupDateTime, String pickupTimeZone, Location returnBranch, OffsetDateTime returnDateTime, String returnTimeZone) {
    this.pickupBranch = pickupBranch;
    this.pickupDateTime = pickupDateTime;
    this.pickupTimeZone = pickupTimeZone;
    this.returnBranch = returnBranch;
    this.returnDateTime = returnDateTime;
    this.returnTimeZone = returnTimeZone;
  }

  public Trip pickupBranch(Location pickupBranch) {
    this.pickupBranch = pickupBranch;
    return this;
  }

  /**
   * Get pickupBranch
   * @return pickupBranch
  */
  @NotNull @Valid 
  @Schema(name = "pickupBranch", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("pickupBranch")
  public Location getPickupBranch() {
    return pickupBranch;
  }

  public void setPickupBranch(Location pickupBranch) {
    this.pickupBranch = pickupBranch;
  }

  public Trip pickupDateTime(OffsetDateTime pickupDateTime) {
    this.pickupDateTime = pickupDateTime;
    return this;
  }

  /**
   * the date time of the pickup with timezone
   * @return pickupDateTime
  */
  @NotNull @Valid 
  @Schema(name = "pickupDateTime", example = "2021-07-30T10:00+02:00", description = "the date time of the pickup with timezone", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("pickupDateTime")
  public OffsetDateTime getPickupDateTime() {
    return pickupDateTime;
  }

  public void setPickupDateTime(OffsetDateTime pickupDateTime) {
    this.pickupDateTime = pickupDateTime;
  }

  public Trip pickupTimeZone(String pickupTimeZone) {
    this.pickupTimeZone = pickupTimeZone;
    return this;
  }

  /**
   * Get pickupTimeZone
   * @return pickupTimeZone
  */
  @NotNull 
  @Schema(name = "pickupTimeZone", example = "America/New_York", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("pickupTimeZone")
  public String getPickupTimeZone() {
    return pickupTimeZone;
  }

  public void setPickupTimeZone(String pickupTimeZone) {
    this.pickupTimeZone = pickupTimeZone;
  }

  public Trip returnBranch(Location returnBranch) {
    this.returnBranch = returnBranch;
    return this;
  }

  /**
   * Get returnBranch
   * @return returnBranch
  */
  @NotNull @Valid 
  @Schema(name = "returnBranch", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("returnBranch")
  public Location getReturnBranch() {
    return returnBranch;
  }

  public void setReturnBranch(Location returnBranch) {
    this.returnBranch = returnBranch;
  }

  public Trip returnDateTime(OffsetDateTime returnDateTime) {
    this.returnDateTime = returnDateTime;
    return this;
  }

  /**
   * the date time of the return with timezone
   * @return returnDateTime
  */
  @NotNull @Valid 
  @Schema(name = "returnDateTime", example = "2021-07-30T10:00+02:00", description = "the date time of the return with timezone", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("returnDateTime")
  public OffsetDateTime getReturnDateTime() {
    return returnDateTime;
  }

  public void setReturnDateTime(OffsetDateTime returnDateTime) {
    this.returnDateTime = returnDateTime;
  }

  public Trip returnTimeZone(String returnTimeZone) {
    this.returnTimeZone = returnTimeZone;
    return this;
  }

  /**
   * Get returnTimeZone
   * @return returnTimeZone
  */
  @NotNull 
  @Schema(name = "returnTimeZone", example = "America/New_York", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("returnTimeZone")
  public String getReturnTimeZone() {
    return returnTimeZone;
  }

  public void setReturnTimeZone(String returnTimeZone) {
    this.returnTimeZone = returnTimeZone;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Trip trip = (Trip) o;
    return Objects.equals(this.pickupBranch, trip.pickupBranch) &&
        Objects.equals(this.pickupDateTime, trip.pickupDateTime) &&
        Objects.equals(this.pickupTimeZone, trip.pickupTimeZone) &&
        Objects.equals(this.returnBranch, trip.returnBranch) &&
        Objects.equals(this.returnDateTime, trip.returnDateTime) &&
        Objects.equals(this.returnTimeZone, trip.returnTimeZone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pickupBranch, pickupDateTime, pickupTimeZone, returnBranch, returnDateTime, returnTimeZone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Trip {\n");
    sb.append("    pickupBranch: ").append(toIndentedString(pickupBranch)).append("\n");
    sb.append("    pickupDateTime: ").append(toIndentedString(pickupDateTime)).append("\n");
    sb.append("    pickupTimeZone: ").append(toIndentedString(pickupTimeZone)).append("\n");
    sb.append("    returnBranch: ").append(toIndentedString(returnBranch)).append("\n");
    sb.append("    returnDateTime: ").append(toIndentedString(returnDateTime)).append("\n");
    sb.append("    returnTimeZone: ").append(toIndentedString(returnTimeZone)).append("\n");
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

