package com.example.mvvm_practice_example.tenthvideo.viewmodels;

import androidx.databinding.ObservableField;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.mvvm_practice_example.tenthvideo.remote.UserRepository;

public class NameModel extends ViewModel {
    public MutableLiveData<String> data;
    private UserRepository userRepository;
    public ObservableField<String> nameVal = new ObservableField<>();

    public MutableLiveData<String> getData(){
        if (data == null){
            data = new MutableLiveData<>();
        }
        return data;
    }

    public NameModel(){
        userRepository = new UserRepository();
        //nameVal.set("This is first one");
        userRepository.loginUser("Ashutosh");
        data = userRepository.getRepository();
    }

    public void login(){
        userRepository.loginUser("abc");
        data = userRepository.getRepository();
    }

}
