package com.henggu.mvp_test;

/**
 * Created by skll on 2017/2/15.
 */

public class ViewPresenter {
    private IUserModle model;
    private BaseView view;

    public ViewPresenter(IUserModle model, BaseView view) {
        this.model = model;
        this.view = view;
    }

    public void login(User user) {
        model.login(user, new OnSuccessLoginListener() {
            @Override
            public void loginSuccess() {
                view.loginSuccess();
            }

            @Override
            public void loginError() {
                view.loginError();
            }
        });
    }

}
