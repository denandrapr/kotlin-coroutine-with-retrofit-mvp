package com.example.coroutineandroid.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.coroutineandroid.R
import com.example.coroutineandroid.models.UserResponse

class MainActivity : AppCompatActivity(), IMainActivity {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MainActivityPresenter(this).getUsersData()
    }

    override fun onDataResponseComplete(responseUser: List<UserResponse>?) {
        Log.d("Response", "$responseUser")
    }

    override fun onDataResponseFailure(throwable: Throwable) {
        Log.d("Response", "$throwable")
    }
}
