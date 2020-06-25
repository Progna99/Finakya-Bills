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

public class RecyclerEwallet extends RecyclerView.Adapter<RecyclerEwallet.MyViewHolder3>{
    Context mctx3;
    RealmResults<Ewallet> mdata3;

    public RecyclerEwallet(Context mctx3, RealmResults<Ewallet> mdata3) {
        this.mctx3 = mctx3;
        this.mdata3 = mdata3;
    }

    @NonNull
    @Override
    public MyViewHolder3 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view2;
        view2= LayoutInflater.from(mctx3).inflate(R.layout.itemewallet,parent,false);
        MyViewHolder3 vHolder3=new MyViewHolder3(view2);
        return vHolder3;

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder3 holder, int position) {
        Ewallet obj4=mdata3.get(position);
        holder.digit.setText(mdata3.get(position).getDigits());
        holder.image3.setImageResource(mdata3.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return mdata3.size();
    }

    public static class MyViewHolder3 extends RecyclerView.ViewHolder{
        private TextView digit;
        private ImageView image3;
        public MyViewHolder3(@NonNull View itemView) {
            super(itemView);
            digit=(TextView)itemView.findViewById(R.id.textView3);
            image3=(ImageView)itemView.findViewById(R.id.imageView10);
        }
    }
}

