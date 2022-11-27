package com.example.praticeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.praticeapp.FromRoute.FromTabViewAdapter;
import com.example.praticeapp.ToRoute.ToTabViewAdapter;
import com.google.android.material.tabs.TabLayout;


public class ToActivity extends AppCompatActivity {


    TabLayout tabLayout;
    ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to);

        tabLayout =  findViewById(R.id.totablayout);
        viewPager = findViewById(R.id.toviewpager);

        ToTabViewAdapter adapter = new ToTabViewAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);


        tabLayout.setupWithViewPager(viewPager);

    }
}