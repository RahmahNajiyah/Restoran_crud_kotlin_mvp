package com.rahmahnajiyahimtihan.restoran_crud_kotlin.server

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory



class ConfigServer {

    var retrofit = Retrofit.Builder()
            .baseUrl("http://192.168.20.190/server_restoran/index.php/Server/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    var service = retrofit.create<ApiService>(ApiService::class.java!!)
}