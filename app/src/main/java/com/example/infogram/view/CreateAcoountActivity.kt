package com.example.infogram.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import com.example.infogram.R
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.appbar_toolbar.*

class CreateAcoountActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_acoount)
        showToolBar()
        }
    
    public fun showToolBar(String titulo , boolean botonSubir) {
        Toolbar toolbar=clearFindViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle(titulo);
        getSupportActionBar().setDisplayHomeAsUpEnabled(botonSubir);
    }

}