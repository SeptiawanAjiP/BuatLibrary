package com.dewakoding.buatlibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.dewakoding.loglib.LogLib

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        LogLib.run("ini pesan dari MainActivity")

    }
}