package com.zhant.deliverymanagermobile.model

import com.google.gson.annotations.SerializedName

data class CourierEntity(

    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: Int,
)
