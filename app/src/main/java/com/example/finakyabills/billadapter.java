package com.example.finakyabills;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import io.realm.RealmResults;

public class billadapter extends RecyclerView.Adapter<billadapter.ProductViewHolder> {
    private RealmResults<billsamt> bill;
    private Context mctx;
    private int count;
    //private List<billsproduct> bill;



    public billadapter(RealmResults<billsamt> bills, Context context) {
        mctx=context;
        bill=bills;
        count=0;
    }


    @NonNull
    @Override
    public billadapter.ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


            LayoutInflater inflater = LayoutInflater.from(mctx);
            View view1 = inflater.inflate(R.layout.bills, null);


        return new billadapter.ProductViewHolder(view1);
    }

    @Override
    public void onBindViewHolder(@NonNull billadapter.ProductViewHolder holder, int position) {
        //billsproduct bp=bill.get(position);
        billsamt bp= bill.get(position);
        holder.txt1.setText(bp.getType());
        holder.txt2.setText(bp.getAmt());
        holder.image1.setImageDrawable(mctx.getResources().getDrawable(bp.getImage()));


    }

    @Override
    public int getItemCount() {
        return bill.size();
    }

    public class ProductViewHolder extends RecyclerView.ViewHolder {
        ImageView image1,image2,image3,image4,image5;
        TextView txt1,txt2,txt3,txt4,txt5,txt6,txt7,txt8,txt9,txt10;
        Button btn;
        public ProductViewHolder(@NonNull final View itemView) {
            super(itemView);
            txt1=itemView.findViewById(R.id.textView);
            txt2=itemView.findViewById(R.id.textView2);

            image1 = itemView.findViewById(R.id.imageView);
            btn = itemView.findViewById(R.id.button);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(mctx, PaynowActivity.class);
                    TextView tx = (TextView) itemView.findViewById(R.id.textView2);
                    String s = tx.getText().toString();
                    i.putExtra("amount", s);
                    mctx.startActivity(i);
                }
            });







        }



    }
}
