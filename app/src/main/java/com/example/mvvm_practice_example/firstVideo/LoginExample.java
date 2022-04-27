package com.example.mvvm_practice_example.firstVideo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.widget.Toast;

import com.example.mvvm_practice_example.R;
import com.example.mvvm_practice_example.databinding.ActivityLoginExampleBinding;
import com.example.mvvm_practice_example.listeners.UserLogin;

public class LoginExample extends AppCompatActivity {

    private ActivityLoginExampleBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_login_example);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_login_example);
        UserModel userModel = new UserModel(new User("Enter email","Enter password"));
        binding.setLogin(userModel);

        binding.setLoginEvent(new UserLogin() {
            @Override
            public void login() {
                Toast.makeText(LoginExample.this, userModel.getEmail(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}