package com.example.finakyabills;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.greenrobot.eventbus.EventBus;

import java.util.List;

import io.realm.RealmResults;

public class RecyclerCredit extends RecyclerView.Adapter<RecyclerCredit.MyViewHolder> {
    Context mctx;
    RealmResults<Credit> mdata;

    public RecyclerCredit(Context mctx, RealmResults<Credit> mdata) {
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
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        Credit obj = mdata.get(position);
        holder.img.setImageDrawable(mctx.getResources().getDrawable(obj.getImage()));
        holder.img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EventBus.getDefault().post(new EventBusPojo(position));


            }
        });


    }

    @Override
    public int getItemCount() {
        return mdata.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        private ImageView img;
        public MyViewHolder(View itemView){
            super(itemView);
            img=(ImageView) itemView.findViewById(R.id.credit_image);

        }
    }






}

