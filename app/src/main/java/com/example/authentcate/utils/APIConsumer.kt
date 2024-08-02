package com.example.authentcate.utils

import com.example.authentcate.data.AuthResponse
import com.example.authentcate.data.LoginBody
import com.example.authentcate.data.RegisterBody
import com.example.authentcate.data.UniqueEmailValidationResponse
import com.example.authentcate.data.ValidateEmailBody
import okhttp3.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface APIConsumer {
    @POST("user/validate-unique-email")
    suspend fun validateEmailAddress(@Body body: ValidateEmailBody): retrofit2.Response<UniqueEmailValidationResponse>

    @POST("user/register")
    suspend fun registerUser(@Body body: RegisterBody): retrofit2.Response<AuthResponse>

    @POST("user/login")
    suspend fun loginUser(@Body body: LoginBody): retrofit2.Response<AuthResponse>
}