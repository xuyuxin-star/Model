package com.example.day5_29_loginmvp.view;

import com.example.day5_29_loginmvp.bean.LoginBean;

public interface LoginView {
    void onSuccess(LoginBean loginBean);
    void onFail(String error);
}
