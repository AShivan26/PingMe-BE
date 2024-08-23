package com.project.service.ping_me.domain.contract;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.project.service.ping_me.domain.contract.BlockDateTime;
import com.project.service.ping_me.domain.contract.Deal;
import com.project.service.ping_me.domain.contract.Filter;
import com.project.service.ping_me.domain.contract.IDs;
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
 * VehicleSelectionResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class VehicleSelectionResponse {

  private IDs internalIds;

  private String configurationId;

  @Valid
  private List<@Valid Deal> deals = new ArrayList<>();

  private String bannerMessage;

  private String bottomPopUpMessage;

  private Deal blockedDealVehicle;

  private BlockDateTime blockDateTime;

  private Filter filter;

  private Boolean hasWinterTyreWarning;

  private String winterTyreMessage;

  public VehicleSelectionResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VehicleSelectionResponse(IDs internalIds, String configurationId, List<@Valid Deal> deals, Filter filter, Boolean hasWinterTyreWarning) {
    this.internalIds = internalIds;
    this.configurationId = configurationId;
    this.deals = deals;
    this.filter = filter;
    this.hasWinterTyreWarning = hasWinterTyreWarning;
  }

  public VehicleSelectionResponse internalIds(IDs internalIds) {
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

  public VehicleSelectionResponse configurationId(String configurationId) {
    this.configurationId = configurationId;
    return this;
  }

  /**
   * Get configurationId
   * @return configurationId
  */
  @NotNull 
  @Schema(name = "configurationId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("configurationId")
  public String getConfigurationId() {
    return configurationId;
  }

  public void setConfigurationId(String configurationId) {
    this.configurationId = configurationId;
  }

  public VehicleSelectionResponse deals(List<@Valid Deal> deals) {
    this.deals = deals;
    return this;
  }

  public VehicleSelectionResponse addDealsItem(Deal dealsItem) {
    if (this.deals == null) {
      this.deals = new ArrayList<>();
    }
    this.deals.add(dealsItem);
    return this;
  }

  /**
   * Get deals
   * @return deals
  */
  @NotNull @Valid 
  @Schema(name = "deals", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("deals")
  public List<@Valid Deal> getDeals() {
    return deals;
  }

  public void setDeals(List<@Valid Deal> deals) {
    this.deals = deals;
  }

  public VehicleSelectionResponse bannerMessage(String bannerMessage) {
    this.bannerMessage = bannerMessage;
    return this;
  }

  /**
   * Get bannerMessage
   * @return bannerMessage
  */
  
  @Schema(name = "bannerMessage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bannerMessage")
  public String getBannerMessage() {
    return bannerMessage;
  }

  public void setBannerMessage(String bannerMessage) {
    this.bannerMessage = bannerMessage;
  }

  public VehicleSelectionResponse bottomPopUpMessage(String bottomPopUpMessage) {
    this.bottomPopUpMessage = bottomPopUpMessage;
    return this;
  }

  /**
   * In case of the branch is going to close in less than 2 hours and greater than 1 hour. the BE sends a message (i.e. Branch will be closing in XX mins ensure you pick up key before branch closes).
   * @return bottomPopUpMessage
  */
  
  @Schema(name = "bottomPopUpMessage", description = "In case of the branch is going to close in less than 2 hours and greater than 1 hour. the BE sends a message (i.e. Branch will be closing in XX mins ensure you pick up key before branch closes).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bottomPopUpMessage")
  public String getBottomPopUpMessage() {
    return bottomPopUpMessage;
  }

  public void setBottomPopUpMessage(String bottomPopUpMessage) {
    this.bottomPopUpMessage = bottomPopUpMessage;
  }

  public VehicleSelectionResponse blockedDealVehicle(Deal blockedDealVehicle) {
    this.blockedDealVehicle = blockedDealVehicle;
    return this;
  }

  /**
   * Get blockedDealVehicle
   * @return blockedDealVehicle
  */
  @Valid 
  @Schema(name = "blockedDealVehicle", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("blockedDealVehicle")
  public Deal getBlockedDealVehicle() {
    return blockedDealVehicle;
  }

  public void setBlockedDealVehicle(Deal blockedDealVehicle) {
    this.blockedDealVehicle = blockedDealVehicle;
  }

  public VehicleSelectionResponse blockDateTime(BlockDateTime blockDateTime) {
    this.blockDateTime = blockDateTime;
    return this;
  }

  /**
   * Get blockDateTime
   * @return blockDateTime
  */
  @Valid 
  @Schema(name = "blockDateTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("blockDateTime")
  public BlockDateTime getBlockDateTime() {
    return blockDateTime;
  }

  public void setBlockDateTime(BlockDateTime blockDateTime) {
    this.blockDateTime = blockDateTime;
  }

  public VehicleSelectionResponse filter(Filter filter) {
    this.filter = filter;
    return this;
  }

  /**
   * Get filter
   * @return filter
  */
  @NotNull @Valid 
  @Schema(name = "filter", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("filter")
  public Filter getFilter() {
    return filter;
  }

  public void setFilter(Filter filter) {
    this.filter = filter;
  }

  public VehicleSelectionResponse hasWinterTyreWarning(Boolean hasWinterTyreWarning) {
    this.hasWinterTyreWarning = hasWinterTyreWarning;
    return this;
  }

  /**
   * returns true if there is winter season for particular pickup branch.
   * @return hasWinterTyreWarning
  */
  @NotNull 
  @Schema(name = "hasWinterTyreWarning", description = "returns true if there is winter season for particular pickup branch.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("hasWinterTyreWarning")
  public Boolean isHasWinterTyreWarning() {
    return hasWinterTyreWarning;
  }

  public void setHasWinterTyreWarning(Boolean hasWinterTyreWarning) {
    this.hasWinterTyreWarning = hasWinterTyreWarning;
  }

  public VehicleSelectionResponse winterTyreMessage(String winterTyreMessage) {
    this.winterTyreMessage = winterTyreMessage;
    return this;
  }

  /**
   * This vehicle is equipped with summer tires. Vehicle may not be used under Winter road conditions (ice, snow, clear, ice, packed show, snow, slush etc.). Do you still confirm to take the vehicle?
   * @return winterTyreMessage
  */
  
  @Schema(name = "winterTyreMessage", description = "This vehicle is equipped with summer tires. Vehicle may not be used under Winter road conditions (ice, snow, clear, ice, packed show, snow, slush etc.). Do you still confirm to take the vehicle?", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("winterTyreMessage")
  public String getWinterTyreMessage() {
    return winterTyreMessage;
  }

  public void setWinterTyreMessage(String winterTyreMessage) {
    this.winterTyreMessage = winterTyreMessage;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VehicleSelectionResponse vehicleSelectionResponse = (VehicleSelectionResponse) o;
    return Objects.equals(this.internalIds, vehicleSelectionResponse.internalIds) &&
        Objects.equals(this.configurationId, vehicleSelectionResponse.configurationId) &&
        Objects.equals(this.deals, vehicleSelectionResponse.deals) &&
        Objects.equals(this.bannerMessage, vehicleSelectionResponse.bannerMessage) &&
        Objects.equals(this.bottomPopUpMessage, vehicleSelectionResponse.bottomPopUpMessage) &&
        Objects.equals(this.blockedDealVehicle, vehicleSelectionResponse.blockedDealVehicle) &&
        Objects.equals(this.blockDateTime, vehicleSelectionResponse.blockDateTime) &&
        Objects.equals(this.filter, vehicleSelectionResponse.filter) &&
        Objects.equals(this.hasWinterTyreWarning, vehicleSelectionResponse.hasWinterTyreWarning) &&
        Objects.equals(this.winterTyreMessage, vehicleSelectionResponse.winterTyreMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(internalIds, configurationId, deals, bannerMessage, bottomPopUpMessage, blockedDealVehicle, blockDateTime, filter, hasWinterTyreWarning, winterTyreMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleSelectionResponse {\n");
    sb.append("    internalIds: ").append(toIndentedString(internalIds)).append("\n");
    sb.append("    configurationId: ").append(toIndentedString(configurationId)).append("\n");
    sb.append("    deals: ").append(toIndentedString(deals)).append("\n");
    sb.append("    bannerMessage: ").append(toIndentedString(bannerMessage)).append("\n");
    sb.append("    bottomPopUpMessage: ").append(toIndentedString(bottomPopUpMessage)).append("\n");
    sb.append("    blockedDealVehicle: ").append(toIndentedString(blockedDealVehicle)).append("\n");
    sb.append("    blockDateTime: ").append(toIndentedString(blockDateTime)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    hasWinterTyreWarning: ").append(toIndentedString(hasWinterTyreWarning)).append("\n");
    sb.append("    winterTyreMessage: ").append(toIndentedString(winterTyreMessage)).append("\n");
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

