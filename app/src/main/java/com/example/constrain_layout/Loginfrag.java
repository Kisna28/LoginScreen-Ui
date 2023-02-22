package com.example.constrain_layout;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.constrain_layout.databinding.FragmentLoginfragBinding;
import com.example.constrain_layout.model.Data_Binding;
import com.example.constrain_layout.viewmodels.ViewModelData;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import org.w3c.dom.Text;

import java.util.jar.Attributes;

import javax.xml.namespace.QName;

public class Loginfrag extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_loginfrag, container, false);

        FragmentLoginfragBinding mainxml = DataBindingUtil.inflate(inflater,R.layout.fragment_loginfrag,container,false);
        View view1= mainxml.getRoot();
        //mainxml.setWelcome();



        
       /* ActivityMainBinding mainxml = DataBindingUtil.setContentView(this, R.layout.activity_main);
        setContentView(mainxml.getRoot());
        viewModelData= ViewModelProviders.of(this).get(ViewModelData.class);
        mainxml.setName(viewModelData.getData_binding());
        mainxml.setRollno(viewModelData.getData_binding());
*/
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextInputEditText editText=view.findViewById(R.id.ed2user);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextInputEditText ed=view.findViewById(R.id.ed3pass);

        Button button = view.findViewById(R.id.btnsign);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(TextUtils.isEmpty(editText.getText().toString())){
                    editText.setError("Please Enter Username");
                    return;
                }
                if (TextUtils.isEmpty(ed.getText().toString())){
                    ed.setError("Please Enter Password");
                    return;
                }
                else {
                    signupfrag nextFrag = new signupfrag();
                    getActivity().getSupportFragmentManager().beginTransaction()
                            .setCustomAnimations(R.anim.enter_right_to_left, R.anim.exit_right_to_left, R.anim.enter_left_to_right, R.anim.exit_left_to_right)
                            .replace(R.id.fragmentContainerView2, nextFrag)
                            .addToBackStack(null)
                            .commit();}
            }
        });

        return view;
    }
}