package com.example.constrain_layout;

import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Loginfrag extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_loginfrag, container, false);


        Button button = view.findViewById(R.id.btnsign);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                signupfrag nextFrag = new signupfrag();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .setCustomAnimations(R.anim.enter_right_to_left, R.anim.exit_right_to_left, R.anim.enter_left_to_right, R.anim.exit_left_to_right)
                        .replace(R.id.fragmentContainerView2, nextFrag)
                        .addToBackStack(null)
                        .commit();

            }
        });

        return view;
    }
}