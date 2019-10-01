package com.example.wajadnagvigationbottom

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.bottom_layout.view.bottom_text
import kotlinx.android.synthetic.main.menu_layout.view.item_icon
import kotlinx.android.synthetic.main.menu_layout.view.item_name
import kotlinx.android.synthetic.main.side_menu_header.view.user_image
import kotlinx.android.synthetic.main.side_menu_header.view.user_name
import kotlinx.android.synthetic.main.side_menu_header.view.user_points

/**
 * Authored by Ahmed Gamal on 26 Sep, 2019.
 * Contact: a.gamal@smartappco.com
 */
class DrawerAdapter(private val context: Context, private val menuList: List<Any>) :
  RecyclerView.Adapter<RecyclerView.ViewHolder>() {

  companion object {
    private const val TYPE_HEADER = 0
    private const val TYPE_ITEMS = 1
    private const val TYPE_BOTTOM = 2
  }

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = when (viewType) {

    TYPE_HEADER -> HeaderHolder(
      LayoutInflater.from(parent.context)
        .inflate(R.layout.side_menu_header, parent, false)
    )
    TYPE_ITEMS -> DrawerHolder(
      LayoutInflater.from(parent.context)
        .inflate(R.layout.menu_layout, parent, false)
    )

    TYPE_BOTTOM -> BottomHolder(
      LayoutInflater.from(parent.context)
        .inflate(R.layout.bottom_layout, parent, false)
    )
    else -> throw IllegalArgumentException()
  }

  override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
    when (holder.itemViewType) {
      TYPE_HEADER -> onBindHeader(holder, menuList[position] as HeaderModel)
      TYPE_ITEMS -> onBindItems(holder, menuList[position] as DrawerModel)
      TYPE_BOTTOM -> onBindBottomText(holder, menuList[position] as BottomTextModel)
      else -> throw IllegalArgumentException()
    }
  }

  private fun onBindHeader(holder: RecyclerView.ViewHolder, row: HeaderModel) {
    val headerRow = holder as HeaderHolder
    headerRow.userImage.setImageResource(row.image)
    headerRow.userName.text = row.name
    headerRow.userPoints.text = row.points
  }

  private fun onBindItems(holder: RecyclerView.ViewHolder, row: DrawerModel) {
    val headerRow = holder as DrawerHolder
    headerRow.myImage.setImageResource(row.icon)
    headerRow.myText.text = row.name
  }

  private fun onBindBottomText(holder: RecyclerView.ViewHolder, row: BottomTextModel) {
    val headerRow = holder as BottomHolder
    headerRow.question.text = row.bottomText
  }


  override fun getItemCount(): Int {
    return menuList.size
  }

  override fun getItemViewType(position: Int): Int {
    val obj = menuList[position]
    return when (obj) {
      is DrawerModel -> TYPE_ITEMS
      is HeaderModel -> TYPE_HEADER
      else -> TYPE_BOTTOM
    }
  }

}

class DrawerHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
  val myImage = itemView.item_icon
  val myText = itemView.item_name
}

class HeaderHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
  val userImage = itemView.user_image
  val userName = itemView.user_name
  val userPoints = itemView.user_points
}

class BottomHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
  val question = itemView.bottom_text
}


