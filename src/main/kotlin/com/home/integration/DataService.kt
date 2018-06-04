package com.home.integration

import com.home.dto.Data
import retrofit2.Call
import retrofit2.http.*

interface DataService {

    @GET("data/{id}")
    fun getData(@Path("id") id: Long): Call<Data>

    @PUT("data/{id}")
    fun putData(@Path("id") id: String): Call<Data>

    @POST("data")
    fun postData(@Body data: Data): Call<Data>
}