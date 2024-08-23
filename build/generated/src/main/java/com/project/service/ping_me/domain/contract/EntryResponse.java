package com.project.service.ping_me.domain.contract;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.project.service.ping_me.domain.contract.DocumentationStatus;
import com.project.service.ping_me.domain.contract.EntryUsecase;
import com.project.service.ping_me.domain.contract.IDs;
import com.project.service.ping_me.domain.contract.PriceInfo;
import com.project.service.ping_me.domain.contract.Step;
import com.project.service.ping_me.domain.contract.Terminal;
import com.project.service.ping_me.domain.contract.Trip;
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
 * Response object of the entry API
 */

@Schema(name = "EntryResponse", description = "Response object of the entry API")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class EntryResponse {

  private IDs internalIds;

  private String title;

  private String subTitle;

  private String id;

  private String imageUrl;

  private PriceInfo priceInfo;

  private Trip trip;

  private EntryUsecase usecase;

  private DocumentationStatus documentationStatus;

  @Valid
  private List<@Valid Step> instructionList = new ArrayList<>();

  @Valid
  private List<@Valid Terminal> terminalList;

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

  public EntryResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public EntryResponse(IDs internalIds, String title, String id, String imageUrl, Trip trip, EntryUsecase usecase, DocumentationStatus documentationStatus, List<@Valid Step> instructionList) {
    this.internalIds = internalIds;
    this.title = title;
    this.id = id;
    this.imageUrl = imageUrl;
    this.trip = trip;
    this.usecase = usecase;
    this.documentationStatus = documentationStatus;
    this.instructionList = instructionList;
  }

  public EntryResponse internalIds(IDs internalIds) {
    this.internalIds = internalIds;
    return this;
  }

  /**
   * Get internalIds
   * @return internalIds
  */
  @NotNull @Valid 
  @Schema(name = "internalIds", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("internalIds")
  public IDs getInternalIds() {
    return internalIds;
  }

  public void setInternalIds(IDs internalIds) {
    this.internalIds = internalIds;
  }

  public EntryResponse title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  */
  @NotNull 
  @Schema(name = "title", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public EntryResponse subTitle(String subTitle) {
    this.subTitle = subTitle;
    return this;
  }

  /**
   * Get subTitle
   * @return subTitle
  */
  
  @Schema(name = "subTitle", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subTitle")
  public String getSubTitle() {
    return subTitle;
  }

  public void setSubTitle(String subTitle) {
    this.subTitle = subTitle;
  }

  public EntryResponse id(String id) {
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
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public EntryResponse imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

  /**
   * Get imageUrl
   * @return imageUrl
  */
  @NotNull 
  @Schema(name = "imageUrl", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("imageUrl")
  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public EntryResponse priceInfo(PriceInfo priceInfo) {
    this.priceInfo = priceInfo;
    return this;
  }

  /**
   * Get priceInfo
   * @return priceInfo
  */
  @Valid 
  @Schema(name = "priceInfo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("priceInfo")
  public PriceInfo getPriceInfo() {
    return priceInfo;
  }

  public void setPriceInfo(PriceInfo priceInfo) {
    this.priceInfo = priceInfo;
  }

  public EntryResponse trip(Trip trip) {
    this.trip = trip;
    return this;
  }

  /**
   * Get trip
   * @return trip
  */
  @NotNull @Valid 
  @Schema(name = "trip", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("trip")
  public Trip getTrip() {
    return trip;
  }

  public void setTrip(Trip trip) {
    this.trip = trip;
  }

  public EntryResponse usecase(EntryUsecase usecase) {
    this.usecase = usecase;
    return this;
  }

  /**
   * Get usecase
   * @return usecase
  */
  @NotNull @Valid 
  @Schema(name = "usecase", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("usecase")
  public EntryUsecase getUsecase() {
    return usecase;
  }

  public void setUsecase(EntryUsecase usecase) {
    this.usecase = usecase;
  }

  public EntryResponse documentationStatus(DocumentationStatus documentationStatus) {
    this.documentationStatus = documentationStatus;
    return this;
  }

  /**
   * Get documentationStatus
   * @return documentationStatus
  */
  @NotNull @Valid 
  @Schema(name = "documentationStatus", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("documentationStatus")
  public DocumentationStatus getDocumentationStatus() {
    return documentationStatus;
  }

  public void setDocumentationStatus(DocumentationStatus documentationStatus) {
    this.documentationStatus = documentationStatus;
  }

  public EntryResponse instructionList(List<@Valid Step> instructionList) {
    this.instructionList = instructionList;
    return this;
  }

  public EntryResponse addInstructionListItem(Step instructionListItem) {
    if (this.instructionList == null) {
      this.instructionList = new ArrayList<>();
    }
    this.instructionList.add(instructionListItem);
    return this;
  }

  /**
   * Get instructionList
   * @return instructionList
  */
  @NotNull @Valid 
  @Schema(name = "instructionList", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("instructionList")
  public List<@Valid Step> getInstructionList() {
    return instructionList;
  }

  public void setInstructionList(List<@Valid Step> instructionList) {
    this.instructionList = instructionList;
  }

  public EntryResponse terminalList(List<@Valid Terminal> terminalList) {
    this.terminalList = terminalList;
    return this;
  }

  public EntryResponse addTerminalListItem(Terminal terminalListItem) {
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

  public EntryResponse actions(List<ActionsEnum> actions) {
    this.actions = actions;
    return this;
  }

  public EntryResponse addActionsItem(ActionsEnum actionsItem) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntryResponse entryResponse = (EntryResponse) o;
    return Objects.equals(this.internalIds, entryResponse.internalIds) &&
        Objects.equals(this.title, entryResponse.title) &&
        Objects.equals(this.subTitle, entryResponse.subTitle) &&
        Objects.equals(this.id, entryResponse.id) &&
        Objects.equals(this.imageUrl, entryResponse.imageUrl) &&
        Objects.equals(this.priceInfo, entryResponse.priceInfo) &&
        Objects.equals(this.trip, entryResponse.trip) &&
        Objects.equals(this.usecase, entryResponse.usecase) &&
        Objects.equals(this.documentationStatus, entryResponse.documentationStatus) &&
        Objects.equals(this.instructionList, entryResponse.instructionList) &&
        Objects.equals(this.terminalList, entryResponse.terminalList) &&
        Objects.equals(this.actions, entryResponse.actions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(internalIds, title, subTitle, id, imageUrl, priceInfo, trip, usecase, documentationStatus, instructionList, terminalList, actions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntryResponse {\n");
    sb.append("    internalIds: ").append(toIndentedString(internalIds)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    subTitle: ").append(toIndentedString(subTitle)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    priceInfo: ").append(toIndentedString(priceInfo)).append("\n");
    sb.append("    trip: ").append(toIndentedString(trip)).append("\n");
    sb.append("    usecase: ").append(toIndentedString(usecase)).append("\n");
    sb.append("    documentationStatus: ").append(toIndentedString(documentationStatus)).append("\n");
    sb.append("    instructionList: ").append(toIndentedString(instructionList)).append("\n");
    sb.append("    terminalList: ").append(toIndentedString(terminalList)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
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

