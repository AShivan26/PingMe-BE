package com.project.service.ping_me.domain.contract;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.project.service.ping_me.domain.contract.BlockDateTime;
import com.project.service.ping_me.domain.contract.DealV2;
import com.project.service.ping_me.domain.contract.Filter;
import com.project.service.ping_me.domain.contract.Message;
import com.project.service.ping_me.domain.contract.QuickFilter;
import com.project.service.ping_me.domain.contract.Terminal;
import com.project.service.ping_me.domain.contract.VehicleLessCheckin;
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
 * VehicleListResponseV2
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class VehicleListResponseV2 {

  private String reservationId;

  @Valid
  private List<@Valid DealV2> deals = new ArrayList<>();

  private Integer totalVehicles;

  private Message bannerMessage;

  private String bottomPopUpMessage;

  private DealV2 blockedDealVehicle;

  private BlockDateTime reservationBlockDateTime;

  private Filter filter;

  @Valid
  private List<@Valid QuickFilter> quickFilters;

  @Valid
  private List<@Valid Terminal> terminalList;

  private VehicleLessCheckin vehicleLessCheckin;

  public VehicleListResponseV2() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VehicleListResponseV2(String reservationId, List<@Valid DealV2> deals) {
    this.reservationId = reservationId;
    this.deals = deals;
  }

  public VehicleListResponseV2 reservationId(String reservationId) {
    this.reservationId = reservationId;
    return this;
  }

  /**
   * Reservation ID, rental activity ID for the booking
   * @return reservationId
  */
  @NotNull 
  @Schema(name = "reservationId", description = "Reservation ID, rental activity ID for the booking", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("reservationId")
  public String getReservationId() {
    return reservationId;
  }

  public void setReservationId(String reservationId) {
    this.reservationId = reservationId;
  }

  public VehicleListResponseV2 deals(List<@Valid DealV2> deals) {
    this.deals = deals;
    return this;
  }

  public VehicleListResponseV2 addDealsItem(DealV2 dealsItem) {
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
  public List<@Valid DealV2> getDeals() {
    return deals;
  }

  public void setDeals(List<@Valid DealV2> deals) {
    this.deals = deals;
  }

  public VehicleListResponseV2 totalVehicles(Integer totalVehicles) {
    this.totalVehicles = totalVehicles;
    return this;
  }

  /**
   * Field will have the total number of vehicles available which the user can browse through.
   * @return totalVehicles
  */
  
  @Schema(name = "totalVehicles", description = "Field will have the total number of vehicles available which the user can browse through.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalVehicles")
  public Integer getTotalVehicles() {
    return totalVehicles;
  }

  public void setTotalVehicles(Integer totalVehicles) {
    this.totalVehicles = totalVehicles;
  }

  public VehicleListResponseV2 bannerMessage(Message bannerMessage) {
    this.bannerMessage = bannerMessage;
    return this;
  }

  /**
   * Get bannerMessage
   * @return bannerMessage
  */
  @Valid 
  @Schema(name = "bannerMessage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bannerMessage")
  public Message getBannerMessage() {
    return bannerMessage;
  }

  public void setBannerMessage(Message bannerMessage) {
    this.bannerMessage = bannerMessage;
  }

  public VehicleListResponseV2 bottomPopUpMessage(String bottomPopUpMessage) {
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

  public VehicleListResponseV2 blockedDealVehicle(DealV2 blockedDealVehicle) {
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
  public DealV2 getBlockedDealVehicle() {
    return blockedDealVehicle;
  }

  public void setBlockedDealVehicle(DealV2 blockedDealVehicle) {
    this.blockedDealVehicle = blockedDealVehicle;
  }

  public VehicleListResponseV2 reservationBlockDateTime(BlockDateTime reservationBlockDateTime) {
    this.reservationBlockDateTime = reservationBlockDateTime;
    return this;
  }

  /**
   * Get reservationBlockDateTime
   * @return reservationBlockDateTime
  */
  @Valid 
  @Schema(name = "reservationBlockDateTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reservationBlockDateTime")
  public BlockDateTime getReservationBlockDateTime() {
    return reservationBlockDateTime;
  }

  public void setReservationBlockDateTime(BlockDateTime reservationBlockDateTime) {
    this.reservationBlockDateTime = reservationBlockDateTime;
  }

  public VehicleListResponseV2 filter(Filter filter) {
    this.filter = filter;
    return this;
  }

  /**
   * Get filter
   * @return filter
  */
  @Valid 
  @Schema(name = "filter", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("filter")
  public Filter getFilter() {
    return filter;
  }

  public void setFilter(Filter filter) {
    this.filter = filter;
  }

  public VehicleListResponseV2 quickFilters(List<@Valid QuickFilter> quickFilters) {
    this.quickFilters = quickFilters;
    return this;
  }

  public VehicleListResponseV2 addQuickFiltersItem(QuickFilter quickFiltersItem) {
    if (this.quickFilters == null) {
      this.quickFilters = new ArrayList<>();
    }
    this.quickFilters.add(quickFiltersItem);
    return this;
  }

  /**
   * Get quickFilters
   * @return quickFilters
  */
  @Valid 
  @Schema(name = "quickFilters", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("quickFilters")
  public List<@Valid QuickFilter> getQuickFilters() {
    return quickFilters;
  }

  public void setQuickFilters(List<@Valid QuickFilter> quickFilters) {
    this.quickFilters = quickFilters;
  }

  public VehicleListResponseV2 terminalList(List<@Valid Terminal> terminalList) {
    this.terminalList = terminalList;
    return this;
  }

  public VehicleListResponseV2 addTerminalListItem(Terminal terminalListItem) {
    if (this.terminalList == null) {
      this.terminalList = new ArrayList<>();
    }
    this.terminalList.add(terminalListItem);
    return this;
  }

  /**
   * Get terminalList
   * @return terminalList
  */
  @Valid 
  @Schema(name = "terminalList", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("terminalList")
  public List<@Valid Terminal> getTerminalList() {
    return terminalList;
  }

  public void setTerminalList(List<@Valid Terminal> terminalList) {
    this.terminalList = terminalList;
  }

  public VehicleListResponseV2 vehicleLessCheckin(VehicleLessCheckin vehicleLessCheckin) {
    this.vehicleLessCheckin = vehicleLessCheckin;
    return this;
  }

  /**
   * Get vehicleLessCheckin
   * @return vehicleLessCheckin
  */
  @Valid 
  @Schema(name = "vehicleLessCheckin", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vehicleLessCheckin")
  public VehicleLessCheckin getVehicleLessCheckin() {
    return vehicleLessCheckin;
  }

  public void setVehicleLessCheckin(VehicleLessCheckin vehicleLessCheckin) {
    this.vehicleLessCheckin = vehicleLessCheckin;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VehicleListResponseV2 vehicleListResponseV2 = (VehicleListResponseV2) o;
    return Objects.equals(this.reservationId, vehicleListResponseV2.reservationId) &&
        Objects.equals(this.deals, vehicleListResponseV2.deals) &&
        Objects.equals(this.totalVehicles, vehicleListResponseV2.totalVehicles) &&
        Objects.equals(this.bannerMessage, vehicleListResponseV2.bannerMessage) &&
        Objects.equals(this.bottomPopUpMessage, vehicleListResponseV2.bottomPopUpMessage) &&
        Objects.equals(this.blockedDealVehicle, vehicleListResponseV2.blockedDealVehicle) &&
        Objects.equals(this.reservationBlockDateTime, vehicleListResponseV2.reservationBlockDateTime) &&
        Objects.equals(this.filter, vehicleListResponseV2.filter) &&
        Objects.equals(this.quickFilters, vehicleListResponseV2.quickFilters) &&
        Objects.equals(this.terminalList, vehicleListResponseV2.terminalList) &&
        Objects.equals(this.vehicleLessCheckin, vehicleListResponseV2.vehicleLessCheckin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reservationId, deals, totalVehicles, bannerMessage, bottomPopUpMessage, blockedDealVehicle, reservationBlockDateTime, filter, quickFilters, terminalList, vehicleLessCheckin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleListResponseV2 {\n");
    sb.append("    reservationId: ").append(toIndentedString(reservationId)).append("\n");
    sb.append("    deals: ").append(toIndentedString(deals)).append("\n");
    sb.append("    totalVehicles: ").append(toIndentedString(totalVehicles)).append("\n");
    sb.append("    bannerMessage: ").append(toIndentedString(bannerMessage)).append("\n");
    sb.append("    bottomPopUpMessage: ").append(toIndentedString(bottomPopUpMessage)).append("\n");
    sb.append("    blockedDealVehicle: ").append(toIndentedString(blockedDealVehicle)).append("\n");
    sb.append("    reservationBlockDateTime: ").append(toIndentedString(reservationBlockDateTime)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    quickFilters: ").append(toIndentedString(quickFilters)).append("\n");
    sb.append("    terminalList: ").append(toIndentedString(terminalList)).append("\n");
    sb.append("    vehicleLessCheckin: ").append(toIndentedString(vehicleLessCheckin)).append("\n");
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

