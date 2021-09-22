package com.example.sicapin.HttpRequest;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class InitRetrofit {

    private static final String URL = "https://zuperior-backend-rest-api.herokuapp.com/api/v1/";

    public static Retrofit setInit(){

        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient okHttpClient = new OkHttpClient.Builder().addInterceptor(httpLoggingInterceptor).build();

        return new Retrofit.Builder()
                .baseUrl(URL)
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static ApiInterface getInstance(){
//        return setInit().create(ApiInterface.class);
        ApiInterface apiInterface = setInit().create(ApiInterface.class);

        return apiInterface;
    }
}