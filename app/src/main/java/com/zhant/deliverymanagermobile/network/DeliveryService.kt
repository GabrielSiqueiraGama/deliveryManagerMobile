package com.zhant.deliverymanagermobile.network

import com.zhant.deliverymanagermobile.model.DeliveryEntity
import retrofit2.Call
import retrofit2.http.GET

interface DeliveryService {

    @GET("api/deliveries")
    fun listAll(): Call<List<DeliveryEntity>>
}