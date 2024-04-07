package com.jh1nz.backend.model;

import lombok.Data;

@Data
public class RegisterRequest {

    private String username;
    private String password;
    private String email;
}
