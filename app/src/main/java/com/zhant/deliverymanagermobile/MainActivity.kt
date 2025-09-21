package com.zhant.deliverymanagermobile

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.zhant.deliverymanagermobile.databinding.ActivityMainBinding
import com.zhant.deliverymanagermobile.model.DeliveryEntity
import com.zhant.deliverymanagermobile.network.DeliveryService
import com.zhant.deliverymanagermobile.network.RetrofitClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.net.HttpURLConnection
import java.net.URL

class MainActivity : AppCompatActivity() {

    private val deliveryService = RetrofitClient.createService(DeliveryService::class.java)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val cal = deliveryService.listAll()
        cal.enqueue(object: Callback<List<DeliveryEntity>>{
            override fun onResponse(
                call: Call<List<DeliveryEntity>?>, response: Response<List<DeliveryEntity>?>
            ) {
                val s = ""
            }

            override fun onFailure(
                call: Call<List<DeliveryEntity>?>, t: Throwable
            ) {
                val s = ""
            }

        })
    }
}