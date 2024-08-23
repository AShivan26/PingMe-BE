package com.project.service.ping_me.domain.contract;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.project.service.ping_me.domain.contract.PriceV2;
import com.project.service.ping_me.domain.contract.SelectionStrategy;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * AdditionalChargeInfo
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AdditionalChargeInfo {

  private PriceV2 price;

  private Boolean isPreviouslySelected;

  private Boolean isSelected;

  private Boolean isEnabled;

  private SelectionStrategy selectionStrategy;

  private Boolean isNudge;

  public AdditionalChargeInfo() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AdditionalChargeInfo(PriceV2 price, Boolean isPreviouslySelected, Boolean isSelected, Boolean isEnabled, Boolean isNudge) {
    this.price = price;
    this.isPreviouslySelected = isPreviouslySelected;
    this.isSelected = isSelected;
    this.isEnabled = isEnabled;
    this.isNudge = isNudge;
  }

  public AdditionalChargeInfo price(PriceV2 price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
  */
  @NotNull @Valid 
  @Schema(name = "price", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("price")
  public PriceV2 getPrice() {
    return price;
  }

  public void setPrice(PriceV2 price) {
    this.price = price;
  }

  public AdditionalChargeInfo isPreviouslySelected(Boolean isPreviouslySelected) {
    this.isPreviouslySelected = isPreviouslySelected;
    return this;
  }

  /**
   * Get isPreviouslySelected
   * @return isPreviouslySelected
  */
  @NotNull 
  @Schema(name = "isPreviouslySelected", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("isPreviouslySelected")
  public Boolean isIsPreviouslySelected() {
    return isPreviouslySelected;
  }

  public void setIsPreviouslySelected(Boolean isPreviouslySelected) {
    this.isPreviouslySelected = isPreviouslySelected;
  }

  public AdditionalChargeInfo isSelected(Boolean isSelected) {
    this.isSelected = isSelected;
    return this;
  }

  /**
   * Get isSelected
   * @return isSelected
  */
  @NotNull 
  @Schema(name = "isSelected", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("isSelected")
  public Boolean isIsSelected() {
    return isSelected;
  }

  public void setIsSelected(Boolean isSelected) {
    this.isSelected = isSelected;
  }

  public AdditionalChargeInfo isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

  /**
   * Get isEnabled
   * @return isEnabled
  */
  @NotNull 
  @Schema(name = "isEnabled", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("isEnabled")
  public Boolean isIsEnabled() {
    return isEnabled;
  }

  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }

  public AdditionalChargeInfo selectionStrategy(SelectionStrategy selectionStrategy) {
    this.selectionStrategy = selectionStrategy;
    return this;
  }

  /**
   * Get selectionStrategy
   * @return selectionStrategy
  */
  @Valid 
  @Schema(name = "selectionStrategy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("selectionStrategy")
  public SelectionStrategy getSelectionStrategy() {
    return selectionStrategy;
  }

  public void setSelectionStrategy(SelectionStrategy selectionStrategy) {
    this.selectionStrategy = selectionStrategy;
  }

  public AdditionalChargeInfo isNudge(Boolean isNudge) {
    this.isNudge = isNudge;
    return this;
  }

  /**
   * Get isNudge
   * @return isNudge
  */
  @NotNull 
  @Schema(name = "isNudge", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("isNudge")
  public Boolean isIsNudge() {
    return isNudge;
  }

  public void setIsNudge(Boolean isNudge) {
    this.isNudge = isNudge;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdditionalChargeInfo additionalChargeInfo = (AdditionalChargeInfo) o;
    return Objects.equals(this.price, additionalChargeInfo.price) &&
        Objects.equals(this.isPreviouslySelected, additionalChargeInfo.isPreviouslySelected) &&
        Objects.equals(this.isSelected, additionalChargeInfo.isSelected) &&
        Objects.equals(this.isEnabled, additionalChargeInfo.isEnabled) &&
        Objects.equals(this.selectionStrategy, additionalChargeInfo.selectionStrategy) &&
        Objects.equals(this.isNudge, additionalChargeInfo.isNudge);
  }

  @Override
  public int hashCode() {
    return Objects.hash(price, isPreviouslySelected, isSelected, isEnabled, selectionStrategy, isNudge);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionalChargeInfo {\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    isPreviouslySelected: ").append(toIndentedString(isPreviouslySelected)).append("\n");
    sb.append("    isSelected: ").append(toIndentedString(isSelected)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    selectionStrategy: ").append(toIndentedString(selectionStrategy)).append("\n");
    sb.append("    isNudge: ").append(toIndentedString(isNudge)).append("\n");
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

