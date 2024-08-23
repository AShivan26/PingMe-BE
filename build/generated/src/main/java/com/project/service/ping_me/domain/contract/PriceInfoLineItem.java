package com.project.service.ping_me.domain.contract;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.project.service.ping_me.domain.contract.Amount;
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
 * PriceInfoLineItem
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class PriceInfoLineItem {

  private String key;

  /**
   * If a new enum value is added in future, older version of app should be able to map that new value to default one.
   */
  public enum DisplayTypeEnum {
    DEFAULT("DEFAULT"),
    
    HIGHLIGHTED("HIGHLIGHTED"),
    
    LINK("LINK");

    private String value;

    DisplayTypeEnum(String value) {
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
    public static DisplayTypeEnum fromValue(String value) {
      for (DisplayTypeEnum b : DisplayTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private DisplayTypeEnum displayType;

  private String title;

  @Valid
  private List<String> subtitles;

  private Amount displayPrice;

  private Amount listPrice;

  /**
   * If a new enum value is added in future, older version of app should be able to map that new value to default one which is ALREADY_CHARGED.
   */
  public enum CostingTypeEnum {
    ALREADY_CHARGED("ALREADY_CHARGED"),
    
    INCLUDED("INCLUDED"),
    
    ADDITIONAL("ADDITIONAL"),
    
    DEDUCT("DEDUCT");

    private String value;

    CostingTypeEnum(String value) {
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
    public static CostingTypeEnum fromValue(String value) {
      for (CostingTypeEnum b : CostingTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private CostingTypeEnum costingType;

  public PriceInfoLineItem() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PriceInfoLineItem(String key, DisplayTypeEnum displayType, String title, CostingTypeEnum costingType) {
    this.key = key;
    this.displayType = displayType;
    this.title = title;
    this.costingType = costingType;
  }

  public PriceInfoLineItem key(String key) {
    this.key = key;
    return this;
  }

  /**
   * Just an identifier for every line item in price info. Possible values are LINE_ITEM_TOTAL_AMOUNT, LINE_ITEM_SECURITY_DEPOSIT, LINE_ITEM_SECURITY_DEPOSIT_LEARN_MORE, LINE_ITEM_VEHICLE_UPGRADE etc.
   * @return key
  */
  @NotNull 
  @Schema(name = "key", example = "MCI_P100_PAYMENT_RENTAL_FEE", description = "Just an identifier for every line item in price info. Possible values are LINE_ITEM_TOTAL_AMOUNT, LINE_ITEM_SECURITY_DEPOSIT, LINE_ITEM_SECURITY_DEPOSIT_LEARN_MORE, LINE_ITEM_VEHICLE_UPGRADE etc.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("key")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public PriceInfoLineItem displayType(DisplayTypeEnum displayType) {
    this.displayType = displayType;
    return this;
  }

  /**
   * If a new enum value is added in future, older version of app should be able to map that new value to default one.
   * @return displayType
  */
  @NotNull 
  @Schema(name = "displayType", example = "DEFAULT", description = "If a new enum value is added in future, older version of app should be able to map that new value to default one.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("displayType")
  public DisplayTypeEnum getDisplayType() {
    return displayType;
  }

  public void setDisplayType(DisplayTypeEnum displayType) {
    this.displayType = displayType;
  }

  public PriceInfoLineItem title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Vehicle Upgrade or Learn More in case of key LINE_ITEM_SECURITY_DEPOSIT_LEARN_MORE
   * @return title
  */
  @NotNull 
  @Schema(name = "title", example = "Your reservation", description = "Vehicle Upgrade or Learn More in case of key LINE_ITEM_SECURITY_DEPOSIT_LEARN_MORE", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public PriceInfoLineItem subtitles(List<String> subtitles) {
    this.subtitles = subtitles;
    return this;
  }

  public PriceInfoLineItem addSubtitlesItem(String subtitlesItem) {
    if (this.subtitles == null) {
      this.subtitles = new ArrayList<>();
    }
    this.subtitles.add(subtitlesItem);
    return this;
  }

  /**
   * 6 x $82 /day, 10% discount applied, $0 financial responsibility OR Security Deposit, A security deposit placed on your vehicle in case of key LINE_ITEM_SECURITY_DEPOSIT_LEARN_MORE
   * @return subtitles
  */
  
  @Schema(name = "subtitles", example = "[\"5 x 66.16 $ /day\",\"10% discount applied\",\"$0 financial responsibility\"]", description = "6 x $82 /day, 10% discount applied, $0 financial responsibility OR Security Deposit, A security deposit placed on your vehicle in case of key LINE_ITEM_SECURITY_DEPOSIT_LEARN_MORE", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subtitles")
  public List<String> getSubtitles() {
    return subtitles;
  }

  public void setSubtitles(List<String> subtitles) {
    this.subtitles = subtitles;
  }

  public PriceInfoLineItem displayPrice(Amount displayPrice) {
    this.displayPrice = displayPrice;
    return this;
  }

  /**
   * Get displayPrice
   * @return displayPrice
  */
  @Valid 
  @Schema(name = "displayPrice", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("displayPrice")
  public Amount getDisplayPrice() {
    return displayPrice;
  }

  public void setDisplayPrice(Amount displayPrice) {
    this.displayPrice = displayPrice;
  }

  public PriceInfoLineItem listPrice(Amount listPrice) {
    this.listPrice = listPrice;
    return this;
  }

  /**
   * Get listPrice
   * @return listPrice
  */
  @Valid 
  @Schema(name = "listPrice", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("listPrice")
  public Amount getListPrice() {
    return listPrice;
  }

  public void setListPrice(Amount listPrice) {
    this.listPrice = listPrice;
  }

  public PriceInfoLineItem costingType(CostingTypeEnum costingType) {
    this.costingType = costingType;
    return this;
  }

  /**
   * If a new enum value is added in future, older version of app should be able to map that new value to default one which is ALREADY_CHARGED.
   * @return costingType
  */
  @NotNull 
  @Schema(name = "costingType", description = "If a new enum value is added in future, older version of app should be able to map that new value to default one which is ALREADY_CHARGED.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("costingType")
  public CostingTypeEnum getCostingType() {
    return costingType;
  }

  public void setCostingType(CostingTypeEnum costingType) {
    this.costingType = costingType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PriceInfoLineItem priceInfoLineItem = (PriceInfoLineItem) o;
    return Objects.equals(this.key, priceInfoLineItem.key) &&
        Objects.equals(this.displayType, priceInfoLineItem.displayType) &&
        Objects.equals(this.title, priceInfoLineItem.title) &&
        Objects.equals(this.subtitles, priceInfoLineItem.subtitles) &&
        Objects.equals(this.displayPrice, priceInfoLineItem.displayPrice) &&
        Objects.equals(this.listPrice, priceInfoLineItem.listPrice) &&
        Objects.equals(this.costingType, priceInfoLineItem.costingType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, displayType, title, subtitles, displayPrice, listPrice, costingType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceInfoLineItem {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    displayType: ").append(toIndentedString(displayType)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    subtitles: ").append(toIndentedString(subtitles)).append("\n");
    sb.append("    displayPrice: ").append(toIndentedString(displayPrice)).append("\n");
    sb.append("    listPrice: ").append(toIndentedString(listPrice)).append("\n");
    sb.append("    costingType: ").append(toIndentedString(costingType)).append("\n");
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

