package com.example.constrain_layout;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;


public class signupfrag extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_signupfrag, container, false);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextInputEditText txname = view.findViewById(R.id.ed2name);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextInputEditText txemail = view.findViewById(R.id.ed3email);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextInputEditText txpass = view.findViewById(R.id.ed3password);
        Button button = view.findViewById(R.id.btnlog2);
        Button buttonsign = view.findViewById(R.id.btnsing2);

        buttonsign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextUtils.isEmpty(txname.getText().toString())) {
                    txname.setError("Please Enter Your Name");
                    return;
                }
                if (TextUtils.isEmpty(txemail.getText().toString())){
                    txemail.setError("Please Enter Email");
                    return;
                }
               if (TextUtils.isEmpty(txpass.getText().toString())){
                   txpass.setError("Enter Password");
               }
               else {
                   Loginfrag back = new Loginfrag();
                   getActivity().getSupportFragmentManager().beginTransaction()
                           .setCustomAnimations(R.anim.enter_left_to_right, R.anim.exit_left_to_right, R.anim.enter_right_to_left, R.anim.exit_right_to_left)
                           .replace(R.id.fragmentContainerView2, back)
                           .addToBackStack(null)
                           .commit();}

            }
        });


        return view;
    }
}