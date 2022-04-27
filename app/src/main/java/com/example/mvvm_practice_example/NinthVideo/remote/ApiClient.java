package com.example.mvvm_practice_example.NinthVideo.remote;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.mvvm_practice_example.NinthVideo.model.Ticket;
import com.example.mvvm_practice_example.seventhVideo.remote.APIService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
    private static final String BASE_URL = "http://192.168.132.2";
    private static Retrofit getRetrofitInstance(){
        Gson gson = new GsonBuilder().setLenient().create();
        OkHttpClient okHttpClient = new OkHttpClient().newBuilder()
                .connectTimeout(100, TimeUnit.SECONDS)
                .readTimeout(60, TimeUnit.SECONDS)
                .writeTimeout(60, TimeUnit.SECONDS)
                .build();
        return new Retrofit.Builder()
                .client(okHttpClient).baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson)).build();
    }

    public static ApiInterface getAPIService(){
        return getRetrofitInstance().create(ApiInterface.class);
    }

    public Ticket getTicket(){
        final Ticket ticket = new Ticket();
        ApiInterface apiInterface = ApiClient.getAPIService();
        apiInterface.getTicketJson().enqueue(new Callback<Ticket>() {
            @Override
            public void onResponse(Call<Ticket> call, Response<Ticket> response) {
                Ticket tk = response.body();
                ticket.setTicketId(tk.ticketId);
                ticket.setTicketName(tk.ticketName);
                ticket.setTicketDesc(tk.ticketDesc);

            }

            @Override
            public void onFailure(Call<Ticket> call, Throwable t) {

            }
        });
        return ticket;
    }

    public LiveData<Ticket> getTicketLiveData(){
        final MutableLiveData<Ticket> mutableLiveData = new MutableLiveData<>();

        ApiInterface apiInterface = ApiClient.getAPIService();
        apiInterface.getTicketJson().enqueue(new Callback<Ticket>() {
            @Override
            public void onResponse(Call<Ticket> call, Response<Ticket> response) {
                Ticket ticket = response.body();
                mutableLiveData.setValue(ticket);
            }

            @Override
            public void onFailure(Call<Ticket> call, Throwable t) {

            }
        });
        return mutableLiveData;
    }
}
