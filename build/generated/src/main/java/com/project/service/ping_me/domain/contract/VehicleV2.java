package com.project.service.ping_me.domain.contract;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.project.service.ping_me.domain.contract.AttributeV2;
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
 * VehicleV2
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class VehicleV2 {

  private String id;

  private String brand;

  private String model;

  private String acrissCode;

  @Valid
  private List<String> images = new ArrayList<>();

  private Integer bagsCount;

  private Integer passengersCount;

  private String groupType;

  private String tyreType;

  private String transmissionType;

  private String fuelType;

  private Boolean isNewCar;

  private Boolean isRecommended;

  private Boolean isMoreLuxury;

  private Boolean isExcitingDiscount;

  @Valid
  private List<@Valid AttributeV2> attributes;

  /**
   * vehicle status, which can be used in the block vehicle to indicate if the vehicle is blocked or reserved.
   */
  public enum VehicleStatusEnum {
    UNKNOWN("UNKNOWN"),
    
    AVAILABLE("AVAILABLE"),
    
    BLOCKED("BLOCKED"),
    
    RESERVED("RESERVED");

    private String value;

    VehicleStatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static VehicleStatusEnum fromValue(String value) {
      for (VehicleStatusEnum b : VehicleStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private VehicleStatusEnum vehicleStatus;

  public VehicleV2() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VehicleV2(String id, String brand, String model, List<String> images, Integer bagsCount, String tyreType, String transmissionType, String fuelType) {
    this.id = id;
    this.brand = brand;
    this.model = model;
    this.images = images;
    this.bagsCount = bagsCount;
    this.tyreType = tyreType;
    this.transmissionType = transmissionType;
    this.fuelType = fuelType;
  }

  public VehicleV2 id(String id) {
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

  public VehicleV2 brand(String brand) {
    this.brand = brand;
    return this;
  }

  /**
   * Get brand
   * @return brand
  */
  @NotNull 
  @Schema(name = "brand", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("brand")
  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public VehicleV2 model(String model) {
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

  public VehicleV2 acrissCode(String acrissCode) {
    this.acrissCode = acrissCode;
    return this;
  }

  /**
   * Get acrissCode
   * @return acrissCode
  */
  
  @Schema(name = "acrissCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("acrissCode")
  public String getAcrissCode() {
    return acrissCode;
  }

  public void setAcrissCode(String acrissCode) {
    this.acrissCode = acrissCode;
  }

  public VehicleV2 images(List<String> images) {
    this.images = images;
    return this;
  }

  public VehicleV2 addImagesItem(String imagesItem) {
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

  public VehicleV2 bagsCount(Integer bagsCount) {
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

  public VehicleV2 passengersCount(Integer passengersCount) {
    this.passengersCount = passengersCount;
    return this;
  }

  /**
   * Get passengersCount
   * @return passengersCount
  */
  
  @Schema(name = "passengersCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("passengersCount")
  public Integer getPassengersCount() {
    return passengersCount;
  }

  public void setPassengersCount(Integer passengersCount) {
    this.passengersCount = passengersCount;
  }

  public VehicleV2 groupType(String groupType) {
    this.groupType = groupType;
    return this;
  }

  /**
   * Get groupType
   * @return groupType
  */
  
  @Schema(name = "groupType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("groupType")
  public String getGroupType() {
    return groupType;
  }

  public void setGroupType(String groupType) {
    this.groupType = groupType;
  }

  public VehicleV2 tyreType(String tyreType) {
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

  public VehicleV2 transmissionType(String transmissionType) {
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

  public VehicleV2 fuelType(String fuelType) {
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

  public VehicleV2 isNewCar(Boolean isNewCar) {
    this.isNewCar = isNewCar;
    return this;
  }

  /**
   * to be used for quick filters if the car is driven under x kms/miles
   * @return isNewCar
  */
  
  @Schema(name = "isNewCar", description = "to be used for quick filters if the car is driven under x kms/miles", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isNewCar")
  public Boolean isIsNewCar() {
    return isNewCar;
  }

  public void setIsNewCar(Boolean isNewCar) {
    this.isNewCar = isNewCar;
  }

  public VehicleV2 isRecommended(Boolean isRecommended) {
    this.isRecommended = isRecommended;
    return this;
  }

  /**
   * to be used for quick filters, in case the vehicle is to be more likely to be upsold
   * @return isRecommended
  */
  
  @Schema(name = "isRecommended", description = "to be used for quick filters, in case the vehicle is to be more likely to be upsold", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isRecommended")
  public Boolean isIsRecommended() {
    return isRecommended;
  }

  public void setIsRecommended(Boolean isRecommended) {
    this.isRecommended = isRecommended;
  }

  public VehicleV2 isMoreLuxury(Boolean isMoreLuxury) {
    this.isMoreLuxury = isMoreLuxury;
    return this;
  }

  /**
   * to be used for quick filters, in case the vehicle is more luxury than booked category
   * @return isMoreLuxury
  */
  
  @Schema(name = "isMoreLuxury", description = "to be used for quick filters, in case the vehicle is more luxury than booked category", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isMoreLuxury")
  public Boolean isIsMoreLuxury() {
    return isMoreLuxury;
  }

  public void setIsMoreLuxury(Boolean isMoreLuxury) {
    this.isMoreLuxury = isMoreLuxury;
  }

  public VehicleV2 isExcitingDiscount(Boolean isExcitingDiscount) {
    this.isExcitingDiscount = isExcitingDiscount;
    return this;
  }

  /**
   * to be used for quick filters, in case the vehicle is more discounted than the config
   * @return isExcitingDiscount
  */
  
  @Schema(name = "isExcitingDiscount", description = "to be used for quick filters, in case the vehicle is more discounted than the config", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isExcitingDiscount")
  public Boolean isIsExcitingDiscount() {
    return isExcitingDiscount;
  }

  public void setIsExcitingDiscount(Boolean isExcitingDiscount) {
    this.isExcitingDiscount = isExcitingDiscount;
  }

  public VehicleV2 attributes(List<@Valid AttributeV2> attributes) {
    this.attributes = attributes;
    return this;
  }

  public VehicleV2 addAttributesItem(AttributeV2 attributesItem) {
    if (this.attributes == null) {
      this.attributes = new ArrayList<>();
    }
    this.attributes.add(attributesItem);
    return this;
  }

  /**
   * Get attributes
   * @return attributes
  */
  @Valid 
  @Schema(name = "attributes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("attributes")
  public List<@Valid AttributeV2> getAttributes() {
    return attributes;
  }

  public void setAttributes(List<@Valid AttributeV2> attributes) {
    this.attributes = attributes;
  }

  public VehicleV2 vehicleStatus(VehicleStatusEnum vehicleStatus) {
    this.vehicleStatus = vehicleStatus;
    return this;
  }

  /**
   * vehicle status, which can be used in the block vehicle to indicate if the vehicle is blocked or reserved.
   * @return vehicleStatus
  */
  
  @Schema(name = "vehicleStatus", description = "vehicle status, which can be used in the block vehicle to indicate if the vehicle is blocked or reserved.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vehicleStatus")
  public VehicleStatusEnum getVehicleStatus() {
    return vehicleStatus;
  }

  public void setVehicleStatus(VehicleStatusEnum vehicleStatus) {
    this.vehicleStatus = vehicleStatus;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VehicleV2 vehicleV2 = (VehicleV2) o;
    return Objects.equals(this.id, vehicleV2.id) &&
        Objects.equals(this.brand, vehicleV2.brand) &&
        Objects.equals(this.model, vehicleV2.model) &&
        Objects.equals(this.acrissCode, vehicleV2.acrissCode) &&
        Objects.equals(this.images, vehicleV2.images) &&
        Objects.equals(this.bagsCount, vehicleV2.bagsCount) &&
        Objects.equals(this.passengersCount, vehicleV2.passengersCount) &&
        Objects.equals(this.groupType, vehicleV2.groupType) &&
        Objects.equals(this.tyreType, vehicleV2.tyreType) &&
        Objects.equals(this.transmissionType, vehicleV2.transmissionType) &&
        Objects.equals(this.fuelType, vehicleV2.fuelType) &&
        Objects.equals(this.isNewCar, vehicleV2.isNewCar) &&
        Objects.equals(this.isRecommended, vehicleV2.isRecommended) &&
        Objects.equals(this.isMoreLuxury, vehicleV2.isMoreLuxury) &&
        Objects.equals(this.isExcitingDiscount, vehicleV2.isExcitingDiscount) &&
        Objects.equals(this.attributes, vehicleV2.attributes) &&
        Objects.equals(this.vehicleStatus, vehicleV2.vehicleStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, brand, model, acrissCode, images, bagsCount, passengersCount, groupType, tyreType, transmissionType, fuelType, isNewCar, isRecommended, isMoreLuxury, isExcitingDiscount, attributes, vehicleStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleV2 {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    acrissCode: ").append(toIndentedString(acrissCode)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    bagsCount: ").append(toIndentedString(bagsCount)).append("\n");
    sb.append("    passengersCount: ").append(toIndentedString(passengersCount)).append("\n");
    sb.append("    groupType: ").append(toIndentedString(groupType)).append("\n");
    sb.append("    tyreType: ").append(toIndentedString(tyreType)).append("\n");
    sb.append("    transmissionType: ").append(toIndentedString(transmissionType)).append("\n");
    sb.append("    fuelType: ").append(toIndentedString(fuelType)).append("\n");
    sb.append("    isNewCar: ").append(toIndentedString(isNewCar)).append("\n");
    sb.append("    isRecommended: ").append(toIndentedString(isRecommended)).append("\n");
    sb.append("    isMoreLuxury: ").append(toIndentedString(isMoreLuxury)).append("\n");
    sb.append("    isExcitingDiscount: ").append(toIndentedString(isExcitingDiscount)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    vehicleStatus: ").append(toIndentedString(vehicleStatus)).append("\n");
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

