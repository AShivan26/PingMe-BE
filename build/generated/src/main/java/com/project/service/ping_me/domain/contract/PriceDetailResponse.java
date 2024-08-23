package com.project.service.ping_me.domain.contract;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.project.service.ping_me.domain.contract.PriceInfoBlock;
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
 * PriceDetailResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class PriceDetailResponse {

  @Valid
  private List<@Valid PriceInfoBlock> priceInfo = new ArrayList<>();

  public PriceDetailResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PriceDetailResponse(List<@Valid PriceInfoBlock> priceInfo) {
    this.priceInfo = priceInfo;
  }

  public PriceDetailResponse priceInfo(List<@Valid PriceInfoBlock> priceInfo) {
    this.priceInfo = priceInfo;
    return this;
  }

  public PriceDetailResponse addPriceInfoItem(PriceInfoBlock priceInfoItem) {
    if (this.priceInfo == null) {
      this.priceInfo = new ArrayList<>();
    }
    this.priceInfo.add(priceInfoItem);
    return this;
  }

  /**
   * Get priceInfo
   * @return priceInfo
  */
  @NotNull @Valid 
  @Schema(name = "priceInfo", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("priceInfo")
  public List<@Valid PriceInfoBlock> getPriceInfo() {
    return priceInfo;
  }

  public void setPriceInfo(List<@Valid PriceInfoBlock> priceInfo) {
    this.priceInfo = priceInfo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PriceDetailResponse priceDetailResponse = (PriceDetailResponse) o;
    return Objects.equals(this.priceInfo, priceDetailResponse.priceInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(priceInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceDetailResponse {\n");
    sb.append("    priceInfo: ").append(toIndentedString(priceInfo)).append("\n");
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

