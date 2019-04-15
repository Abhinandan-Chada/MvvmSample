package com.example.sampleproject.retrofit

import com.example.sampleproject.retrofit.models.LoginRequest
import com.example.sampleproject.retrofit.models.LoginResponse
import io.reactivex.Single
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiInterface {
    @POST("login")
    fun loginUser(@Body request: LoginRequest): Single<LoginResponse>
}