package com.example.coroutineandroid.ui

import com.example.coroutineandroid.models.UserResponse

interface IMainActivity {
    fun onDataResponseComplete(responseUser: List<UserResponse>?)
    fun onDataResponseFailure(throwable: Throwable)
}