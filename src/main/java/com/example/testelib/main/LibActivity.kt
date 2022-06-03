
package com.example.testelib.main

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testelib.R

class LibActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lib)
    }

    companion object {
        fun start(context: Context) {
            val intent = Intent(context, LibActivity::class.java)
            context.startActivity(intent)
        }
    }
}