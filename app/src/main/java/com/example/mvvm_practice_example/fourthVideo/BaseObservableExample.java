package com.example.mvvm_practice_example.fourthVideo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.mvvm_practice_example.R;
import com.example.mvvm_practice_example.databinding.ActivityBaseObservableExampleBinding;
import com.example.mvvm_practice_example.viewmodel.UserModel;

public class BaseObservableExample extends AppCompatActivity {
    private ActivityBaseObservableExampleBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_base_observable_example);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_base_observable_example);
        UserModel userModel = new UserModel();
        userModel.setEmail("Ashutosh");
        userModel.setPassword("Ashutosh");
        binding.setUser(userModel);
    }
}