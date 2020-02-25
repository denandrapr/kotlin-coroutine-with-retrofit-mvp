package com.example.coroutineandroid.models

data class UserResponse(
    val __v: Int,
    val _id: String,
    val avatar: String,
    val birth: String,
    val campus: String,
    val createdAt: String,
    val description: String,
    val email: String,
    val interest: List<Any>,
    val name: String,
    val password: String,
    val personality: String,
    val study_program: String,
    val updatedAt: String
)