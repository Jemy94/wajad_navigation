package com.example.wajadnagvigationbottom


import android.graphics.drawable.InsetDrawable
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import androidx.drawerlayout.widget.DrawerLayout.DrawerListener
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.wajadnagvigationbottom.R.drawable
import com.example.wajadnagvigationbottom.fragments.HomeFragment
import com.google.android.material.floatingactionbutton.FloatingActionButton
import kotlinx.android.synthetic.main.activity_main.drawer_layout
import kotlinx.android.synthetic.main.activity_main.recycler_view
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
    setSupportActionBar(toolBar)
    drawerLayout = drawer_layout

    val toggle = ActionBarDrawerToggle(
      this, drawerLayout,
      toolBar, R.string.navigation_drawer_open, R.string.navigation_drawer_close
    )
    drawerLayout.addDrawerListener(toggle)
    toggle.syncState()


    drawerLayout.addDrawerListener(object : DrawerListener {
      override fun onDrawerStateChanged(newState: Int) {

      }

      override fun onDrawerSlide(drawerView: View, slideOffset: Float) {
      }

      override fun onDrawerClosed(drawerView: View) {
      }

      override fun onDrawerOpened(drawerView: View) {
      }
    })
    list.add(0, HeaderModel(drawable.profile_image, "Mohamed Ahmed", "150 Points"))
    list.add(1, DrawerModel(drawable.home_menu, "Home"))
    list.add(2, DrawerModel(drawable.qr_code, "My QR codes"))
    list.add(3, DrawerModel(drawable.notification_menu, "Notifications"))
    list.add(4, DrawerModel(drawable.post_it, "My Items"))
    list.add(5, DrawerModel(drawable.noun_info_1585217, "About us"))
    list.add(6, DrawerModel(drawable.phone_book, "Contact us"))
    list.add(7, DrawerModel(drawable.noun_logout_1262641, "Logout"))
    list.add(8, DrawerModel(drawable.noun_language_2712648, "Language"))
    list.add(9, BottomTextModel("How Does it work ?"))

    val attrs = intArrayOf(android.R.attr.listDivider)

    val a = obtainStyledAttributes(attrs)
    val divider = a.getDrawable(0)
    val inset = resources.getDimensionPixelSize(R.dimen.divider_margin)
    val insetDivider = InsetDrawable(divider, inset, 0, inset, 0)
    a.recycle()

    val itemDecoration = DividerItemDecoration(this, DividerItemDecoration.VERTICAL)
    itemDecoration.setDrawable(insetDivider)

    recycler_view.layoutManager = LinearLayoutManager(this)
    recycler_view.addItemDecoration(itemDecoration)
    recycler_view.adapter = DrawerAdapter(this, list)


  }

  fun chnageFabColor(fab: FloatingActionButton) {

  }
}
