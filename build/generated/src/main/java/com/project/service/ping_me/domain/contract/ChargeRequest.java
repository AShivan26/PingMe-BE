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
 * ChargeRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ChargeRequest {

  private String id;

  private Long quantity;

  public ChargeRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ChargeRequest(String id, Long quantity) {
    this.id = id;
    this.quantity = quantity;
  }

  public ChargeRequest id(String id) {
    this.id = id;
    return this;
  }

  /**
   * the id of the charge (a.k.a. charge code)
   * @return id
  */
  @NotNull 
  @Schema(name = "id", example = "LD", description = "the id of the charge (a.k.a. charge code)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ChargeRequest quantity(Long quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * the number of pieces to select
   * @return quantity
  */
  @NotNull 
  @Schema(name = "quantity", example = "4", description = "the number of pieces to select", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("quantity")
  public Long getQuantity() {
    return quantity;
  }

  public void setQuantity(Long quantity) {
    this.quantity = quantity;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChargeRequest chargeRequest = (ChargeRequest) o;
    return Objects.equals(this.id, chargeRequest.id) &&
        Objects.equals(this.quantity, chargeRequest.quantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, quantity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChargeRequest {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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

