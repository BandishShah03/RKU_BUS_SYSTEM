package com.example.praticeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.praticeapp.ToMapRoute.TMapTabViewAdapter;
import com.google.android.material.tabs.TabLayout;

public class ToMapActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_map);

        tabLayout =  findViewById(R.id.tmaptablayout);
        viewPager = findViewById(R.id.tmapviewpager);

        TMapTabViewAdapter adapter = new TMapTabViewAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);


        tabLayout.setupWithViewPager(viewPager);
    }
}