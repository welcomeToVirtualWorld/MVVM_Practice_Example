package com.example.mvvm_practice_example.tenthvideo.remote;

import androidx.lifecycle.MutableLiveData;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginRepository {
    private MutableLiveData<String> data = new MutableLiveData<>();
    public LoginRepository(){

    }
    public MutableLiveData<String> getData(String username,String userpass){
        ApiService service = ApiClient.getAPIService();
        Call<String> call = service.userLogin(username,userpass);
        call.enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                data.setValue(response.body());
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {

            }
        });
        return data;
    }
}
