package com.project.service.ping_me.domain.contract;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.project.service.ping_me.domain.contract.PriceInfoLineItem;
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
 * PriceInfoBlock
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class PriceInfoBlock {

  private String title;

  @Valid
  private List<@Valid PriceInfoLineItem> lineItems = new ArrayList<>();

  public PriceInfoBlock() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PriceInfoBlock(List<@Valid PriceInfoLineItem> lineItems) {
    this.lineItems = lineItems;
  }

  public PriceInfoBlock title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  */
  
  @Schema(name = "title", example = "Rental fees", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public PriceInfoBlock lineItems(List<@Valid PriceInfoLineItem> lineItems) {
    this.lineItems = lineItems;
    return this;
  }

  public PriceInfoBlock addLineItemsItem(PriceInfoLineItem lineItemsItem) {
    if (this.lineItems == null) {
      this.lineItems = new ArrayList<>();
    }
    this.lineItems.add(lineItemsItem);
    return this;
  }

  /**
   * Get lineItems
   * @return lineItems
  */
  @NotNull @Valid 
  @Schema(name = "lineItems", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("lineItems")
  public List<@Valid PriceInfoLineItem> getLineItems() {
    return lineItems;
  }

  public void setLineItems(List<@Valid PriceInfoLineItem> lineItems) {
    this.lineItems = lineItems;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PriceInfoBlock priceInfoBlock = (PriceInfoBlock) o;
    return Objects.equals(this.title, priceInfoBlock.title) &&
        Objects.equals(this.lineItems, priceInfoBlock.lineItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, lineItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceInfoBlock {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
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

