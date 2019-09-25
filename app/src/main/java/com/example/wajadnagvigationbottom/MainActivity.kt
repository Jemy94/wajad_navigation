package com.example.wajadnagvigationbottom

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.wajadnagvigationbottom.fragments.HomeFragment
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    if (savedInstanceState == null) {
      val fragment = HomeFragment()
      supportFragmentManager.beginTransaction()
        .replace(R.id.nav_host_fragment, fragment)
        .addToBackStack(null)
        .commit()
    }
  }

  fun chnageFabColor(fab: FloatingActionButton) {

  }
}
