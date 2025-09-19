package com.zhant.deliverymanagermobile.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitClient private constructor(){

    companion object{

        private lateinit var instance: Retrofit

        fun getRetrofitInstance(): Retrofit{

            val httpClient = okhttp3.OkHttpClient.Builder()

            synchronized(this){
                if(!::instance.isInitialized){
                    instance = Retrofit.Builder()
                        .client(httpClient.build())
                        .baseUrl("http://localhost:8080/")
                        .addConverterFactory(GsonConverterFactory.create())
                        .build()
                }
                return instance
            }
        }

        fun createDeliveryService(): DeliveryService{
            return getRetrofitInstance().create(DeliveryService::class.java)
        }
    }

}