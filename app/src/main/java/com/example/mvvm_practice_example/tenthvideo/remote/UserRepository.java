package com.example.mvvm_practice_example.tenthvideo.remote;

import androidx.lifecycle.MutableLiveData;

public class UserRepository {
    private MutableLiveData<String> data = new MutableLiveData<>();
    public UserRepository(){

    }

    public MutableLiveData<String> getRepository(){


        return data;
    }

    public void loginUser(String name){
        if(name.equals("Ashutosh")){
            data.setValue("login");
        }else {
            data.setValue("error");
        }
    }
}
