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

public class FragmentEwallet extends Fragment {
    View v;
    private RecyclerView myrecycler3;
    private List<Ewallet> type4;
    RealmResults<Ewallet> test4;



    public FragmentEwallet() {
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v=inflater.inflate(R.layout.ewalletfragment,container,false);
        myrecycler3=(RecyclerView) v.findViewById(R.id.recycler3);

        Realm realm4= Realm.getDefaultInstance();

        try {
            test4=realm4.where(Ewallet.class).findAll();
        }
        catch (Exception e){

        }
        if (test4.size()<1){
            realm4.beginTransaction();
            try {
                Ewallet wallet=realm4.createObject(Ewallet.class);
                wallet.setImage(R.drawable.paytm);
                wallet.setDigits("6791Rs remaining");
                Ewallet wallet2=realm4.createObject(Ewallet.class);
                wallet2.setImage(R.drawable.zeta);
                wallet2.setDigits("4379");
                realm4.commitTransaction();
            }
            catch (Exception e){
                realm4.cancelTransaction();
            }
        }
        RealmResults<Ewallet> list_test4= realm4.where(Ewallet.class).findAll();


        RecyclerEwallet adapter3=new RecyclerEwallet(getContext(),list_test4);
        myrecycler3.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecycler3.setAdapter(adapter3);
        return v;
    }

   /* @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        wallet=new ArrayList<>();
        wallet.add(new Ewallet(R.drawable.paytm,"7561"));
        wallet.add(new Ewallet(R.drawable.zeta,"8932"));
    }*/
}
