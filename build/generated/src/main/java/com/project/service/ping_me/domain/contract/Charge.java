package com.project.service.ping_me.domain.contract;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.project.service.ping_me.domain.contract.ChargeDetail;
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
 * Charge
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class Charge {

  private String description;

  private String iconUrl;

  private String id;

  private Boolean isEnabled;

  private Boolean isIncluded;

  private Integer maxQuantity;

  private String name;

  private Pricing pricing;

  private Integer quantity;

  private String type;

  @Valid
  private List<String> details;

  private String infoText;

  @Valid
  private List<@Valid Charge> chargeOptions;

  private String recommendationTag;

  private Boolean nudgeProtection;

  @Valid
  private List<@Valid ChargeDetail> protectionPackagesCharges;

  public Charge() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Charge(String description, String iconUrl, String id, Boolean isEnabled, Boolean isIncluded, Integer maxQuantity, String name, Pricing pricing, Integer quantity, String type) {
    this.description = description;
    this.iconUrl = iconUrl;
    this.id = id;
    this.isEnabled = isEnabled;
    this.isIncluded = isIncluded;
    this.maxQuantity = maxQuantity;
    this.name = name;
    this.pricing = pricing;
    this.quantity = quantity;
    this.type = type;
  }

  public Charge description(String description) {
    this.description = description;
    return this;
  }

  /**
   * a translated description of the charge
   * @return description
  */
  @NotNull 
  @Schema(name = "description", example = "Everyone loves to drive our cars! Add a friend and hit the road", description = "a translated description of the charge", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Charge iconUrl(String iconUrl) {
    this.iconUrl = iconUrl;
    return this;
  }

  /**
   * the icon URL for this charge
   * @return iconUrl
  */
  @NotNull 
  @Schema(name = "iconUrl", example = "https://cdn.sixt.io/extras/{density}/ico_personplusbig.png", description = "the icon URL for this charge", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("iconUrl")
  public String getIconUrl() {
    return iconUrl;
  }

  public void setIconUrl(String iconUrl) {
    this.iconUrl = iconUrl;
  }

  public Charge id(String id) {
    this.id = id;
    return this;
  }

  /**
   * the charge code, In case of the charge is a chargeOption, the id for the default chargeOption will be exported from the BE in this format xyz-none so that the front-end can check if the id is in the format of xyz-none, then it is the default chargeOption, otherwise it is a normal id.
   * @return id
  */
  @NotNull 
  @Schema(name = "id", example = "AD", description = "the charge code, In case of the charge is a chargeOption, the id for the default chargeOption will be exported from the BE in this format xyz-none so that the front-end can check if the id is in the format of xyz-none, then it is the default chargeOption, otherwise it is a normal id.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Charge isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

  /**
   * when false, this charge should not be displayed
   * @return isEnabled
  */
  @NotNull 
  @Schema(name = "isEnabled", example = "true", description = "when false, this charge should not be displayed", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("isEnabled")
  public Boolean isIsEnabled() {
    return isEnabled;
  }

  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }

  public Charge isIncluded(Boolean isIncluded) {
    this.isIncluded = isIncluded;
    return this;
  }

  /**
   * When true, it indicates that this charge was included as part of the rate rather than explicit selection (and therefore cannot be modified)
   * @return isIncluded
  */
  @NotNull 
  @Schema(name = "isIncluded", example = "true", description = "When true, it indicates that this charge was included as part of the rate rather than explicit selection (and therefore cannot be modified)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("isIncluded")
  public Boolean isIsIncluded() {
    return isIncluded;
  }

  public void setIsIncluded(Boolean isIncluded) {
    this.isIncluded = isIncluded;
  }

  public Charge maxQuantity(Integer maxQuantity) {
    this.maxQuantity = maxQuantity;
    return this;
  }

  /**
   * the maximum number of pieces which can be booked. The default value will be one
   * @return maxQuantity
  */
  @NotNull 
  @Schema(name = "maxQuantity", example = "4", description = "the maximum number of pieces which can be booked. The default value will be one", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("maxQuantity")
  public Integer getMaxQuantity() {
    return maxQuantity;
  }

  public void setMaxQuantity(Integer maxQuantity) {
    this.maxQuantity = maxQuantity;
  }

  public Charge name(String name) {
    this.name = name;
    return this;
  }

  /**
   * the translated name of the charge
   * @return name
  */
  @NotNull 
  @Schema(name = "name", example = "Additional Driver", description = "the translated name of the charge", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Charge pricing(Pricing pricing) {
    this.pricing = pricing;
    return this;
  }

  /**
   * Get pricing
   * @return pricing
  */
  @NotNull @Valid 
  @Schema(name = "pricing", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("pricing")
  public Pricing getPricing() {
    return pricing;
  }

  public void setPricing(Pricing pricing) {
    this.pricing = pricing;
  }

  public Charge quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * number of pieces currently selected. Zero indicates that it is not selected
   * @return quantity
  */
  @NotNull 
  @Schema(name = "quantity", example = "1", description = "number of pieces currently selected. Zero indicates that it is not selected", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("quantity")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public Charge type(String type) {
    this.type = type;
    return this;
  }

  /**
   * the charge type, used for grouping charges together
   * @return type
  */
  @NotNull 
  @Schema(name = "type", example = "protection|seats|winter|other", description = "the charge type, used for grouping charges together", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Charge details(List<String> details) {
    this.details = details;
    return this;
  }

  public Charge addDetailsItem(String detailsItem) {
    if (this.details == null) {
      this.details = new ArrayList<>();
    }
    this.details.add(detailsItem);
    return this;
  }

  /**
   * translated details about charge splitted as paragraphs
   * @return details
  */
  
  @Schema(name = "details", description = "translated details about charge splitted as paragraphs", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("details")
  public List<String> getDetails() {
    return details;
  }

  public void setDetails(List<String> details) {
    this.details = details;
  }

  public Charge infoText(String infoText) {
    this.infoText = infoText;
    return this;
  }

  /**
   * On Selecting the charge informtaion text to be displayed in case required
   * @return infoText
  */
  
  @Schema(name = "infoText", example = "Additonal driver verification will be done at the counter.", description = "On Selecting the charge informtaion text to be displayed in case required", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("infoText")
  public String getInfoText() {
    return infoText;
  }

  public void setInfoText(String infoText) {
    this.infoText = infoText;
  }

  public Charge chargeOptions(List<@Valid Charge> chargeOptions) {
    this.chargeOptions = chargeOptions;
    return this;
  }

  public Charge addChargeOptionsItem(Charge chargeOptionsItem) {
    if (this.chargeOptions == null) {
      this.chargeOptions = new ArrayList<>();
    }
    this.chargeOptions.add(chargeOptionsItem);
    return this;
  }

  /**
   * List of charge options for single protection.
   * @return chargeOptions
  */
  @Valid 
  @Schema(name = "chargeOptions", example = "Charge options under Loss Damage Waiver protection (e.g., Liable to pay upto EUR 950, Liable to pay upto EUR 450 and Full Protection).", description = "List of charge options for single protection.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("chargeOptions")
  public List<@Valid Charge> getChargeOptions() {
    return chargeOptions;
  }

  public void setChargeOptions(List<@Valid Charge> chargeOptions) {
    this.chargeOptions = chargeOptions;
  }

  public Charge recommendationTag(String recommendationTag) {
    this.recommendationTag = recommendationTag;
    return this;
  }

  /**
   * will contain the recommendation tag label if that protection package is recommended for user if it is configured in SF, otherwise should be NULL
   * @return recommendationTag
  */
  
  @Schema(name = "recommendationTag", example = "Recommended for you", description = "will contain the recommendation tag label if that protection package is recommended for user if it is configured in SF, otherwise should be NULL", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("recommendationTag")
  public String getRecommendationTag() {
    return recommendationTag;
  }

  public void setRecommendationTag(String recommendationTag) {
    this.recommendationTag = recommendationTag;
  }

  public Charge nudgeProtection(Boolean nudgeProtection) {
    this.nudgeProtection = nudgeProtection;
    return this;
  }

  /**
   * will specify if this protection should be nudge to user if he hasnt selected anything. Controlled by SF configs, if configs are not present, first protection in the list will be the default one
   * @return nudgeProtection
  */
  
  @Schema(name = "nudgeProtection", description = "will specify if this protection should be nudge to user if he hasnt selected anything. Controlled by SF configs, if configs are not present, first protection in the list will be the default one", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("nudgeProtection")
  public Boolean isNudgeProtection() {
    return nudgeProtection;
  }

  public void setNudgeProtection(Boolean nudgeProtection) {
    this.nudgeProtection = nudgeProtection;
  }

  public Charge protectionPackagesCharges(List<@Valid ChargeDetail> protectionPackagesCharges) {
    this.protectionPackagesCharges = protectionPackagesCharges;
    return this;
  }

  public Charge addProtectionPackagesChargesItem(ChargeDetail protectionPackagesChargesItem) {
    if (this.protectionPackagesCharges == null) {
      this.protectionPackagesCharges = new ArrayList<>();
    }
    this.protectionPackagesCharges.add(protectionPackagesChargesItem);
    return this;
  }

  /**
   * Get protectionPackagesCharges
   * @return protectionPackagesCharges
  */
  @Valid 
  @Schema(name = "protectionPackagesCharges", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("protectionPackagesCharges")
  public List<@Valid ChargeDetail> getProtectionPackagesCharges() {
    return protectionPackagesCharges;
  }

  public void setProtectionPackagesCharges(List<@Valid ChargeDetail> protectionPackagesCharges) {
    this.protectionPackagesCharges = protectionPackagesCharges;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Charge charge = (Charge) o;
    return Objects.equals(this.description, charge.description) &&
        Objects.equals(this.iconUrl, charge.iconUrl) &&
        Objects.equals(this.id, charge.id) &&
        Objects.equals(this.isEnabled, charge.isEnabled) &&
        Objects.equals(this.isIncluded, charge.isIncluded) &&
        Objects.equals(this.maxQuantity, charge.maxQuantity) &&
        Objects.equals(this.name, charge.name) &&
        Objects.equals(this.pricing, charge.pricing) &&
        Objects.equals(this.quantity, charge.quantity) &&
        Objects.equals(this.type, charge.type) &&
        Objects.equals(this.details, charge.details) &&
        Objects.equals(this.infoText, charge.infoText) &&
        Objects.equals(this.chargeOptions, charge.chargeOptions) &&
        Objects.equals(this.recommendationTag, charge.recommendationTag) &&
        Objects.equals(this.nudgeProtection, charge.nudgeProtection) &&
        Objects.equals(this.protectionPackagesCharges, charge.protectionPackagesCharges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, iconUrl, id, isEnabled, isIncluded, maxQuantity, name, pricing, quantity, type, details, infoText, chargeOptions, recommendationTag, nudgeProtection, protectionPackagesCharges);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Charge {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    iconUrl: ").append(toIndentedString(iconUrl)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    isIncluded: ").append(toIndentedString(isIncluded)).append("\n");
    sb.append("    maxQuantity: ").append(toIndentedString(maxQuantity)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pricing: ").append(toIndentedString(pricing)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    infoText: ").append(toIndentedString(infoText)).append("\n");
    sb.append("    chargeOptions: ").append(toIndentedString(chargeOptions)).append("\n");
    sb.append("    recommendationTag: ").append(toIndentedString(recommendationTag)).append("\n");
    sb.append("    nudgeProtection: ").append(toIndentedString(nudgeProtection)).append("\n");
    sb.append("    protectionPackagesCharges: ").append(toIndentedString(protectionPackagesCharges)).append("\n");
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

