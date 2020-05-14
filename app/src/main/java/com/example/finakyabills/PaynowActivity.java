package com.example.finakyabills;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
public class PaynowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.paynow);
        Intent i = new Intent();
        String amt = i.getStringExtra("amount");
        TextView amtv = (TextView) findViewById(R.id.textView12);
        amtv.setText(amt);

    }

    public void opencredit(View view) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.details_container,new creditactivity());
        ft.addToBackStack(null);
        ft.commit();
    }
    public void openUPI(View view) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.details_container,new upiactivity());
        ft.addToBackStack(null);
        ft.commit();
    }

    public void openewallet(View view) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.details_container,new ewalletactivity());
        ft.addToBackStack(null);
        ft.commit();
    }

    public void opendebit(View view) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.details_container,new debitactivity());
        ft.addToBackStack(null);
        ft.commit();
    }

    public void opennetbanking(View view) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.details_container,new netbankingactivity());
        ft.addToBackStack(null);
        ft.commit();
    }

}
