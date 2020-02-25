package com.example.coroutineandroid.networking

import com.example.coroutineandroid.models.UserResponse
import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.http.GET

interface ApiServices {

    @GET("/users")
    fun getUsers() : Deferred<Response<List<UserResponse>>>

}