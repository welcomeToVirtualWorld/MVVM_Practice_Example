package com.example.mvvm_practice_example.viewmodel;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.example.mvvm_practice_example.model.User;

public class UserModel extends BaseObservable {

    private String email;
    private String password;


    @Bindable
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        //notifyPropertyChanged(BR.email);
    }

    @Bindable
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        //notifyPropertyChanged(BR.password);
    }

}
