package com.example.facebook160250.network;

import com.example.facebook160250.utilities.Constants;

import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class Retrofit {


    public static retrofit2.Retrofit retrofitInit(){

        retrofit2.Retrofit retrofit =  new retrofit2.Retrofit.Builder()
                .baseUrl(Constants.BASE_URL)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();


        return retrofit;
    }



}
