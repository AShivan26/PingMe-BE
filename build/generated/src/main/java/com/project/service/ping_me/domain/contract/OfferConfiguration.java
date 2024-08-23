package com.project.service.ping_me.domain.contract;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.project.service.ping_me.domain.contract.Amount;
import com.project.service.ping_me.domain.contract.ChargeDetail;
import com.project.service.ping_me.domain.contract.NotificationItem;
import com.project.service.ping_me.domain.contract.OfferOption;
import com.project.service.ping_me.domain.contract.OfferOptionGroup;
import com.project.service.ping_me.domain.contract.OfferPackage;
import com.project.service.ping_me.domain.contract.PriceInfoBlock;
import com.project.service.ping_me.domain.contract.VehicleBlockDateTime;
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
 * OfferConfiguration
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OfferConfiguration {

  private String reservationId;

  @Valid
  private List<@Valid NotificationItem> notifications;

  @Valid
  private List<@Valid ChargeDetail> includedProtections;

  @Valid
  private List<@Valid ChargeDetail> includedAddons;

  @Valid
  private List<@Valid OfferPackage> protectionPackages;

  @Valid
  private List<@Valid OfferOption> singleProtections;

  @Valid
  private List<@Valid OfferOptionGroup> addons = new ArrayList<>();

  private VehicleBlockDateTime vehicleBlockDateTime;

  @Valid
  private List<@Valid PriceInfoBlock> priceInfo = new ArrayList<>();

  private Amount totalPayableAmount;

  public OfferConfiguration() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OfferConfiguration(String reservationId, List<@Valid OfferOptionGroup> addons, List<@Valid PriceInfoBlock> priceInfo, Amount totalPayableAmount) {
    this.reservationId = reservationId;
    this.addons = addons;
    this.priceInfo = priceInfo;
    this.totalPayableAmount = totalPayableAmount;
  }

  public OfferConfiguration reservationId(String reservationId) {
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

  public OfferConfiguration notifications(List<@Valid NotificationItem> notifications) {
    this.notifications = notifications;
    return this;
  }

  public OfferConfiguration addNotificationsItem(NotificationItem notificationsItem) {
    if (this.notifications == null) {
      this.notifications = new ArrayList<>();
    }
    this.notifications.add(notificationsItem);
    return this;
  }

  /**
   * Get notifications
   * @return notifications
  */
  @Valid 
  @Schema(name = "notifications", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("notifications")
  public List<@Valid NotificationItem> getNotifications() {
    return notifications;
  }

  public void setNotifications(List<@Valid NotificationItem> notifications) {
    this.notifications = notifications;
  }

  public OfferConfiguration includedProtections(List<@Valid ChargeDetail> includedProtections) {
    this.includedProtections = includedProtections;
    return this;
  }

  public OfferConfiguration addIncludedProtectionsItem(ChargeDetail includedProtectionsItem) {
    if (this.includedProtections == null) {
      this.includedProtections = new ArrayList<>();
    }
    this.includedProtections.add(includedProtectionsItem);
    return this;
  }

  /**
   * Get includedProtections
   * @return includedProtections
  */
  @Valid 
  @Schema(name = "includedProtections", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("includedProtections")
  public List<@Valid ChargeDetail> getIncludedProtections() {
    return includedProtections;
  }

  public void setIncludedProtections(List<@Valid ChargeDetail> includedProtections) {
    this.includedProtections = includedProtections;
  }

  public OfferConfiguration includedAddons(List<@Valid ChargeDetail> includedAddons) {
    this.includedAddons = includedAddons;
    return this;
  }

  public OfferConfiguration addIncludedAddonsItem(ChargeDetail includedAddonsItem) {
    if (this.includedAddons == null) {
      this.includedAddons = new ArrayList<>();
    }
    this.includedAddons.add(includedAddonsItem);
    return this;
  }

  /**
   * Get includedAddons
   * @return includedAddons
  */
  @Valid 
  @Schema(name = "includedAddons", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("includedAddons")
  public List<@Valid ChargeDetail> getIncludedAddons() {
    return includedAddons;
  }

  public void setIncludedAddons(List<@Valid ChargeDetail> includedAddons) {
    this.includedAddons = includedAddons;
  }

  public OfferConfiguration protectionPackages(List<@Valid OfferPackage> protectionPackages) {
    this.protectionPackages = protectionPackages;
    return this;
  }

  public OfferConfiguration addProtectionPackagesItem(OfferPackage protectionPackagesItem) {
    if (this.protectionPackages == null) {
      this.protectionPackages = new ArrayList<>();
    }
    this.protectionPackages.add(protectionPackagesItem);
    return this;
  }

  /**
   * Get protectionPackages
   * @return protectionPackages
  */
  @Valid 
  @Schema(name = "protectionPackages", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("protectionPackages")
  public List<@Valid OfferPackage> getProtectionPackages() {
    return protectionPackages;
  }

  public void setProtectionPackages(List<@Valid OfferPackage> protectionPackages) {
    this.protectionPackages = protectionPackages;
  }

  public OfferConfiguration singleProtections(List<@Valid OfferOption> singleProtections) {
    this.singleProtections = singleProtections;
    return this;
  }

  public OfferConfiguration addSingleProtectionsItem(OfferOption singleProtectionsItem) {
    if (this.singleProtections == null) {
      this.singleProtections = new ArrayList<>();
    }
    this.singleProtections.add(singleProtectionsItem);
    return this;
  }

  /**
   * Get singleProtections
   * @return singleProtections
  */
  @Valid 
  @Schema(name = "singleProtections", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("singleProtections")
  public List<@Valid OfferOption> getSingleProtections() {
    return singleProtections;
  }

  public void setSingleProtections(List<@Valid OfferOption> singleProtections) {
    this.singleProtections = singleProtections;
  }

  public OfferConfiguration addons(List<@Valid OfferOptionGroup> addons) {
    this.addons = addons;
    return this;
  }

  public OfferConfiguration addAddonsItem(OfferOptionGroup addonsItem) {
    if (this.addons == null) {
      this.addons = new ArrayList<>();
    }
    this.addons.add(addonsItem);
    return this;
  }

  /**
   * Get addons
   * @return addons
  */
  @NotNull @Valid 
  @Schema(name = "addons", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("addons")
  public List<@Valid OfferOptionGroup> getAddons() {
    return addons;
  }

  public void setAddons(List<@Valid OfferOptionGroup> addons) {
    this.addons = addons;
  }

  public OfferConfiguration vehicleBlockDateTime(VehicleBlockDateTime vehicleBlockDateTime) {
    this.vehicleBlockDateTime = vehicleBlockDateTime;
    return this;
  }

  /**
   * Get vehicleBlockDateTime
   * @return vehicleBlockDateTime
  */
  @Valid 
  @Schema(name = "vehicleBlockDateTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vehicleBlockDateTime")
  public VehicleBlockDateTime getVehicleBlockDateTime() {
    return vehicleBlockDateTime;
  }

  public void setVehicleBlockDateTime(VehicleBlockDateTime vehicleBlockDateTime) {
    this.vehicleBlockDateTime = vehicleBlockDateTime;
  }

  public OfferConfiguration priceInfo(List<@Valid PriceInfoBlock> priceInfo) {
    this.priceInfo = priceInfo;
    return this;
  }

  public OfferConfiguration addPriceInfoItem(PriceInfoBlock priceInfoItem) {
    if (this.priceInfo == null) {
      this.priceInfo = new ArrayList<>();
    }
    this.priceInfo.add(priceInfoItem);
    return this;
  }

  /**
   * Get priceInfo
   * @return priceInfo
  */
  @NotNull @Valid 
  @Schema(name = "priceInfo", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("priceInfo")
  public List<@Valid PriceInfoBlock> getPriceInfo() {
    return priceInfo;
  }

  public void setPriceInfo(List<@Valid PriceInfoBlock> priceInfo) {
    this.priceInfo = priceInfo;
  }

  public OfferConfiguration totalPayableAmount(Amount totalPayableAmount) {
    this.totalPayableAmount = totalPayableAmount;
    return this;
  }

  /**
   * Get totalPayableAmount
   * @return totalPayableAmount
  */
  @NotNull @Valid 
  @Schema(name = "totalPayableAmount", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("totalPayableAmount")
  public Amount getTotalPayableAmount() {
    return totalPayableAmount;
  }

  public void setTotalPayableAmount(Amount totalPayableAmount) {
    this.totalPayableAmount = totalPayableAmount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferConfiguration offerConfiguration = (OfferConfiguration) o;
    return Objects.equals(this.reservationId, offerConfiguration.reservationId) &&
        Objects.equals(this.notifications, offerConfiguration.notifications) &&
        Objects.equals(this.includedProtections, offerConfiguration.includedProtections) &&
        Objects.equals(this.includedAddons, offerConfiguration.includedAddons) &&
        Objects.equals(this.protectionPackages, offerConfiguration.protectionPackages) &&
        Objects.equals(this.singleProtections, offerConfiguration.singleProtections) &&
        Objects.equals(this.addons, offerConfiguration.addons) &&
        Objects.equals(this.vehicleBlockDateTime, offerConfiguration.vehicleBlockDateTime) &&
        Objects.equals(this.priceInfo, offerConfiguration.priceInfo) &&
        Objects.equals(this.totalPayableAmount, offerConfiguration.totalPayableAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reservationId, notifications, includedProtections, includedAddons, protectionPackages, singleProtections, addons, vehicleBlockDateTime, priceInfo, totalPayableAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferConfiguration {\n");
    sb.append("    reservationId: ").append(toIndentedString(reservationId)).append("\n");
    sb.append("    notifications: ").append(toIndentedString(notifications)).append("\n");
    sb.append("    includedProtections: ").append(toIndentedString(includedProtections)).append("\n");
    sb.append("    includedAddons: ").append(toIndentedString(includedAddons)).append("\n");
    sb.append("    protectionPackages: ").append(toIndentedString(protectionPackages)).append("\n");
    sb.append("    singleProtections: ").append(toIndentedString(singleProtections)).append("\n");
    sb.append("    addons: ").append(toIndentedString(addons)).append("\n");
    sb.append("    vehicleBlockDateTime: ").append(toIndentedString(vehicleBlockDateTime)).append("\n");
    sb.append("    priceInfo: ").append(toIndentedString(priceInfo)).append("\n");
    sb.append("    totalPayableAmount: ").append(toIndentedString(totalPayableAmount)).append("\n");
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

