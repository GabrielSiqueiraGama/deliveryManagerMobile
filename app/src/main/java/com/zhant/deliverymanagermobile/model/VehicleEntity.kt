package com.zhant.deliverymanagermobile.model

import com.google.gson.annotations.SerializedName

data class VehicleEntity(

    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: Int,
)
