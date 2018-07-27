package com.rahmahnajiyahimtihan.restoran_crud_kotlin.tambah

import com.rahmahnajiyahimtihan.restoran_crud_kotlin.response.ResponseInsert
import com.rahmahnajiyahimtihan.restoran_crud_kotlin.server.ConfigServer
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class TambahPresenter (var tambah : TambahView) {

    fun insertServer(et_nama: String, et_harga: String, et_restoran: String) {

        // checking
        //ambil inputan user

//        val et_nama = et_Name.text.toString()
//        val et_harga = et_Price.text.toString()
//        val et_restoran = et_Restoran.text.toString()

        //check inputan user
        if (et_nama == "" && et_harga == "" && et_restoran == "") {
            tambah.error("error")

        } else {
            //insert server

            //ambil configurasi
            val config = ConfigServer().service

            //ambil request
            val request = config.requestInsert(et_nama, et_harga, et_restoran)

            //get response
            request.enqueue(object : Callback<ResponseInsert> {
                override fun onFailure(call: Call<ResponseInsert>?, t: Throwable?) {

                    //Toast.makeText(this@TambahActivity,t.toString(), Toast.LENGTH_SHORT).show()
                }

                override fun onResponse(call: Call<ResponseInsert>?, response: Response<ResponseInsert>?) {

                    //eksekusi response
                    if (response?.isSuccessful!!) {//klo null save gk kuat 1 pake ? maka tambah dgn !!

                        val status = response.body()?.status
                        val pesan = response.body()?.pesan

                        if (status == 1) {
                            tambah.succes(status, pesan!!)
                        }
//                            //pindah Main activity

                    } else {
                        //toast("pesan")
                    }
                }


            })

        }
    }
}