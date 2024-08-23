package com.project.service.ping_me.domain.contract;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.project.service.ping_me.domain.contract.IDs;
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
 * VehicleBlockDateTime represents the response payload after blocking a vehicle to a rental activity.
 */

@Schema(name = "VehicleBlockDateTime", description = "VehicleBlockDateTime represents the response payload after blocking a vehicle to a rental activity.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class VehicleBlockDateTime {

  private IDs internalIds;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime date;

  private String timeZone;

  public VehicleBlockDateTime() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VehicleBlockDateTime(IDs internalIds) {
    this.internalIds = internalIds;
  }

  public VehicleBlockDateTime internalIds(IDs internalIds) {
    this.internalIds = internalIds;
    return this;
  }

  /**
   * Get internalIds
   * @return internalIds
  */
  @NotNull @Valid 
  @Schema(name = "internalIds", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("internalIds")
  public IDs getInternalIds() {
    return internalIds;
  }

  public void setInternalIds(IDs internalIds) {
    this.internalIds = internalIds;
  }

  public VehicleBlockDateTime date(OffsetDateTime date) {
    this.date = date;
    return this;
  }

  /**
   * The time at which the vehicle will automatically be unblocked. Timestamp is RFC-3339
   * @return date
  */
  @Valid 
  @Schema(name = "date", example = "2006-01-02T15:04:05+07:00", description = "The time at which the vehicle will automatically be unblocked. Timestamp is RFC-3339", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("date")
  public OffsetDateTime getDate() {
    return date;
  }

  public void setDate(OffsetDateTime date) {
    this.date = date;
  }

  public VehicleBlockDateTime timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

  /**
   * Get timeZone
   * @return timeZone
  */
  
  @Schema(name = "timeZone", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("timeZone")
  public String getTimeZone() {
    return timeZone;
  }

  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VehicleBlockDateTime vehicleBlockDateTime = (VehicleBlockDateTime) o;
    return Objects.equals(this.internalIds, vehicleBlockDateTime.internalIds) &&
        Objects.equals(this.date, vehicleBlockDateTime.date) &&
        Objects.equals(this.timeZone, vehicleBlockDateTime.timeZone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(internalIds, date, timeZone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleBlockDateTime {\n");
    sb.append("    internalIds: ").append(toIndentedString(internalIds)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
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

