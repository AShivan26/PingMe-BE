package com.project.service.contract;

import lombok.*;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApiResponseObject {
    private String message;
    private boolean status;
}


