package com.project.service.ping_me.domain.contract;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.project.service.ping_me.domain.contract.Amount;
import com.project.service.ping_me.domain.contract.AttributeCategoryV2;
import com.project.service.ping_me.domain.contract.AttributeV2;
import com.project.service.ping_me.domain.contract.BlockDateTime;
import com.project.service.ping_me.domain.contract.GroupType;
import com.project.service.ping_me.domain.contract.Message;
import com.project.service.ping_me.domain.contract.PriceV2;
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
 * VehicleAttributeResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class VehicleAttributeResponse {

  private String make;

  private String model;

  @Valid
  private List<String> images;

  private GroupType groupType;

  private PriceV2 pricing;

  private String dealInfo;

  @Valid
  private List<@Valid AttributeV2> cardAttributes;

  @Valid
  private List<@Valid AttributeCategoryV2> detailAttributes = new ArrayList<>();

  private Amount totalPayableAmount;

  private BlockDateTime reservationBlockDateTime;

  private Message winterTyreMessage;

  public VehicleAttributeResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VehicleAttributeResponse(List<@Valid AttributeCategoryV2> detailAttributes) {
    this.detailAttributes = detailAttributes;
  }

  public VehicleAttributeResponse make(String make) {
    this.make = make;
    return this;
  }

  /**
   * Get make
   * @return make
  */
  
  @Schema(name = "make", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("make")
  public String getMake() {
    return make;
  }

  public void setMake(String make) {
    this.make = make;
  }

  public VehicleAttributeResponse model(String model) {
    this.model = model;
    return this;
  }

  /**
   * Get model
   * @return model
  */
  
  @Schema(name = "model", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("model")
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public VehicleAttributeResponse images(List<String> images) {
    this.images = images;
    return this;
  }

  public VehicleAttributeResponse addImagesItem(String imagesItem) {
    if (this.images == null) {
      this.images = new ArrayList<>();
    }
    this.images.add(imagesItem);
    return this;
  }

  /**
   * Get images
   * @return images
  */
  
  @Schema(name = "images", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("images")
  public List<String> getImages() {
    return images;
  }

  public void setImages(List<String> images) {
    this.images = images;
  }

  public VehicleAttributeResponse groupType(GroupType groupType) {
    this.groupType = groupType;
    return this;
  }

  /**
   * Get groupType
   * @return groupType
  */
  @Valid 
  @Schema(name = "groupType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("groupType")
  public GroupType getGroupType() {
    return groupType;
  }

  public void setGroupType(GroupType groupType) {
    this.groupType = groupType;
  }

  public VehicleAttributeResponse pricing(PriceV2 pricing) {
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

  public VehicleAttributeResponse dealInfo(String dealInfo) {
    this.dealInfo = dealInfo;
    return this;
  }

  /**
   * the field will denote what type of deal possible values BOOKED_CATEGORY, DISCOUNT, COMPLIMENTARY, GUARANTEED_MODEL
   * @return dealInfo
  */
  
  @Schema(name = "dealInfo", description = "the field will denote what type of deal possible values BOOKED_CATEGORY, DISCOUNT, COMPLIMENTARY, GUARANTEED_MODEL", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dealInfo")
  public String getDealInfo() {
    return dealInfo;
  }

  public void setDealInfo(String dealInfo) {
    this.dealInfo = dealInfo;
  }

  public VehicleAttributeResponse cardAttributes(List<@Valid AttributeV2> cardAttributes) {
    this.cardAttributes = cardAttributes;
    return this;
  }

  public VehicleAttributeResponse addCardAttributesItem(AttributeV2 cardAttributesItem) {
    if (this.cardAttributes == null) {
      this.cardAttributes = new ArrayList<>();
    }
    this.cardAttributes.add(cardAttributesItem);
    return this;
  }

  /**
   * Get cardAttributes
   * @return cardAttributes
  */
  @Valid 
  @Schema(name = "cardAttributes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cardAttributes")
  public List<@Valid AttributeV2> getCardAttributes() {
    return cardAttributes;
  }

  public void setCardAttributes(List<@Valid AttributeV2> cardAttributes) {
    this.cardAttributes = cardAttributes;
  }

  public VehicleAttributeResponse detailAttributes(List<@Valid AttributeCategoryV2> detailAttributes) {
    this.detailAttributes = detailAttributes;
    return this;
  }

  public VehicleAttributeResponse addDetailAttributesItem(AttributeCategoryV2 detailAttributesItem) {
    if (this.detailAttributes == null) {
      this.detailAttributes = new ArrayList<>();
    }
    this.detailAttributes.add(detailAttributesItem);
    return this;
  }

  /**
   * Get detailAttributes
   * @return detailAttributes
  */
  @NotNull @Valid 
  @Schema(name = "detailAttributes", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("detailAttributes")
  public List<@Valid AttributeCategoryV2> getDetailAttributes() {
    return detailAttributes;
  }

  public void setDetailAttributes(List<@Valid AttributeCategoryV2> detailAttributes) {
    this.detailAttributes = detailAttributes;
  }

  public VehicleAttributeResponse totalPayableAmount(Amount totalPayableAmount) {
    this.totalPayableAmount = totalPayableAmount;
    return this;
  }

  /**
   * Get totalPayableAmount
   * @return totalPayableAmount
  */
  @Valid 
  @Schema(name = "totalPayableAmount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalPayableAmount")
  public Amount getTotalPayableAmount() {
    return totalPayableAmount;
  }

  public void setTotalPayableAmount(Amount totalPayableAmount) {
    this.totalPayableAmount = totalPayableAmount;
  }

  public VehicleAttributeResponse reservationBlockDateTime(BlockDateTime reservationBlockDateTime) {
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

  public VehicleAttributeResponse winterTyreMessage(Message winterTyreMessage) {
    this.winterTyreMessage = winterTyreMessage;
    return this;
  }

  /**
   * Get winterTyreMessage
   * @return winterTyreMessage
  */
  @Valid 
  @Schema(name = "winterTyreMessage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("winterTyreMessage")
  public Message getWinterTyreMessage() {
    return winterTyreMessage;
  }

  public void setWinterTyreMessage(Message winterTyreMessage) {
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
    VehicleAttributeResponse vehicleAttributeResponse = (VehicleAttributeResponse) o;
    return Objects.equals(this.make, vehicleAttributeResponse.make) &&
        Objects.equals(this.model, vehicleAttributeResponse.model) &&
        Objects.equals(this.images, vehicleAttributeResponse.images) &&
        Objects.equals(this.groupType, vehicleAttributeResponse.groupType) &&
        Objects.equals(this.pricing, vehicleAttributeResponse.pricing) &&
        Objects.equals(this.dealInfo, vehicleAttributeResponse.dealInfo) &&
        Objects.equals(this.cardAttributes, vehicleAttributeResponse.cardAttributes) &&
        Objects.equals(this.detailAttributes, vehicleAttributeResponse.detailAttributes) &&
        Objects.equals(this.totalPayableAmount, vehicleAttributeResponse.totalPayableAmount) &&
        Objects.equals(this.reservationBlockDateTime, vehicleAttributeResponse.reservationBlockDateTime) &&
        Objects.equals(this.winterTyreMessage, vehicleAttributeResponse.winterTyreMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(make, model, images, groupType, pricing, dealInfo, cardAttributes, detailAttributes, totalPayableAmount, reservationBlockDateTime, winterTyreMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleAttributeResponse {\n");
    sb.append("    make: ").append(toIndentedString(make)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    groupType: ").append(toIndentedString(groupType)).append("\n");
    sb.append("    pricing: ").append(toIndentedString(pricing)).append("\n");
    sb.append("    dealInfo: ").append(toIndentedString(dealInfo)).append("\n");
    sb.append("    cardAttributes: ").append(toIndentedString(cardAttributes)).append("\n");
    sb.append("    detailAttributes: ").append(toIndentedString(detailAttributes)).append("\n");
    sb.append("    totalPayableAmount: ").append(toIndentedString(totalPayableAmount)).append("\n");
    sb.append("    reservationBlockDateTime: ").append(toIndentedString(reservationBlockDateTime)).append("\n");
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

