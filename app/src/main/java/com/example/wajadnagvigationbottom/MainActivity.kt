package com.example.wajadnagvigationbottom

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.graphics.drawable.DrawableCompat
import com.example.wajadnagvigationbottom.fragments.FirstFragment
import com.example.wajadnagvigationbottom.fragments.FourthFragment
import com.example.wajadnagvigationbottom.fragments.SecondFragment
import com.example.wajadnagvigationbottom.fragments.ThirdFragment
import com.google.android.material.floatingactionbutton.FloatingActionButton
import kotlinx.android.synthetic.main.activity_main.home_button
import kotlinx.android.synthetic.main.activity_main.notification
import kotlinx.android.synthetic.main.activity_main.profile
import kotlinx.android.synthetic.main.activity_main.qr_code

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    if (savedInstanceState == null) {
      val fragment = FirstFragment()
      supportFragmentManager.beginTransaction()
        .replace(R.id.main_frag_container, fragment)
        .addToBackStack(null)
        .commit()
    }

    home_button.setOnClickListener {
      val fragment = FirstFragment()
      supportFragmentManager.beginTransaction()
        .replace(R.id.main_frag_container, fragment)
        .addToBackStack(null)
        .commit()

      home_button.background = ContextCompat.getDrawable(this, R.drawable.float_button_selected)
      notification.background = ContextCompat.getDrawable(this, R.drawable.float_button_unselected)
      qr_code.background = ContextCompat.getDrawable(this, R.drawable.float_button_unselected)
      profile.background = ContextCompat.getDrawable(this, R.drawable.float_button_unselected)

      DrawableCompat.setTint(home_button.drawable, ContextCompat.getColor(this, R.color.white))
      DrawableCompat.setTint(notification.drawable, ContextCompat.getColor(this, R.color.gray))
      DrawableCompat.setTint(qr_code.drawable, ContextCompat.getColor(this, R.color.gray))
      DrawableCompat.setTint(profile.drawable, ContextCompat.getColor(this, R.color.gray))

    }

    qr_code.setOnClickListener {
      val fragment = ThirdFragment()
      supportFragmentManager.beginTransaction()
        .replace(R.id.main_frag_container, fragment)
        .addToBackStack(null)
        .commit()

      home_button.background = ContextCompat.getDrawable(this, R.drawable.float_button_unselected)
      notification.background = ContextCompat.getDrawable(this, R.drawable.float_button_unselected)
      qr_code.background = ContextCompat.getDrawable(this, R.drawable.float_button_selected)
      profile.background = ContextCompat.getDrawable(this, R.drawable.float_button_unselected)


      DrawableCompat.setTint(home_button.drawable, ContextCompat.getColor(this, R.color.gray))
      DrawableCompat.setTint(notification.drawable, ContextCompat.getColor(this, R.color.gray))
      DrawableCompat.setTint(qr_code.drawable, ContextCompat.getColor(this, R.color.white))
      DrawableCompat.setTint(profile.drawable, ContextCompat.getColor(this, R.color.gray))


    }
    notification.setOnClickListener {
      val fragment = SecondFragment()
      supportFragmentManager.beginTransaction()
        .replace(R.id.main_frag_container, fragment)
        .addToBackStack(null)
        .commit()

      home_button.background = ContextCompat.getDrawable(this, R.drawable.float_button_unselected)
      notification.background = ContextCompat.getDrawable(this, R.drawable.float_button_selected)
      qr_code.background = ContextCompat.getDrawable(this, R.drawable.float_button_unselected)
      profile.background = ContextCompat.getDrawable(this, R.drawable.float_button_unselected)

      DrawableCompat.setTint(home_button.drawable, ContextCompat.getColor(this, R.color.gray))
      DrawableCompat.setTint(notification.drawable, ContextCompat.getColor(this, R.color.white))
      DrawableCompat.setTint(qr_code.drawable, ContextCompat.getColor(this, R.color.gray))
      DrawableCompat.setTint(profile.drawable, ContextCompat.getColor(this, R.color.gray))

    }

    profile.setOnClickListener {
      val fragment = FourthFragment()
      supportFragmentManager.beginTransaction()
        .replace(R.id.main_frag_container, fragment)
        .addToBackStack(null)
        .commit()

      home_button.background = ContextCompat.getDrawable(this, R.drawable.float_button_unselected)
      notification.background = ContextCompat.getDrawable(this, R.drawable.float_button_unselected)
      qr_code.background = ContextCompat.getDrawable(this, R.drawable.float_button_unselected)
      profile.background = ContextCompat.getDrawable(this, R.drawable.float_button_selected)

      DrawableCompat.setTint(home_button.drawable, ContextCompat.getColor(this, R.color.gray))
      DrawableCompat.setTint(notification.drawable, ContextCompat.getColor(this, R.color.gray))
      DrawableCompat.setTint(qr_code.drawable, ContextCompat.getColor(this, R.color.gray))
      DrawableCompat.setTint(profile.drawable, ContextCompat.getColor(this, R.color.white))

    }

  }

  fun chnageFabColor(fab: FloatingActionButton) {

  }
}
