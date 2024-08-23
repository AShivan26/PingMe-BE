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
 * SelectionStrategy
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class SelectionStrategy {

  private Boolean isMultiSelectionAllowed;

  private Integer maxSelectionLimit;

  private Integer currentSelection;

  public SelectionStrategy() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SelectionStrategy(Boolean isMultiSelectionAllowed, Integer maxSelectionLimit, Integer currentSelection) {
    this.isMultiSelectionAllowed = isMultiSelectionAllowed;
    this.maxSelectionLimit = maxSelectionLimit;
    this.currentSelection = currentSelection;
  }

  public SelectionStrategy isMultiSelectionAllowed(Boolean isMultiSelectionAllowed) {
    this.isMultiSelectionAllowed = isMultiSelectionAllowed;
    return this;
  }

  /**
   * Get isMultiSelectionAllowed
   * @return isMultiSelectionAllowed
  */
  @NotNull 
  @Schema(name = "isMultiSelectionAllowed", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("isMultiSelectionAllowed")
  public Boolean isIsMultiSelectionAllowed() {
    return isMultiSelectionAllowed;
  }

  public void setIsMultiSelectionAllowed(Boolean isMultiSelectionAllowed) {
    this.isMultiSelectionAllowed = isMultiSelectionAllowed;
  }

  public SelectionStrategy maxSelectionLimit(Integer maxSelectionLimit) {
    this.maxSelectionLimit = maxSelectionLimit;
    return this;
  }

  /**
   * Get maxSelectionLimit
   * @return maxSelectionLimit
  */
  @NotNull 
  @Schema(name = "maxSelectionLimit", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("maxSelectionLimit")
  public Integer getMaxSelectionLimit() {
    return maxSelectionLimit;
  }

  public void setMaxSelectionLimit(Integer maxSelectionLimit) {
    this.maxSelectionLimit = maxSelectionLimit;
  }

  public SelectionStrategy currentSelection(Integer currentSelection) {
    this.currentSelection = currentSelection;
    return this;
  }

  /**
   * Get currentSelection
   * @return currentSelection
  */
  @NotNull 
  @Schema(name = "currentSelection", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("currentSelection")
  public Integer getCurrentSelection() {
    return currentSelection;
  }

  public void setCurrentSelection(Integer currentSelection) {
    this.currentSelection = currentSelection;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SelectionStrategy selectionStrategy = (SelectionStrategy) o;
    return Objects.equals(this.isMultiSelectionAllowed, selectionStrategy.isMultiSelectionAllowed) &&
        Objects.equals(this.maxSelectionLimit, selectionStrategy.maxSelectionLimit) &&
        Objects.equals(this.currentSelection, selectionStrategy.currentSelection);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isMultiSelectionAllowed, maxSelectionLimit, currentSelection);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SelectionStrategy {\n");
    sb.append("    isMultiSelectionAllowed: ").append(toIndentedString(isMultiSelectionAllowed)).append("\n");
    sb.append("    maxSelectionLimit: ").append(toIndentedString(maxSelectionLimit)).append("\n");
    sb.append("    currentSelection: ").append(toIndentedString(currentSelection)).append("\n");
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

