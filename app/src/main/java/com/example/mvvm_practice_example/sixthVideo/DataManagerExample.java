package com.example.mvvm_practice_example.sixthVideo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.mvvm_practice_example.R;
import com.example.mvvm_practice_example.databinding.ActivityDataManagerExampleBinding;
import com.example.mvvm_practice_example.sixthVideo.presenters.Presenter;
import com.example.mvvm_practice_example.sixthVideo.remote.data.DataManager;

public class DataManagerExample extends AppCompatActivity {
    private ActivityDataManagerExampleBinding binding;
    private DataManager dataManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_manager_example);
        dataManager = new DataManager(this);
        binding = DataBindingUtil.setContentView(DataManagerExample.this,R.layout.activity_data_manager_example);
        binding.setCallback(new Presenter() {
            @Override
            public void getJsonData() {
                dataManager.sendVolleyRequest();
            }
        });
    }
}