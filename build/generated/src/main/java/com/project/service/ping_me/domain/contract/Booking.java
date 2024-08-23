package com.project.service.ping_me.domain.contract;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.project.service.ping_me.domain.contract.Charge;
import com.project.service.ping_me.domain.contract.ChargeGroup;
import com.project.service.ping_me.domain.contract.IDs;
import com.project.service.ping_me.domain.contract.IncludedOffersDetails;
import com.project.service.ping_me.domain.contract.PriceInfo;
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
 * Booking
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class Booking {

  private IDs internalIds;

  private String rentalActivityId;

  @Valid
  private List<@Valid Charge> protection = new ArrayList<>();

  @Valid
  private List<@Valid Charge> protectionPackages;

  @Valid
  private List<@Valid Charge> protectionSingles;

  @Valid
  private List<@Valid ChargeGroup> extras = new ArrayList<>();

  private IncludedOffersDetails includedOffersDetails;

  private PriceInfo priceInfo;

  private String infoMessage;

  private Boolean showIncludedOffers;

  public Booking() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Booking(IDs internalIds, String rentalActivityId, List<@Valid Charge> protection, List<@Valid ChargeGroup> extras, PriceInfo priceInfo) {
    this.internalIds = internalIds;
    this.rentalActivityId = rentalActivityId;
    this.protection = protection;
    this.extras = extras;
    this.priceInfo = priceInfo;
  }

  public Booking internalIds(IDs internalIds) {
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

  public Booking rentalActivityId(String rentalActivityId) {
    this.rentalActivityId = rentalActivityId;
    return this;
  }

  /**
   * the id of the rental-activity
   * @return rentalActivityId
  */
  @NotNull 
  @Schema(name = "rentalActivityId", example = "1001987478", description = "the id of the rental-activity", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("rentalActivityId")
  public String getRentalActivityId() {
    return rentalActivityId;
  }

  public void setRentalActivityId(String rentalActivityId) {
    this.rentalActivityId = rentalActivityId;
  }

  public Booking protection(List<@Valid Charge> protection) {
    this.protection = protection;
    return this;
  }

  public Booking addProtectionItem(Charge protectionItem) {
    if (this.protection == null) {
      this.protection = new ArrayList<>();
    }
    this.protection.add(protectionItem);
    return this;
  }

  /**
   * DEPRECATED. Only after apps adopt to new version (using separate fields protectionPackages and protectionSingles) - can be removed. For now should work like before.
   * @return protection
  */
  @NotNull @Valid 
  @Schema(name = "protection", description = "DEPRECATED. Only after apps adopt to new version (using separate fields protectionPackages and protectionSingles) - can be removed. For now should work like before.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("protection")
  public List<@Valid Charge> getProtection() {
    return protection;
  }

  public void setProtection(List<@Valid Charge> protection) {
    this.protection = protection;
  }

  public Booking protectionPackages(List<@Valid Charge> protectionPackages) {
    this.protectionPackages = protectionPackages;
    return this;
  }

  public Booking addProtectionPackagesItem(Charge protectionPackagesItem) {
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
  public List<@Valid Charge> getProtectionPackages() {
    return protectionPackages;
  }

  public void setProtectionPackages(List<@Valid Charge> protectionPackages) {
    this.protectionPackages = protectionPackages;
  }

  public Booking protectionSingles(List<@Valid Charge> protectionSingles) {
    this.protectionSingles = protectionSingles;
    return this;
  }

  public Booking addProtectionSinglesItem(Charge protectionSinglesItem) {
    if (this.protectionSingles == null) {
      this.protectionSingles = new ArrayList<>();
    }
    this.protectionSingles.add(protectionSinglesItem);
    return this;
  }

  /**
   * Get protectionSingles
   * @return protectionSingles
  */
  @Valid 
  @Schema(name = "protectionSingles", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("protectionSingles")
  public List<@Valid Charge> getProtectionSingles() {
    return protectionSingles;
  }

  public void setProtectionSingles(List<@Valid Charge> protectionSingles) {
    this.protectionSingles = protectionSingles;
  }

  public Booking extras(List<@Valid ChargeGroup> extras) {
    this.extras = extras;
    return this;
  }

  public Booking addExtrasItem(ChargeGroup extrasItem) {
    if (this.extras == null) {
      this.extras = new ArrayList<>();
    }
    this.extras.add(extrasItem);
    return this;
  }

  /**
   * Get extras
   * @return extras
  */
  @NotNull @Valid 
  @Schema(name = "extras", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("extras")
  public List<@Valid ChargeGroup> getExtras() {
    return extras;
  }

  public void setExtras(List<@Valid ChargeGroup> extras) {
    this.extras = extras;
  }

  public Booking includedOffersDetails(IncludedOffersDetails includedOffersDetails) {
    this.includedOffersDetails = includedOffersDetails;
    return this;
  }

  /**
   * Get includedOffersDetails
   * @return includedOffersDetails
  */
  @Valid 
  @Schema(name = "includedOffersDetails", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("includedOffersDetails")
  public IncludedOffersDetails getIncludedOffersDetails() {
    return includedOffersDetails;
  }

  public void setIncludedOffersDetails(IncludedOffersDetails includedOffersDetails) {
    this.includedOffersDetails = includedOffersDetails;
  }

  public Booking priceInfo(PriceInfo priceInfo) {
    this.priceInfo = priceInfo;
    return this;
  }

  /**
   * Get priceInfo
   * @return priceInfo
  */
  @NotNull @Valid 
  @Schema(name = "priceInfo", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("priceInfo")
  public PriceInfo getPriceInfo() {
    return priceInfo;
  }

  public void setPriceInfo(PriceInfo priceInfo) {
    this.priceInfo = priceInfo;
  }

  public Booking infoMessage(String infoMessage) {
    this.infoMessage = infoMessage;
    return this;
  }

  /**
   * Get infoMessage
   * @return infoMessage
  */
  
  @Schema(name = "infoMessage", example = "Please review the protection coverage that you may have bought outside of Sixt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("infoMessage")
  public String getInfoMessage() {
    return infoMessage;
  }

  public void setInfoMessage(String infoMessage) {
    this.infoMessage = infoMessage;
  }

  public Booking showIncludedOffers(Boolean showIncludedOffers) {
    this.showIncludedOffers = showIncludedOffers;
    return this;
  }

  /**
   * it signifies if we want to show packages or included offers on protection screen. If true, there is no applicable packages available and show included offer only. Otherwise, behaviour will be as usual.
   * @return showIncludedOffers
  */
  
  @Schema(name = "showIncludedOffers", description = "it signifies if we want to show packages or included offers on protection screen. If true, there is no applicable packages available and show included offer only. Otherwise, behaviour will be as usual.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("showIncludedOffers")
  public Boolean isShowIncludedOffers() {
    return showIncludedOffers;
  }

  public void setShowIncludedOffers(Boolean showIncludedOffers) {
    this.showIncludedOffers = showIncludedOffers;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Booking booking = (Booking) o;
    return Objects.equals(this.internalIds, booking.internalIds) &&
        Objects.equals(this.rentalActivityId, booking.rentalActivityId) &&
        Objects.equals(this.protection, booking.protection) &&
        Objects.equals(this.protectionPackages, booking.protectionPackages) &&
        Objects.equals(this.protectionSingles, booking.protectionSingles) &&
        Objects.equals(this.extras, booking.extras) &&
        Objects.equals(this.includedOffersDetails, booking.includedOffersDetails) &&
        Objects.equals(this.priceInfo, booking.priceInfo) &&
        Objects.equals(this.infoMessage, booking.infoMessage) &&
        Objects.equals(this.showIncludedOffers, booking.showIncludedOffers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(internalIds, rentalActivityId, protection, protectionPackages, protectionSingles, extras, includedOffersDetails, priceInfo, infoMessage, showIncludedOffers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Booking {\n");
    sb.append("    internalIds: ").append(toIndentedString(internalIds)).append("\n");
    sb.append("    rentalActivityId: ").append(toIndentedString(rentalActivityId)).append("\n");
    sb.append("    protection: ").append(toIndentedString(protection)).append("\n");
    sb.append("    protectionPackages: ").append(toIndentedString(protectionPackages)).append("\n");
    sb.append("    protectionSingles: ").append(toIndentedString(protectionSingles)).append("\n");
    sb.append("    extras: ").append(toIndentedString(extras)).append("\n");
    sb.append("    includedOffersDetails: ").append(toIndentedString(includedOffersDetails)).append("\n");
    sb.append("    priceInfo: ").append(toIndentedString(priceInfo)).append("\n");
    sb.append("    infoMessage: ").append(toIndentedString(infoMessage)).append("\n");
    sb.append("    showIncludedOffers: ").append(toIndentedString(showIncludedOffers)).append("\n");
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

