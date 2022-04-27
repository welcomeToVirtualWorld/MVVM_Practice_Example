package com.example.mvvm_practice_example.tenthvideo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import com.example.mvvm_practice_example.R;
import com.example.mvvm_practice_example.tenthvideo.presenters.Presenter;
import com.example.mvvm_practice_example.tenthvideo.viewmodels.NameModel;
import com.example.mvvm_practice_example.databinding.ActivityLiveDataWithDataBindingBinding;

public class LiveDataWithDataBinding extends AppCompatActivity {

    private ActivityLiveDataWithDataBindingBinding binding;
    private NameModel model;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_live_data_with_data_binding);

        binding = DataBindingUtil.setContentView(this,R.layout.activity_live_data_with_data_binding);
        model = ViewModelProviders.of(this).get(NameModel.class);

        //binding.setNamemodel(model);
        binding.setLifecycleOwner(this);
        model.getData().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                binding.txtValue.setText(s);
            }
        });
        binding.setPresenter(new Presenter() {
            @Override
            public void getData() {

                //Third approach
                model.login();

                 //This is second approach using observable field
                //model.nameVal.set("This is updated one");

                //This is first approach
                //model.data.setValue("This is first approach of data binding");
            }
        });
    }
}