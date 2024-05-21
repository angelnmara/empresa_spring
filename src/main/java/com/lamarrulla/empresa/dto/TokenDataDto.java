package com.lamarrulla.empresa.dto;

import lombok.Data;

@Data
public class TokenDataDto {
    private Long id;
    private Long refresh_token_valid_time;
    private String havana_id;
    private Long expire_time;
    private String locale;
    private String user_nick;
    private String access_token;
    private String refresh_token;
    private String user_id;
    private String account_platform;
    private Long refresh_expires_in;
    private Long expires_in;
    private String sp;
    private String seller_id;
    private String account;
    private String code;
    private String request_id;
}
