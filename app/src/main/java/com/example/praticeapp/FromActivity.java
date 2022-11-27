package com.example.praticeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.praticeapp.FromRoute.FromTabViewAdapter;
import com.google.android.material.tabs.TabLayout;


public class FromActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_from);

        tabLayout =  findViewById(R.id.totablayout);
        viewPager = findViewById(R.id.toviewpager);

        FromTabViewAdapter adapter = new FromTabViewAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);


        tabLayout.setupWithViewPager(viewPager);




    }



}