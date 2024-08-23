package com.project.service.ping_me.domain.api;

import com.project.service.ping_me.domain.contract.EligibleDiscount;
import com.project.service.ping_me.domain.contract.HttpError;
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
 * A delegate to be called by the {@link DiscountApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public interface DiscountApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /discount/{rentalActivityId}/eligibility : Gets discount eligibility details for rentalActivity.
     * # Gets discount eligibility details for rentalActivity, takes rentalActivity/reservationid in parameter  ## Example:  &#x60;&#x60;&#x60; GET /v1/digital-checkout/115646542/eligibility?currency&#x3D;USD&amp;identifierType&#x3D;RENTAL_ACTIVITY &#x60;&#x60;&#x60;
     *
     * @param rentalActivityId Rental Activity Id (required)
     * @param currency currency code (required)
     * @param identifierType Identifier type for rentalActivityid in path param values will be RENTAL_ACTIVITY/RESERVATION (required)
     * @return Returns DiscountEligibility response object (status code 200)
     *         or HTTP errors may have one of the following error codes: - &#x60;INVALID_REQUEST&#x60; - PersonID is missing from token. (status code 400)
     *         or HTTP errors may have one of the following error codes: - &#x60;BOOKING_NOT_FOUND&#x60; - The reservation was not found. (status code 404)
     *         or HTTP errors may have one of the following error codes: - &#x60;INTERNAL_SERVER_ERROR&#x60; - If there is some error talking to a dependency (status code 500)
     *         or HTTP errors are represented in the following format (status code 200)
     * @see DiscountApi#discountEligibility
     */
    default ResponseEntity<EligibleDiscount> discountEligibility(String rentalActivityId,
        String currency,
        String identifierType) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"discount\" : { \"eligible\" : true, \"validityDateTime\" : { \"date\" : \"2006-01-02T15:04:05+07:00\", \"timeZone\" : \"America/New_York\" }, \"incentivizationUseCase\" : \"incentivizationUseCase\", \"discountType\" : \"discountType\", \"message\" : \"message\", \"discountValue\" : 0.8008281904610115 }, \"isBookingDigitalCheckoutEligible\" : true }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
