package com.example.udemyclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import com.example.udemyclone.databinding.ActivityMainBinding
import com.example.udemyclone.ui.fragment.AraFragment
import com.example.udemyclone.ui.fragment.HesapFragment
import com.example.udemyclone.ui.fragment.OneCikanlarFragment
import com.example.udemyclone.ui.fragment.WishlistFragment
import com.example.udemyclone.ui.ogrenimIcerigim.fragment.OgrenimIcerigimFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
}