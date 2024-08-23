package com.project.service.ping_me.domain.contract;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.project.service.ping_me.domain.contract.Charge;
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
 * ChargeGroup
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ChargeGroup {

  private String name;

  @Valid
  private List<@Valid Charge> items = new ArrayList<>();

  public ChargeGroup() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ChargeGroup(List<@Valid Charge> items) {
    this.items = items;
  }

  public ChargeGroup name(String name) {
    this.name = name;
    return this;
  }

  /**
   * the translated name of the charge group. Optional if should be stated without group
   * @return name
  */
  
  @Schema(name = "name", example = "Child seats", description = "the translated name of the charge group. Optional if should be stated without group", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ChargeGroup items(List<@Valid Charge> items) {
    this.items = items;
    return this;
  }

  public ChargeGroup addItemsItem(Charge itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * list of charges in this group
   * @return items
  */
  @NotNull @Valid 
  @Schema(name = "items", description = "list of charges in this group", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("items")
  public List<@Valid Charge> getItems() {
    return items;
  }

  public void setItems(List<@Valid Charge> items) {
    this.items = items;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChargeGroup chargeGroup = (ChargeGroup) o;
    return Objects.equals(this.name, chargeGroup.name) &&
        Objects.equals(this.items, chargeGroup.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChargeGroup {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

