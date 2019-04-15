package com.example.sampleproject

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.sampleproject.databinding.ActivityMainBinding
import com.example.sampleproject.retrofit.Constants
import com.example.sampleproject.retrofit.Resource
import com.example.sampleproject.retrofit.models.LoginResponse

class MainActivity : AppCompatActivity() {

    var viewBinding: ActivityMainBinding? = null
    var viewModel: MainViewModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewBinding?.mainActivity = this
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        viewModel?.loginLiveData?.observe(this, Observer { loginResponse(it) })
    }

    fun login(view: View) {
        viewModel?.validation(viewBinding?.email?.text?.toString(), viewBinding?.password?.text?.toString())
    }

    private fun loginResponse(resource: Resource<LoginResponse>) {
        when (resource.status) {
            Constants.LOADING -> {
                //show loader
                Toast.makeText(this, "show loader", Toast.LENGTH_LONG).show()
            }
            Constants.SUCCESS -> {
                // sucess work intent to next activity
                Toast.makeText(this, "sucess work intent to next activity", Toast.LENGTH_LONG).show()
            }
            Constants.MESSAGE -> {
                //show message
                Toast.makeText(this, resource.message, Toast.LENGTH_LONG).show()
            }
        }
    }

}
