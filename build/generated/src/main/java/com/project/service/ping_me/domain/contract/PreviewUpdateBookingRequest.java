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
 * PreviewUpdateReservationRequest represents the request payload for updating a reservation
 */

@Schema(name = "PreviewUpdateBookingRequest", description = "PreviewUpdateReservationRequest represents the request payload for updating a reservation")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class PreviewUpdateBookingRequest {

  @Valid
  private List<@Valid ChargeRequest> charges;

  private String currency;

  public PreviewUpdateBookingRequest charges(List<@Valid ChargeRequest> charges) {
    this.charges = charges;
    return this;
  }

  public PreviewUpdateBookingRequest addChargesItem(ChargeRequest chargesItem) {
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
  @Valid 
  @Schema(name = "charges", description = "the charges to select/deselect", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("charges")
  public List<@Valid ChargeRequest> getCharges() {
    return charges;
  }

  public void setCharges(List<@Valid ChargeRequest> charges) {
    this.charges = charges;
  }

  public PreviewUpdateBookingRequest currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * the ISO currency code if conversion is desired
   * @return currency
  */
  @Pattern(regexp = "^.{3}$") 
  @Schema(name = "currency", example = "EUR", description = "the ISO currency code if conversion is desired", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currency")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PreviewUpdateBookingRequest previewUpdateBookingRequest = (PreviewUpdateBookingRequest) o;
    return Objects.equals(this.charges, previewUpdateBookingRequest.charges) &&
        Objects.equals(this.currency, previewUpdateBookingRequest.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(charges, currency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PreviewUpdateBookingRequest {\n");
    sb.append("    charges: ").append(toIndentedString(charges)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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

