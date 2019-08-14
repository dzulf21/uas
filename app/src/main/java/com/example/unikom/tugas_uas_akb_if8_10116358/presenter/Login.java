package com.example.unikom.tugas_uas_akb_if8_10116358.presenter;

/*
 * 10 Agustus 2019
 * 10116358
 * Dzulfikar Miandro Akbar
 * IF-8
 */

import com.example.unikom.tugas_uas_akb_if8_10116358.model.User;
import com.example.unikom.tugas_uas_akb_if8_10116358.view.LoginView;

public class Login implements LoginPresenter {
    private LoginView view;
    private User model;

    public Login(LoginView view){
        this.view=view;
        this.model=new User(this);
    }

    @Override
    public void onLogin(String username, String password, String dataUser, String dataPass) {
        model.validateUser(username,password,dataUser,dataPass);
    }

    @Override
    public void onSuccess() {
        view.onSuccess();
    }

    @Override
    public void onError(String message) {
        view.onError(message);
    }
}
