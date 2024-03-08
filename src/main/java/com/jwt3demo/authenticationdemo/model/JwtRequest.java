package com.jwt3demo.authenticationdemo.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class JwtRequest {

    private String email;
    private String password;
}
