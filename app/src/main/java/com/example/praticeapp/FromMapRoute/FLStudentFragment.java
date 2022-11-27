package com.example.praticeapp.FromMapRoute;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.praticeapp.R;
import com.example.praticeapp.FRoute10;
import com.example.praticeapp.FRoute11;
import com.example.praticeapp.FRoute12;
import com.example.praticeapp.FRoute5;
import com.example.praticeapp.FRoute6;
import com.example.praticeapp.FRoute7;
import com.example.praticeapp.FRoute8;
import com.example.praticeapp.FRoute9;


public class FLStudentFragment extends Fragment {
    CardView FMS5,FMS6,FMS7,FMS9,FMS10,FMS11,FMS12;
    
    
    public FLStudentFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_f_l_student, container, false);
        
        FMS5 = root.findViewById(R.id.FMSfive);
        FMS6 = root.findViewById(R.id.FMSsix);
        FMS7 = root.findViewById(R.id.FMSseven);
        FMS9= root.findViewById(R.id.FMSnine);
        FMS10 = root.findViewById(R.id.FMSten);
        FMS11 = root.findViewById(R.id.FMSeleven);
        FMS12 = root.findViewById(R.id.FMStwelve);
        
        //route5
        FMS5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), FRoute5.class));
            }
        });
        //route6
        FMS6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), FRoute6.class));
            }
        });
        //route7
        FMS7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), FRoute7.class));
            }
        });
        //route9
        FMS9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), FRoute9.class));
            }
        });
        //route10
        FMS10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), FRoute10.class));
            }
        });
        //route11
        FMS11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), FRoute11.class));
            }
        });
        //route12
        FMS12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), FRoute12.class));
            }
        });
        return root;
    }
}