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

public class FragmentUpi extends Fragment {
    private RecyclerView myrecyclerupi;
    private List<Upi> upis;
    View v;
    public FragmentUpi(){

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v=inflater.inflate(R.layout.upifragment,container,false);
        myrecyclerupi=(RecyclerView)v.findViewById(R.id.recycler5);
        RecyclerUpi adapter5=new RecyclerUpi(getContext(),upis);
        myrecyclerupi.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerupi.setAdapter(adapter5);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        upis=new ArrayList<>();
        upis.add(new Upi("progna","9755467382","progna@okicici","Upi bank","Icici bank","default bank",R.drawable.citi,R.drawable.hdfc));

    }
}

