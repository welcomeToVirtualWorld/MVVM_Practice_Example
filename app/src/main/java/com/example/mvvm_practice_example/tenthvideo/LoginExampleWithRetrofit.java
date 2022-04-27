package com.example.mvvm_practice_example.tenthvideo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import com.example.mvvm_practice_example.R;
import com.example.mvvm_practice_example.databinding.ActivityLoginExampleWithRetrofitBinding;
import com.example.mvvm_practice_example.tenthvideo.presenters.Presenter;
import com.example.mvvm_practice_example.tenthvideo.viewmodels.LoginViewModel;

public class LoginExampleWithRetrofit extends AppCompatActivity {
    private ActivityLoginExampleWithRetrofitBinding binding;
    private LoginViewModel model;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_login_example_with_retrofit);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_login_example_with_retrofit);
        model = ViewModelProviders.of(this).get(LoginViewModel.class);
        binding.setLogin(model);
        binding.setLifecycleOwner(this);
        model.data.observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                binding.txtValue.setText(s);
            }
        });
        binding.setPresenter(new Presenter() {
            @Override
            public void getData() {
                model.login();
            }
        });
    }
}