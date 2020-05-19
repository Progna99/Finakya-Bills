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

public class FragmentNetBank extends Fragment {
    View v;
    RecyclerView myrecycler4;
    List<Netbanking> net;



    public FragmentNetBank() {
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v=inflater.inflate(R.layout.netbankingfragment,container,false);
        myrecycler4=(RecyclerView)v.findViewById(R.id.recycler4);
        RecyclerNetBanking adapter4=new RecyclerNetBanking(getContext(),net);
        myrecycler4.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecycler4.setAdapter(adapter4);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        net=new ArrayList<>();
        net.add(new Netbanking(R.drawable.hdfc,"7561"));
        net.add(new Netbanking(R.drawable.citi,"6521"));

    }
}

