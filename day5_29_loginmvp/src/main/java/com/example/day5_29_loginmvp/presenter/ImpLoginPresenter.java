package com.example.day5_29_loginmvp.presenter;

import android.text.TextUtils;
import android.widget.Toast;

import com.example.day5_29_loginmvp.bean.LoginBean;
import com.example.day5_29_loginmvp.callback.LoginCallBack;
import com.example.day5_29_loginmvp.model.ImpLoginModel;
import com.example.day5_29_loginmvp.view.LoginView;

public class ImpLoginPresenter implements LoginPresenter, LoginCallBack {
    private LoginView loginView;
    private ImpLoginModel loginModel;
    public ImpLoginPresenter(LoginView loginView) {
        this.loginView = loginView;
        loginModel=new ImpLoginModel();
    }

    @Override
    public void onSuccess(LoginBean loginBean) {
        loginView.onSuccess(loginBean);
    }

    @Override
    public void onFail(String error) {
        loginView.onFail(error);
    }

    @Override
    public void login(String userName, String pwd) {
        if (TextUtils.isEmpty(userName)) {
            loginView.onFail("请输入账号");
            return;
        }else if (TextUtils.isEmpty(pwd)) {
            loginView.onFail("请输入密码");
            return;
        }

        loginModel.login(this,userName,pwd);
    }
}
