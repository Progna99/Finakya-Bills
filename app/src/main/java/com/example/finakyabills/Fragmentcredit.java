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

public class Fragmentcredit extends Fragment {
    View v;
    private RecyclerView myrecyclerview;
    private List<Credit> type;

    public Fragmentcredit() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v=inflater.inflate(R.layout.creditfragment,container,false);
        myrecyclerview=(RecyclerView) v.findViewById(R.id.recycler1);
        RecyclerCredit adapter=new RecyclerCredit(getContext(),type);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setAdapter(adapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        type=new ArrayList<>();
        type.add(new Credit(R.drawable.hdfc));
        type.add(new Credit(R.drawable.citi));
        type.add(new Credit(R.drawable.hdfc));
        type.add(new Credit(R.drawable.sbi));
    }
}
