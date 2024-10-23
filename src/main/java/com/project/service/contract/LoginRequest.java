package com.project.service.contract;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
public class LoginRequest {
    private String email;
    private String password;
}
