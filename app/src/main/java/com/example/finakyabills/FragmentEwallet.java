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

public class FragmentEwallet extends Fragment {
    View v;
    private RecyclerView myrecycler3;
    private List<Ewallet> wallet;



    public FragmentEwallet() {
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v=inflater.inflate(R.layout.ewalletfragment,container,false);
        myrecycler3=(RecyclerView) v.findViewById(R.id.recycler3);
        RecyclerEwallet adapter3=new RecyclerEwallet(getContext(),wallet);
        myrecycler3.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecycler3.setAdapter(adapter3);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        wallet=new ArrayList<>();
        wallet.add(new Ewallet(R.drawable.paytm,"7561"));
        wallet.add(new Ewallet(R.drawable.zeta,"8932"));
    }
}
