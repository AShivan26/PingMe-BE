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
 * ChargeDetail
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ChargeDetail {

  private String id;

  private String title;

  private String description;

  private String iconUrl;

  public ChargeDetail() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ChargeDetail(String id, String title, String description) {
    this.id = id;
    this.title = title;
    this.description = description;
  }

  public ChargeDetail id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @NotNull 
  @Schema(name = "id", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ChargeDetail title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  */
  @NotNull 
  @Schema(name = "title", example = "Charge code (i.e. Damage & theft, Roadside Assistance)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public ChargeDetail description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  @NotNull 
  @Schema(name = "description", example = "description for the charge code (i.e. Avoid high cost, Limit your financial exposure to accidental exposure)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ChargeDetail iconUrl(String iconUrl) {
    this.iconUrl = iconUrl;
    return this;
  }

  /**
   * Will contain detail of charges which are included in package.
   * @return iconUrl
  */
  
  @Schema(name = "iconUrl", example = "the charge code icon url (i.e https://www.sixt.com/shared/icons/rent/circle_plus.png)", description = "Will contain detail of charges which are included in package.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("iconUrl")
  public String getIconUrl() {
    return iconUrl;
  }

  public void setIconUrl(String iconUrl) {
    this.iconUrl = iconUrl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChargeDetail chargeDetail = (ChargeDetail) o;
    return Objects.equals(this.id, chargeDetail.id) &&
        Objects.equals(this.title, chargeDetail.title) &&
        Objects.equals(this.description, chargeDetail.description) &&
        Objects.equals(this.iconUrl, chargeDetail.iconUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, description, iconUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChargeDetail {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    iconUrl: ").append(toIndentedString(iconUrl)).append("\n");
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

