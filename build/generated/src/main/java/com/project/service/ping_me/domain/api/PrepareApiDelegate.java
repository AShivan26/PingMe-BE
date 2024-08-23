package com.project.service.ping_me.domain.api;

import com.project.service.ping_me.domain.contract.HttpError;
import com.project.service.ping_me.domain.contract.PrepareResponse;
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
 * A delegate to be called by the {@link PrepareApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public interface PrepareApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /{rentalActivityId}/prepare : Sync all documentation data with RA before starting the checkout
     * # Do a prepare  ## Example:  &#x60;&#x60;&#x60; POST /v1/digital-checkout/115646542/prepare -H \&quot;Authorization: Bearer TOKEN\&quot; &#x60;&#x60;&#x60;
     *
     * @param rentalActivityId Rental Activity Id (required)
     * @return Returns success if data is synced successfully (status code 200)
     *         or HTTP errors may have one of the following error codes: - &#x60;INVALID_REQUEST&#x60; - PersonID is missing from token. (status code 400)
     *         or HTTP errors may have one of the following error codes: - &#x60;INTERNAL_SERVER_ERROR&#x60; - If there is some error talking to a dependency (status code 500)
     *         or HTTP errors are represented in the following format (status code 200)
     * @see PrepareApi#prepare
     */
    default ResponseEntity<PrepareResponse> prepare(String rentalActivityId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"rentalActivityId\" : \"rentalActivityId\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
