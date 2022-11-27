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


public class TLStudentFragment extends Fragment {
    CardView TLS1,TLS2,TLS3,TLS4,TLS5,TLS6,TLS7,TLS8,TLS9,TLS10,TLS11,TLS12;

    public TLStudentFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        View root =inflater.inflate(R.layout.fragment_t_l_student, container, false);

        TLS1 = root.findViewById(R.id.MTSTone);
        TLS2 = root.findViewById(R.id.MTSTtwo);
        TLS3 = root.findViewById(R.id.MTSTthree);
        TLS4 = root.findViewById(R.id.MTSTfour);
        TLS5 = root.findViewById(R.id.MTSTfive);
        TLS6 = root.findViewById(R.id.MTSTsix);
        TLS7 = root.findViewById(R.id.MTSTseven);
        TLS8 = root.findViewById(R.id.MTSTeight);
        TLS9= root.findViewById(R.id.MTSTnine);
        TLS10 = root.findViewById(R.id.MTSTten);
        TLS11 = root.findViewById(R.id.MTSTeleven);
        TLS12 = root.findViewById(R.id.MTSTtwelve);

        //route1
        TLS1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), TRoute1.class));
            }
        });
        //route2
        TLS2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), TRoute2.class));
            }
        });
        //route3
        TLS3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), TRoute3.class));
            }
        });
        //route4
        TLS4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), TRoute4.class));
            }
        });
        //route5
        TLS5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), TRoute5.class));
            }
        });
        //route6
        TLS6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), TRoute6.class));
            }
        });
        //route7
        TLS7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), TRoute7.class));
            }
        });
        //route8
        TLS8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), TRoute8.class));
            }
        });
        //route9
        TLS9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), TRoute9.class));
            }
        });
        //route10
        TLS10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), TRoute10.class));
            }
        });
        //route11
        TLS11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), TRoute11.class));
            }
        });
        //route12
        TLS12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), TRoute12.class));
            }
        });



        return root;
    }
}