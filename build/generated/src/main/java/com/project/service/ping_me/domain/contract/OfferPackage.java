package com.project.service.ping_me.domain.contract;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.project.service.ping_me.domain.contract.Amount;
import com.project.service.ping_me.domain.contract.ChargeDetail;
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
 * OfferPackage
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OfferPackage {

  private String id;

  private String name;

  private String description;

  private Amount deductibleAmount;

  private Double ratingStars;

  private Boolean isPreviouslySelected;

  private Boolean isSelected;

  private Boolean isDeductibleAvailable;

  @Valid
  private List<@Valid ChargeDetail> includes = new ArrayList<>();

  @Valid
  private List<@Valid ChargeDetail> excludes = new ArrayList<>();

  private PriceV2 price;

  private Boolean isNudge;

  public OfferPackage() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OfferPackage(String id, String name, Amount deductibleAmount, Double ratingStars, Boolean isPreviouslySelected, Boolean isSelected, Boolean isDeductibleAvailable, List<@Valid ChargeDetail> includes, List<@Valid ChargeDetail> excludes, Boolean isNudge) {
    this.id = id;
    this.name = name;
    this.deductibleAmount = deductibleAmount;
    this.ratingStars = ratingStars;
    this.isPreviouslySelected = isPreviouslySelected;
    this.isSelected = isSelected;
    this.isDeductibleAvailable = isDeductibleAvailable;
    this.includes = includes;
    this.excludes = excludes;
    this.isNudge = isNudge;
  }

  public OfferPackage id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @NotNull 
  @Schema(name = "id", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public OfferPackage name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @NotNull 
  @Schema(name = "name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OfferPackage description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  
  @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public OfferPackage deductibleAmount(Amount deductibleAmount) {
    this.deductibleAmount = deductibleAmount;
    return this;
  }

  /**
   * Get deductibleAmount
   * @return deductibleAmount
  */
  @NotNull @Valid 
  @Schema(name = "deductibleAmount", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("deductibleAmount")
  public Amount getDeductibleAmount() {
    return deductibleAmount;
  }

  public void setDeductibleAmount(Amount deductibleAmount) {
    this.deductibleAmount = deductibleAmount;
  }

  public OfferPackage ratingStars(Double ratingStars) {
    this.ratingStars = ratingStars;
    return this;
  }

  /**
   * Get ratingStars
   * @return ratingStars
  */
  @NotNull 
  @Schema(name = "ratingStars", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ratingStars")
  public Double getRatingStars() {
    return ratingStars;
  }

  public void setRatingStars(Double ratingStars) {
    this.ratingStars = ratingStars;
  }

  public OfferPackage isPreviouslySelected(Boolean isPreviouslySelected) {
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

  public OfferPackage isSelected(Boolean isSelected) {
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

  public OfferPackage isDeductibleAvailable(Boolean isDeductibleAvailable) {
    this.isDeductibleAvailable = isDeductibleAvailable;
    return this;
  }

  /**
   * Get isDeductibleAvailable
   * @return isDeductibleAvailable
  */
  @NotNull 
  @Schema(name = "isDeductibleAvailable", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("isDeductibleAvailable")
  public Boolean isIsDeductibleAvailable() {
    return isDeductibleAvailable;
  }

  public void setIsDeductibleAvailable(Boolean isDeductibleAvailable) {
    this.isDeductibleAvailable = isDeductibleAvailable;
  }

  public OfferPackage includes(List<@Valid ChargeDetail> includes) {
    this.includes = includes;
    return this;
  }

  public OfferPackage addIncludesItem(ChargeDetail includesItem) {
    if (this.includes == null) {
      this.includes = new ArrayList<>();
    }
    this.includes.add(includesItem);
    return this;
  }

  /**
   * Get includes
   * @return includes
  */
  @NotNull @Valid 
  @Schema(name = "includes", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("includes")
  public List<@Valid ChargeDetail> getIncludes() {
    return includes;
  }

  public void setIncludes(List<@Valid ChargeDetail> includes) {
    this.includes = includes;
  }

  public OfferPackage excludes(List<@Valid ChargeDetail> excludes) {
    this.excludes = excludes;
    return this;
  }

  public OfferPackage addExcludesItem(ChargeDetail excludesItem) {
    if (this.excludes == null) {
      this.excludes = new ArrayList<>();
    }
    this.excludes.add(excludesItem);
    return this;
  }

  /**
   * Get excludes
   * @return excludes
  */
  @NotNull @Valid 
  @Schema(name = "excludes", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("excludes")
  public List<@Valid ChargeDetail> getExcludes() {
    return excludes;
  }

  public void setExcludes(List<@Valid ChargeDetail> excludes) {
    this.excludes = excludes;
  }

  public OfferPackage price(PriceV2 price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
  */
  @Valid 
  @Schema(name = "price", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("price")
  public PriceV2 getPrice() {
    return price;
  }

  public void setPrice(PriceV2 price) {
    this.price = price;
  }

  public OfferPackage isNudge(Boolean isNudge) {
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
    OfferPackage offerPackage = (OfferPackage) o;
    return Objects.equals(this.id, offerPackage.id) &&
        Objects.equals(this.name, offerPackage.name) &&
        Objects.equals(this.description, offerPackage.description) &&
        Objects.equals(this.deductibleAmount, offerPackage.deductibleAmount) &&
        Objects.equals(this.ratingStars, offerPackage.ratingStars) &&
        Objects.equals(this.isPreviouslySelected, offerPackage.isPreviouslySelected) &&
        Objects.equals(this.isSelected, offerPackage.isSelected) &&
        Objects.equals(this.isDeductibleAvailable, offerPackage.isDeductibleAvailable) &&
        Objects.equals(this.includes, offerPackage.includes) &&
        Objects.equals(this.excludes, offerPackage.excludes) &&
        Objects.equals(this.price, offerPackage.price) &&
        Objects.equals(this.isNudge, offerPackage.isNudge);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, deductibleAmount, ratingStars, isPreviouslySelected, isSelected, isDeductibleAvailable, includes, excludes, price, isNudge);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferPackage {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    deductibleAmount: ").append(toIndentedString(deductibleAmount)).append("\n");
    sb.append("    ratingStars: ").append(toIndentedString(ratingStars)).append("\n");
    sb.append("    isPreviouslySelected: ").append(toIndentedString(isPreviouslySelected)).append("\n");
    sb.append("    isSelected: ").append(toIndentedString(isSelected)).append("\n");
    sb.append("    isDeductibleAvailable: ").append(toIndentedString(isDeductibleAvailable)).append("\n");
    sb.append("    includes: ").append(toIndentedString(includes)).append("\n");
    sb.append("    excludes: ").append(toIndentedString(excludes)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
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

