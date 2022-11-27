package com.example.praticeapp.ToMapRoute;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.praticeapp.R;
import com.example.praticeapp.TRoute1;
import com.example.praticeapp.TRoute10;
import com.example.praticeapp.TRoute11;
import com.example.praticeapp.TRoute12;
import com.example.praticeapp.TRoute2;
import com.example.praticeapp.TRoute3;
import com.example.praticeapp.TRoute4;
import com.example.praticeapp.TRoute5;
import com.example.praticeapp.TRoute6;
import com.example.praticeapp.TRoute7;
import com.example.praticeapp.TRoute8;
import com.example.praticeapp.TRoute9;


public class TLStaffFragment extends Fragment {
    CardView TLSA1,TLSA2,TLSA3,TLSA4,TLSA5,TLSA6,TLSA7,TLSA8,TLSA9,TLSA10,TLSA11,TLSA12;


    public TLStaffFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root= inflater.inflate(R.layout.fragment_t_l_staff, container, false);

        TLSA1 = root.findViewById(R.id.MTSTAone);
        TLSA2 = root.findViewById(R.id.MTSTAtwo);
        TLSA3 = root.findViewById(R.id.MTSTAthree);
        TLSA4 = root.findViewById(R.id.MTSTAfour);
        TLSA5 = root.findViewById(R.id.MTSTAfive);
        TLSA6 = root.findViewById(R.id.MTSTAsix);
        TLSA7 = root.findViewById(R.id.MTSTAseven);
        TLSA8 = root.findViewById(R.id.MTSTAeight);
        TLSA9= root.findViewById(R.id.MTSTAnine);
        TLSA10 = root.findViewById(R.id.MTSTAten);
        TLSA11 = root.findViewById(R.id.MTSTAeleven);
        TLSA12 = root.findViewById(R.id.MTSTAtwelve);

        //route1
        TLSA1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), TRoute1.class));
            }
        });
        //route2
        TLSA2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), TRoute2.class));
            }
        });
        //route3
        TLSA3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), TRoute3.class));
            }
        });
        //route4
        TLSA4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), TRoute4.class));
            }
        });
        //route5
        TLSA5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), TRoute5.class));
            }
        });
        //route6
        TLSA6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), TRoute6.class));
            }
        });
        //route7
        TLSA7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), TRoute7.class));
            }
        });
        //route8
        TLSA8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), TRoute8.class));
            }
        });
        //route9
        TLSA9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), TRoute9.class));
            }
        });
        //route10
        TLSA10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), TRoute10.class));
            }
        });
        //route11
        TLSA11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), TRoute11.class));
            }
        });
        //route12
        TLSA12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), TRoute12.class));
            }
        });
        return root;
    }
}