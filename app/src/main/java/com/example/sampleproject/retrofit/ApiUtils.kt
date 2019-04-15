package com.example.sampleproject.retrofit

import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory


object ApiUtils {

    val apiInterface: ApiInterface by lazy {
        Retrofit.Builder()
            .baseUrl("https://staging-api.vendortrax.com/public/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build().create(ApiInterface::class.java)
    }

}