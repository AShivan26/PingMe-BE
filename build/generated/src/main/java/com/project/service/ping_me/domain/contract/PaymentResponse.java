package com.project.service.ping_me.domain.contract;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.project.service.ping_me.domain.contract.Contact;
import com.project.service.ping_me.domain.contract.CorporateDetails;
import com.project.service.ping_me.domain.contract.IDs;
import com.project.service.ping_me.domain.contract.IncludedOffersDetails;
import com.project.service.ping_me.domain.contract.NotificationItem;
import com.project.service.ping_me.domain.contract.Payment;
import com.project.service.ping_me.domain.contract.PriceInfo;
import com.project.service.ping_me.domain.contract.TermsAndConditionsUrls;
import com.project.service.ping_me.domain.contract.Vehicle;
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
 * PaymentResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class PaymentResponse {

  private IDs internalIds;

  private PriceInfo priceInfo;

  private Vehicle blockedVehicle;

  private VehicleBlockDateTime vehicleBlockDateTime;

  private Payment payment;

  private Contact customerSupport;

  private TermsAndConditionsUrls termsAndConditionsUrls;

  @Valid
  private List<String> includedCharges;

  private IncludedOffersDetails includedOffersDetails;

  private CorporateDetails corporateDetails;

  private String errorMessage;

  private String cardChangeMessage;

  private String totalPayableMessage;

  private String taxId;

  @Valid
  private List<String> flags;

  private NotificationItem notification;

  public PaymentResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PaymentResponse(IDs internalIds, PriceInfo priceInfo, Vehicle blockedVehicle, VehicleBlockDateTime vehicleBlockDateTime, TermsAndConditionsUrls termsAndConditionsUrls, String totalPayableMessage) {
    this.internalIds = internalIds;
    this.priceInfo = priceInfo;
    this.blockedVehicle = blockedVehicle;
    this.vehicleBlockDateTime = vehicleBlockDateTime;
    this.termsAndConditionsUrls = termsAndConditionsUrls;
    this.totalPayableMessage = totalPayableMessage;
  }

  public PaymentResponse internalIds(IDs internalIds) {
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

  public PaymentResponse priceInfo(PriceInfo priceInfo) {
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

  public PaymentResponse blockedVehicle(Vehicle blockedVehicle) {
    this.blockedVehicle = blockedVehicle;
    return this;
  }

  /**
   * Get blockedVehicle
   * @return blockedVehicle
  */
  @NotNull @Valid 
  @Schema(name = "blockedVehicle", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("blockedVehicle")
  public Vehicle getBlockedVehicle() {
    return blockedVehicle;
  }

  public void setBlockedVehicle(Vehicle blockedVehicle) {
    this.blockedVehicle = blockedVehicle;
  }

  public PaymentResponse vehicleBlockDateTime(VehicleBlockDateTime vehicleBlockDateTime) {
    this.vehicleBlockDateTime = vehicleBlockDateTime;
    return this;
  }

  /**
   * Get vehicleBlockDateTime
   * @return vehicleBlockDateTime
  */
  @NotNull @Valid 
  @Schema(name = "vehicleBlockDateTime", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("vehicleBlockDateTime")
  public VehicleBlockDateTime getVehicleBlockDateTime() {
    return vehicleBlockDateTime;
  }

  public void setVehicleBlockDateTime(VehicleBlockDateTime vehicleBlockDateTime) {
    this.vehicleBlockDateTime = vehicleBlockDateTime;
  }

  public PaymentResponse payment(Payment payment) {
    this.payment = payment;
    return this;
  }

  /**
   * Get payment
   * @return payment
  */
  @Valid 
  @Schema(name = "payment", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("payment")
  public Payment getPayment() {
    return payment;
  }

  public void setPayment(Payment payment) {
    this.payment = payment;
  }

  public PaymentResponse customerSupport(Contact customerSupport) {
    this.customerSupport = customerSupport;
    return this;
  }

  /**
   * Get customerSupport
   * @return customerSupport
  */
  @Valid 
  @Schema(name = "customerSupport", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("customerSupport")
  public Contact getCustomerSupport() {
    return customerSupport;
  }

  public void setCustomerSupport(Contact customerSupport) {
    this.customerSupport = customerSupport;
  }

  public PaymentResponse termsAndConditionsUrls(TermsAndConditionsUrls termsAndConditionsUrls) {
    this.termsAndConditionsUrls = termsAndConditionsUrls;
    return this;
  }

  /**
   * Get termsAndConditionsUrls
   * @return termsAndConditionsUrls
  */
  @NotNull @Valid 
  @Schema(name = "termsAndConditionsUrls", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("termsAndConditionsUrls")
  public TermsAndConditionsUrls getTermsAndConditionsUrls() {
    return termsAndConditionsUrls;
  }

  public void setTermsAndConditionsUrls(TermsAndConditionsUrls termsAndConditionsUrls) {
    this.termsAndConditionsUrls = termsAndConditionsUrls;
  }

  public PaymentResponse includedCharges(List<String> includedCharges) {
    this.includedCharges = includedCharges;
    return this;
  }

  public PaymentResponse addIncludedChargesItem(String includedChargesItem) {
    if (this.includedCharges == null) {
      this.includedCharges = new ArrayList<>();
    }
    this.includedCharges.add(includedChargesItem);
    return this;
  }

  /**
   * Get includedCharges
   * @return includedCharges
  */
  
  @Schema(name = "includedCharges", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("includedCharges")
  public List<String> getIncludedCharges() {
    return includedCharges;
  }

  public void setIncludedCharges(List<String> includedCharges) {
    this.includedCharges = includedCharges;
  }

  public PaymentResponse includedOffersDetails(IncludedOffersDetails includedOffersDetails) {
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

  public PaymentResponse corporateDetails(CorporateDetails corporateDetails) {
    this.corporateDetails = corporateDetails;
    return this;
  }

  /**
   * Get corporateDetails
   * @return corporateDetails
  */
  @Valid 
  @Schema(name = "corporateDetails", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("corporateDetails")
  public CorporateDetails getCorporateDetails() {
    return corporateDetails;
  }

  public void setCorporateDetails(CorporateDetails corporateDetails) {
    this.corporateDetails = corporateDetails;
  }

  public PaymentResponse errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  /**
   * Get errorMessage
   * @return errorMessage
  */
  
  @Schema(name = "errorMessage", example = "Additional driver verification will be done at the counter", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errorMessage")
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public PaymentResponse cardChangeMessage(String cardChangeMessage) {
    this.cardChangeMessage = cardChangeMessage;
    return this;
  }

  /**
   * Get cardChangeMessage
   * @return cardChangeMessage
  */
  
  @Schema(name = "cardChangeMessage", example = "Changing card, will initiate complete payment on new card. Prepaid amount will be refunded on card XXX1234", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cardChangeMessage")
  public String getCardChangeMessage() {
    return cardChangeMessage;
  }

  public void setCardChangeMessage(String cardChangeMessage) {
    this.cardChangeMessage = cardChangeMessage;
  }

  public PaymentResponse totalPayableMessage(String totalPayableMessage) {
    this.totalPayableMessage = totalPayableMessage;
    return this;
  }

  /**
   * should contain corresponding and formatted currency
   * @return totalPayableMessage
  */
  @NotNull 
  @Schema(name = "totalPayableMessage", example = "You won’t be charged until you return the vehicle. We will authorize a total of $100 refundable deposit on your card.", description = "should contain corresponding and formatted currency", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("totalPayableMessage")
  public String getTotalPayableMessage() {
    return totalPayableMessage;
  }

  public void setTotalPayableMessage(String totalPayableMessage) {
    this.totalPayableMessage = totalPayableMessage;
  }

  public PaymentResponse taxId(String taxId) {
    this.taxId = taxId;
    return this;
  }

  /**
   * Get taxId
   * @return taxId
  */
  
  @Schema(name = "taxId", example = "NXXXXXXXXXXXXXXF", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("taxId")
  public String getTaxId() {
    return taxId;
  }

  public void setTaxId(String taxId) {
    this.taxId = taxId;
  }

  public PaymentResponse flags(List<String> flags) {
    this.flags = flags;
    return this;
  }

  public PaymentResponse addFlagsItem(String flagsItem) {
    if (this.flags == null) {
      this.flags = new ArrayList<>();
    }
    this.flags.add(flagsItem);
    return this;
  }

  /**
   * Get flags
   * @return flags
  */
  
  @Schema(name = "flags", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("flags")
  public List<String> getFlags() {
    return flags;
  }

  public void setFlags(List<String> flags) {
    this.flags = flags;
  }

  public PaymentResponse notification(NotificationItem notification) {
    this.notification = notification;
    return this;
  }

  /**
   * Get notification
   * @return notification
  */
  @Valid 
  @Schema(name = "notification", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("notification")
  public NotificationItem getNotification() {
    return notification;
  }

  public void setNotification(NotificationItem notification) {
    this.notification = notification;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentResponse paymentResponse = (PaymentResponse) o;
    return Objects.equals(this.internalIds, paymentResponse.internalIds) &&
        Objects.equals(this.priceInfo, paymentResponse.priceInfo) &&
        Objects.equals(this.blockedVehicle, paymentResponse.blockedVehicle) &&
        Objects.equals(this.vehicleBlockDateTime, paymentResponse.vehicleBlockDateTime) &&
        Objects.equals(this.payment, paymentResponse.payment) &&
        Objects.equals(this.customerSupport, paymentResponse.customerSupport) &&
        Objects.equals(this.termsAndConditionsUrls, paymentResponse.termsAndConditionsUrls) &&
        Objects.equals(this.includedCharges, paymentResponse.includedCharges) &&
        Objects.equals(this.includedOffersDetails, paymentResponse.includedOffersDetails) &&
        Objects.equals(this.corporateDetails, paymentResponse.corporateDetails) &&
        Objects.equals(this.errorMessage, paymentResponse.errorMessage) &&
        Objects.equals(this.cardChangeMessage, paymentResponse.cardChangeMessage) &&
        Objects.equals(this.totalPayableMessage, paymentResponse.totalPayableMessage) &&
        Objects.equals(this.taxId, paymentResponse.taxId) &&
        Objects.equals(this.flags, paymentResponse.flags) &&
        Objects.equals(this.notification, paymentResponse.notification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(internalIds, priceInfo, blockedVehicle, vehicleBlockDateTime, payment, customerSupport, termsAndConditionsUrls, includedCharges, includedOffersDetails, corporateDetails, errorMessage, cardChangeMessage, totalPayableMessage, taxId, flags, notification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentResponse {\n");
    sb.append("    internalIds: ").append(toIndentedString(internalIds)).append("\n");
    sb.append("    priceInfo: ").append(toIndentedString(priceInfo)).append("\n");
    sb.append("    blockedVehicle: ").append(toIndentedString(blockedVehicle)).append("\n");
    sb.append("    vehicleBlockDateTime: ").append(toIndentedString(vehicleBlockDateTime)).append("\n");
    sb.append("    payment: ").append(toIndentedString(payment)).append("\n");
    sb.append("    customerSupport: ").append(toIndentedString(customerSupport)).append("\n");
    sb.append("    termsAndConditionsUrls: ").append(toIndentedString(termsAndConditionsUrls)).append("\n");
    sb.append("    includedCharges: ").append(toIndentedString(includedCharges)).append("\n");
    sb.append("    includedOffersDetails: ").append(toIndentedString(includedOffersDetails)).append("\n");
    sb.append("    corporateDetails: ").append(toIndentedString(corporateDetails)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    cardChangeMessage: ").append(toIndentedString(cardChangeMessage)).append("\n");
    sb.append("    totalPayableMessage: ").append(toIndentedString(totalPayableMessage)).append("\n");
    sb.append("    taxId: ").append(toIndentedString(taxId)).append("\n");
    sb.append("    flags: ").append(toIndentedString(flags)).append("\n");
    sb.append("    notification: ").append(toIndentedString(notification)).append("\n");
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

