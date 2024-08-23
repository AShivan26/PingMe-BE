package com.project.service.ping_me.domain.api;

import com.project.service.ping_me.domain.contract.HttpError;
import com.project.service.ping_me.domain.contract.UpdateCorporateDetailsRequest;
import com.project.service.ping_me.domain.contract.UpdateCorporateDetailsResponse;


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
public class CorporateDetailsApiController implements CorporateDetailsApi {

    private final CorporateDetailsApiDelegate delegate;

    public CorporateDetailsApiController(@Autowired(required = false) CorporateDetailsApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new CorporateDetailsApiDelegate() {});
    }

    @Override
    public CorporateDetailsApiDelegate getDelegate() {
        return delegate;
    }

}
