package com.example.unikom.tugas_uas_akb_if8_10116358;

import com.example.unikom.tugas_uas_akb_if8_10116358.adapter.MahasiswaAdapter;
import com.example.unikom.tugas_uas_akb_if8_10116358.helper.RealmHelper;
import com.example.unikom.tugas_uas_akb_if8_10116358.model.MahasiswaModel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import io.realm.Realm;
import io.realm.RealmConfiguration;

/*
 * 12 Agustus 2019
 * 10116358
 * Dzulfikar Miandro Akbar
 * IF-8
 */

public class MahasiswaActivity extends AppCompatActivity {
    Realm realm;
    RealmHelper realmHelper;
    RecyclerView recyclerView;
    MahasiswaAdapter mahasiswaAdapter;
    List<MahasiswaModel> mahasiswaModels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mahasiswa);

        recyclerView = findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        //setup realm
        RealmConfiguration configuration = new RealmConfiguration.Builder().deleteRealmIfMigrationNeeded().build();
        realm = Realm.getInstance(configuration);

        realmHelper = new RealmHelper(realm);
        mahasiswaModels = new ArrayList<>();

        mahasiswaModels = realmHelper.getAllMahasiswa();

        show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        mahasiswaAdapter.notifyDataSetChanged();
        show();
    }

    public void show(){
        mahasiswaAdapter = new MahasiswaAdapter(this, mahasiswaModels);
        recyclerView.setAdapter(mahasiswaAdapter);
    }
}