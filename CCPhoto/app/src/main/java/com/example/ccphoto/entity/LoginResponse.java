package com.example.ccphoto.entity;

public class LoginResponse {


    /**
     * msg : success
     * code : 0
     * expire : 3600
     * token : eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9.eyJzdWIiOiI2IiwiaWF0IjoxNjAzMTgxODc2LCJleHAiOjE2MDMxODU0NzZ9.mMWS8PMZedPCU1jLzlXEgIi7ExQR_hH3X4gtbP9fNZo3DiQVDh4O93B4ChLgDq8OHwWljE7fmCMnYSTOORLJpg
     */

    private String msg;
    private int code;
    private int expire;
    private String token;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getExpire() {
        return expire;
    }

    public void setExpire(int expire) {
        this.expire = expire;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
