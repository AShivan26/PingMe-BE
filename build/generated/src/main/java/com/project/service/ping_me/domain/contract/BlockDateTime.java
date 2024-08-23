package com.project.service.ping_me.domain.contract;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * BlockDateTime represents the time for which a rental activity will be returned back to RA_RESERVATION.
 */

@Schema(name = "BlockDateTime", description = "BlockDateTime represents the time for which a rental activity will be returned back to RA_RESERVATION.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class BlockDateTime {

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime date;

  private String timeZone;

  public BlockDateTime date(OffsetDateTime date) {
    this.date = date;
    return this;
  }

  /**
   * The time at which the Ra status will automatically be changed to RA_RESERVATION. Timestamp is RFC-3339
   * @return date
  */
  @Valid 
  @Schema(name = "date", example = "2006-01-02T15:04:05+07:00", description = "The time at which the Ra status will automatically be changed to RA_RESERVATION. Timestamp is RFC-3339", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("date")
  public OffsetDateTime getDate() {
    return date;
  }

  public void setDate(OffsetDateTime date) {
    this.date = date;
  }

  public BlockDateTime timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

  /**
   * Get timeZone
   * @return timeZone
  */
  
  @Schema(name = "timeZone", example = "America/New_York", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    BlockDateTime blockDateTime = (BlockDateTime) o;
    return Objects.equals(this.date, blockDateTime.date) &&
        Objects.equals(this.timeZone, blockDateTime.timeZone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, timeZone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlockDateTime {\n");
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

