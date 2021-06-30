package com.example.instazoo.payload.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class JWTTockenSuccessResponse {
    private boolean success;
    private String token;
}
