package com.piva.apigit
import retrofit2.Call
import retrofit2.http.GET


interface UsersService {

    @GET("users")
    fun list() : Call<List<UsersModel>>
}