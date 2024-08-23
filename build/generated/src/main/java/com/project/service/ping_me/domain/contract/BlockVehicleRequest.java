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
 * BlockVehicleRequest represents the request payload for blocking a vehicle to a rental activity
 */

@Schema(name = "BlockVehicleRequest", description = "BlockVehicleRequest represents the request payload for blocking a vehicle to a rental activity")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class BlockVehicleRequest {

  private String configurationId;

  private String vehicleId;

  public BlockVehicleRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public BlockVehicleRequest(String configurationId, String vehicleId) {
    this.configurationId = configurationId;
    this.vehicleId = vehicleId;
  }

  public BlockVehicleRequest configurationId(String configurationId) {
    this.configurationId = configurationId;
    return this;
  }

  /**
   * the id for this upsell configuration. This is a UUID
   * @return configurationId
  */
  @NotNull 
  @Schema(name = "configurationId", example = "233888243-34fa-12d3-a456-426784174422", description = "the id for this upsell configuration. This is a UUID", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("configurationId")
  public String getConfigurationId() {
    return configurationId;
  }

  public void setConfigurationId(String configurationId) {
    this.configurationId = configurationId;
  }

  public BlockVehicleRequest vehicleId(String vehicleId) {
    this.vehicleId = vehicleId;
    return this;
  }

  /**
   * the id of the vehicle to block. This is the vehicle ID
   * @return vehicleId
  */
  @NotNull 
  @Schema(name = "vehicleId", example = "1234-abc-121", description = "the id of the vehicle to block. This is the vehicle ID", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("vehicleId")
  public String getVehicleId() {
    return vehicleId;
  }

  public void setVehicleId(String vehicleId) {
    this.vehicleId = vehicleId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BlockVehicleRequest blockVehicleRequest = (BlockVehicleRequest) o;
    return Objects.equals(this.configurationId, blockVehicleRequest.configurationId) &&
        Objects.equals(this.vehicleId, blockVehicleRequest.vehicleId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configurationId, vehicleId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlockVehicleRequest {\n");
    sb.append("    configurationId: ").append(toIndentedString(configurationId)).append("\n");
    sb.append("    vehicleId: ").append(toIndentedString(vehicleId)).append("\n");
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

