package com.example.unikom.tugas_uas_akb_if8_10116358.presenter;

/*
 * 12 Agustus 2019
 * 10116358
 * Dzulfikar Miandro Akbar
 * IF-8
 */

import com.example.unikom.tugas_uas_akb_if8_10116358.model.RegisterUser;
import com.example.unikom.tugas_uas_akb_if8_10116358.view.RegisterView;

public class Register implements RegisterPresenter{
    RegisterView view;
    RegisterUser model;

    public Register(RegisterView view) {
        this.view = view;
        this.model = new RegisterUser(this);
    }

    @Override
    public void onHandleRegister(String email, String password, String name, String password2) {
        model.validateRegister(email,password, name, password2);
    }

    @Override
    public void onSuccess() {
        view.onSuccess();
    }

    @Override
    public void onErrorRegister(String message) {
        view.onErrorRegister(message);
    }
}
