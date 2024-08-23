package com.project.service.ping_me.domain.contract;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.project.service.ping_me.domain.contract.BrowserInfo;
import com.project.service.ping_me.domain.contract.PaymentProviderSdkVersion;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ThreeDsParams
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ThreeDsParams {

  private String channel;

  private String returnUrl;

  private String origin;

  private BrowserInfo browserInfo;

  private PaymentProviderSdkVersion paymentProviderSdkVersion;

  public ThreeDsParams channel(String channel) {
    this.channel = channel;
    return this;
  }

  /**
   * Get channel
   * @return channel
  */
  
  @Schema(name = "channel", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("channel")
  public String getChannel() {
    return channel;
  }

  public void setChannel(String channel) {
    this.channel = channel;
  }

  public ThreeDsParams returnUrl(String returnUrl) {
    this.returnUrl = returnUrl;
    return this;
  }

  /**
   * Get returnUrl
   * @return returnUrl
  */
  
  @Schema(name = "returnUrl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("returnUrl")
  public String getReturnUrl() {
    return returnUrl;
  }

  public void setReturnUrl(String returnUrl) {
    this.returnUrl = returnUrl;
  }

  public ThreeDsParams origin(String origin) {
    this.origin = origin;
    return this;
  }

  /**
   * Get origin
   * @return origin
  */
  
  @Schema(name = "origin", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("origin")
  public String getOrigin() {
    return origin;
  }

  public void setOrigin(String origin) {
    this.origin = origin;
  }

  public ThreeDsParams browserInfo(BrowserInfo browserInfo) {
    this.browserInfo = browserInfo;
    return this;
  }

  /**
   * Get browserInfo
   * @return browserInfo
  */
  @Valid 
  @Schema(name = "browserInfo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("browserInfo")
  public BrowserInfo getBrowserInfo() {
    return browserInfo;
  }

  public void setBrowserInfo(BrowserInfo browserInfo) {
    this.browserInfo = browserInfo;
  }

  public ThreeDsParams paymentProviderSdkVersion(PaymentProviderSdkVersion paymentProviderSdkVersion) {
    this.paymentProviderSdkVersion = paymentProviderSdkVersion;
    return this;
  }

  /**
   * Get paymentProviderSdkVersion
   * @return paymentProviderSdkVersion
  */
  @Valid 
  @Schema(name = "paymentProviderSdkVersion", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("paymentProviderSdkVersion")
  public PaymentProviderSdkVersion getPaymentProviderSdkVersion() {
    return paymentProviderSdkVersion;
  }

  public void setPaymentProviderSdkVersion(PaymentProviderSdkVersion paymentProviderSdkVersion) {
    this.paymentProviderSdkVersion = paymentProviderSdkVersion;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThreeDsParams threeDsParams = (ThreeDsParams) o;
    return Objects.equals(this.channel, threeDsParams.channel) &&
        Objects.equals(this.returnUrl, threeDsParams.returnUrl) &&
        Objects.equals(this.origin, threeDsParams.origin) &&
        Objects.equals(this.browserInfo, threeDsParams.browserInfo) &&
        Objects.equals(this.paymentProviderSdkVersion, threeDsParams.paymentProviderSdkVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channel, returnUrl, origin, browserInfo, paymentProviderSdkVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThreeDsParams {\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    returnUrl: ").append(toIndentedString(returnUrl)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    browserInfo: ").append(toIndentedString(browserInfo)).append("\n");
    sb.append("    paymentProviderSdkVersion: ").append(toIndentedString(paymentProviderSdkVersion)).append("\n");
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

