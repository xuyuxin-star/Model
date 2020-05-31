package com.example.day5_29_loginmvp.api;

import com.example.day5_29_loginmvp.bean.LoginBean;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiService {
    String baseUrl="https://www.wanandroid.com/";
    @POST("user/login")
    @FormUrlEncoded
    /**
     * key值与规定的一致
     */
    Observable<LoginBean> login(@Field("username") String username,@Field("password") String password);
}
