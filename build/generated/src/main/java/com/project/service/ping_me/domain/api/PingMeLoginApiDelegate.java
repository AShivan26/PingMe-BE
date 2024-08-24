package com.project.service.ping_me.domain.api;

import com.project.service.ping_me.domain.contract.HttpError;
import com.project.service.ping_me.domain.contract.RegisterRequestObject;
import com.project.service.ping_me.domain.contract.RegisterResponseObject;
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
 * A delegate to be called by the {@link PingMeLoginApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public interface PingMeLoginApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /pingme/login : Login Existing User
     *
     * @param username Username of user. (required)
     * @param password Password for user (Will be encrypted). (required)
     * @return Returns login response object (status code 200)
     *         or HTTP errors may have one of the following error codes: - &#x60;INVALID_REQUEST&#x60; - pingmeId is missing from token. (status code 400)
     *         or HTTP errors may have one of the following error codes: - &#x60;PAGE_NOT_FOUND&#x60; - The API was not found. (status code 404)
     *         or HTTP errors may have one of the following error codes: - &#x60;CONFLICT_ERROR&#x60; - The session is already in place for this identifier. (status code 409)
     *         or HTTP errors may have one of the following error codes: - &#x60;INTERNAL_SERVER_ERROR&#x60; - If there is some error talking to a dependency (status code 500)
     *         or HTTP errors are represented in the following format (status code 200)
     * @see PingMeLoginApi#pingmeLoginGet
     */
    default ResponseEntity<RegisterResponseObject> pingmeLoginGet(String username,
        String password) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"userId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /pingme/register : Create User in System
     *
     * @param registerRequestObject Register user (required)
     * @return Returns entry response object (status code 200)
     *         or HTTP errors may have one of the following error codes: - &#x60;INVALID_REQUEST&#x60; - pingmeId is missing from token. (status code 400)
     *         or HTTP errors may have one of the following error codes: - &#x60;PAGE_NOT_FOUND&#x60; - The API was not found. (status code 404)
     *         or HTTP errors may have one of the following error codes: - &#x60;CONFLICT_ERROR&#x60; - The session is already in place for this identifier. (status code 409)
     *         or HTTP errors may have one of the following error codes: - &#x60;INTERNAL_SERVER_ERROR&#x60; - If there is some error talking to a dependency (status code 500)
     *         or HTTP errors are represented in the following format (status code 200)
     * @see PingMeLoginApi#pingmeRegisterPost
     */
    default ResponseEntity<RegisterResponseObject> pingmeRegisterPost(RegisterRequestObject registerRequestObject) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"userId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
