package com.example.finakyabills;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class cardadapter extends RecyclerView.Adapter<cardadapter.ProductViewHolder> {
    Context mctx;
    private List<cardimage> cardlist;


    public cardadapter(Context mctx, List<cardimage> cardlist) {
        this.mctx = mctx;
        this.cardlist = cardlist;
    }

    @NonNull
    @Override
    public cardadapter.ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater2 = LayoutInflater.from(mctx);
        View view2 = inflater2.inflate(R.layout.cardimg, null);
        return new cardadapter.ProductViewHolder(view2);
    }

    @Override
    public void onBindViewHolder(@NonNull cardadapter.ProductViewHolder holder, int position) {
        cardimage cp = cardlist.get(position);
        holder.image.setImageDrawable(mctx.getResources().getDrawable(cp.getImage()));


    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ProductViewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        public ProductViewHolder(View view2) {
            super(view2);
            image=view2.findViewById(R.id.imageView2);
        }
    }
}
