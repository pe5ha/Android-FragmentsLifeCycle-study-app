package com.pe5ha.fragmentslifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(savedInstanceState==null){
            Log.i("FragmentLifeCycle","MainActivity: addFragmentA()")
            addFragmentA()
        }
    }

    private fun addFragmentA(){
        supportFragmentManager.beginTransaction()
            .add(R.id.fragment_container_activivty,FragmentA())
            .commit()
    }
}