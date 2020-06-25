package com.example.finakyabills;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.RealmResults;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<billsproduct> bill;
    RealmResults<billsamt> test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);
        recyclerView = findViewById(R.id.recyclerView);
       // recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));




        Realm realm = Realm.getDefaultInstance();

        try {
            test = realm.where(billsamt.class).findAll();

        } catch (Exception e) {

        }
        if (test.size()<1) {

            realm.beginTransaction();
            try {
                billsamt amt = realm.createObject(billsamt.class, System.currentTimeMillis() / 1000);
                amt.setType("Mobile");
                amt.setAmt("2000");
                amt.setImage(R.drawable.mobileicon);
                billsamt amt1 = realm.createObject(billsamt.class, System.currentTimeMillis() / 1000);
                amt1.setType("Wifi");
                amt1.setAmt("750");
                amt1.setImage(R.drawable.wifi);
                realm.commitTransaction();
            } catch (Exception e) {
                realm.cancelTransaction();
            }
        }

        Realm realm1 = Realm.getDefaultInstance();
            try  {
                RealmResults<billsamt> billsamtRealmResults = realm1.where(billsamt.class).findAll();
                billadapter bd = new billadapter(billsamtRealmResults, this);
                recyclerView.setAdapter(bd);
            }
            catch (Exception e){}

            //bill=new ArrayList<>();

            //bill.add(new billsproduct("Mobile","1000",R.drawable.mobileicon));
            //bill.add(new billsproduct("Electricity","1000",R.drawable.electricity));
            //bill.add(new billsproduct("Wifi","1000",R.drawable.wifi));
            //bill.add(new billsproduct("Phone","1000",R.drawable.phone));
            //bill.add(new billsproduct("TV","1000",R.drawable.television));


    }


}

