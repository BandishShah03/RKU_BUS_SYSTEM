package com.example.praticeapp.ui.busmap;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.praticeapp.FromActivity;
import com.example.praticeapp.FromMapActivity;
import com.example.praticeapp.R;
import com.example.praticeapp.ToActivity;
import com.example.praticeapp.ToMapActivity;
import com.example.praticeapp.databinding.FragmentBusmapBinding;


public class BusMapFragment extends Fragment {

    private FragmentBusmapBinding binding;
    CardView TMCardview,FMCardview;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        BusMapViewModel busMapViewModel = new ViewModelProvider(this).get(BusMapViewModel.class);

        binding = FragmentBusmapBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        // Cardview Clickable

        TMCardview = root.findViewById(R.id.TOMCV);
        FMCardview = root.findViewById(R.id.FMCV);


        TMCardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), ToMapActivity.class));

            }
        });
        FMCardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), FromMapActivity.class));

            }
        });
    
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}