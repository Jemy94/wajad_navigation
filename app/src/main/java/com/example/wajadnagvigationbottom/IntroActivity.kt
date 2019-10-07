package com.example.wajadnagvigationbottom

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import kotlinx.android.synthetic.main.activity_intro.on_boarding_next_button
import kotlinx.android.synthetic.main.activity_intro.view_pager
import setParallaxTransformation

class IntroActivity : AppCompatActivity() {
  private val onBoardingList =ArrayList<ViewPagerModel>()
  private val numberOfPages = 3
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_intro)

    onBoardingList.add(ViewPagerModel(R.drawable.ic_onboarding_1,"Lost & Found \n items","ahmed gamal ahmed"))
    onBoardingList.add(ViewPagerModel(R.drawable.ic_onboarding_2,"Prevent to lose \n your item","opopopo gamal ahmed"))
    onBoardingList.add(ViewPagerModel(R.drawable.ic_onboarding_3,"Wajad Zone ","ablab lba lbal lbalbl"))
    setUpSlider(view_pager)
    view_pager.adapter = ViewPagerAdapter(onBoardingList)

    on_boarding_next_button.setOnClickListener {
      view_pager.currentItem = view_pager.currentItem + 1
        if( view_pager.currentItem ==2){
          on_boarding_next_button.text="done"
        }
      if (view_pager.currentItem > 2) {
        val i = Intent(this, MainActivity::class.java)
        startActivity(i)
      }
    }
  }

  private fun setUpSlider(view: View) {
    with(view_pager) {
      adapter = ViewPagerAdapter(onBoardingList)
      setPageTransformer { page, position ->
        setParallaxTransformation(page, position)
      }

      addSlideChangeListener()

    }
  }

  private fun addSlideChangeListener() {

    view_pager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
      override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
        super.onPageScrolled(position, positionOffset, positionOffsetPixels)
        if (numberOfPages > 1) {
          val newProgress = (position + positionOffset) / (numberOfPages - 1)
        }
      }
    })
  }
}

