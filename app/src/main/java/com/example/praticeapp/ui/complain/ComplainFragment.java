package com.example.praticeapp.ui.complain;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.praticeapp.FromActivity;
import com.example.praticeapp.R;
import com.example.praticeapp.databinding.FragmentComplainBinding;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;


public class ComplainFragment extends Fragment {

    private FragmentComplainBinding binding;
    TextInputLayout toemail,tosub,tomsg;
    Button tosend;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ComplainViewModel complainViewModel = new ViewModelProvider(this).get(ComplainViewModel.class);
        binding = FragmentComplainBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        root = inflater.inflate(R.layout.fragment_complain,container,false);


//
//        toemail = root.findViewById(R.id.Cemail);
//        tosub = root.findViewById(R.id.Csubject);
//        tomsg = root.findViewById(R.id.Cmessage);
//        tosend = root.findViewById(R.id.sendemail);



//        tosend.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("mailto:"+toemail.getEditText().toString()));
//                intent.putExtra(Intent.EXTRA_SUBJECT,tosub.getEditText().toString());
//                intent.putExtra(Intent.EXTRA_TEXT,tomsg.getEditText().toString());
//                startActivity(intent);
//
//            }
//        });

        return root;
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
//   public void SendData()
//   {
//       Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("mailto:"+to.getEditText().toString()));
//       intent.putExtra(Intent.EXTRA_SUBJECT,sub.getEditText().toString());
//       intent.putExtra(Intent.EXTRA_TEXT,msg.getEditText().toString());
//       startActivity(intent);
//   }

}