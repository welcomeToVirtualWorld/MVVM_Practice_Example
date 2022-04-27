package com.example.mvvm_practice_example.NinthVideo.remote;

import com.example.mvvm_practice_example.NinthVideo.model.Ticket;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("/test/b.json")
    Call<Ticket> getTicketJson();
}
