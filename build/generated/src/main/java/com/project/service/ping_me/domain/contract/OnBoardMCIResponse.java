package com.project.service.ping_me.domain.contract;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.project.service.ping_me.domain.contract.TerminalInfo;
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
 * Response object of the entry API V2
 */

@Schema(name = "OnBoardMCIResponse", description = "Response object of the entry API V2")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OnBoardMCIResponse {

  private String pickupBranchId;

  private String pickupCountryCode;

  /**
   * Gets or Sets actions
   */
  public enum ActionsEnum {
    DVLA("DVLA"),
    
    DEFAULT_PARAMS("DEFAULT_PARAMS");

    private String value;

    ActionsEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ActionsEnum fromValue(String value) {
      for (ActionsEnum b : ActionsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @Valid
  private List<ActionsEnum> actions;

  private TerminalInfo terminalInformation;

  public OnBoardMCIResponse pickupBranchId(String pickupBranchId) {
    this.pickupBranchId = pickupBranchId;
    return this;
  }

  /**
   * Get pickupBranchId
   * @return pickupBranchId
  */
  
  @Schema(name = "pickupBranchId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pickupBranchId")
  public String getPickupBranchId() {
    return pickupBranchId;
  }

  public void setPickupBranchId(String pickupBranchId) {
    this.pickupBranchId = pickupBranchId;
  }

  public OnBoardMCIResponse pickupCountryCode(String pickupCountryCode) {
    this.pickupCountryCode = pickupCountryCode;
    return this;
  }

  /**
   * Get pickupCountryCode
   * @return pickupCountryCode
  */
  
  @Schema(name = "pickupCountryCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pickupCountryCode")
  public String getPickupCountryCode() {
    return pickupCountryCode;
  }

  public void setPickupCountryCode(String pickupCountryCode) {
    this.pickupCountryCode = pickupCountryCode;
  }

  public OnBoardMCIResponse actions(List<ActionsEnum> actions) {
    this.actions = actions;
    return this;
  }

  public OnBoardMCIResponse addActionsItem(ActionsEnum actionsItem) {
    if (this.actions == null) {
      this.actions = new ArrayList<>();
    }
    this.actions.add(actionsItem);
    return this;
  }

  /**
   * Get actions
   * @return actions
  */
  
  @Schema(name = "actions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("actions")
  public List<ActionsEnum> getActions() {
    return actions;
  }

  public void setActions(List<ActionsEnum> actions) {
    this.actions = actions;
  }

  public OnBoardMCIResponse terminalInformation(TerminalInfo terminalInformation) {
    this.terminalInformation = terminalInformation;
    return this;
  }

  /**
   * Get terminalInformation
   * @return terminalInformation
  */
  @Valid 
  @Schema(name = "terminalInformation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("terminalInformation")
  public TerminalInfo getTerminalInformation() {
    return terminalInformation;
  }

  public void setTerminalInformation(TerminalInfo terminalInformation) {
    this.terminalInformation = terminalInformation;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OnBoardMCIResponse onBoardMCIResponse = (OnBoardMCIResponse) o;
    return Objects.equals(this.pickupBranchId, onBoardMCIResponse.pickupBranchId) &&
        Objects.equals(this.pickupCountryCode, onBoardMCIResponse.pickupCountryCode) &&
        Objects.equals(this.actions, onBoardMCIResponse.actions) &&
        Objects.equals(this.terminalInformation, onBoardMCIResponse.terminalInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pickupBranchId, pickupCountryCode, actions, terminalInformation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OnBoardMCIResponse {\n");
    sb.append("    pickupBranchId: ").append(toIndentedString(pickupBranchId)).append("\n");
    sb.append("    pickupCountryCode: ").append(toIndentedString(pickupCountryCode)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    terminalInformation: ").append(toIndentedString(terminalInformation)).append("\n");
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

