package com.example.day5_29_loginmvp.model;

import com.example.day5_29_loginmvp.callback.LoginCallBack;

public interface LoginModel {
    void login(LoginCallBack loginCallBack,String userName,String pwd);
}
