package com.project.service.ping_me.domain.contract;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.project.service.ping_me.domain.contract.Pricing;
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
 * BillingSection
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class BillingSection {

  private Pricing pricing;

  private String title;

  private String type;

  private String reference;

  @Valid
  private List<@Valid BillingSection> infos;

  private String explanation;

  public BillingSection() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public BillingSection(String type, String reference) {
    this.type = type;
    this.reference = reference;
  }

  public BillingSection pricing(Pricing pricing) {
    this.pricing = pricing;
    return this;
  }

  /**
   * Get pricing
   * @return pricing
  */
  @Valid 
  @Schema(name = "pricing", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pricing")
  public Pricing getPricing() {
    return pricing;
  }

  public void setPricing(Pricing pricing) {
    this.pricing = pricing;
  }

  public BillingSection title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Title can be Fees or Rental Details (localised)
   * @return title
  */
  
  @Schema(name = "title", description = "Title can be Fees or Rental Details (localised)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public BillingSection type(String type) {
    this.type = type;
    return this;
  }

  /**
   * options can be group | single . Group for parent level, single for childs
   * @return type
  */
  @NotNull 
  @Schema(name = "type", description = "options can be group | single . Group for parent level, single for childs", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public BillingSection reference(String reference) {
    this.reference = reference;
    return this;
  }

  /**
   * options can be fees | rental | additional_driver_fee | refundable_deposit etc
   * @return reference
  */
  @NotNull 
  @Schema(name = "reference", description = "options can be fees | rental | additional_driver_fee | refundable_deposit etc", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("reference")
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public BillingSection infos(List<@Valid BillingSection> infos) {
    this.infos = infos;
    return this;
  }

  public BillingSection addInfosItem(BillingSection infosItem) {
    if (this.infos == null) {
      this.infos = new ArrayList<>();
    }
    this.infos.add(infosItem);
    return this;
  }

  /**
   * Get infos
   * @return infos
  */
  @Valid 
  @Schema(name = "infos", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("infos")
  public List<@Valid BillingSection> getInfos() {
    return infos;
  }

  public void setInfos(List<@Valid BillingSection> infos) {
    this.infos = infos;
  }

  public BillingSection explanation(String explanation) {
    this.explanation = explanation;
    return this;
  }

  /**
   * Get explanation
   * @return explanation
  */
  
  @Schema(name = "explanation", example = "A refundable deposit is a security while you have our car. We refund the deposit 7 days after you return the car without any delays, damages or traffic violations", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("explanation")
  public String getExplanation() {
    return explanation;
  }

  public void setExplanation(String explanation) {
    this.explanation = explanation;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillingSection billingSection = (BillingSection) o;
    return Objects.equals(this.pricing, billingSection.pricing) &&
        Objects.equals(this.title, billingSection.title) &&
        Objects.equals(this.type, billingSection.type) &&
        Objects.equals(this.reference, billingSection.reference) &&
        Objects.equals(this.infos, billingSection.infos) &&
        Objects.equals(this.explanation, billingSection.explanation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pricing, title, type, reference, infos, explanation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingSection {\n");
    sb.append("    pricing: ").append(toIndentedString(pricing)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    infos: ").append(toIndentedString(infos)).append("\n");
    sb.append("    explanation: ").append(toIndentedString(explanation)).append("\n");
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

