package com.project.service.ping_me.domain.contract;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * Filter
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class Filter {

  @Valid
  private List<String> brands = new ArrayList<>();

  @Valid
  private List<String> transmissionTypes = new ArrayList<>();

  @Valid
  private List<String> fuelTypes = new ArrayList<>();

  public Filter() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Filter(List<String> brands, List<String> transmissionTypes, List<String> fuelTypes) {
    this.brands = brands;
    this.transmissionTypes = transmissionTypes;
    this.fuelTypes = fuelTypes;
  }

  public Filter brands(List<String> brands) {
    this.brands = brands;
    return this;
  }

  public Filter addBrandsItem(String brandsItem) {
    if (this.brands == null) {
      this.brands = new ArrayList<>();
    }
    this.brands.add(brandsItem);
    return this;
  }

  /**
   * Get brands
   * @return brands
  */
  @NotNull 
  @Schema(name = "brands", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("brands")
  public List<String> getBrands() {
    return brands;
  }

  public void setBrands(List<String> brands) {
    this.brands = brands;
  }

  public Filter transmissionTypes(List<String> transmissionTypes) {
    this.transmissionTypes = transmissionTypes;
    return this;
  }

  public Filter addTransmissionTypesItem(String transmissionTypesItem) {
    if (this.transmissionTypes == null) {
      this.transmissionTypes = new ArrayList<>();
    }
    this.transmissionTypes.add(transmissionTypesItem);
    return this;
  }

  /**
   * Get transmissionTypes
   * @return transmissionTypes
  */
  @NotNull 
  @Schema(name = "transmissionTypes", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("transmissionTypes")
  public List<String> getTransmissionTypes() {
    return transmissionTypes;
  }

  public void setTransmissionTypes(List<String> transmissionTypes) {
    this.transmissionTypes = transmissionTypes;
  }

  public Filter fuelTypes(List<String> fuelTypes) {
    this.fuelTypes = fuelTypes;
    return this;
  }

  public Filter addFuelTypesItem(String fuelTypesItem) {
    if (this.fuelTypes == null) {
      this.fuelTypes = new ArrayList<>();
    }
    this.fuelTypes.add(fuelTypesItem);
    return this;
  }

  /**
   * Get fuelTypes
   * @return fuelTypes
  */
  @NotNull 
  @Schema(name = "fuelTypes", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("fuelTypes")
  public List<String> getFuelTypes() {
    return fuelTypes;
  }

  public void setFuelTypes(List<String> fuelTypes) {
    this.fuelTypes = fuelTypes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Filter filter = (Filter) o;
    return Objects.equals(this.brands, filter.brands) &&
        Objects.equals(this.transmissionTypes, filter.transmissionTypes) &&
        Objects.equals(this.fuelTypes, filter.fuelTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brands, transmissionTypes, fuelTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Filter {\n");
    sb.append("    brands: ").append(toIndentedString(brands)).append("\n");
    sb.append("    transmissionTypes: ").append(toIndentedString(transmissionTypes)).append("\n");
    sb.append("    fuelTypes: ").append(toIndentedString(fuelTypes)).append("\n");
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

