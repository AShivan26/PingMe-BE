package com.project.service.ping_me.domain.api;

import com.project.service.ping_me.domain.contract.HttpError;
import com.project.service.ping_me.domain.contract.PriceDetailResponse;
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
 * A delegate to be called by the {@link PriceApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public interface PriceApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /{rentalActivityId}/price/detail : Gets price information
     * # Gets price information ## Example: &#x60;&#x60;&#x60; GET /v1/digital-checkout/115646542/price/detail -H \&quot;Authorization: Bearer TOKEN\&quot; &#x60;&#x60;&#x60;
     *
     * @param rentalActivityId Rental Activity Id (required)
     * @return Returns price breakup information (status code 200)
     *         or HTTP errors may have one of the following error codes: - &#x60;INVALID_REQUEST&#x60; - PersonID is missing from token. (status code 400)
     *         or {\&quot;errorCode\&quot;: \&quot;VEHICLE_NOT_AVAILABLE\&quot;, \&quot;title\&quot;: \&quot;Vehicle not available\&quot;, \&quot;message\&quot;: \&quot;Vehicle you selected is no longer available, please select new vehicle.\&quot;, \&quot;retriable\&quot;: false} (status code 402)
     *         or HTTP errors may have one of the following error codes: - &#x60;RESERVATION_NOT_FOUND&#x60; - The reservation was not found. (status code 404)
     *         or HTTP errors may have one of the following error codes: - &#x60;INITIATED_AT_COUNTER&#x60; - The reservation already initiated at counter. (status code 409)
     *         or in case of unstisfyable request - &#x60;BOOKING_NOT_ELIGIBLE&#x60; - in case of non zen or next not eligible bookings (status code 416)
     *         or HTTP errors may have one of the following error codes: - &#x60;INTERNAL_SERVER_ERROR&#x60; - If there is some error talking to a dependency (status code 500)
     *         or HTTP errors are represented in the following format (status code 200)
     * @see PriceApi#getPriceDetail
     */
    default ResponseEntity<PriceDetailResponse> getPriceDetail(String rentalActivityId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"priceInfo\" : [ { \"lineItems\" : [ { \"subtitles\" : [ \"5 x 66.16 $ /day\", \"10% discount applied\", \"$0 financial responsibility\" ], \"displayType\" : \"DEFAULT\", \"displayPrice\" : { \"currency\" : \"USD\", \"value\" : 330.82 }, \"costingType\" : \"ALREADY_CHARGED\", \"title\" : \"Your reservation\", \"key\" : \"MCI_P100_PAYMENT_RENTAL_FEE\", \"listPrice\" : { \"currency\" : \"USD\", \"value\" : 330.82 } }, { \"subtitles\" : [ \"5 x 66.16 $ /day\", \"10% discount applied\", \"$0 financial responsibility\" ], \"displayType\" : \"DEFAULT\", \"displayPrice\" : { \"currency\" : \"USD\", \"value\" : 330.82 }, \"costingType\" : \"ALREADY_CHARGED\", \"title\" : \"Your reservation\", \"key\" : \"MCI_P100_PAYMENT_RENTAL_FEE\", \"listPrice\" : { \"currency\" : \"USD\", \"value\" : 330.82 } } ], \"title\" : \"Rental fees\" }, { \"lineItems\" : [ { \"subtitles\" : [ \"5 x 66.16 $ /day\", \"10% discount applied\", \"$0 financial responsibility\" ], \"displayType\" : \"DEFAULT\", \"displayPrice\" : { \"currency\" : \"USD\", \"value\" : 330.82 }, \"costingType\" : \"ALREADY_CHARGED\", \"title\" : \"Your reservation\", \"key\" : \"MCI_P100_PAYMENT_RENTAL_FEE\", \"listPrice\" : { \"currency\" : \"USD\", \"value\" : 330.82 } }, { \"subtitles\" : [ \"5 x 66.16 $ /day\", \"10% discount applied\", \"$0 financial responsibility\" ], \"displayType\" : \"DEFAULT\", \"displayPrice\" : { \"currency\" : \"USD\", \"value\" : 330.82 }, \"costingType\" : \"ALREADY_CHARGED\", \"title\" : \"Your reservation\", \"key\" : \"MCI_P100_PAYMENT_RENTAL_FEE\", \"listPrice\" : { \"currency\" : \"USD\", \"value\" : 330.82 } } ], \"title\" : \"Rental fees\" } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
