package com.example.praticeapp.FromMapRoute;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.praticeapp.FRoute8;
import com.example.praticeapp.R;
import com.example.praticeapp.FRoute1;
import com.example.praticeapp.FRoute2;
import com.example.praticeapp.FRoute3;
import com.example.praticeapp.FRoute4;
import com.example.praticeapp.FRoute5;


public class FLStaffFragment extends Fragment {
    CardView FMSA1,FMSA2,FMSA3,FMSA4,FMSA8;


    public FLStaffFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root =inflater.inflate(R.layout.fragment_f_l_staff, container, false);

        FMSA1 = root.findViewById(R.id.FMSAone);
        FMSA2 = root.findViewById(R.id.FMSAtwo);
        FMSA3 = root.findViewById(R.id.FMSAthree);
        FMSA4 = root.findViewById(R.id.FMSAfour);
        FMSA8 = root.findViewById(R.id.FMSAeight);
        
        //route1
        FMSA1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), FRoute1.class));
            }
        });
        //route2
        FMSA2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), FRoute2.class));
            }
        });
        //route3
        FMSA3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), FRoute3.class));
            }
        });
        //route4
        FMSA4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), FRoute4.class));
            }
        });
        //route8
        FMSA8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), FRoute8.class));
            }
        });
        return root;
    }
}