package com.example.unikom.tugas_uas_akb_if8_10116358.helper;

import android.app.Application;

import io.realm.Realm;
import io.realm.RealmConfiguration;

public class RealmDB extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);
        RealmConfiguration configuration = new RealmConfiguration.Builder()
                .name(Realm.DEFAULT_REALM_NAME)
                .schemaVersion(0)
                .deleteRealmIfMigrationNeeded()
                .build();
        Realm.setDefaultConfiguration(configuration);
    }

}