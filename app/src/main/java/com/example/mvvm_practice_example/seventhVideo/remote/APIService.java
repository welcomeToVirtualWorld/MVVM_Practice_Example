package com.example.mvvm_practice_example.seventhVideo.remote;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface APIService {
    @FormUrlEncoded
    @POST("logintab.php")
    Call<String> userLoginCall(@Field("username")String username,@Field("userpass")String userpass);

}
