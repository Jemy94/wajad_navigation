package com.example.wajadnagvigationbottom

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.menu_layout.view.item_icon
import kotlinx.android.synthetic.main.menu_layout.view.item_name

/**
 * Authored by Mohamed Fathy on 26 Sep, 2019.
 * Contact: m.fathy@rytalo.com
 * by Rytalo.
 */
class DrawerAdapter(private val menuList: List<DrawerModel>) :
  RecyclerView.Adapter<DrawerHolder>() {


  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DrawerHolder {
    val itemView: View =
      LayoutInflater.from(parent.context).inflate(R.layout.menu_layout, parent, false)
    return DrawerHolder(itemView)
  }

  override fun onBindViewHolder(holder: DrawerHolder, position: Int) {
    holder.myImage.setImageResource(menuList[position].icon)
    holder.myText.text = menuList[position].name
  }


  override fun getItemCount(): Int {
    return menuList.size
  }

}

class DrawerHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
  val myImage = itemView.item_icon
  val myText = itemView.item_name

}
