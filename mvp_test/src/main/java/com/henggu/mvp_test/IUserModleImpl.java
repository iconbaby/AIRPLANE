package com.henggu.mvp_test;

import android.view.View;

/**
 * Created by skll on 2017/2/15.
 */

public class IUserModleImpl implements IUserModle {

    public IUserModleImpl() {

    }

    @Override
    public void login(final User user, final OnSuccessLoginListener listenner) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                if (user.getUserName().equals("123") && user.getUserPwd().equals("123")) {
                    listenner.loginSuccess();
                } else {
                    listenner.loginError();

                }

            }
        }).start();
    }
}
