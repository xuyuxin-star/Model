package com.example.day5_29_loginmvp.model;

import com.example.day5_29_loginmvp.api.ApiService;
import com.example.day5_29_loginmvp.bean.LoginBean;
import com.example.day5_29_loginmvp.callback.LoginCallBack;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class ImpLoginModel implements LoginModel {
    @Override
    public void login(final LoginCallBack loginCallBack, String userName, String pwd) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ApiService.baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        ApiService apiService = retrofit.create(ApiService.class);
        final Observable<LoginBean> login = apiService.login(userName, pwd);
        login.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<LoginBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(LoginBean loginBean) {
                        int errorCode = loginBean.getErrorCode();
                        if (errorCode==0){
                            loginCallBack.onSuccess(loginBean);
                        }else{
                            loginCallBack.onFail(loginBean.getErrorMsg());
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        loginCallBack.onFail("登录失败"+e.getMessage());
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
