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

public class RecyclerUpi extends RecyclerView.Adapter<RecyclerUpi.MyViewHolder5> {
    Context mctx5;
    RealmResults<Upi> mdata5;

    public RecyclerUpi(Context mctx5, RealmResults<Upi> mdata5) {
        this.mctx5 = mctx5;
        this.mdata5 = mdata5;
    }

    @NonNull
    @Override
    public MyViewHolder5 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        view= LayoutInflater.from(mctx5).inflate(R.layout.itemupi,parent,false);
        MyViewHolder5 vholder=new MyViewHolder5(view);
        return vholder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder5 holder, int position) {

        holder.name.setText(mdata5.get(position).getName());
        holder.phone.setText(mdata5.get(position).getPhone());
        holder.id.setText(mdata5.get(position).getId());
        holder.account.setText(mdata5.get(position).getAccount());
        holder.bank.setText(mdata5.get(position).getBank());
        holder.upi.setText(mdata5.get(position).getUpi());
        holder.imageaccount.setImageResource(mdata5.get(position).getImage5());
        holder.imageupi.setImageResource(mdata5.get(position).getImage6());



    }

    @Override
    public int getItemCount() {
        return mdata5.size();
    }

    public static class MyViewHolder5 extends RecyclerView.ViewHolder{
        private TextView name;
        private TextView phone;
        private TextView id;
        private TextView account;
        private TextView bank;
        private TextView upi;
        private ImageView imageaccount;
        private ImageView imageupi;
        public MyViewHolder5(@NonNull View itemView) {
            super(itemView);
            name=(TextView)itemView.findViewById(R.id.textView7);
            phone=(TextView)itemView.findViewById(R.id.textView8);
            id=(TextView)itemView.findViewById(R.id.textView9);
            upi=(TextView)itemView.findViewById(R.id.textView10);
            account=(TextView)itemView.findViewById(R.id.textView20);
            bank=(TextView)itemView.findViewById(R.id.textView21);
            imageaccount=(ImageView)itemView.findViewById(R.id.imageView12);
            imageupi=(ImageView)itemView.findViewById(R.id.imageView13);




        }
    }






}

