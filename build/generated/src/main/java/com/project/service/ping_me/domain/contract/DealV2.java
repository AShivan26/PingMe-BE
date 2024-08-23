package com.project.service.ping_me.domain.contract;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.project.service.ping_me.domain.contract.PriceV2;
import com.project.service.ping_me.domain.contract.VehicleV2;
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
 * DealV2
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class DealV2 {

  private VehicleV2 vehicle;

  private PriceV2 pricing;

  private String dealInfo;

  @Valid
  private List<String> tags;

  public DealV2() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DealV2(VehicleV2 vehicle, String dealInfo) {
    this.vehicle = vehicle;
    this.dealInfo = dealInfo;
  }

  public DealV2 vehicle(VehicleV2 vehicle) {
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
  public VehicleV2 getVehicle() {
    return vehicle;
  }

  public void setVehicle(VehicleV2 vehicle) {
    this.vehicle = vehicle;
  }

  public DealV2 pricing(PriceV2 pricing) {
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
  public PriceV2 getPricing() {
    return pricing;
  }

  public void setPricing(PriceV2 pricing) {
    this.pricing = pricing;
  }

  public DealV2 dealInfo(String dealInfo) {
    this.dealInfo = dealInfo;
    return this;
  }

  /**
   * the field will denote what type of deal possible values BOOKED_CATEGORY, DISCOUNT, COMPLIMENTARY, GUARANTEED_MODEL
   * @return dealInfo
  */
  @NotNull 
  @Schema(name = "dealInfo", description = "the field will denote what type of deal possible values BOOKED_CATEGORY, DISCOUNT, COMPLIMENTARY, GUARANTEED_MODEL", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("dealInfo")
  public String getDealInfo() {
    return dealInfo;
  }

  public void setDealInfo(String dealInfo) {
    this.dealInfo = dealInfo;
  }

  public DealV2 tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public DealV2 addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * in case of tags to be shown for the vehicle card eg- new vehicle, recommended etc.
   * @return tags
  */
  
  @Schema(name = "tags", description = "in case of tags to be shown for the vehicle card eg- new vehicle, recommended etc.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tags")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DealV2 dealV2 = (DealV2) o;
    return Objects.equals(this.vehicle, dealV2.vehicle) &&
        Objects.equals(this.pricing, dealV2.pricing) &&
        Objects.equals(this.dealInfo, dealV2.dealInfo) &&
        Objects.equals(this.tags, dealV2.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vehicle, pricing, dealInfo, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DealV2 {\n");
    sb.append("    vehicle: ").append(toIndentedString(vehicle)).append("\n");
    sb.append("    pricing: ").append(toIndentedString(pricing)).append("\n");
    sb.append("    dealInfo: ").append(toIndentedString(dealInfo)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

