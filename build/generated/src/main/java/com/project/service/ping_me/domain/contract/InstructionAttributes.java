package com.project.service.ping_me.domain.contract;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.project.service.ping_me.domain.contract.DirectionListItem;
import com.project.service.ping_me.domain.contract.LocationItem;
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
 * InstructionAttributes
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class InstructionAttributes {

  @Valid
  private List<@Valid DirectionListItem> direction;

  private LocationItem location;

  public InstructionAttributes direction(List<@Valid DirectionListItem> direction) {
    this.direction = direction;
    return this;
  }

  public InstructionAttributes addDirectionItem(DirectionListItem directionItem) {
    if (this.direction == null) {
      this.direction = new ArrayList<>();
    }
    this.direction.add(directionItem);
    return this;
  }

  /**
   * Get direction
   * @return direction
  */
  @Valid 
  @Schema(name = "direction", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("direction")
  public List<@Valid DirectionListItem> getDirection() {
    return direction;
  }

  public void setDirection(List<@Valid DirectionListItem> direction) {
    this.direction = direction;
  }

  public InstructionAttributes location(LocationItem location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
  */
  @Valid 
  @Schema(name = "location", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("location")
  public LocationItem getLocation() {
    return location;
  }

  public void setLocation(LocationItem location) {
    this.location = location;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstructionAttributes instructionAttributes = (InstructionAttributes) o;
    return Objects.equals(this.direction, instructionAttributes.direction) &&
        Objects.equals(this.location, instructionAttributes.location);
  }

  @Override
  public int hashCode() {
    return Objects.hash(direction, location);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstructionAttributes {\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
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

