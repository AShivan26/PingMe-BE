package com.project.service.contract;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;

import java.util.Objects;

/**
 * HttpError
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class HttpError {

  private Object data;

  private String errorCode;

  private String message;

  private Boolean retriable;

  private String title;

  public HttpError data(Object data) {
    this.data = data;
    return this;
  }

  /**
   * interface for adding additional information with arbitary format
   * @return data
  */
  
  @Schema(name = "data", description = "interface for adding additional information with arbitary format", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("data")
  public Object getData() {
    return data;
  }

  public void setData(Object data) {
    this.data = data;
  }

  public HttpError errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  /**
   * the unique error code  (e.g. 'user_not_found')
   * @return errorCode
  */
  
  @Schema(name = "errorCode", description = "the unique error code  (e.g. 'user_not_found')", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errorCode")
  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public HttpError message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Human readable error message (e.g. 'The requested user could not be found')
   * @return message
  */
  
  @Schema(name = "message", description = "Human readable error message (e.g. 'The requested user could not be found')", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public HttpError retriable(Boolean retriable) {
    this.retriable = retriable;
    return this;
  }

  /**
   * indicates if the client might perform a retry for the request causing the error
   * @return retriable
  */
  
  @Schema(name = "retriable", description = "indicates if the client might perform a retry for the request causing the error", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("retriable")
  public Boolean isRetriable() {
    return retriable;
  }

  public void setRetriable(Boolean retriable) {
    this.retriable = retriable;
  }

  public HttpError title(String title) {
    this.title = title;
    return this;
  }

  /**
   * human readable error title (e.g. 'Not Found')
   * @return title
  */
  
  @Schema(name = "title", description = "human readable error title (e.g. 'Not Found')", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HttpError httpError = (HttpError) o;
    return Objects.equals(this.data, httpError.data) &&
        Objects.equals(this.errorCode, httpError.errorCode) &&
        Objects.equals(this.message, httpError.message) &&
        Objects.equals(this.retriable, httpError.retriable) &&
        Objects.equals(this.title, httpError.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, errorCode, message, retriable, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HttpError {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    retriable: ").append(toIndentedString(retriable)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

