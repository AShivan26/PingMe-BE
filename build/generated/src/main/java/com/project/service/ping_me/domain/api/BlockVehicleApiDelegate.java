package com.project.service.ping_me.domain.api;

import com.project.service.ping_me.domain.contract.BlockVehicleRequest;
import com.project.service.ping_me.domain.contract.HttpError;
import com.project.service.ping_me.domain.contract.VehicleBlockDateTime;
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
 * A delegate to be called by the {@link BlockVehicleApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public interface BlockVehicleApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * PUT /{rentalActivityId}/vehicle/block : Blocks the given vehicle to the given reservation, adding an upsell charge if necessary.
     * # Block vehicle to rental activity  ## Example:  &#x60;&#x60;&#x60; PUT /v1/digital-checkout/115646542/vehicle/block -H \&quot;Authorization: Bearer TOKEN\&quot; { \&quot;vehicleId\&quot;: \&quot;1234\&quot;, \&quot;configurationId\&quot;: \&quot;5678-2342-2342-234234\&quot; } &#x60;&#x60;&#x60;
     *
     * @param rentalActivityId Rental Activity Id (required)
     * @param blockVehicleRequest  (required)
     * @return datetime inside response present in case сustomer blocked vehicle via app, also if customer blocked same vehicle again (but just with less time). In case of blocking prebooked/guaranteed model - datetime and timezone are null (status code 200)
     *         or HTTP errors may have one of the following error codes: - &#x60;INVALID_VEHICLE&#x60; - The vehicle id was missing or invalid. - &#x60;INVALID_PERSON&#x60; - PersonID is missing from token. - &#x60;INVALID_TIME_FOR_BLOCK_VEHICLE_REQUEST&#x60; - Vehicle cannot be blocked during this time period (status code 400)
     *         or HTTP errors may have one of the following error codes: - &#x60;VEHICLE_NOT_AVAILABLE&#x60; - Vehicle you selected is no longer available, please select new vehicle. - &#x60;CONFIGURATION_NOT_FOUND&#x60; - If the configuration is non-existent or has expired. - &#x60;RESERVATION_NOT_FOUND&#x60; - The reservation was not found. (status code 404)
     *         or HTTP errors may have one of the following error codes: - &#x60;INITIATED_AT_COUNTER&#x60; - The reservation already initiated at counter. (status code 409)
     *         or in case of unstisfyable request - &#x60;BOOKING_NOT_ELIGIBLE&#x60; - in case of non zen or next not eligible bookings (status code 416)
     *         or HTTP errors may have one of the following error codes: - &#x60;INTERNAL_ERROR&#x60; - If there is some error talking to a dependency (status code 500)
     *         or HTTP errors may have one of the following error codes: - &#x60;VEHICLE_ALREADY_BLOCKED&#x60; - The vehicle was already blocked to another reservation. - &#x60;RESERVATION_NOT_IN_TIMERANGE&#x60; - The reservation is not within the timerange for using block endpoint. - &#x60;VEHICLE_SELECTION_NOT_ALLOWED&#x60; - The reservation or branch does not support vehicle selection. (status code 501)
     *         or HTTP errors are represented in the following format (status code 200)
     * @see BlockVehicleApi#blockVehicle
     */
    default ResponseEntity<VehicleBlockDateTime> blockVehicle(String rentalActivityId,
        BlockVehicleRequest blockVehicleRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"date\" : \"2006-01-02T15:04:05+07:00\", \"internalIds\" : { \"reservationId\" : \"reservationId\" }, \"timeZone\" : \"timeZone\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
