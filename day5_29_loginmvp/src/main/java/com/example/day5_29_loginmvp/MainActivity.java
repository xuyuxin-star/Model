package com.example.day5_29_loginmvp;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.day5_29_loginmvp.bean.LoginBean;
import com.example.day5_29_loginmvp.presenter.ImpLoginPresenter;
import com.example.day5_29_loginmvp.presenter.LoginPresenter;
import com.example.day5_29_loginmvp.view.LoginView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, LoginView {

    private EditText et_name;
    private EditText et_pwd;
    private Button btn_login;
    private LoginPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        presenter = new ImpLoginPresenter(this);
    }

    private void initView() {
        et_name = (EditText) findViewById(R.id.et_name);
        et_pwd = (EditText) findViewById(R.id.et_pwd);
        btn_login = (Button) findViewById(R.id.btn_login);
        btn_login.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_login:
                login();
                break;
        }
    }
    private void login() {
        // validate
        String name = et_name.getText().toString().trim();
        String pwd = et_pwd.getText().toString().trim();
        presenter.login(name,pwd);
    }

    @Override
    public void onSuccess(LoginBean loginBean) {

            Toast.makeText(this, "登录成功", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onFail(String error) {
        Toast.makeText(this, error, Toast.LENGTH_SHORT).show();
    }
}
