package com.example.praticeapp.FromRoute;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.praticeapp.ToRoute.TStaffFragment;
import com.example.praticeapp.ToRoute.TStudentFragment;

public class FromTabViewAdapter extends FragmentPagerAdapter {

    public FromTabViewAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position==0){
            return new FStudentFragment();
        }
        else
        {
            return new FStaffFragment();
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
