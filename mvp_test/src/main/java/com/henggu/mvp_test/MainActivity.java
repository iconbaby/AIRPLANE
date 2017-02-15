package com.henggu.mvp_test;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, BaseView {

    private EditText userName;
    private EditText userPwd;
    private Button btn_login;
    private Button btn_clear;
    private ProgressBar pbar;
    private ViewPresenter presenter;
    private Handler handler = new Handler();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

        presenter = new ViewPresenter(new IUserModleImpl(), this);

    }


    public void initView() {

        userName = (EditText) findViewById(R.id.user_name);
        userPwd = (EditText) findViewById(R.id.user_pwd);

        pbar = (ProgressBar) findViewById(R.id.pbar);
        btn_login = (Button) findViewById(R.id.login);
        btn_clear = (Button) findViewById(R.id.clear);

        btn_login.setOnClickListener(this);
        btn_clear.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.login:
                String userName = this.userName.getText().toString();
                String userPwd = this.userPwd.getText().toString();
                if (userName != null && userPwd != null) {
                    User user = new User(userName, userPwd);

                    presenter.login(user);
                    loginStart();

                }
                break;
            case R.id.clear:
                break;
        }
    }

    @Override
    public void getName() {

    }

    @Override
    public void getPwd() {

    }

    @Override
    public void clear() {

    }

    @Override
    public void loginSuccess() {
        handler.post(new Runnable() {
            @Override
            public void run() {
                loginStop();
            }
        });
    }

    @Override
    public void loginStart() {
        pbar.setVisibility(View.VISIBLE);

    }

    @Override
    public void loginError() {

    }

    @Override
    public void loginStop() {
        pbar.setVisibility(View.GONE);
    }
}
