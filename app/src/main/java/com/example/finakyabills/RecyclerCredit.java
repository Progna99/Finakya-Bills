package com.example.finakyabills;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerCredit extends RecyclerView.Adapter<RecyclerCredit.MyViewHolder> {
    Context mctx;
    List<Credit> mdata;

    public RecyclerCredit(Context mctx, List<Credit> mdata) {
        this.mctx = mctx;
        this.mdata = mdata;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        v= LayoutInflater.from(mctx).inflate(R.layout.itemcredit,parent,false);
        MyViewHolder vHolder= new MyViewHolder(v);
        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.img.setImageResource(mdata.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return mdata.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        private ImageView img;
        public MyViewHolder(View itemView){
            super(itemView);
            img=(ImageView) itemView.findViewById(R.id.imageView4);

        }
    }






}

