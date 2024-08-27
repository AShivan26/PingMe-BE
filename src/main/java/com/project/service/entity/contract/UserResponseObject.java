package com.project.service.entity.contract;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;

import java.util.Objects;

/**
 * UserResponseObject
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class UserResponseObject {

  private String name;

  private String id;

  private Boolean online;

  public UserResponseObject name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UserResponseObject id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public UserResponseObject online(Boolean online) {
    this.online = online;
    return this;
  }

  /**
   * Get online
   * @return online
  */
  
  @Schema(name = "online", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("online")
  public Boolean isOnline() {
    return online;
  }

  public void setOnline(Boolean online) {
    this.online = online;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserResponseObject userResponseObject = (UserResponseObject) o;
    return Objects.equals(this.name, userResponseObject.name) &&
        Objects.equals(this.id, userResponseObject.id) &&
        Objects.equals(this.online, userResponseObject.online);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, id, online);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserResponseObject {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    online: ").append(toIndentedString(online)).append("\n");
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

