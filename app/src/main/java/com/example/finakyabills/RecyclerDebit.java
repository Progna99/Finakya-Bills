package com.example.finakyabills;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import io.realm.RealmResults;

public class RecyclerDebit extends RecyclerView.Adapter<RecyclerDebit.MyViewHolder2> {
    Context mctx2;
    RealmResults<Debit> mData2;

    public RecyclerDebit(Context mctx2, RealmResults<Debit> mData2) {
        this.mctx2 = mctx2;
        this.mData2 = mData2;
    }

    @NonNull
    @Override
    public MyViewHolder2 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view2;
        view2= LayoutInflater.from(mctx2).inflate(R.layout.itemdebit,parent,false);
        MyViewHolder2 vHolder2=new MyViewHolder2(view2);
        return vHolder2;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder2 holder, int position) {
        Debit obj=mData2.get(position);
        holder.imagedebit.setImageDrawable(mctx2.getResources().getDrawable(obj.getImage2()));
       // holder.imagedebit.setImageResource(mData2.get(position).getImage2());

    }

    @Override
    public int getItemCount() {
        return mData2.size();
    }

    public static class MyViewHolder2 extends RecyclerView.ViewHolder{

        private ImageView imagedebit;

        public MyViewHolder2(@NonNull View itemView) {
            super(itemView);
            imagedebit=(ImageView) itemView.findViewById(R.id.imagedebit);
        }
    }
}
