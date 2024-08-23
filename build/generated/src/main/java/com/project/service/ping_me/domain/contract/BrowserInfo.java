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
 * BrowserInfo
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class BrowserInfo {

  private Integer screenWidth;

  private Integer screenHeight;

  private Integer colorDepth;

  private String userAgent;

  private Boolean javaEnabled;

  private Integer timeZoneOffset;

  private String language;

  private String acceptHeader;

  public BrowserInfo screenWidth(Integer screenWidth) {
    this.screenWidth = screenWidth;
    return this;
  }

  /**
   * Get screenWidth
   * @return screenWidth
  */
  
  @Schema(name = "screenWidth", example = "1680", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("screenWidth")
  public Integer getScreenWidth() {
    return screenWidth;
  }

  public void setScreenWidth(Integer screenWidth) {
    this.screenWidth = screenWidth;
  }

  public BrowserInfo screenHeight(Integer screenHeight) {
    this.screenHeight = screenHeight;
    return this;
  }

  /**
   * Get screenHeight
   * @return screenHeight
  */
  
  @Schema(name = "screenHeight", example = "1050", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("screenHeight")
  public Integer getScreenHeight() {
    return screenHeight;
  }

  public void setScreenHeight(Integer screenHeight) {
    this.screenHeight = screenHeight;
  }

  public BrowserInfo colorDepth(Integer colorDepth) {
    this.colorDepth = colorDepth;
    return this;
  }

  /**
   * Get colorDepth
   * @return colorDepth
  */
  
  @Schema(name = "colorDepth", example = "30", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("colorDepth")
  public Integer getColorDepth() {
    return colorDepth;
  }

  public void setColorDepth(Integer colorDepth) {
    this.colorDepth = colorDepth;
  }

  public BrowserInfo userAgent(String userAgent) {
    this.userAgent = userAgent;
    return this;
  }

  /**
   * Get userAgent
   * @return userAgent
  */
  
  @Schema(name = "userAgent", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userAgent")
  public String getUserAgent() {
    return userAgent;
  }

  public void setUserAgent(String userAgent) {
    this.userAgent = userAgent;
  }

  public BrowserInfo javaEnabled(Boolean javaEnabled) {
    this.javaEnabled = javaEnabled;
    return this;
  }

  /**
   * Get javaEnabled
   * @return javaEnabled
  */
  
  @Schema(name = "javaEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("javaEnabled")
  public Boolean isJavaEnabled() {
    return javaEnabled;
  }

  public void setJavaEnabled(Boolean javaEnabled) {
    this.javaEnabled = javaEnabled;
  }

  public BrowserInfo timeZoneOffset(Integer timeZoneOffset) {
    this.timeZoneOffset = timeZoneOffset;
    return this;
  }

  /**
   * Get timeZoneOffset
   * @return timeZoneOffset
  */
  
  @Schema(name = "timeZoneOffset", example = "30", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("timeZoneOffset")
  public Integer getTimeZoneOffset() {
    return timeZoneOffset;
  }

  public void setTimeZoneOffset(Integer timeZoneOffset) {
    this.timeZoneOffset = timeZoneOffset;
  }

  public BrowserInfo language(String language) {
    this.language = language;
    return this;
  }

  /**
   * Get language
   * @return language
  */
  
  @Schema(name = "language", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("language")
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public BrowserInfo acceptHeader(String acceptHeader) {
    this.acceptHeader = acceptHeader;
    return this;
  }

  /**
   * Get acceptHeader
   * @return acceptHeader
  */
  
  @Schema(name = "acceptHeader", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("acceptHeader")
  public String getAcceptHeader() {
    return acceptHeader;
  }

  public void setAcceptHeader(String acceptHeader) {
    this.acceptHeader = acceptHeader;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrowserInfo browserInfo = (BrowserInfo) o;
    return Objects.equals(this.screenWidth, browserInfo.screenWidth) &&
        Objects.equals(this.screenHeight, browserInfo.screenHeight) &&
        Objects.equals(this.colorDepth, browserInfo.colorDepth) &&
        Objects.equals(this.userAgent, browserInfo.userAgent) &&
        Objects.equals(this.javaEnabled, browserInfo.javaEnabled) &&
        Objects.equals(this.timeZoneOffset, browserInfo.timeZoneOffset) &&
        Objects.equals(this.language, browserInfo.language) &&
        Objects.equals(this.acceptHeader, browserInfo.acceptHeader);
  }

  @Override
  public int hashCode() {
    return Objects.hash(screenWidth, screenHeight, colorDepth, userAgent, javaEnabled, timeZoneOffset, language, acceptHeader);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrowserInfo {\n");
    sb.append("    screenWidth: ").append(toIndentedString(screenWidth)).append("\n");
    sb.append("    screenHeight: ").append(toIndentedString(screenHeight)).append("\n");
    sb.append("    colorDepth: ").append(toIndentedString(colorDepth)).append("\n");
    sb.append("    userAgent: ").append(toIndentedString(userAgent)).append("\n");
    sb.append("    javaEnabled: ").append(toIndentedString(javaEnabled)).append("\n");
    sb.append("    timeZoneOffset: ").append(toIndentedString(timeZoneOffset)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    acceptHeader: ").append(toIndentedString(acceptHeader)).append("\n");
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

