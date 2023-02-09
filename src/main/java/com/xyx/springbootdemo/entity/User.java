package com.xyx.springbootdemo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Data
public class User {
    private Integer id;
    private String username;
    @JsonIgnore//不展示密码
    private String password;
    private String nickname;
    private String email;
    private String phone;
    private String address;

}
