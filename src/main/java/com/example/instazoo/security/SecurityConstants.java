package com.example.instazoo.security;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SecurityConstants {

    public static final String SIGN_UP_URLS = "/api/auth/**";
    public static String SECRET;
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String HEADER_STRING = "Authorization";
    public static final String CONTENT_TYPE = "application/json";
    public static final long EXPIRATION_TIME = 600_000;

    @Value("${jwt.secret}")
    public void setSecretStatic(String secret){
        SecurityConstants.SECRET = secret;
    }

}
