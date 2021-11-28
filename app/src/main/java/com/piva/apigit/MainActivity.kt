package com.piva.apigit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val remote = RetrofitClient.createServicce((UsersService::class.java))
        val call: Call<List<UsersModel>> = remote.list()


        var response = call.enqueue(object : Callback<List<UsersModel>>{
            override fun onFailure(call: Call<List<UsersModel>>, t: Throwable) {
                val s = t.message

            }

            override fun onResponse(call: Call<List<UsersModel>>, res: Response<List<UsersModel>>) {
                val s = res.body()
            }

        })
    }
    private fun observe(){

    }
}