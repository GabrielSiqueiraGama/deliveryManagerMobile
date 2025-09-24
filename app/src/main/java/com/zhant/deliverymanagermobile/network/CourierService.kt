package com.zhant.deliverymanagermobile.network

import com.zhant.deliverymanagermobile.model.CourierEntity
import retrofit2.Call
import retrofit2.http.GET

interface CourierService {

    @GET("api/couriers")
    fun listAll(): Call<List<CourierEntity>>
}