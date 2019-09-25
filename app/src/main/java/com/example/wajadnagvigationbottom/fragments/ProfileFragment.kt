package com.example.wajadnagvigationbottom.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.getColor
import androidx.core.graphics.drawable.DrawableCompat
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.wajadnagvigationbottom.MainActivity
import com.example.wajadnagvigationbottom.R
import kotlinx.android.synthetic.main.activity_main.home_button
import kotlinx.android.synthetic.main.activity_main.notification
import kotlinx.android.synthetic.main.activity_main.profile
import kotlinx.android.synthetic.main.activity_main.qr_code
import kotlinx.android.synthetic.main.common_layout.common
import kotlinx.android.synthetic.main.common_layout.main_text

/**
 * Authored by Ahmed Gamal on 18 Sep, 2019.
 *
 */
class ProfileFragment : Fragment() {
  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? =
    inflater.inflate(R.layout.common_layout, container, false)

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)

    val naveController = Navigation.findNavController(view)

    (activity as MainActivity).qr_code.setOnClickListener {
      naveController.navigate(R.id.action_fourthFragment_to_thirdFragment)
    }

    (activity as MainActivity).notification.setOnClickListener {
      naveController.navigate(R.id.action_fourthFragment_to_secondFragment)
    }

    (activity as MainActivity).home_button.setOnClickListener {
      naveController.navigate(R.id.action_fourthFragment_to_firstFragment)
    }

    (activity as MainActivity).profile.setOnClickListener {
      return@setOnClickListener
    }
  }

  override fun onActivityCreated(savedInstanceState: Bundle?) {
    super.onActivityCreated(savedInstanceState)
    main_text.text = "Profile"
    common.setBackgroundColor(getColor(activity!!, android.R.color.darker_gray))

    (activity as MainActivity).home_button.animate()
      .setDuration(200)
      .scaleX(1.0f)
      .scaleY(1.0f)
      .start()
    (activity as MainActivity).notification.animate()
      .setDuration(200)
      .scaleX(1.0f)
      .scaleY(1.0f)
      .start()
    (activity as MainActivity).qr_code.animate()
      .setDuration(200)
      .scaleX(1.0f)
      .scaleY(1.0f)
      .start()
    (activity as MainActivity).profile.animate()
      .setDuration(200)
      .scaleX(1.2f)
      .scaleY(1.2f)
      .start()

    (activity as MainActivity).home_button.background =
      ContextCompat.getDrawable(activity!!, R.drawable.float_button_unselected)
    (activity as MainActivity).notification.background =
      ContextCompat.getDrawable(activity!!, R.drawable.float_button_unselected)
    (activity as MainActivity).qr_code.background =
      ContextCompat.getDrawable(activity!!, R.drawable.float_button_unselected)
    (activity as MainActivity).profile.background =
      ContextCompat.getDrawable(activity!!, R.drawable.float_button_selected)

    DrawableCompat.setTint(
      (activity as MainActivity).home_button.drawable,
      getColor(activity!!, R.color.gray)
    )
    DrawableCompat.setTint(
      (activity as MainActivity).notification.drawable,
      getColor(activity!!, R.color.gray)
    )
    DrawableCompat.setTint(
      (activity as MainActivity).qr_code.drawable,
      getColor(activity!!, R.color.gray)
    )
    DrawableCompat.setTint(
      (activity as MainActivity).profile.drawable,
      getColor(activity!!, R.color.white)
    )


  }
}