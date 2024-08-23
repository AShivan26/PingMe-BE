package com.project.service.ping_me.domain.contract;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.project.service.ping_me.domain.contract.ChargeRequest;
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
 * UpdateOfferConfigurationRequest represents the request payload for updating a reservation
 */

@Schema(name = "UpdateOfferConfigurationRequest", description = "UpdateOfferConfigurationRequest represents the request payload for updating a reservation")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class UpdateOfferConfigurationRequest {

  @Valid
  private List<@Valid ChargeRequest> charges = new ArrayList<>();

  public UpdateOfferConfigurationRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UpdateOfferConfigurationRequest(List<@Valid ChargeRequest> charges) {
    this.charges = charges;
  }

  public UpdateOfferConfigurationRequest charges(List<@Valid ChargeRequest> charges) {
    this.charges = charges;
    return this;
  }

  public UpdateOfferConfigurationRequest addChargesItem(ChargeRequest chargesItem) {
    if (this.charges == null) {
      this.charges = new ArrayList<>();
    }
    this.charges.add(chargesItem);
    return this;
  }

  /**
   * the charges to select/deselect
   * @return charges
  */
  @NotNull @Valid 
  @Schema(name = "charges", description = "the charges to select/deselect", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("charges")
  public List<@Valid ChargeRequest> getCharges() {
    return charges;
  }

  public void setCharges(List<@Valid ChargeRequest> charges) {
    this.charges = charges;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateOfferConfigurationRequest updateOfferConfigurationRequest = (UpdateOfferConfigurationRequest) o;
    return Objects.equals(this.charges, updateOfferConfigurationRequest.charges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(charges);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateOfferConfigurationRequest {\n");
    sb.append("    charges: ").append(toIndentedString(charges)).append("\n");
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

