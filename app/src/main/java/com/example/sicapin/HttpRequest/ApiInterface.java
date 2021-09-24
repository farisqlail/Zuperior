package com.example.sicapin.HttpRequest;

import com.example.sicapin.Response.LoginResponse;
import com.example.sicapin.Response.RegisterResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiInterface {
    int idPoints = 0;

    //Zuperior API Masuk
//    @FormUrlEncoded
    @POST("auth/login")
    Call<Object> loginUser(@Body LoginRequest loginRequest);

    @POST("auth/register")
    Call<RegisterResponse> registerUser(@Body RegisterRequest registerRequest);
}