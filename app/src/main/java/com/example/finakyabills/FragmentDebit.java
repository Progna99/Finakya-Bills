package com.example.finakyabills;

import android.content.Context;
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

public class FragmentDebit extends Fragment {
    View v;
    private RecyclerView myrecyclerdebit;
    private List<Debit> type2;
    RealmResults<Debit> test3;
    Context contextd;

    public void onAttach(Context contextd){
        super.onAttach(contextd);
        this.contextd=contextd;
    }


    public FragmentDebit() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v=inflater.inflate(R.layout.debitfragment,container,false);
        LinearLayoutManager layoutManager=new LinearLayoutManager(contextd,LinearLayoutManager.HORIZONTAL,false);
        myrecyclerdebit=(RecyclerView) v.findViewById(R.id.recycler2);
        Realm realm2=Realm.getDefaultInstance();
        try {
            test3=realm2.where(Debit.class).findAll();
        }
        catch (Exception e){

        }
        if (test3.size()<1){
            realm2.beginTransaction();
            try {
                Debit debit=realm2.createObject(Debit.class);
                debit.setImage2(R.drawable.citi);
                Debit debit2=realm2.createObject(Debit.class);
                debit2.setImage2(R.drawable.axis);
                realm2.commitTransaction();

            }
            catch (Exception e){
                realm2.cancelTransaction();
            }

        }
        RealmResults<Debit> list_test = realm2.where(Debit.class).findAll();


        myrecyclerdebit.setLayoutManager(layoutManager);
        RecyclerDebit adapter1=new RecyclerDebit(getContext(),list_test);
       // myrecyclerdebit.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerdebit.setAdapter(adapter1);
        return v;

    }

   /* @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        debit1=new ArrayList<>();
        debit1.add(new Debit(R.drawable.hdfc));
        debit1.add(new Debit(R.drawable.citi));
    }

    */



}
