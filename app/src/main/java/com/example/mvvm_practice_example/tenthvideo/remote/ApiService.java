package com.example.mvvm_practice_example.tenthvideo.remote;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiService {
    @FormUrlEncoded
    @POST("/loginview/login.php")
    Call<String> userLogin(@Field("username")String username,@Field("userpass") String userpass);
}
