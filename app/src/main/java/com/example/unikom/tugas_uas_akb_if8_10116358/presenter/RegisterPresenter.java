package com.example.unikom.tugas_uas_akb_if8_10116358.presenter;

/*
 * 12 Agustus 2019
 * 10116358
 * Dzulfikar Miandro Akbar
 * IF-8
 */

public interface RegisterPresenter {
    void onHandleRegister(String email, String password, String name, String password2);
    void onSuccess();
    void onErrorRegister(String message);
}
