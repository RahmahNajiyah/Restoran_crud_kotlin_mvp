package com.rahmahnajiyahimtihan.restoran_crud_kotlin.response

//klo pake data gk perlu pake kurung krawal
data class Makanan (
        var makanan_id : String? = null,
        var makanan_nama : String? = null,
        var makanan_restoran : String? = null,
        var makanan_harga : String? = null
)
