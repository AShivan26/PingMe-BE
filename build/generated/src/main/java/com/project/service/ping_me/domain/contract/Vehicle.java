package com.project.service.ping_me.domain.contract;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.project.service.ping_me.domain.contract.Attribute;
import com.project.service.ping_me.domain.contract.AttributeCategory;
import com.project.service.ping_me.domain.contract.GroupType;
import com.project.service.ping_me.domain.contract.SecondaryFilterAttribute;
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
 * Vehicle
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class Vehicle {

  private String id;

  private String acriss;

  private String licensePlate;

  private String make;

  private String model;

  private String color;

  private Integer drivenMileage;

  private Integer carAge;

  @Valid
  private List<String> images = new ArrayList<>();

  @Valid
  private List<@Valid Attribute> attributeSummary = new ArrayList<>();

  @Valid
  private List<@Valid AttributeCategory> attributeCategories = new ArrayList<>();

  @Valid
  private List<@Valid SecondaryFilterAttribute> secondaryFilterAttributes;

  private Integer bagsCount;

  private Integer passengersCount;

  private GroupType groupType;

  private String tyreType;

  private String transmissionType;

  private String fuelType;

  public Vehicle() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Vehicle(String id, String make, String model, String color, List<String> images, List<@Valid Attribute> attributeSummary, List<@Valid AttributeCategory> attributeCategories, Integer bagsCount, Integer passengersCount, String tyreType, String transmissionType, String fuelType) {
    this.id = id;
    this.make = make;
    this.model = model;
    this.color = color;
    this.images = images;
    this.attributeSummary = attributeSummary;
    this.attributeCategories = attributeCategories;
    this.bagsCount = bagsCount;
    this.passengersCount = passengersCount;
    this.tyreType = tyreType;
    this.transmissionType = transmissionType;
    this.fuelType = fuelType;
  }

  public Vehicle id(String id) {
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

  public Vehicle acriss(String acriss) {
    this.acriss = acriss;
    return this;
  }

  /**
   * Get acriss
   * @return acriss
  */
  
  @Schema(name = "acriss", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("acriss")
  public String getAcriss() {
    return acriss;
  }

  public void setAcriss(String acriss) {
    this.acriss = acriss;
  }

  public Vehicle licensePlate(String licensePlate) {
    this.licensePlate = licensePlate;
    return this;
  }

  /**
   * Get licensePlate
   * @return licensePlate
  */
  
  @Schema(name = "licensePlate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("licensePlate")
  public String getLicensePlate() {
    return licensePlate;
  }

  public void setLicensePlate(String licensePlate) {
    this.licensePlate = licensePlate;
  }

  public Vehicle make(String make) {
    this.make = make;
    return this;
  }

  /**
   * Get make
   * @return make
  */
  @NotNull 
  @Schema(name = "make", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("make")
  public String getMake() {
    return make;
  }

  public void setMake(String make) {
    this.make = make;
  }

  public Vehicle model(String model) {
    this.model = model;
    return this;
  }

  /**
   * Get model
   * @return model
  */
  @NotNull 
  @Schema(name = "model", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("model")
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public Vehicle color(String color) {
    this.color = color;
    return this;
  }

  /**
   * Get color
   * @return color
  */
  @NotNull 
  @Schema(name = "color", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("color")
  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public Vehicle drivenMileage(Integer drivenMileage) {
    this.drivenMileage = drivenMileage;
    return this;
  }

  /**
   * the number of miles the car has driven. [Optional] this field should be presented only in case of it is presented on the vehicle card.
   * @return drivenMileage
  */
  
  @Schema(name = "drivenMileage", example = "50", description = "the number of miles the car has driven. [Optional] this field should be presented only in case of it is presented on the vehicle card.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("drivenMileage")
  public Integer getDrivenMileage() {
    return drivenMileage;
  }

  public void setDrivenMileage(Integer drivenMileage) {
    this.drivenMileage = drivenMileage;
  }

  public Vehicle carAge(Integer carAge) {
    this.carAge = carAge;
    return this;
  }

  /**
   * the age of the car in days. [Optional] this field should be presented only in case of it is presented on the vehicle card.
   * @return carAge
  */
  
  @Schema(name = "carAge", example = "45", description = "the age of the car in days. [Optional] this field should be presented only in case of it is presented on the vehicle card.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("carAge")
  public Integer getCarAge() {
    return carAge;
  }

  public void setCarAge(Integer carAge) {
    this.carAge = carAge;
  }

  public Vehicle images(List<String> images) {
    this.images = images;
    return this;
  }

  public Vehicle addImagesItem(String imagesItem) {
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
  @NotNull 
  @Schema(name = "images", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("images")
  public List<String> getImages() {
    return images;
  }

  public void setImages(List<String> images) {
    this.images = images;
  }

  public Vehicle attributeSummary(List<@Valid Attribute> attributeSummary) {
    this.attributeSummary = attributeSummary;
    return this;
  }

  public Vehicle addAttributeSummaryItem(Attribute attributeSummaryItem) {
    if (this.attributeSummary == null) {
      this.attributeSummary = new ArrayList<>();
    }
    this.attributeSummary.add(attributeSummaryItem);
    return this;
  }

  /**
   * Get attributeSummary
   * @return attributeSummary
  */
  @NotNull @Valid 
  @Schema(name = "attributeSummary", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("attributeSummary")
  public List<@Valid Attribute> getAttributeSummary() {
    return attributeSummary;
  }

  public void setAttributeSummary(List<@Valid Attribute> attributeSummary) {
    this.attributeSummary = attributeSummary;
  }

  public Vehicle attributeCategories(List<@Valid AttributeCategory> attributeCategories) {
    this.attributeCategories = attributeCategories;
    return this;
  }

  public Vehicle addAttributeCategoriesItem(AttributeCategory attributeCategoriesItem) {
    if (this.attributeCategories == null) {
      this.attributeCategories = new ArrayList<>();
    }
    this.attributeCategories.add(attributeCategoriesItem);
    return this;
  }

  /**
   * Get attributeCategories
   * @return attributeCategories
  */
  @NotNull @Valid 
  @Schema(name = "attributeCategories", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("attributeCategories")
  public List<@Valid AttributeCategory> getAttributeCategories() {
    return attributeCategories;
  }

  public void setAttributeCategories(List<@Valid AttributeCategory> attributeCategories) {
    this.attributeCategories = attributeCategories;
  }

  public Vehicle secondaryFilterAttributes(List<@Valid SecondaryFilterAttribute> secondaryFilterAttributes) {
    this.secondaryFilterAttributes = secondaryFilterAttributes;
    return this;
  }

  public Vehicle addSecondaryFilterAttributesItem(SecondaryFilterAttribute secondaryFilterAttributesItem) {
    if (this.secondaryFilterAttributes == null) {
      this.secondaryFilterAttributes = new ArrayList<>();
    }
    this.secondaryFilterAttributes.add(secondaryFilterAttributesItem);
    return this;
  }

  /**
   * Get secondaryFilterAttributes
   * @return secondaryFilterAttributes
  */
  @Valid 
  @Schema(name = "secondaryFilterAttributes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("secondaryFilterAttributes")
  public List<@Valid SecondaryFilterAttribute> getSecondaryFilterAttributes() {
    return secondaryFilterAttributes;
  }

  public void setSecondaryFilterAttributes(List<@Valid SecondaryFilterAttribute> secondaryFilterAttributes) {
    this.secondaryFilterAttributes = secondaryFilterAttributes;
  }

  public Vehicle bagsCount(Integer bagsCount) {
    this.bagsCount = bagsCount;
    return this;
  }

  /**
   * Get bagsCount
   * @return bagsCount
  */
  @NotNull 
  @Schema(name = "bagsCount", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("bagsCount")
  public Integer getBagsCount() {
    return bagsCount;
  }

  public void setBagsCount(Integer bagsCount) {
    this.bagsCount = bagsCount;
  }

  public Vehicle passengersCount(Integer passengersCount) {
    this.passengersCount = passengersCount;
    return this;
  }

  /**
   * Get passengersCount
   * @return passengersCount
  */
  @NotNull 
  @Schema(name = "passengersCount", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("passengersCount")
  public Integer getPassengersCount() {
    return passengersCount;
  }

  public void setPassengersCount(Integer passengersCount) {
    this.passengersCount = passengersCount;
  }

  public Vehicle groupType(GroupType groupType) {
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

  public Vehicle tyreType(String tyreType) {
    this.tyreType = tyreType;
    return this;
  }

  /**
   * Possible values winter, summer. If the vehicle is equipped with winter tyres, return winter else summer.
   * @return tyreType
  */
  @NotNull 
  @Schema(name = "tyreType", description = "Possible values winter, summer. If the vehicle is equipped with winter tyres, return winter else summer.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("tyreType")
  public String getTyreType() {
    return tyreType;
  }

  public void setTyreType(String tyreType) {
    this.tyreType = tyreType;
  }

  public Vehicle transmissionType(String transmissionType) {
    this.transmissionType = transmissionType;
    return this;
  }

  /**
   * Possible values Automatic, Manual.
   * @return transmissionType
  */
  @NotNull 
  @Schema(name = "transmissionType", description = "Possible values Automatic, Manual.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("transmissionType")
  public String getTransmissionType() {
    return transmissionType;
  }

  public void setTransmissionType(String transmissionType) {
    this.transmissionType = transmissionType;
  }

  public Vehicle fuelType(String fuelType) {
    this.fuelType = fuelType;
    return this;
  }

  /**
   * Possible values Electric, Petrol, Diesel, Hybrid.
   * @return fuelType
  */
  @NotNull 
  @Schema(name = "fuelType", description = "Possible values Electric, Petrol, Diesel, Hybrid.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("fuelType")
  public String getFuelType() {
    return fuelType;
  }

  public void setFuelType(String fuelType) {
    this.fuelType = fuelType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Vehicle vehicle = (Vehicle) o;
    return Objects.equals(this.id, vehicle.id) &&
        Objects.equals(this.acriss, vehicle.acriss) &&
        Objects.equals(this.licensePlate, vehicle.licensePlate) &&
        Objects.equals(this.make, vehicle.make) &&
        Objects.equals(this.model, vehicle.model) &&
        Objects.equals(this.color, vehicle.color) &&
        Objects.equals(this.drivenMileage, vehicle.drivenMileage) &&
        Objects.equals(this.carAge, vehicle.carAge) &&
        Objects.equals(this.images, vehicle.images) &&
        Objects.equals(this.attributeSummary, vehicle.attributeSummary) &&
        Objects.equals(this.attributeCategories, vehicle.attributeCategories) &&
        Objects.equals(this.secondaryFilterAttributes, vehicle.secondaryFilterAttributes) &&
        Objects.equals(this.bagsCount, vehicle.bagsCount) &&
        Objects.equals(this.passengersCount, vehicle.passengersCount) &&
        Objects.equals(this.groupType, vehicle.groupType) &&
        Objects.equals(this.tyreType, vehicle.tyreType) &&
        Objects.equals(this.transmissionType, vehicle.transmissionType) &&
        Objects.equals(this.fuelType, vehicle.fuelType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, acriss, licensePlate, make, model, color, drivenMileage, carAge, images, attributeSummary, attributeCategories, secondaryFilterAttributes, bagsCount, passengersCount, groupType, tyreType, transmissionType, fuelType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Vehicle {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    acriss: ").append(toIndentedString(acriss)).append("\n");
    sb.append("    licensePlate: ").append(toIndentedString(licensePlate)).append("\n");
    sb.append("    make: ").append(toIndentedString(make)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    drivenMileage: ").append(toIndentedString(drivenMileage)).append("\n");
    sb.append("    carAge: ").append(toIndentedString(carAge)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    attributeSummary: ").append(toIndentedString(attributeSummary)).append("\n");
    sb.append("    attributeCategories: ").append(toIndentedString(attributeCategories)).append("\n");
    sb.append("    secondaryFilterAttributes: ").append(toIndentedString(secondaryFilterAttributes)).append("\n");
    sb.append("    bagsCount: ").append(toIndentedString(bagsCount)).append("\n");
    sb.append("    passengersCount: ").append(toIndentedString(passengersCount)).append("\n");
    sb.append("    groupType: ").append(toIndentedString(groupType)).append("\n");
    sb.append("    tyreType: ").append(toIndentedString(tyreType)).append("\n");
    sb.append("    transmissionType: ").append(toIndentedString(transmissionType)).append("\n");
    sb.append("    fuelType: ").append(toIndentedString(fuelType)).append("\n");
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

