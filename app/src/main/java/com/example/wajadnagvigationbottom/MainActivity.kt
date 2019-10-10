package com.example.wajadnagvigationbottom


import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import androidx.drawerlayout.widget.DrawerLayout.DrawerListener
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.wajadnagvigationbottom.R.drawable
import com.example.wajadnagvigationbottom.R.string
import com.example.wajadnagvigationbottom.fragments.HomeFragment
import com.google.android.material.floatingactionbutton.FloatingActionButton
import kotlinx.android.synthetic.main.activity_main.drawer_layout
import kotlinx.android.synthetic.main.activity_main.recycler_view
import kotlinx.android.synthetic.main.app_bar_wajad.main_activity_coordinator
import kotlinx.android.synthetic.main.app_bar_wajad.toolbar


class MainActivity : AppCompatActivity() {

  private val list = mutableListOf<Any>()
  private lateinit var drawerLayout: DrawerLayout
  private lateinit var toolBar: Toolbar
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

    toolBar = toolbar
    toolBar.title=""
    setSupportActionBar(toolBar)
    drawerLayout = drawer_layout


    list.add(HeaderModel(drawable.profile_image, "Mohamed Ahmed", "150 Points"))
    list.add(DrawerModel(drawable.home_menu, "Home"))
    list.add(DrawerModel(drawable.qr_code, "My QR codes"))
    list.add(DrawerModel(drawable.notification_menu, "Notifications"))
    list.add(DrawerModel(drawable.post_it, "My Items"))
    list.add(DrawerModel(drawable.noun_info_1585217, "About us"))
    list.add(DrawerModel(drawable.phone_book, "Contact us"))
    list.add(DrawerModel(drawable.noun_logout_1262641, "Logout"))
    list.add(DrawerModel(drawable.noun_language_2712648, "Language"))
    list.add(BottomTextModel("How Does it work ?"))

    recycler_view.layoutManager = LinearLayoutManager(this)
    recycler_view.adapter = DrawerAdapter(this, list)
    val toggle = ActionBarDrawerToggle(
      this, drawerLayout,
      toolBar, string.navigation_drawer_open, string.navigation_drawer_close
    )
    toggle.syncState()
    drawerLayout.drawerElevation = 0.0f

    drawerLayout.addDrawerListener(object : DrawerListener {
      override fun onDrawerStateChanged(newState: Int) {

      }

      override fun onDrawerSlide(drawerView: View, slideOffset: Float) {
        Log.d("Mainjnibu", slideOffset.toString())
        main_activity_coordinator.translationX = slideOffset * drawerView.width
        drawerLayout.bringChildToFront(drawerView)
        drawerLayout.requestLayout()
        drawerLayout.setScrimColor(Color.TRANSPARENT)
      }

      override fun onDrawerClosed(drawerView: View) {
      }

      override fun onDrawerOpened(drawerView: View) {
      }
    })


  }

  fun chnageFabColor(fab: FloatingActionButton) {

  }
}
