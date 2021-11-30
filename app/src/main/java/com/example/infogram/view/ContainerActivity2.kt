package com.example.infogram.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.infogram.R
import kotlinx.android.synthetic.*
import com.google.android.material.bottomnavigation.BottomNavigationItemView as BottomNavigationItemView

class ContainerActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_container2);

        BottomNavigationItemView bottonNavigationView = clearFindViewById(R.id.botton_navigation_view);
        BottomNavigationItemView.setOnNavigationItemSelectedListener(

        )
    }
}
