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
 * DocumentationStatus
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class DocumentationStatus {

  private String usecase;

  private String message;

  private String documentationStatus;

  private Boolean membershipAgreementAgreed;

  public DocumentationStatus() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DocumentationStatus(String usecase, String documentationStatus, Boolean membershipAgreementAgreed) {
    this.usecase = usecase;
    this.documentationStatus = documentationStatus;
    this.membershipAgreementAgreed = membershipAgreementAgreed;
  }

  public DocumentationStatus usecase(String usecase) {
    this.usecase = usecase;
    return this;
  }

  /**
   *  To be deprecated  Probable values are  - completed  - not_completed  - failed  - missed  - fraud  - additional_driver_details_missed
   * @return usecase
  */
  @NotNull 
  @Schema(name = "usecase", description = " To be deprecated  Probable values are  - completed  - not_completed  - failed  - missed  - fraud  - additional_driver_details_missed", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("usecase")
  public String getUsecase() {
    return usecase;
  }

  public void setUsecase(String usecase) {
    this.usecase = usecase;
  }

  public DocumentationStatus message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
  */
  
  @Schema(name = "message", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public DocumentationStatus documentationStatus(String documentationStatus) {
    this.documentationStatus = documentationStatus;
    return this;
  }

  /**
   * Probable values are  - completed  - not_completed  - failed  - fraud
   * @return documentationStatus
  */
  @NotNull 
  @Schema(name = "documentationStatus", description = "Probable values are  - completed  - not_completed  - failed  - fraud", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("documentationStatus")
  public String getDocumentationStatus() {
    return documentationStatus;
  }

  public void setDocumentationStatus(String documentationStatus) {
    this.documentationStatus = documentationStatus;
  }

  public DocumentationStatus membershipAgreementAgreed(Boolean membershipAgreementAgreed) {
    this.membershipAgreementAgreed = membershipAgreementAgreed;
    return this;
  }

  /**
   * boolean field to indicate  the user have accepted the membershipAgreement
   * @return membershipAgreementAgreed
  */
  @NotNull 
  @Schema(name = "membershipAgreementAgreed", description = "boolean field to indicate  the user have accepted the membershipAgreement", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("membershipAgreementAgreed")
  public Boolean isMembershipAgreementAgreed() {
    return membershipAgreementAgreed;
  }

  public void setMembershipAgreementAgreed(Boolean membershipAgreementAgreed) {
    this.membershipAgreementAgreed = membershipAgreementAgreed;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentationStatus documentationStatus = (DocumentationStatus) o;
    return Objects.equals(this.usecase, documentationStatus.usecase) &&
        Objects.equals(this.message, documentationStatus.message) &&
        Objects.equals(this.documentationStatus, documentationStatus.documentationStatus) &&
        Objects.equals(this.membershipAgreementAgreed, documentationStatus.membershipAgreementAgreed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(usecase, message, documentationStatus, membershipAgreementAgreed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentationStatus {\n");
    sb.append("    usecase: ").append(toIndentedString(usecase)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    documentationStatus: ").append(toIndentedString(documentationStatus)).append("\n");
    sb.append("    membershipAgreementAgreed: ").append(toIndentedString(membershipAgreementAgreed)).append("\n");
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

