package com.project.service.contract;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class RegisterRequestObject {
  private String email;
  private String username;
  private String profile;
  private String password;
}