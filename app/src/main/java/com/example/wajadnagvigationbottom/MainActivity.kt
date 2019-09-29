package com.example.wajadnagvigationbottom


import android.os.Bundle
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.wajadnagvigationbottom.fragments.HomeFragment
import com.google.android.material.floatingactionbutton.FloatingActionButton
import kotlinx.android.synthetic.main.activity_main.drawer_layout
import kotlinx.android.synthetic.main.activity_main.recycler_view
import kotlinx.android.synthetic.main.activity_main.toolbar

class MainActivity : AppCompatActivity() {

  private val list = mutableListOf<DrawerModel>()
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
    setSupportActionBar(toolBar)
    drawerLayout = drawer_layout

    val toggle = ActionBarDrawerToggle(
      this, drawerLayout,
      toolBar, R.string.navigation_drawer_open, R.string.navigation_drawer_close
    )
    drawerLayout.addDrawerListener(toggle)
    toggle.syncState()

    list.add(0, DrawerModel(R.drawable.home_menu, "Home"))
    list.add(1, DrawerModel(R.drawable.qr_code, "My QR codes"))
    list.add(2, DrawerModel(R.drawable.notification_menu, "Notifications"))
    list.add(3, DrawerModel(R.drawable.post_it, "My Items"))
    list.add(4, DrawerModel(R.drawable.noun_info_1585217, "About us"))
    list.add(5, DrawerModel(R.drawable.phone_book, "Contact us"))
    list.add(6, DrawerModel(R.drawable.noun_logout_1262641, "Logout"))
    list.add(7, DrawerModel(R.drawable.noun_language_2712648, "Language"))

    recycler_view.layoutManager = LinearLayoutManager(this)
    recycler_view.adapter = DrawerAdapter(list)


  }

  fun chnageFabColor(fab: FloatingActionButton) {

  }
}
