package com.project.service.adapter.mapper;

import com.project.service.contract.HttpError;
import com.project.service.contract.RegisterResponseObject;
import com.project.service.domain.HttpErrorDomainObject;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class DomainToResponseErrorMapper {
    public RegisterResponseObject PingMeRegisterOrLoginErrorCaseResponseMapper(HttpErrorDomainObject errorDomainObject) {
        RegisterResponseObject registerResponseObject = new RegisterResponseObject();
        HttpError httpError = new HttpError();
        httpError.title(errorDomainObject.getTitle());
        httpError.message(errorDomainObject.getMessage());
        httpError.errorCode(errorDomainObject.getErrorCode());
        httpError.retriable(errorDomainObject.getRetriable());
        registerResponseObject.setError(httpError);
        return registerResponseObject;
    }

    public RegisterResponseObject getUserNameAlreadyTakenErrorResponse() {
        return PingMeRegisterOrLoginErrorCaseResponseMapper(
                new HttpErrorDomainObject(null,
                        "400",
                        "UserName is Already Taken",
                        Boolean.FALSE,
                        HttpStatus.BAD_REQUEST.name()));
    }

    public RegisterResponseObject getUserDoesNotExistErrorResponse() {
        return PingMeRegisterOrLoginErrorCaseResponseMapper(
                new HttpErrorDomainObject(null,
                        "400",
                        "User Doesn't Exist",
                        Boolean.TRUE,
                        HttpStatus.BAD_REQUEST.name()));
    }
}
