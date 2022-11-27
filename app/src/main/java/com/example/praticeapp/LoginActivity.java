package com.example.praticeapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;

import com.example.praticeapp.Models.User;
import com.example.praticeapp.databinding.ActivityLoginBinding;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class LoginActivity extends AppCompatActivity {
        ActivityLoginBinding binding; //object or implementation for binding
        private FirebaseAuth Auth;
        ProgressDialog pd;
        DatabaseReference ref;
        FirebaseDatabase database;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            binding =ActivityLoginBinding.inflate(getLayoutInflater());
            setContentView(binding.getRoot());
            //FirebaseAuth
            Auth = FirebaseAuth.getInstance();
            database = FirebaseDatabase.getInstance();
            getSupportActionBar().hide();
            // progess Box

            pd = new ProgressDialog(LoginActivity.this);
            pd.setTitle("Login Account");
            pd.setMessage("In Progress");
            if (Auth.getCurrentUser()!=null)
            {
                startActivity(new Intent(LoginActivity.this,MainActivity.class));
                finish();
            }






            // sign up Button
                binding.btnlogin.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick (View view){
                            String email,password;
                            email = binding.email.getText().toString();
                            password =  binding.password.getText().toString();
                            // Validatioin For Input Email And Password
                            if (TextUtils.isEmpty(email))
                            {
                                Toast.makeText(LoginActivity.this,"PLEASE ENTER YOUR EMAIL",Toast.LENGTH_LONG).show();
                                return;
                            }
                            if (TextUtils.isEmpty(password))
                            {
                                Toast.makeText(LoginActivity.this,"PLEASE ENTER YOUR PASSWORD",Toast.LENGTH_LONG).show();
                                return;
                            }
                        pd.show();
                        Auth.signInWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                pd.dismiss();
                                if (task.isSuccessful()) {
//                                    User user = new User(binding.email.getText().toString(), binding.password.getText().toString());
//                                    String id = task.getResult().getUser().getUid();
//                                    ref = database.getReference().child("users").child(id);
//                                    ref.setValue(user);

                                    Toast.makeText(LoginActivity.this, "Login Succesfully Done", Toast.LENGTH_SHORT).show();
                                    Intent i = new Intent(LoginActivity.this, MainActivity.class);
                                    startActivity(i);
                                    finish();
                                } else {
                                    Toast.makeText(LoginActivity.this, task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
                    }
                });

    }
}