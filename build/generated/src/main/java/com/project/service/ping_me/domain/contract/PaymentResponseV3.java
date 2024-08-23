package com.project.service.ping_me.domain.contract;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.project.service.ping_me.domain.contract.Amount;
import com.project.service.ping_me.domain.contract.BlockDateTime;
import com.project.service.ping_me.domain.contract.NotificationItem;
import com.project.service.ping_me.domain.contract.PaymentV3;
import com.project.service.ping_me.domain.contract.PriceInfoBlock;
import com.project.service.ping_me.domain.contract.TermsAndConditionsUrls;
import com.project.service.ping_me.domain.contract.TripSummary;
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
 * PaymentResponseV3
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class PaymentResponseV3 {

  private String vehicleDisplayname;

  private String vehicleImage;

  private TripSummary trip;

  @Valid
  private List<@Valid NotificationItem> notification;

  private TermsAndConditionsUrls rentalUrls;

  private String legalConsent;

  private String reservationId;

  private BlockDateTime reservationResetTime;

  private PaymentV3 payment;

  @Valid
  private List<@Valid PriceInfoBlock> priceInfo = new ArrayList<>();

  private Amount totalPayableAmount;

  private String totalPayableMessage;

  public PaymentResponseV3() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PaymentResponseV3(String vehicleDisplayname, String vehicleImage, TripSummary trip, TermsAndConditionsUrls rentalUrls, String legalConsent, String reservationId, BlockDateTime reservationResetTime, List<@Valid PriceInfoBlock> priceInfo, Amount totalPayableAmount, String totalPayableMessage) {
    this.vehicleDisplayname = vehicleDisplayname;
    this.vehicleImage = vehicleImage;
    this.trip = trip;
    this.rentalUrls = rentalUrls;
    this.legalConsent = legalConsent;
    this.reservationId = reservationId;
    this.reservationResetTime = reservationResetTime;
    this.priceInfo = priceInfo;
    this.totalPayableAmount = totalPayableAmount;
    this.totalPayableMessage = totalPayableMessage;
  }

  public PaymentResponseV3 vehicleDisplayname(String vehicleDisplayname) {
    this.vehicleDisplayname = vehicleDisplayname;
    return this;
  }

  /**
   * Get vehicleDisplayname
   * @return vehicleDisplayname
  */
  @NotNull 
  @Schema(name = "vehicleDisplayname", example = "BMW X3", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("vehicleDisplayname")
  public String getVehicleDisplayname() {
    return vehicleDisplayname;
  }

  public void setVehicleDisplayname(String vehicleDisplayname) {
    this.vehicleDisplayname = vehicleDisplayname;
  }

  public PaymentResponseV3 vehicleImage(String vehicleImage) {
    this.vehicleImage = vehicleImage;
    return this;
  }

  /**
   * vehicle image url
   * @return vehicleImage
  */
  @NotNull 
  @Schema(name = "vehicleImage", example = "https://vehicle-pictures-stage.goorange.sixt.com/5140195/ff0081/18_1.png", description = "vehicle image url", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("vehicleImage")
  public String getVehicleImage() {
    return vehicleImage;
  }

  public void setVehicleImage(String vehicleImage) {
    this.vehicleImage = vehicleImage;
  }

  public PaymentResponseV3 trip(TripSummary trip) {
    this.trip = trip;
    return this;
  }

  /**
   * Get trip
   * @return trip
  */
  @NotNull @Valid 
  @Schema(name = "trip", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("trip")
  public TripSummary getTrip() {
    return trip;
  }

  public void setTrip(TripSummary trip) {
    this.trip = trip;
  }

  public PaymentResponseV3 notification(List<@Valid NotificationItem> notification) {
    this.notification = notification;
    return this;
  }

  public PaymentResponseV3 addNotificationItem(NotificationItem notificationItem) {
    if (this.notification == null) {
      this.notification = new ArrayList<>();
    }
    this.notification.add(notificationItem);
    return this;
  }

  /**
   * Get notification
   * @return notification
  */
  @Valid 
  @Schema(name = "notification", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("notification")
  public List<@Valid NotificationItem> getNotification() {
    return notification;
  }

  public void setNotification(List<@Valid NotificationItem> notification) {
    this.notification = notification;
  }

  public PaymentResponseV3 rentalUrls(TermsAndConditionsUrls rentalUrls) {
    this.rentalUrls = rentalUrls;
    return this;
  }

  /**
   * Get rentalUrls
   * @return rentalUrls
  */
  @NotNull @Valid 
  @Schema(name = "rentalUrls", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("rentalUrls")
  public TermsAndConditionsUrls getRentalUrls() {
    return rentalUrls;
  }

  public void setRentalUrls(TermsAndConditionsUrls rentalUrls) {
    this.rentalUrls = rentalUrls;
  }

  public PaymentResponseV3 legalConsent(String legalConsent) {
    this.legalConsent = legalConsent;
    return this;
  }

  /**
   * Legal text with inline links in markdown format
   * @return legalConsent
  */
  @NotNull 
  @Schema(name = "legalConsent", example = "By continuing, I confirm that I have read and accepted SIXT’s [Rental Information](https://www.sixt.com/php/terms/view?liso=US&rtar=000&view=EPP&tlang=en_US) and [Terms & Conditions](https://www.sixt.de/fileadmin/sys/agb/sixt_US_en.pdf).", description = "Legal text with inline links in markdown format", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("legalConsent")
  public String getLegalConsent() {
    return legalConsent;
  }

  public void setLegalConsent(String legalConsent) {
    this.legalConsent = legalConsent;
  }

  public PaymentResponseV3 reservationId(String reservationId) {
    this.reservationId = reservationId;
    return this;
  }

  /**
   * Get reservationId
   * @return reservationId
  */
  @NotNull 
  @Schema(name = "reservationId", example = "9700478205", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("reservationId")
  public String getReservationId() {
    return reservationId;
  }

  public void setReservationId(String reservationId) {
    this.reservationId = reservationId;
  }

  public PaymentResponseV3 reservationResetTime(BlockDateTime reservationResetTime) {
    this.reservationResetTime = reservationResetTime;
    return this;
  }

  /**
   * Get reservationResetTime
   * @return reservationResetTime
  */
  @NotNull @Valid 
  @Schema(name = "reservationResetTime", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("reservationResetTime")
  public BlockDateTime getReservationResetTime() {
    return reservationResetTime;
  }

  public void setReservationResetTime(BlockDateTime reservationResetTime) {
    this.reservationResetTime = reservationResetTime;
  }

  public PaymentResponseV3 payment(PaymentV3 payment) {
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
  public PaymentV3 getPayment() {
    return payment;
  }

  public void setPayment(PaymentV3 payment) {
    this.payment = payment;
  }

  public PaymentResponseV3 priceInfo(List<@Valid PriceInfoBlock> priceInfo) {
    this.priceInfo = priceInfo;
    return this;
  }

  public PaymentResponseV3 addPriceInfoItem(PriceInfoBlock priceInfoItem) {
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

  public PaymentResponseV3 totalPayableAmount(Amount totalPayableAmount) {
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

  public PaymentResponseV3 totalPayableMessage(String totalPayableMessage) {
    this.totalPayableMessage = totalPayableMessage;
    return this;
  }

  /**
   * Get totalPayableMessage
   * @return totalPayableMessage
  */
  @NotNull 
  @Schema(name = "totalPayableMessage", example = "You will not be charged until you return the vehicle", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("totalPayableMessage")
  public String getTotalPayableMessage() {
    return totalPayableMessage;
  }

  public void setTotalPayableMessage(String totalPayableMessage) {
    this.totalPayableMessage = totalPayableMessage;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentResponseV3 paymentResponseV3 = (PaymentResponseV3) o;
    return Objects.equals(this.vehicleDisplayname, paymentResponseV3.vehicleDisplayname) &&
        Objects.equals(this.vehicleImage, paymentResponseV3.vehicleImage) &&
        Objects.equals(this.trip, paymentResponseV3.trip) &&
        Objects.equals(this.notification, paymentResponseV3.notification) &&
        Objects.equals(this.rentalUrls, paymentResponseV3.rentalUrls) &&
        Objects.equals(this.legalConsent, paymentResponseV3.legalConsent) &&
        Objects.equals(this.reservationId, paymentResponseV3.reservationId) &&
        Objects.equals(this.reservationResetTime, paymentResponseV3.reservationResetTime) &&
        Objects.equals(this.payment, paymentResponseV3.payment) &&
        Objects.equals(this.priceInfo, paymentResponseV3.priceInfo) &&
        Objects.equals(this.totalPayableAmount, paymentResponseV3.totalPayableAmount) &&
        Objects.equals(this.totalPayableMessage, paymentResponseV3.totalPayableMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vehicleDisplayname, vehicleImage, trip, notification, rentalUrls, legalConsent, reservationId, reservationResetTime, payment, priceInfo, totalPayableAmount, totalPayableMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentResponseV3 {\n");
    sb.append("    vehicleDisplayname: ").append(toIndentedString(vehicleDisplayname)).append("\n");
    sb.append("    vehicleImage: ").append(toIndentedString(vehicleImage)).append("\n");
    sb.append("    trip: ").append(toIndentedString(trip)).append("\n");
    sb.append("    notification: ").append(toIndentedString(notification)).append("\n");
    sb.append("    rentalUrls: ").append(toIndentedString(rentalUrls)).append("\n");
    sb.append("    legalConsent: ").append(toIndentedString(legalConsent)).append("\n");
    sb.append("    reservationId: ").append(toIndentedString(reservationId)).append("\n");
    sb.append("    reservationResetTime: ").append(toIndentedString(reservationResetTime)).append("\n");
    sb.append("    payment: ").append(toIndentedString(payment)).append("\n");
    sb.append("    priceInfo: ").append(toIndentedString(priceInfo)).append("\n");
    sb.append("    totalPayableAmount: ").append(toIndentedString(totalPayableAmount)).append("\n");
    sb.append("    totalPayableMessage: ").append(toIndentedString(totalPayableMessage)).append("\n");
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

