package com.example.wajadnagvigationbottom

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.view_pager_layout.view.on_boarding_description_text_view
import kotlinx.android.synthetic.main.view_pager_layout.view.on_boarding_image_view
import kotlinx.android.synthetic.main.view_pager_layout.view.on_boarding_title_text_view


/**
 * Authored by Mohamed Fathy on 01 Oct, 2019.
 * Contact: m.fathy@rytalo.com
 * by Rytalo.
 */
class ViewPagerAdapter(private val onBoardingList: ArrayList<ViewPagerModel>) :
  RecyclerView.Adapter<ViewPagerHolder>() {


  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerHolder =
    ViewPagerHolder(
      LayoutInflater.from(parent.context).inflate(
        R.layout.view_pager_layout,
        parent,
        false
      )
    )

  override fun getItemCount(): Int{
    return onBoardingList.size
  }

  override fun onBindViewHolder(holder: ViewPagerHolder, position: Int) {
    holder.image.setImageResource(onBoardingList[position].image)
    holder.title.text = onBoardingList[position].title
    holder.description.text = onBoardingList[position].description

    /* if (position ==0){
       holder.image.setImageResource(R.drawable.ic_onboarding_1)
       holder.title.text = "Lost & Found \n items"
       holder.description.text = "ahmed gamal ahmed ali"
     }
     if (position ==1){
       holder.image.setImageResource(R.drawable.ic_onboarding_2)
       holder.title.text = "Prevent to lose \n your item"
       holder.description.text = "apkpkfpekfpekpekfpi"
     }
     if (position ==2){
       holder.image.setImageResource(R.drawable.ic_onboarding_3)
       holder.title.text = "Wajad Zone "
       holder.description.text = "gfgfgkfgjfkgfkgjfkgjfkgjfk"
     }*/
  }
  /* override fun onBindViewHolder(holder: ViewPagerHolder, position: Int)=holder.itemView.run{
     if (position ==0){
      view_pager_container.setImageResource(R.drawable.ic_onboarding_2)
     }
     if (position ==1){
       view_pager_container.setImageResource(R.drawable.ic_onboarding_2)
     }
     if (position ==2){
       view_pager_container.setImageResource(R.drawable.ic_onboarding_3)
     }

   }*/
}

class ViewPagerHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
  val image: ImageView = itemView.on_boarding_image_view
  val title: TextView = itemView.on_boarding_title_text_view
  val description: TextView = itemView.on_boarding_description_text_view
}