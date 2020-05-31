package com.example.day5_29_loginmvp.callback;

import com.example.day5_29_loginmvp.bean.LoginBean;

public interface LoginCallBack {
    /**
     * aaaaa
     * @param loginBean
     */
    void onSuccess(LoginBean loginBean);
    void onFail(String error);
}
