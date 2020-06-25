package com.example.finakyabills;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import io.realm.Realm;
import io.realm.RealmResults;

public class Fragmentcredit extends Fragment {
    View v;
    private RecyclerView myrecyclerview;
    private List<Credit> type;
    RealmResults<Credit> test2;
    Context context;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        this.context = context;
    }

    public Fragmentcredit() {

    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.creditfragment, container, false);
        LinearLayoutManager layoutManager = new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false);

        myrecyclerview = (RecyclerView) v.findViewById(R.id.recycler1);


        Realm realm1 = Realm.getDefaultInstance();

        try {
            test2 = realm1.where(Credit.class).findAll();


        } catch (Exception e) {

        }
        if (test2.size() < 1) {

            realm1.beginTransaction();
            try {
                Credit credit = realm1.createObject(Credit.class, System.currentTimeMillis() / 1000);
                credit.setImage(R.drawable.citi);
                Credit credit1 = realm1.createObject(Credit.class, System.currentTimeMillis() / 1000);
                credit1.setImage(R.drawable.axis);
                realm1.commitTransaction();
            } catch (Exception e) {
                realm1.cancelTransaction();
            }
        }
        RealmResults<Credit> list_test = realm1.where(Credit.class).findAll();

        //LinearLayoutManager layoutManager=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        // myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setLayoutManager(layoutManager);
        RecyclerCredit adapter = new RecyclerCredit(getContext(), list_test);

        myrecyclerview.setAdapter(adapter);
        return v;
    }

   /* @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        type=new ArrayList<>();
        type.add(new Credit(R.drawable.hdfc));
        type.add(new Credit(R.drawable.citi));
        type.add(new Credit(R.drawable.hdfc));
        type.add(new Credit(R.drawable.sbi));
    }

    */

}
