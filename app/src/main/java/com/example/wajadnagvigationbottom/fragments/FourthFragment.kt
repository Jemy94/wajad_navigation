package com.example.wajadnagvigationbottom.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat.getColor
import androidx.fragment.app.Fragment
import com.example.wajadnagvigationbottom.R
import kotlinx.android.synthetic.main.common_layout.common
import kotlinx.android.synthetic.main.common_layout.main_text

/**
 * Authored by Ahmed Gamal on 18 Sep, 2019.
 *
 */
class FourthFragment : Fragment() {
  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? =
    inflater.inflate(R.layout.common_layout, container, false)

  override fun onActivityCreated(savedInstanceState: Bundle?) {
    super.onActivityCreated(savedInstanceState)
    main_text.text = "Profile"
    common.setBackgroundColor(getColor(activity!!, android.R.color.darker_gray))
  }
}