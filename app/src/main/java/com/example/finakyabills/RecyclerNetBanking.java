package com.example.finakyabills;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import io.realm.RealmResults;

public class RecyclerNetBanking extends RecyclerView.Adapter<RecyclerNetBanking.MyViewHolder4> {
    Context mctx4;
    RealmResults<Netbanking> mdata4;

    public RecyclerNetBanking(Context mctx4, RealmResults<Netbanking> mdata4) {
        this.mctx4 = mctx4;
        this.mdata4 = mdata4;
    }

    @NonNull
    @Override
    public MyViewHolder4 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        view= LayoutInflater.from(mctx4).inflate(R.layout.itemnetbanking,parent,false);
        MyViewHolder4 vholder4=new MyViewHolder4(view);
        return vholder4;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder4 holder, int position) {

        holder.digit.setText(mdata4.get(position).getDigit());
        holder.image.setImageResource(mdata4.get(position).getBankimage());

    }

    @Override
    public int getItemCount() {
        return mdata4.size();
    }

    public static class MyViewHolder4 extends RecyclerView.ViewHolder {

        private TextView digit;
        private ImageView image;

        public MyViewHolder4(@NonNull View itemView) {
            super(itemView);
            image=(ImageView)itemView.findViewById(R.id.imageView6);
            digit=(TextView)itemView.findViewById(R.id.textView15);
        }
    }





}
