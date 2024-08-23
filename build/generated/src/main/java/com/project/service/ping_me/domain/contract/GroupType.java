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
 * GroupType
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class GroupType {

  private String type;

  public GroupType type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Probable values are  SMALL_SEDAN  SEDAN  SUV  SPECIAL_SEDAN  LUXURY_SEDAN  ELECTRIC_SEDAN  SPECIAL_HYBRID_SEDAN  SPECIAL_SUV  SPECIAL_COUPE  LUXURY_COUPE  MIDSIZE_SUV  LUXURY_SUV  CONVERTIBLE  SPECIAL_CONVERTIBLE  LUXURY_CONVERTIBLE  MINI_VAN  VAN  PICKUP_TRUCKS  PREMIUM_COUPE  FULL_SIZE_SUV  LARGE_LUXURY_SUV  LARGE_LUXURY_SEDAN  HATCHBACK
   * @return type
  */
  
  @Schema(name = "type", description = "Probable values are  SMALL_SEDAN  SEDAN  SUV  SPECIAL_SEDAN  LUXURY_SEDAN  ELECTRIC_SEDAN  SPECIAL_HYBRID_SEDAN  SPECIAL_SUV  SPECIAL_COUPE  LUXURY_COUPE  MIDSIZE_SUV  LUXURY_SUV  CONVERTIBLE  SPECIAL_CONVERTIBLE  LUXURY_CONVERTIBLE  MINI_VAN  VAN  PICKUP_TRUCKS  PREMIUM_COUPE  FULL_SIZE_SUV  LARGE_LUXURY_SUV  LARGE_LUXURY_SEDAN  HATCHBACK", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupType groupType = (GroupType) o;
    return Objects.equals(this.type, groupType.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupType {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

