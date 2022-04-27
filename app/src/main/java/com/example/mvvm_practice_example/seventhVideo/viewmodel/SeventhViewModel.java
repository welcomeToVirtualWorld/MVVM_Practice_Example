package com.example.mvvm_practice_example.seventhVideo.viewmodel;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

import androidx.databinding.ObservableField;
import androidx.databinding.ObservableInt;

import com.example.mvvm_practice_example.seventhVideo.remote.APIClient;
import com.example.mvvm_practice_example.seventhVideo.remote.APIService;

import java.util.Observable;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SeventhViewModel extends Observable {
    private Context context;
    public ObservableInt progressBar;
    public final ObservableField<String> username = new ObservableField<>("");
    public final ObservableField<String> userpass = new ObservableField<>("");

    public SeventhViewModel(Context context){
        this.context = context;
        progressBar = new ObservableInt(View.GONE);
    }

    public void sendLoginRequest(String name,String pass){
        progressBar.set(View.VISIBLE);
        APIService apiService = APIClient.getAPIService();
        Call<String> loginresponse = apiService.userLoginCall(name,pass);
        loginresponse.enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                progressBar.set(View.GONE);
                Toast.makeText(context, response.body().toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {
                progressBar.set(View.GONE);
                Toast.makeText(context, t.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
