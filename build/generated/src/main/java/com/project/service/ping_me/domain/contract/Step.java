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
 * No need for index property as app will make indexes from the items order in instructions list
 */

@Schema(name = "Step", description = "No need for index property as app will make indexes from the items order in instructions list")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class Step {

  private String title;

  private String subtitle;

  public Step() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Step(String title, String subtitle) {
    this.title = title;
    this.subtitle = subtitle;
  }

  public Step title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  */
  @NotNull 
  @Schema(name = "title", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Step subtitle(String subtitle) {
    this.subtitle = subtitle;
    return this;
  }

  /**
   * Get subtitle
   * @return subtitle
  */
  @NotNull 
  @Schema(name = "subtitle", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("subtitle")
  public String getSubtitle() {
    return subtitle;
  }

  public void setSubtitle(String subtitle) {
    this.subtitle = subtitle;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Step step = (Step) o;
    return Objects.equals(this.title, step.title) &&
        Objects.equals(this.subtitle, step.subtitle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, subtitle);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Step {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    subtitle: ").append(toIndentedString(subtitle)).append("\n");
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

