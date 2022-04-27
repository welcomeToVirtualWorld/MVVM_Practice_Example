package com.example.mvvm_practice_example.tenthvideo.viewmodels;

import androidx.databinding.ObservableField;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.mvvm_practice_example.tenthvideo.remote.LoginRepository;

public class LoginViewModel extends ViewModel {
    public ObservableField<String> username = new ObservableField<>();
    public ObservableField<String> userpass = new ObservableField<>();
    public MutableLiveData<String> data;
    private LoginRepository loginRepository;

    public LoginViewModel(){
        loginRepository = new LoginRepository();
        username.set("vishal");
        userpass.set("vishal");
        data = loginRepository.getData(username.get(),userpass.get());
    }

    public void login(){
        data = loginRepository.getData(username.get(),userpass.get());
    }

    public MutableLiveData<String> getResponseVsl(){
        return data;
    }
}
