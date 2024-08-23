package com.project.service.ping_me.domain.contract;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.project.service.ping_me.domain.contract.IncludedOffer;
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
 * Included Offers wether protections, addons or payment in the booking.
 */

@Schema(name = "IncludedOffersDetails", description = "Included Offers wether protections, addons or payment in the booking.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class IncludedOffersDetails {

  @Valid
  private List<@Valid IncludedOffer> protectionPackages;

  @Valid
  private List<@Valid IncludedOffer> protectionSingles;

  @Valid
  private List<@Valid IncludedOffer> extras;

  @Valid
  private List<@Valid IncludedOffer> payment;

  @Valid
  private List<@Valid IncludedOffer> noChargeCodeOffers;

  public IncludedOffersDetails protectionPackages(List<@Valid IncludedOffer> protectionPackages) {
    this.protectionPackages = protectionPackages;
    return this;
  }

  public IncludedOffersDetails addProtectionPackagesItem(IncludedOffer protectionPackagesItem) {
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
  public List<@Valid IncludedOffer> getProtectionPackages() {
    return protectionPackages;
  }

  public void setProtectionPackages(List<@Valid IncludedOffer> protectionPackages) {
    this.protectionPackages = protectionPackages;
  }

  public IncludedOffersDetails protectionSingles(List<@Valid IncludedOffer> protectionSingles) {
    this.protectionSingles = protectionSingles;
    return this;
  }

  public IncludedOffersDetails addProtectionSinglesItem(IncludedOffer protectionSinglesItem) {
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
  public List<@Valid IncludedOffer> getProtectionSingles() {
    return protectionSingles;
  }

  public void setProtectionSingles(List<@Valid IncludedOffer> protectionSingles) {
    this.protectionSingles = protectionSingles;
  }

  public IncludedOffersDetails extras(List<@Valid IncludedOffer> extras) {
    this.extras = extras;
    return this;
  }

  public IncludedOffersDetails addExtrasItem(IncludedOffer extrasItem) {
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
  @Valid 
  @Schema(name = "extras", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("extras")
  public List<@Valid IncludedOffer> getExtras() {
    return extras;
  }

  public void setExtras(List<@Valid IncludedOffer> extras) {
    this.extras = extras;
  }

  public IncludedOffersDetails payment(List<@Valid IncludedOffer> payment) {
    this.payment = payment;
    return this;
  }

  public IncludedOffersDetails addPaymentItem(IncludedOffer paymentItem) {
    if (this.payment == null) {
      this.payment = new ArrayList<>();
    }
    this.payment.add(paymentItem);
    return this;
  }

  /**
   * Get payment
   * @return payment
  */
  @Valid 
  @Schema(name = "payment", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("payment")
  public List<@Valid IncludedOffer> getPayment() {
    return payment;
  }

  public void setPayment(List<@Valid IncludedOffer> payment) {
    this.payment = payment;
  }

  public IncludedOffersDetails noChargeCodeOffers(List<@Valid IncludedOffer> noChargeCodeOffers) {
    this.noChargeCodeOffers = noChargeCodeOffers;
    return this;
  }

  public IncludedOffersDetails addNoChargeCodeOffersItem(IncludedOffer noChargeCodeOffersItem) {
    if (this.noChargeCodeOffers == null) {
      this.noChargeCodeOffers = new ArrayList<>();
    }
    this.noChargeCodeOffers.add(noChargeCodeOffersItem);
    return this;
  }

  /**
   * Offers included in the booking other than the included charges (i.e 1567 free miles (0.8 Euro per additional miles) ).
   * @return noChargeCodeOffers
  */
  @Valid 
  @Schema(name = "noChargeCodeOffers", description = "Offers included in the booking other than the included charges (i.e 1567 free miles (0.8 Euro per additional miles) ).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("noChargeCodeOffers")
  public List<@Valid IncludedOffer> getNoChargeCodeOffers() {
    return noChargeCodeOffers;
  }

  public void setNoChargeCodeOffers(List<@Valid IncludedOffer> noChargeCodeOffers) {
    this.noChargeCodeOffers = noChargeCodeOffers;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncludedOffersDetails includedOffersDetails = (IncludedOffersDetails) o;
    return Objects.equals(this.protectionPackages, includedOffersDetails.protectionPackages) &&
        Objects.equals(this.protectionSingles, includedOffersDetails.protectionSingles) &&
        Objects.equals(this.extras, includedOffersDetails.extras) &&
        Objects.equals(this.payment, includedOffersDetails.payment) &&
        Objects.equals(this.noChargeCodeOffers, includedOffersDetails.noChargeCodeOffers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(protectionPackages, protectionSingles, extras, payment, noChargeCodeOffers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncludedOffersDetails {\n");
    sb.append("    protectionPackages: ").append(toIndentedString(protectionPackages)).append("\n");
    sb.append("    protectionSingles: ").append(toIndentedString(protectionSingles)).append("\n");
    sb.append("    extras: ").append(toIndentedString(extras)).append("\n");
    sb.append("    payment: ").append(toIndentedString(payment)).append("\n");
    sb.append("    noChargeCodeOffers: ").append(toIndentedString(noChargeCodeOffers)).append("\n");
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

