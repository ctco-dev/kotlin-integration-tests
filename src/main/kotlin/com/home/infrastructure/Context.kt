package com.home.infrastructure

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.registerKotlinModule
import retrofit2.Retrofit
import retrofit2.converter.jackson.JacksonConverterFactory

class Context {

    companion object {
        fun retrofit(): Retrofit {
            return Retrofit.Builder()
                    .baseUrl("http://localhost:4567/")
                    .addConverterFactory(JacksonConverterFactory.create(objectMapper()))
                    .build()
        }

        fun objectMapper(): ObjectMapper {
            return ObjectMapper().registerKotlinModule()
        }
    }
}