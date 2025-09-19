package com.zhant.deliverymanagermobile.model

import com.google.gson.annotations.SerializedName
import java.time.LocalDateTime

data class DeliveryEntity(

    @SerializedName("id")
    val id: Int,
    @SerializedName("orderDate")
    val orderDate: LocalDateTime,
    @SerializedName("neighborhood")
    val neighborhood: String,
    @SerializedName("amount")
    val amount: String,
    @SerializedName("cashChange")
    val cashChange: String,
    @SerializedName("fragile")
    val fragile: Boolean,
    @SerializedName("noteCode")
    val noteCode: Int,
    @SerializedName("courier_id")
    val courierId: Int,
    @SerializedName("vehicle_id")
    val vehicleId: Int,
)