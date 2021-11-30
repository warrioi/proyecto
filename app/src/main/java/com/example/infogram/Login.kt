package com.example.infogram

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.infogram.view.ContainerActivity2
import com.example.infogram.view.CreateAcoountActivity
import kotlinx.android.synthetic.main.activity_container2.*


class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    fun goCreateAcount(View view){
        Intent intent = new Intent(this, CreateAcoountActivity.class);
        startActivity(Intent);

    }

    fun login(view: View) {
        Intent intent = new Intent(this,ContainerActivity2.class );
        startActivity(intent);
    }

    fun goCreateAcoount(view: View) {}
}