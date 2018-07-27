package com.rahmahnajiyahimtihan.restoran_crud_kotlin.tambah

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.rahmahnajiyahimtihan.restoran_crud_kotlin.R
import com.rahmahnajiyahimtihan.restoran_crud_kotlin.main.MainActivity
import kotlinx.android.synthetic.main.activity_tambah.*

class TambahActivity : AppCompatActivity(), TambahView {

    var presenter : TambahPresenter? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tambah)

        presenter = TambahPresenter(this)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId){
            R.id.insert -> presenter?.insertServer(et_Name.text.toString(), et_Price.text.toString(), et_Restoran.text.toString())
        }

        return super.onOptionsItemSelected(item)
    }

    override fun succes(status: Int, pesan: String) {
        startActivity(Intent(this@TambahActivity, MainActivity::class.java))
    }

    override fun error(msg: String) {

    }


}
