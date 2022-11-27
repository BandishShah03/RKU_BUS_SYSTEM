package com.example.praticeapp.ToRoute;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ToTabViewAdapter extends FragmentPagerAdapter {
    public ToTabViewAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position==0){
            return new TStudentFragment();
        }
        else
        {
            return new TStaffFragment();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position==0){
            return  "STUDENTS BUSES";
        }
        else
        {
            return "STAFF BUSES";
        }
    }
}
