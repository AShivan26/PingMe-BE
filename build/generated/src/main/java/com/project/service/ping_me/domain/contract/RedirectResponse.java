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
 * RedirectResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class RedirectResponse {

  private String merchantData;

  private String paRes;

  public RedirectResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RedirectResponse(String merchantData, String paRes) {
    this.merchantData = merchantData;
    this.paRes = paRes;
  }

  public RedirectResponse merchantData(String merchantData) {
    this.merchantData = merchantData;
    return this;
  }

  /**
   * Get merchantData
   * @return merchantData
  */
  @NotNull 
  @Schema(name = "merchantData", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("merchantData")
  public String getMerchantData() {
    return merchantData;
  }

  public void setMerchantData(String merchantData) {
    this.merchantData = merchantData;
  }

  public RedirectResponse paRes(String paRes) {
    this.paRes = paRes;
    return this;
  }

  /**
   * Get paRes
   * @return paRes
  */
  @NotNull 
  @Schema(name = "paRes", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("paRes")
  public String getPaRes() {
    return paRes;
  }

  public void setPaRes(String paRes) {
    this.paRes = paRes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RedirectResponse redirectResponse = (RedirectResponse) o;
    return Objects.equals(this.merchantData, redirectResponse.merchantData) &&
        Objects.equals(this.paRes, redirectResponse.paRes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantData, paRes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RedirectResponse {\n");
    sb.append("    merchantData: ").append(toIndentedString(merchantData)).append("\n");
    sb.append("    paRes: ").append(toIndentedString(paRes)).append("\n");
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

