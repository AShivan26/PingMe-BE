package com.project.service.ping_me.domain.api;

import com.project.service.ping_me.domain.contract.HttpError;
import com.project.service.ping_me.domain.contract.UserResponseObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;

/**
 * A delegate to be called by the {@link PingMeUserDetailsApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public interface PingMeUserDetailsApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /pingme/users : Gets all users present in the system.
     * ## Gets all users present in the system  ## Example:  &#x60;&#x60;&#x60; GET /v1/ping-me/115646542/users -H \&quot;Authorization: Bearer TOKEN\&quot; &#x60;&#x60;&#x60;
     *
     * @return Returns entry response object (status code 200)
     *         or HTTP errors may have one of the following error codes: - &#x60;INVALID_REQUEST&#x60; - pingmeId is missing from token. (status code 400)
     *         or HTTP errors may have one of the following error codes: - &#x60;PAGE_NOT_FOUND&#x60; - The API was not found. (status code 404)
     *         or HTTP errors may have one of the following error codes: - &#x60;CONFLICT_ERROR&#x60; - The session is already in place for this identifier. (status code 409)
     *         or HTTP errors may have one of the following error codes: - &#x60;INTERNAL_SERVER_ERROR&#x60; - If there is some error talking to a dependency (status code 500)
     *         or HTTP errors are represented in the following format (status code 200)
     * @see PingMeUserDetailsApi#allUserDetails
     */
    default ResponseEntity<List<UserResponseObject>> allUserDetails() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"name\" : \"name\", \"online\" : true, \"id\" : \"id\" }, { \"name\" : \"name\", \"online\" : true, \"id\" : \"id\" } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
