package com.rahmahnajiyahimtihan.restoran_crud_kotlin.main

import android.util.Log
import com.rahmahnajiyahimtihan.restoran_crud_kotlin.response.ResponseMakanan
import com.rahmahnajiyahimtihan.restoran_crud_kotlin.server.ConfigServer
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainPresenter(var main: MainActivity) {

    fun ambilData() {
        ConfigServer().service.requestgetMakanan().enqueue(object : Callback<ResponseMakanan> {
            override fun onFailure(call: Call<ResponseMakanan>?, t: Throwable?) {
                //toast(t.toString())
            }

            override fun onResponse(call: Call<ResponseMakanan>?, response: Response<ResponseMakanan>?) {
                if (response?.isSuccessful!!){
                    val pesan = response.body()?.pesan
                    val status = response.body()?.status

                    val data = response.body()?.datanya

                    if (status == 1) main.succes(data,status,pesan!!)
                    else main.error(pesan!!)

//                    val adapter = MakananAdapter(data!!)

//                    recylerView.adapter = adapter
//                    recylerView.layoutManager = LinearLayoutManager(this@MainActivity)

                    Log.d("data json makan", data.toString())
                }
            }
        })
    }
}