package com.example.mvvm_practice_example.seventhVideo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.mvvm_practice_example.R;
import com.example.mvvm_practice_example.databinding.ActivityRetrofitExampleWithDataManagerBinding;

import com.example.mvvm_practice_example.seventhVideo.viewmodel.SeventhViewModel;

public class RetrofitExampleWithDataManager extends AppCompatActivity {
    private ActivityRetrofitExampleWithDataManagerBinding binding;
    private SeventhViewModel model;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_retrofit_example_with_data_manager);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_retrofit_example_with_data_manager);
        model = new SeventhViewModel(this);
        binding.setSeventhmodel(model);
        binding.setPresenter(new ClickListener() {
            @Override
            public void onButtonClick() {
                String username = binding.edtusername.toString();
                String userpass = binding.edtuserpass.toString();

                model.sendLoginRequest(username,userpass);
            }
        });
    }
}