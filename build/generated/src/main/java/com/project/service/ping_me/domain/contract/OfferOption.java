package com.project.service.ping_me.domain.contract;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.project.service.ping_me.domain.contract.AdditionalChargeInfo;
import com.project.service.ping_me.domain.contract.ChargeDetail;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * OfferOption
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OfferOption {

  private ChargeDetail chargeDetail;

  private AdditionalChargeInfo additionalInfo;

  public OfferOption() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OfferOption(ChargeDetail chargeDetail, AdditionalChargeInfo additionalInfo) {
    this.chargeDetail = chargeDetail;
    this.additionalInfo = additionalInfo;
  }

  public OfferOption chargeDetail(ChargeDetail chargeDetail) {
    this.chargeDetail = chargeDetail;
    return this;
  }

  /**
   * Get chargeDetail
   * @return chargeDetail
  */
  @NotNull @Valid 
  @Schema(name = "chargeDetail", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("chargeDetail")
  public ChargeDetail getChargeDetail() {
    return chargeDetail;
  }

  public void setChargeDetail(ChargeDetail chargeDetail) {
    this.chargeDetail = chargeDetail;
  }

  public OfferOption additionalInfo(AdditionalChargeInfo additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  /**
   * Get additionalInfo
   * @return additionalInfo
  */
  @NotNull @Valid 
  @Schema(name = "additionalInfo", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("additionalInfo")
  public AdditionalChargeInfo getAdditionalInfo() {
    return additionalInfo;
  }

  public void setAdditionalInfo(AdditionalChargeInfo additionalInfo) {
    this.additionalInfo = additionalInfo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferOption offerOption = (OfferOption) o;
    return Objects.equals(this.chargeDetail, offerOption.chargeDetail) &&
        Objects.equals(this.additionalInfo, offerOption.additionalInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chargeDetail, additionalInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferOption {\n");
    sb.append("    chargeDetail: ").append(toIndentedString(chargeDetail)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
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

