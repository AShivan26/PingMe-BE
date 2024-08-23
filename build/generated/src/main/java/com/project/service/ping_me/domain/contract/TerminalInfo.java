package com.project.service.ping_me.domain.contract;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.project.service.ping_me.domain.contract.Terminal;
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
 * TerminalInfo
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class TerminalInfo {

  private String title;

  private String description;

  @Valid
  private List<@Valid Terminal> terminalList;

  public TerminalInfo title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  */
  
  @Schema(name = "title", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public TerminalInfo description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  
  @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public TerminalInfo terminalList(List<@Valid Terminal> terminalList) {
    this.terminalList = terminalList;
    return this;
  }

  public TerminalInfo addTerminalListItem(Terminal terminalListItem) {
    if (this.terminalList == null) {
      this.terminalList = new ArrayList<>();
    }
    this.terminalList.add(terminalListItem);
    return this;
  }

  /**
   * Get terminalList
   * @return terminalList
  */
  @Valid 
  @Schema(name = "terminalList", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("terminalList")
  public List<@Valid Terminal> getTerminalList() {
    return terminalList;
  }

  public void setTerminalList(List<@Valid Terminal> terminalList) {
    this.terminalList = terminalList;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TerminalInfo terminalInfo = (TerminalInfo) o;
    return Objects.equals(this.title, terminalInfo.title) &&
        Objects.equals(this.description, terminalInfo.description) &&
        Objects.equals(this.terminalList, terminalInfo.terminalList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, description, terminalList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TerminalInfo {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    terminalList: ").append(toIndentedString(terminalList)).append("\n");
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

