package com.project.service.ping_me.domain.contract;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.project.service.ping_me.domain.contract.BlockDateTime;
import com.project.service.ping_me.domain.contract.IDs;
import com.project.service.ping_me.domain.contract.InstructionDetails;
import com.project.service.ping_me.domain.contract.Trip;
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
 * PaymentCounterResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class PaymentCounterResponse {

  private IDs internalIds;

  private String vehicleTitle;

  private String vehicleSubtitle;

  private String imageUrl;

  @Valid
  private List<@Valid InstructionDetails> instructionList = new ArrayList<>();

  private Trip trip;

  private BlockDateTime blockDateTime;

  public PaymentCounterResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PaymentCounterResponse(IDs internalIds, String vehicleTitle, String imageUrl, List<@Valid InstructionDetails> instructionList, Trip trip) {
    this.internalIds = internalIds;
    this.vehicleTitle = vehicleTitle;
    this.imageUrl = imageUrl;
    this.instructionList = instructionList;
    this.trip = trip;
  }

  public PaymentCounterResponse internalIds(IDs internalIds) {
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

  public PaymentCounterResponse vehicleTitle(String vehicleTitle) {
    this.vehicleTitle = vehicleTitle;
    return this;
  }

  /**
   * Get vehicleTitle
   * @return vehicleTitle
  */
  @NotNull 
  @Schema(name = "vehicleTitle", example = "Midsize SUV", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("vehicleTitle")
  public String getVehicleTitle() {
    return vehicleTitle;
  }

  public void setVehicleTitle(String vehicleTitle) {
    this.vehicleTitle = vehicleTitle;
  }

  public PaymentCounterResponse vehicleSubtitle(String vehicleSubtitle) {
    this.vehicleSubtitle = vehicleSubtitle;
    return this;
  }

  /**
   * Get vehicleSubtitle
   * @return vehicleSubtitle
  */
  
  @Schema(name = "vehicleSubtitle", example = "BMW 7 Series or similar", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vehicleSubtitle")
  public String getVehicleSubtitle() {
    return vehicleSubtitle;
  }

  public void setVehicleSubtitle(String vehicleSubtitle) {
    this.vehicleSubtitle = vehicleSubtitle;
  }

  public PaymentCounterResponse imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

  /**
   * Get imageUrl
   * @return imageUrl
  */
  @NotNull 
  @Schema(name = "imageUrl", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("imageUrl")
  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public PaymentCounterResponse instructionList(List<@Valid InstructionDetails> instructionList) {
    this.instructionList = instructionList;
    return this;
  }

  public PaymentCounterResponse addInstructionListItem(InstructionDetails instructionListItem) {
    if (this.instructionList == null) {
      this.instructionList = new ArrayList<>();
    }
    this.instructionList.add(instructionListItem);
    return this;
  }

  /**
   * Get instructionList
   * @return instructionList
  */
  @NotNull @Valid 
  @Schema(name = "instructionList", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("instructionList")
  public List<@Valid InstructionDetails> getInstructionList() {
    return instructionList;
  }

  public void setInstructionList(List<@Valid InstructionDetails> instructionList) {
    this.instructionList = instructionList;
  }

  public PaymentCounterResponse trip(Trip trip) {
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
  public Trip getTrip() {
    return trip;
  }

  public void setTrip(Trip trip) {
    this.trip = trip;
  }

  public PaymentCounterResponse blockDateTime(BlockDateTime blockDateTime) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentCounterResponse paymentCounterResponse = (PaymentCounterResponse) o;
    return Objects.equals(this.internalIds, paymentCounterResponse.internalIds) &&
        Objects.equals(this.vehicleTitle, paymentCounterResponse.vehicleTitle) &&
        Objects.equals(this.vehicleSubtitle, paymentCounterResponse.vehicleSubtitle) &&
        Objects.equals(this.imageUrl, paymentCounterResponse.imageUrl) &&
        Objects.equals(this.instructionList, paymentCounterResponse.instructionList) &&
        Objects.equals(this.trip, paymentCounterResponse.trip) &&
        Objects.equals(this.blockDateTime, paymentCounterResponse.blockDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(internalIds, vehicleTitle, vehicleSubtitle, imageUrl, instructionList, trip, blockDateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentCounterResponse {\n");
    sb.append("    internalIds: ").append(toIndentedString(internalIds)).append("\n");
    sb.append("    vehicleTitle: ").append(toIndentedString(vehicleTitle)).append("\n");
    sb.append("    vehicleSubtitle: ").append(toIndentedString(vehicleSubtitle)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    instructionList: ").append(toIndentedString(instructionList)).append("\n");
    sb.append("    trip: ").append(toIndentedString(trip)).append("\n");
    sb.append("    blockDateTime: ").append(toIndentedString(blockDateTime)).append("\n");
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

