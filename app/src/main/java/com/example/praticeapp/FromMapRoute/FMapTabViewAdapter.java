package com.example.praticeapp.FromMapRoute;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class FMapTabViewAdapter extends FragmentPagerAdapter {
    public FMapTabViewAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position==0){
            return new FLStudentFragment();
        }
        else
        {
            return new FLStaffFragment();
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
