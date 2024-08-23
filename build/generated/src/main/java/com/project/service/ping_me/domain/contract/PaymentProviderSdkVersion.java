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
 * PaymentProviderSdkVersion
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class PaymentProviderSdkVersion {

  private String sdkVersion;

  private String threeDs2SdkVersion;

  public PaymentProviderSdkVersion sdkVersion(String sdkVersion) {
    this.sdkVersion = sdkVersion;
    return this;
  }

  /**
   * This field provides sdk version of payment provide
   * @return sdkVersion
  */
  
  @Schema(name = "sdkVersion", example = "5.5.0/5.56.1/5.1", description = "This field provides sdk version of payment provide", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sdkVersion")
  public String getSdkVersion() {
    return sdkVersion;
  }

  public void setSdkVersion(String sdkVersion) {
    this.sdkVersion = sdkVersion;
  }

  public PaymentProviderSdkVersion threeDs2SdkVersion(String threeDs2SdkVersion) {
    this.threeDs2SdkVersion = threeDs2SdkVersion;
    return this;
  }

  /**
   * this field provides 3ds sdk version of payment provider
   * @return threeDs2SdkVersion
  */
  
  @Schema(name = "threeDs2SdkVersion", example = "2.2.1, 2.3.0", description = "this field provides 3ds sdk version of payment provider", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("threeDs2SdkVersion")
  public String getThreeDs2SdkVersion() {
    return threeDs2SdkVersion;
  }

  public void setThreeDs2SdkVersion(String threeDs2SdkVersion) {
    this.threeDs2SdkVersion = threeDs2SdkVersion;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentProviderSdkVersion paymentProviderSdkVersion = (PaymentProviderSdkVersion) o;
    return Objects.equals(this.sdkVersion, paymentProviderSdkVersion.sdkVersion) &&
        Objects.equals(this.threeDs2SdkVersion, paymentProviderSdkVersion.threeDs2SdkVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sdkVersion, threeDs2SdkVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentProviderSdkVersion {\n");
    sb.append("    sdkVersion: ").append(toIndentedString(sdkVersion)).append("\n");
    sb.append("    threeDs2SdkVersion: ").append(toIndentedString(threeDs2SdkVersion)).append("\n");
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

