package com.example.coroutineandroid.ui

import android.content.Context
import com.example.coroutineandroid.networking.NetworkFactory
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivityPresenter(context : Context) {
    private val mainView = context as IMainActivity

    fun getUsersData(){
        val service = NetworkFactory.placeHolderApi
        GlobalScope.launch(Dispatchers.Main) {
            val postRequest = service.getUsers() // Making Network call
            try {
                val response = postRequest.await()
                val posts = response.body() // This is List<PlaceholderPosts>
                mainView.onDataResponseComplete(posts)
            }catch (e: Exception){
                mainView.onDataResponseFailure(e)
            }
        }
    }
}