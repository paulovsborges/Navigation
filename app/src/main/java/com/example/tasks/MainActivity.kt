package com.example.tasks

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(supportActionBar != null) {
            supportActionBar!!.hide()

        }

        button_ganhos.setOnClickListener(this)
        button_despesas.setOnClickListener(this)
    }

    override fun onClick(view: View) {

        val id = view.id
        if( id == R.id.button_ganhos) {
            startActivity(Intent(this, GanhosActivity::class.java))
        }
        if( id == R.id.button_despesas) {

            startActivity(Intent(this, DespesasActivity::class.java))
       }
    }
}