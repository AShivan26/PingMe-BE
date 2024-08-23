package com.project.service.ping_me.domain.contract;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.project.service.ping_me.domain.contract.BlockDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * TripSummary
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class TripSummary {

  private String pickupBranch;

  private String returnBranch;

  private BlockDateTime pickupTime;

  private BlockDateTime returnTime;

  private Integer rentalDays;

  public TripSummary() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TripSummary(String pickupBranch, String returnBranch, BlockDateTime pickupTime, BlockDateTime returnTime, Integer rentalDays) {
    this.pickupBranch = pickupBranch;
    this.returnBranch = returnBranch;
    this.pickupTime = pickupTime;
    this.returnTime = returnTime;
    this.rentalDays = rentalDays;
  }

  public TripSummary pickupBranch(String pickupBranch) {
    this.pickupBranch = pickupBranch;
    return this;
  }

  /**
   * Get pickupBranch
   * @return pickupBranch
  */
  @NotNull 
  @Schema(name = "pickupBranch", example = "Miami International Airport", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("pickupBranch")
  public String getPickupBranch() {
    return pickupBranch;
  }

  public void setPickupBranch(String pickupBranch) {
    this.pickupBranch = pickupBranch;
  }

  public TripSummary returnBranch(String returnBranch) {
    this.returnBranch = returnBranch;
    return this;
  }

  /**
   * Get returnBranch
   * @return returnBranch
  */
  @NotNull 
  @Schema(name = "returnBranch", example = "Miami International Airport", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("returnBranch")
  public String getReturnBranch() {
    return returnBranch;
  }

  public void setReturnBranch(String returnBranch) {
    this.returnBranch = returnBranch;
  }

  public TripSummary pickupTime(BlockDateTime pickupTime) {
    this.pickupTime = pickupTime;
    return this;
  }

  /**
   * Get pickupTime
   * @return pickupTime
  */
  @NotNull @Valid 
  @Schema(name = "pickupTime", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("pickupTime")
  public BlockDateTime getPickupTime() {
    return pickupTime;
  }

  public void setPickupTime(BlockDateTime pickupTime) {
    this.pickupTime = pickupTime;
  }

  public TripSummary returnTime(BlockDateTime returnTime) {
    this.returnTime = returnTime;
    return this;
  }

  /**
   * Get returnTime
   * @return returnTime
  */
  @NotNull @Valid 
  @Schema(name = "returnTime", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("returnTime")
  public BlockDateTime getReturnTime() {
    return returnTime;
  }

  public void setReturnTime(BlockDateTime returnTime) {
    this.returnTime = returnTime;
  }

  public TripSummary rentalDays(Integer rentalDays) {
    this.rentalDays = rentalDays;
    return this;
  }

  /**
   * Get rentalDays
   * @return rentalDays
  */
  @NotNull 
  @Schema(name = "rentalDays", example = "5", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("rentalDays")
  public Integer getRentalDays() {
    return rentalDays;
  }

  public void setRentalDays(Integer rentalDays) {
    this.rentalDays = rentalDays;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TripSummary tripSummary = (TripSummary) o;
    return Objects.equals(this.pickupBranch, tripSummary.pickupBranch) &&
        Objects.equals(this.returnBranch, tripSummary.returnBranch) &&
        Objects.equals(this.pickupTime, tripSummary.pickupTime) &&
        Objects.equals(this.returnTime, tripSummary.returnTime) &&
        Objects.equals(this.rentalDays, tripSummary.rentalDays);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pickupBranch, returnBranch, pickupTime, returnTime, rentalDays);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TripSummary {\n");
    sb.append("    pickupBranch: ").append(toIndentedString(pickupBranch)).append("\n");
    sb.append("    returnBranch: ").append(toIndentedString(returnBranch)).append("\n");
    sb.append("    pickupTime: ").append(toIndentedString(pickupTime)).append("\n");
    sb.append("    returnTime: ").append(toIndentedString(returnTime)).append("\n");
    sb.append("    rentalDays: ").append(toIndentedString(rentalDays)).append("\n");
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

