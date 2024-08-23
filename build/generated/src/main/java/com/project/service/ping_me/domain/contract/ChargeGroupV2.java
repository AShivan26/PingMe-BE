package com.project.service.ping_me.domain.contract;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ChargeGroupV2
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ChargeGroupV2 {

  private Integer id;

  private Integer order;

  private String name;

  public ChargeGroupV2() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ChargeGroupV2(Integer id, Integer order) {
    this.id = id;
    this.order = order;
  }

  public ChargeGroupV2 id(Integer id) {
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
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public ChargeGroupV2 order(Integer order) {
    this.order = order;
    return this;
  }

  /**
   * Get order
   * @return order
  */
  @NotNull 
  @Schema(name = "order", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("order")
  public Integer getOrder() {
    return order;
  }

  public void setOrder(Integer order) {
    this.order = order;
  }

  public ChargeGroupV2 name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChargeGroupV2 chargeGroupV2 = (ChargeGroupV2) o;
    return Objects.equals(this.id, chargeGroupV2.id) &&
        Objects.equals(this.order, chargeGroupV2.order) &&
        Objects.equals(this.name, chargeGroupV2.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, order, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChargeGroupV2 {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

