package com.example.unikom.tugas_uas_akb_if8_10116358.presenter;

/*
 * 10 Agustus 2019
 * 10116358
 * Dzulfikar Miandro Akbar
 * IF-8
 */

public interface LoginPresenter {
    void onLogin(String email, String password, String dataUser, String dataPass);
    void onSuccess();
    void onError(String message);
}
