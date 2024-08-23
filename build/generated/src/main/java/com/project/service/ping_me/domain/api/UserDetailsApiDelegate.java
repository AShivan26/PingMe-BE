package com.project.service.ping_me.domain.api;

import com.project.service.ping_me.domain.contract.HttpError;
import com.project.service.ping_me.domain.contract.UpdateUserDetailsRequest;
import com.project.service.ping_me.domain.contract.UpdateUserDetailsResponse;
import com.project.service.ping_me.domain.contract.UserDetailsResponse;
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
 * A delegate to be called by the {@link UserDetailsApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public interface UserDetailsApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /{rentalActivityId}/driver : Returns the driver data including details requested in query if present.
     * # Gets rental activity data including data queried in identifier.  ## Example:  &#x60;&#x60;&#x60; GET /v1/digital-checkout/115646542/driver?identifiers&#x3D;DEFAULT_PARAMS -H \&quot;Authorization: Bearer TOKEN\&quot; GET /v1/digital-checkout/115646542/driver?identifiers&#x3D;RESIDENTIAL_ADDRESS,ID_CARD_DETAILS -H \&quot;Authorization: Bearer TOKEN\&quot; GET /v1/digital-checkout/115646542/driver?identifiers&#x3D;TAX_ID -H \&quot;Authorization: Bearer TOKEN\&quot;         &#x60;&#x60;&#x60;
     *
     * @param rentalActivityId Rental Activity Id (required)
     * @param identifiers identifier to identify which field is to be updated (required)
     * @return Returns boolean flags for each fields and details of user if its already there in rental-activity. (status code 200)
     *         or HTTP errors may have one of the following error codes: - &#x60;INVALID_REQUEST&#x60; - PersonID is missing from token. (status code 400)
     *         or HTTP errors may have one of the following error codes: - &#x60;INVALID_BOOKING_ID&#x60; - The reservation was not found. (status code 404)
     *         or HTTP errors may have one of the following error codes: - &#x60;INITIATED_AT_COUNTER&#x60; - The reservation already initiated at counter. (status code 409)
     *         or HTTP errors may have one of the following error codes: - &#x60;INTERNAL_SERVER_ERROR&#x60; - If there is some error talking to a dependency (status code 500)
     *         or HTTP errors are represented in the following format (status code 200)
     * @see UserDetailsApi#userDetails
     */
    default ResponseEntity<UserDetailsResponse> userDetails(String rentalActivityId,
        List<String> identifiers) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"driverInfo\" : { \"firstName\" : \"xyz\", \"lastName\" : \"xyz\", \"passport\" : { \"idNumber\" : \"AF 2637468\", \"dateOfIssue\" : \"2023-03-27T00:00:00.000+00:00\", \"issuingCountryCode\" : \"ES\" }, \"taxId\" : \"123456789\", \"otherAddressInfo\" : \"Xpress,SIXT R&D Pvt Ltd,Floor 6,Cessna Business Park,Namma Bengaluru\", \"dvlaDetail\" : { \"penaltyPoint\" : \"5\", \"dvlaCode\" : \"rGJ7m2nq\" } }, \"isIDCardDetailsNeeded\" : false, \"rentalActivityId\" : \"1001987478\", \"isResidentialAddressNeeded\" : false }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /{rentalActivityId}/driver/update : Endpoint for final update of User details.
     * # Endpoint for final update of user details.  ## Example:  &#x60;&#x60;&#x60; PUT /v1/digital-checkout/115646542/driver/update -H \&quot;Authorization: Bearer TOKEN\&quot; &#x60;&#x60;&#x60;
     *
     * @param rentalActivityId Rental Activity Id (required)
     * @param updateUserDetailsRequest  (required)
     * @return Returns an object with boolean flag on success/failure. (status code 200)
     *         or HTTP errors may have one of the following error codes: - &#x60;INVALID_REQUEST&#x60; - PersonID is missing from token. (status code 400)
     *         or HTTP errors may have one of the following error codes: - &#x60;RESERVATION_NOT_FOUND&#x60; - The reservation was not found. (status code 404)
     *         or HTTP errors may have one of the following error codes: - &#x60;INITIATED_AT_COUNTER&#x60; - The reservation already initiated at counter. (status code 409)
     *         or HTTP errors may have one of the following error codes: - &#x60;INTERNAL_ERROR&#x60; - If there is some error talking to a dependency (status code 500)
     *         or HTTP errors are represented in the following format (status code 200)
     * @see UserDetailsApi#userDetailsUpdate
     */
    default ResponseEntity<UpdateUserDetailsResponse> userDetailsUpdate(String rentalActivityId,
        UpdateUserDetailsRequest updateUserDetailsRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"isSuccess\" : false }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
