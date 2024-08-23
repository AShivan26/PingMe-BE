package com.project.service.ping_me.domain.contract;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.project.service.ping_me.domain.contract.BillingSection;
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
 * PriceBreakdown
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class PriceBreakdown {

  @Valid
  private List<@Valid BillingSection> billingSections = new ArrayList<>();

  private String infoMessage;

  public PriceBreakdown() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PriceBreakdown(List<@Valid BillingSection> billingSections) {
    this.billingSections = billingSections;
  }

  public PriceBreakdown billingSections(List<@Valid BillingSection> billingSections) {
    this.billingSections = billingSections;
    return this;
  }

  public PriceBreakdown addBillingSectionsItem(BillingSection billingSectionsItem) {
    if (this.billingSections == null) {
      this.billingSections = new ArrayList<>();
    }
    this.billingSections.add(billingSectionsItem);
    return this;
  }

  /**
   * Get billingSections
   * @return billingSections
  */
  @NotNull @Valid 
  @Schema(name = "billingSections", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("billingSections")
  public List<@Valid BillingSection> getBillingSections() {
    return billingSections;
  }

  public void setBillingSections(List<@Valid BillingSection> billingSections) {
    this.billingSections = billingSections;
  }

  public PriceBreakdown infoMessage(String infoMessage) {
    this.infoMessage = infoMessage;
    return this;
  }

  /**
   * Get infoMessage
   * @return infoMessage
  */
  
  @Schema(name = "infoMessage", example = "We will put a hold of $742 on your credit card and you will be charged once you return the car.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("infoMessage")
  public String getInfoMessage() {
    return infoMessage;
  }

  public void setInfoMessage(String infoMessage) {
    this.infoMessage = infoMessage;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PriceBreakdown priceBreakdown = (PriceBreakdown) o;
    return Objects.equals(this.billingSections, priceBreakdown.billingSections) &&
        Objects.equals(this.infoMessage, priceBreakdown.infoMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingSections, infoMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceBreakdown {\n");
    sb.append("    billingSections: ").append(toIndentedString(billingSections)).append("\n");
    sb.append("    infoMessage: ").append(toIndentedString(infoMessage)).append("\n");
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

