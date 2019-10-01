package com.example.wajadnagvigationbottom

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.view_pager_layout.view.view_pager_container

/**
 * Authored by Mohamed Fathy on 01 Oct, 2019.
 * Contact: m.fathy@rytalo.com
 * by Rytalo.
 */
class ViewPagerAdapter : RecyclerView.Adapter<ViewPagerHolder>() {


  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerHolder =
    ViewPagerHolder(
      LayoutInflater.from(parent.context).inflate(
        R.layout.view_pager_layout,
        parent,
        false
      )
    )

  override fun getItemCount(): Int =Int.MAX_VALUE

  override fun onBindViewHolder(holder: ViewPagerHolder, position: Int)=holder.itemView.run{
    if (position ==0){
      view_pager_container.setBackgroundResource(R.drawable.onboarding_1)
    }
    if (position ==1){
      view_pager_container.setBackgroundResource(R.drawable.onboarding_2)
    }
    if (position ==2){
      view_pager_container.setBackgroundResource(R.drawable.onboarding_3)
    }

  }
}

class ViewPagerHolder(itemView: View) : RecyclerView.ViewHolder(itemView)