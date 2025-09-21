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
                        .baseUrl("http://10.0.2.2:8080/")
                        .addConverterFactory(GsonConverterFactory.create())
                        .build()
                }
                return instance
            }
        }

        fun <S> createService(serviceClass: Class<S>): S{
            return getRetrofitInstance().create(serviceClass)
        }
    }

}