package com.example.sampleproject

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.sampleproject.retrofit.*
import com.example.sampleproject.retrofit.models.LoginRequest
import com.example.sampleproject.retrofit.models.LoginResponse
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.observers.DisposableSingleObserver
import io.reactivex.schedulers.Schedulers

class MainViewModel : ViewModel() {
    val loginLiveData = MutableLiveData<Resource<LoginResponse>>()
    val compositeDisposable = CompositeDisposable()

     fun validation(email: String?, password: String?) {
        if (email.isNullOrEmpty()) {
            loginLiveData.value = message("Email cannot be empty.")
        } else if (!android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            loginLiveData.value = message("Email is not valid.")
        } else if (password.isNullOrEmpty()) {
            loginLiveData.value = message("Password cannot be empty.")
        } else {
            loginWebservice(email, password)
        }
    }

    private fun loginWebservice(email: String, password: String) {
        loginLiveData.value = loading()
        compositeDisposable.add(
            ApiUtils.apiInterface.loginUser(LoginRequest())
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(object : DisposableSingleObserver<LoginResponse>() {
                    override fun onSuccess(t: LoginResponse) {

                        loginLiveData.value = success(t,"successfull")
                    }

                    override fun onError(e: Throwable) {
                        loginLiveData.value = message("Failed")
                    }
                })
        )
    }

    override fun onCleared() {
        super.onCleared()
        compositeDisposable.clear()
    }
}