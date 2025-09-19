package com.zhant.deliverymanagermobile.services

import com.zhant.deliverymanagermobile.model.DeliveryEntity
import retrofit2.Call
import retrofit2.http.GET

interface DeliveryService {

    @GET("deliveries")
    fun listAll(): Call<List<DeliveryEntity>>
}