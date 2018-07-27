package com.rahmahnajiyahimtihan.restoran_crud_kotlin.main

import com.rahmahnajiyahimtihan.restoran_crud_kotlin.response.Makanan

interface MainView  {

    fun succes(data : List<Makanan>?, status: Int, msg : String)

    fun error(msg : String)
}