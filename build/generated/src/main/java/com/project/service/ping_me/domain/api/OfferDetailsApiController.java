package com.project.service.ping_me.domain.api;

import com.project.service.ping_me.domain.contract.HttpError;
import com.project.service.ping_me.domain.contract.OfferConfiguration;
import com.project.service.ping_me.domain.contract.UpdateOfferConfigurationRequest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
@Controller
@RequestMapping("/api")
public class OfferDetailsApiController implements OfferDetailsApi {

    private final OfferDetailsApiDelegate delegate;

    public OfferDetailsApiController(@Autowired(required = false) OfferDetailsApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new OfferDetailsApiDelegate() {});
    }

    @Override
    public OfferDetailsApiDelegate getDelegate() {
        return delegate;
    }

}
