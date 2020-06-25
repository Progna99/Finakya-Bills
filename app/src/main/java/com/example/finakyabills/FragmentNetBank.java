package com.example.finakyabills;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import io.realm.Realm;
import io.realm.RealmResults;

public class FragmentNetBank extends Fragment {
    View v;
    RecyclerView myrecycler4;
    List<Netbanking> typenet;
    RealmResults<Netbanking> test3;



    public FragmentNetBank() {
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v=inflater.inflate(R.layout.netbankingfragment,container,false);
        myrecycler4=(RecyclerView)v.findViewById(R.id.recycler4);

        Realm realm3= Realm.getDefaultInstance();

        try {
            test3=realm3.where(Netbanking.class).findAll();
        }
        catch (Exception e){

        }
        if (test3.size()<1){
            realm3.beginTransaction();
            try {
                Netbanking net=realm3.createObject(Netbanking.class);
                net.setBankimage(R.drawable.citi);
                net.setDigit("3152");
                realm3.commitTransaction();
            }
            catch (Exception e){
                realm3.cancelTransaction();
            }
        }
        RealmResults<Netbanking> list_test3=realm3.where(Netbanking.class).findAll();


        RecyclerNetBanking adapter4=new RecyclerNetBanking(getContext(),list_test3);
        myrecycler4.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecycler4.setAdapter(adapter4);
        return v;
    }

    /*@Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        net=new ArrayList<>();
        net.add(new Netbanking(R.drawable.hdfc,"7561"));
        net.add(new Netbanking(R.drawable.citi,"6521"));

    }*/
}

