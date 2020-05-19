package com.example.finakyabills;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class PageAdaptercredit extends FragmentPagerAdapter {

    private final List<Fragment> fragment1= new ArrayList<>();
    private final List<String> titles=new ArrayList<>();

    public PageAdaptercredit(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragment1.get(position);
    }

    @Override
    public int getCount() {
        return titles.size();
    }
    public CharSequence getPageTitle(int position){
        return titles.get(position);
    }
    public void AddFragment(Fragment fragment,String title){
        fragment1.add(fragment);
        titles.add(title);
    }
}
