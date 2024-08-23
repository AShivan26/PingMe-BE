package com.project.service.ping_me.domain.contract;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.project.service.ping_me.domain.contract.DealInfo;
import com.project.service.ping_me.domain.contract.PriceInfo;
import com.project.service.ping_me.domain.contract.Vehicle;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Deal
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class Deal {

  private Vehicle vehicle;

  private PriceInfo pricing;

  private DealInfo dealInfo;

  public Deal() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Deal(Vehicle vehicle, DealInfo dealInfo) {
    this.vehicle = vehicle;
    this.dealInfo = dealInfo;
  }

  public Deal vehicle(Vehicle vehicle) {
    this.vehicle = vehicle;
    return this;
  }

  /**
   * Get vehicle
   * @return vehicle
  */
  @NotNull @Valid 
  @Schema(name = "vehicle", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("vehicle")
  public Vehicle getVehicle() {
    return vehicle;
  }

  public void setVehicle(Vehicle vehicle) {
    this.vehicle = vehicle;
  }

  public Deal pricing(PriceInfo pricing) {
    this.pricing = pricing;
    return this;
  }

  /**
   * Get pricing
   * @return pricing
  */
  @Valid 
  @Schema(name = "pricing", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pricing")
  public PriceInfo getPricing() {
    return pricing;
  }

  public void setPricing(PriceInfo pricing) {
    this.pricing = pricing;
  }

  public Deal dealInfo(DealInfo dealInfo) {
    this.dealInfo = dealInfo;
    return this;
  }

  /**
   * Get dealInfo
   * @return dealInfo
  */
  @NotNull @Valid 
  @Schema(name = "dealInfo", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("dealInfo")
  public DealInfo getDealInfo() {
    return dealInfo;
  }

  public void setDealInfo(DealInfo dealInfo) {
    this.dealInfo = dealInfo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Deal deal = (Deal) o;
    return Objects.equals(this.vehicle, deal.vehicle) &&
        Objects.equals(this.pricing, deal.pricing) &&
        Objects.equals(this.dealInfo, deal.dealInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vehicle, pricing, dealInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Deal {\n");
    sb.append("    vehicle: ").append(toIndentedString(vehicle)).append("\n");
    sb.append("    pricing: ").append(toIndentedString(pricing)).append("\n");
    sb.append("    dealInfo: ").append(toIndentedString(dealInfo)).append("\n");
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

