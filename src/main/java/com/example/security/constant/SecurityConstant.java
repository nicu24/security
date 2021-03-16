package com.example.security.constant;

import org.springframework.format.number.PercentStyleFormatter;

public class SecurityConstant {
    public static final long EXPIRATION_TIME = 423_000_000;
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String JWT_TOKEN_HEADER = "Jwt-Token";
    public static final String TOKEN_CANNOT_BE_VERIFIED="TOKEN CAN NOT BE VERIFIED";
    public static final String GET_ARRAYS_LLC = "gET aRRAYS, LLC";
    public static final String GET_ARRAYS_ADMINISTRATION = "User Management Portal";
    public static final String AUTHORITIES = "authorities";
    public static final String FORBIDDEN_MESSAGE = "yOU NEED TO LOG-IN TO ACCES THIS PAGE";
    public static final String ACCESS_DENIED_MESSAGE = "You dont have permision";
    public static final String OPTION_HTTP_METHOD="OPTIONS";
    public static final String[] PUBLIC_URLS = {"/user/login", "/usr/register", "/user/resetPassword/**", "/user/image/**"};

}
