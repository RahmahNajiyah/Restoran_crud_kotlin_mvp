package com.rahmahnajiyahimtihan.restoran_crud_kotlin.main

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.rahmahnajiyahimtihan.restoran_crud_kotlin.R
import com.rahmahnajiyahimtihan.restoran_crud_kotlin.adapter.MakananAdapter
import com.rahmahnajiyahimtihan.restoran_crud_kotlin.response.Makanan
import com.rahmahnajiyahimtihan.restoran_crud_kotlin.tambah.TambahActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainView {


    var presenter : MainPresenter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = MainPresenter(this)

        presenter?.ambilData()

        //ambil data
        //make new method
        //ambilData()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu2, menu)
        return true
    }

    override fun succes(data: List<Makanan>?, status: Int, msg: String) {
        recylerView.adapter = MakananAdapter(data!!)
        recylerView.layoutManager = LinearLayoutManager(this)

    }

    override fun error(msg: String) {
        Toast.makeText(this, "error", Toast.LENGTH_LONG).show()
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId){
            R.id.tambah -> startActivity(Intent(this, TambahActivity::class.java))
        }

        return super.onOptionsItemSelected(item)
    }
}
