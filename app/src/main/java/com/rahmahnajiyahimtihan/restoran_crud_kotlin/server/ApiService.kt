package com.rahmahnajiyahimtihan.restoran_crud_kotlin.server

import com.rahmahnajiyahimtihan.restoran_crud_kotlin.response.ResponseInsert
import com.rahmahnajiyahimtihan.restoran_crud_kotlin.response.ResponseMakanan
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiService {

    //ini hrs ada kalau seandainya method url adalah post
    @FormUrlEncoded
    @POST("insertMakanan")
    fun requestInsert(@Field("name")name: String,
                      @Field("price")harga : String,
                      @Field("restoran")restoran : String):Call<ResponseInsert> //parameter dl br callback


    //bikin request buat ngeget
    @GET("getMakanan")
    fun requestgetMakanan():Call<ResponseMakanan>

}