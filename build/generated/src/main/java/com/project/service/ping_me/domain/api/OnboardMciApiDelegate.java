package com.project.service.ping_me.domain.api;

import com.project.service.ping_me.domain.contract.HttpError;
import com.project.service.ping_me.domain.contract.OnBoardMCIResponse;
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
 * A delegate to be called by the {@link OnboardMciApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public interface OnboardMciApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /{rentalActivityId}/onboarding-info : Gets required details for MCI onboard screen.
     * # Gets required details for entry screen ## Example: &#x60;&#x60;&#x60; GET /digital-checkout/115646542/onboarding-info -H \&quot;Authorization: Bearer TOKEN\&quot; &#x60;&#x60;&#x60;
     *
     * @param rentalActivityId Rental Activity Id (required)
     * @return Returns entry response object (status code 200)
     *         or HTTP errors may have one of the following error codes: - &#x60;INVALID_REQUEST&#x60; - PersonID is missing from token. (status code 400)
     *         or HTTP errors may have one of the following error codes: - &#x60;BOOKING_NOT_FOUND&#x60; - The reservation was not found. (status code 404)
     *         or HTTP errors may have one of the following error codes: - &#x60;INITIATED_AT_COUNTER&#x60; - The reservation already initiated at counter. (status code 409)
     *         or HTTP errors may have one of the following error codes: - &#x60;REQUESTED_RANGE_NOT_SATISFIABLE&#x60; - Vehicle Selection not Allowed Currently. - &#x60;BOOKING_NOT_ELIGIBLE&#x60; - in case of non zen or next not eligible bookings (status code 416)
     *         or HTTP errors may have one of the following error codes: - &#x60;INTERNAL_SERVER_ERROR&#x60; - If there is some error talking to a dependency (status code 500)
     *         or HTTP errors are represented in the following format (status code 200)
     * @see OnboardMciApi#mCIOnboard
     */
    default ResponseEntity<OnBoardMCIResponse> mCIOnboard(String rentalActivityId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"terminalInformation\" : { \"description\" : \"description\", \"title\" : \"title\", \"terminalList\" : [ { \"name\" : \"name\", \"id\" : \"id\" }, { \"name\" : \"name\", \"id\" : \"id\" } ] }, \"pickupCountryCode\" : \"pickupCountryCode\", \"actions\" : [ \"DEFAULT_PARAMS\", \"DEFAULT_PARAMS\" ], \"pickupBranchId\" : \"pickupBranchId\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
