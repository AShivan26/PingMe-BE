package com.project.service.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class HttpErrorDomainObject {
    private Object data;

    private String errorCode;

    private String message;

    private Boolean retriable;

    private String title;
}
