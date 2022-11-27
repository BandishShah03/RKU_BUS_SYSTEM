package com.example.praticeapp.ui.home;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.praticeapp.FromActivity;
import com.example.praticeapp.R;
import com.example.praticeapp.SBActivity;
import com.example.praticeapp.ToActivity;
import com.example.praticeapp.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;
    private CardView cardView,cardView3,cardView2,cardView4;



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel = new ViewModelProvider(this).get(HomeViewModel.class);
       binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
       root = inflater.inflate(R.layout.fragment_home,container,false);
        cardView2 = root.findViewById(R.id.FROMCV);
        cardView = root.findViewById(R.id.TOCV);
        cardView3 = root.findViewById(R.id.SBCV);
        cardView4 = root.findViewById(R.id.HELPCV);


        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), ToActivity.class));

            }
        });
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), FromActivity.class));

            }
        });

        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), SBActivity.class));

            }
        });


        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_DIAL);
                String s = "+91 9265437037";

                i.setData(Uri.parse("tel:"+s));
                startActivity(i);
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