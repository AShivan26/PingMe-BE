package com.project.service.ping_me.domain.contract;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.project.service.ping_me.domain.contract.InstructionAttributes;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * InstructionDetailItem
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class InstructionDetailItem {

  private String text;

  private String type;

  private InstructionAttributes attributes;

  public InstructionDetailItem() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public InstructionDetailItem(String text, String type) {
    this.text = text;
    this.type = type;
  }

  public InstructionDetailItem text(String text) {
    this.text = text;
    return this;
  }

  /**
   * Get text
   * @return text
  */
  @NotNull 
  @Schema(name = "text", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("text")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public InstructionDetailItem type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Probable values are  - subtitle  - qrcode  - navigation  - direction
   * @return type
  */
  @NotNull 
  @Schema(name = "type", description = "Probable values are  - subtitle  - qrcode  - navigation  - direction", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public InstructionDetailItem attributes(InstructionAttributes attributes) {
    this.attributes = attributes;
    return this;
  }

  /**
   * Get attributes
   * @return attributes
  */
  @Valid 
  @Schema(name = "attributes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("attributes")
  public InstructionAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(InstructionAttributes attributes) {
    this.attributes = attributes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstructionDetailItem instructionDetailItem = (InstructionDetailItem) o;
    return Objects.equals(this.text, instructionDetailItem.text) &&
        Objects.equals(this.type, instructionDetailItem.type) &&
        Objects.equals(this.attributes, instructionDetailItem.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, type, attributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstructionDetailItem {\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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

