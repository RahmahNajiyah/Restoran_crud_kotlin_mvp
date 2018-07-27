package com.rahmahnajiyahimtihan.restoran_crud_kotlin.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.rahmahnajiyahimtihan.restoran_crud_kotlin.R
import com.rahmahnajiyahimtihan.restoran_crud_kotlin.response.Makanan
import kotlinx.android.synthetic.main.item_layout.view.*

class MakananAdapter (var data : List<Makanan>) : RecyclerView.Adapter<MakananAdapter.MyHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {

        val view = LayoutInflater.from(parent?.context).inflate(R.layout.item_layout, parent, false)

        return MyHolder(view)
    }

    override fun getItemCount(): Int {

        return data.size
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {

        holder?.textview?.text = data.get(position).makanan_nama
        holder?.textview2?.text = data.get(position).makanan_harga

        //holder?.bind(data.get(position))
    }

    class MyHolder(itemView: View?) : RecyclerView.ViewHolder(itemView!!) {
        //fun bind(get: Makanan) {

            var textview = itemView?.textName
            var textview2 = itemView?.textPrice

//            itemView.textName.text = get.makanan_nama
//            itemView.textPrice.text = get.makanan_harga
        }
    }
//}