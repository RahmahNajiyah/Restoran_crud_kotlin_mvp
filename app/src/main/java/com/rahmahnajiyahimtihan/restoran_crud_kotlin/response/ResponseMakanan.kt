package com.rahmahnajiyahimtihan.restoran_crud_kotlin.response

data class ResponseMakanan (var pesan : String? = null,
                            var status : Int? = null,
                            var datanya : List<Makanan>? = null)


