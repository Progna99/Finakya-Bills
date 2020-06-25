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

public class FragmentUpi extends Fragment {
    private RecyclerView myrecyclerupi;
    private List<Upi> type5;
    RealmResults<Upi> test5;
    View v;
    public FragmentUpi(){

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v=inflater.inflate(R.layout.upifragment,container,false);
        myrecyclerupi=(RecyclerView)v.findViewById(R.id.recycler5);

        Realm realm5= Realm.getDefaultInstance();
        try {
            test5=realm5.where(Upi.class).findAll();
        }
        catch (Exception e){

        }
        if (test5.size()<1){
            realm5.beginTransaction();
            try {
                Upi upi=realm5.createObject(Upi.class);
                upi.setName("Ankita Chatterjee");
                upi.setPhone("876541290");
                upi.setId("ankita@okicici");
                upi.setBank("HDFC Bank");
                upi.setAccount("Default Account");
                realm5.commitTransaction();


            }
            catch (Exception e){
                realm5.cancelTransaction();
            }
        }

        RealmResults<Upi> list_test5=realm5.where(Upi.class).findAll();

        RecyclerUpi adapter5=new RecyclerUpi(getContext(),list_test5);
        myrecyclerupi.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerupi.setAdapter(adapter5);
        return v;
    }

    //@Override
   /* public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        upis=new ArrayList<>();
        upis.add(new Upi("progna","9755467382","progna@okicici","Upi bank","Icici bank","default bank",R.drawable.citi,R.drawable.hdfc));

    }*/
}

