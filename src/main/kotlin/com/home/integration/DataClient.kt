package com.home.integration

import com.home.dto.Data
import com.home.infrastructure.Context
import retrofit2.Call
import retrofit2.Response

class DataClient {

    private val service: DataService = Context.retrofit().create(DataService::class.java)

    fun create(content: String?): Long {
        val call = service.postData(Data(id = null, content = content))
        val response = call.execute()
        return response.body()?.id!!
    }

    fun get(id: Long): Data? {
        val call = service.getData(id)
        val response = call.execute()
        return response.body()
    }
}