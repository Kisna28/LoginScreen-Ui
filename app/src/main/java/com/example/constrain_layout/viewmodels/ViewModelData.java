package com.example.constrain_layout.viewmodels;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModel;

import com.example.constrain_layout.model.Data_Binding;

public class ViewModelData extends AndroidViewModel {
    Data_Binding data_binding;

    public ViewModelData(@NonNull Application application) {
        super(application);
        data_binding = new Data_Binding("Welcome!", "Log in to your existant account of Discoa.", "Get Started!"
                , "Create an account to Discoa to get all features.");
    }

    public Data_Binding getData_binding() {
        return this.data_binding;
    }
}
