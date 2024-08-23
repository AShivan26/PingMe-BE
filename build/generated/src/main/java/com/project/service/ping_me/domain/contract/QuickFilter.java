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
 * QuickFilter
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class QuickFilter {

  private String key;

  private String title;

  private String selectType;

  public QuickFilter key(String key) {
    this.key = key;
    return this;
  }

  /**
   * Get key
   * @return key
  */
  
  @Schema(name = "key", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("key")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public QuickFilter title(String title) {
    this.title = title;
    return this;
  }

  /**
   * text to be displayed for quick filters eg, Recommended, More Space, Luxury, Automatic etc.
   * @return title
  */
  
  @Schema(name = "title", description = "text to be displayed for quick filters eg, Recommended, More Space, Luxury, Automatic etc.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public QuickFilter selectType(String selectType) {
    this.selectType = selectType;
    return this;
  }

  /**
   * to identify the behaviour, if this filter would be single select or multiSelect
   * @return selectType
  */
  
  @Schema(name = "selectType", description = "to identify the behaviour, if this filter would be single select or multiSelect", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("selectType")
  public String getSelectType() {
    return selectType;
  }

  public void setSelectType(String selectType) {
    this.selectType = selectType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuickFilter quickFilter = (QuickFilter) o;
    return Objects.equals(this.key, quickFilter.key) &&
        Objects.equals(this.title, quickFilter.title) &&
        Objects.equals(this.selectType, quickFilter.selectType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, title, selectType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuickFilter {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    selectType: ").append(toIndentedString(selectType)).append("\n");
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

