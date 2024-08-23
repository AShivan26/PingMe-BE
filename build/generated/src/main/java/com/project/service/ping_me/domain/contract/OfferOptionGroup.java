package com.project.service.ping_me.domain.contract;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.project.service.ping_me.domain.contract.OfferOption;
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
 * OfferOptionGroup
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OfferOptionGroup {

  private Integer id;

  private String name;

  @Valid
  private List<@Valid OfferOption> options = new ArrayList<>();

  public OfferOptionGroup() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OfferOptionGroup(Integer id, List<@Valid OfferOption> options) {
    this.id = id;
    this.options = options;
  }

  public OfferOptionGroup id(Integer id) {
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
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public OfferOptionGroup name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OfferOptionGroup options(List<@Valid OfferOption> options) {
    this.options = options;
    return this;
  }

  public OfferOptionGroup addOptionsItem(OfferOption optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<>();
    }
    this.options.add(optionsItem);
    return this;
  }

  /**
   * Get options
   * @return options
  */
  @NotNull @Valid 
  @Schema(name = "options", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("options")
  public List<@Valid OfferOption> getOptions() {
    return options;
  }

  public void setOptions(List<@Valid OfferOption> options) {
    this.options = options;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferOptionGroup offerOptionGroup = (OfferOptionGroup) o;
    return Objects.equals(this.id, offerOptionGroup.id) &&
        Objects.equals(this.name, offerOptionGroup.name) &&
        Objects.equals(this.options, offerOptionGroup.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, options);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferOptionGroup {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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

