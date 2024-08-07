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
  // @POST("users/validate-unique-email")
    // suspend fun validateEmailAddress(@Body body: ValidateEmailBody): retrofit2.Response<UniqueEmailValidationResponse>

    @POST("users/register")
    suspend fun registerUser(@Body body: RegisterBody): retrofit2.Response<AuthResponse>

    @POST("users/login")
    suspend fun loginUser(@Body body: LoginBody): retrofit2.Response<AuthResponse>
}