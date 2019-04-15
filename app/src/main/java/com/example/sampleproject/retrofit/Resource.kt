package com.example.sampleproject.retrofit


data class Resource<T>(val status: Int, val data: T?, val message: String?)

fun <T> loading(): Resource<T> = Resource(Constants.LOADING, null, null)

fun <T> success(data: T, message: String?): Resource<T> = Resource(Constants.SUCCESS, data, message)

fun <T> error(data: T, message: String?): Resource<T> = Resource(Constants.ERROR, data, message)

fun <T> message(message: String?): Resource<T> = Resource(Constants.MESSAGE, null, message)