package com.example.praticeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.praticeapp.FromMapRoute.FMapTabViewAdapter;
import com.example.praticeapp.FromRoute.FromTabViewAdapter;
import com.google.android.material.tabs.TabLayout;

public class FromMapActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_from_map);

        tabLayout =  findViewById(R.id.fmaptablayout);
        viewPager = findViewById(R.id.fmapviewpager);

        FMapTabViewAdapter adapter = new FMapTabViewAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);


        tabLayout.setupWithViewPager(viewPager);

    }
}