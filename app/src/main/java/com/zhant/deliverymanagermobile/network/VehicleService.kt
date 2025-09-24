package com.zhant.deliverymanagermobile.network

import com.zhant.deliverymanagermobile.model.VehicleEntity
import retrofit2.Call
import retrofit2.http.GET

interface VehicleService {

    @GET("api/vehicles")
    fun listAll(): Call<List<VehicleEntity>>
}