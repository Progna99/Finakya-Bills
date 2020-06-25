package com.example.finakyabills;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class PaynowActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private PageAdaptercredit adapter;
    TextView amt ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.paynow);
        tabLayout=(TabLayout) findViewById(R.id.tabview);
        viewPager=(ViewPager)findViewById(R.id.pager);
        adapter=new PageAdaptercredit(getSupportFragmentManager());
        adapter.AddFragment(new Fragmentcredit(),"Credit Card");
        adapter.AddFragment(new FragmentDebit(),"Debit Card");
        adapter.AddFragment(new FragmentEwallet(),"E Wallet");
        adapter.AddFragment(new FragmentNetBank(),"Net banking");
        adapter.AddFragment(new FragmentUpi(),"UPI");

        amt= (TextView)findViewById(R.id.textView12);
        Intent i = getIntent();
        String s=i.getStringExtra("amount");
        amt.setText(s);

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

    }























}