package com.project.service.ping_me.domain.contract;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.project.service.ping_me.domain.contract.Price;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * LocalizedPrice
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class LocalizedPrice {

  private Price price;

  private Price listPrice;

  public LocalizedPrice() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public LocalizedPrice(Price price, Price listPrice) {
    this.price = price;
    this.listPrice = listPrice;
  }

  public LocalizedPrice price(Price price) {
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
  public Price getPrice() {
    return price;
  }

  public void setPrice(Price price) {
    this.price = price;
  }

  public LocalizedPrice listPrice(Price listPrice) {
    this.listPrice = listPrice;
    return this;
  }

  /**
   * Get listPrice
   * @return listPrice
  */
  @NotNull @Valid 
  @Schema(name = "listPrice", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("listPrice")
  public Price getListPrice() {
    return listPrice;
  }

  public void setListPrice(Price listPrice) {
    this.listPrice = listPrice;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocalizedPrice localizedPrice = (LocalizedPrice) o;
    return Objects.equals(this.price, localizedPrice.price) &&
        Objects.equals(this.listPrice, localizedPrice.listPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(price, listPrice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocalizedPrice {\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    listPrice: ").append(toIndentedString(listPrice)).append("\n");
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

