package com.henggu.mvp_test;

/**
 * Created by skll on 2017/2/15.
 */

public interface BaseView {
    void getName();

    void getPwd();

    void clear();

    void loginSuccess();

    void loginStart();

    void loginError();

    void loginStop();
}
