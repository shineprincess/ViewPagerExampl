package com.shineprincess.viewpager.onboarding.screen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.shineprincess.viewpager.R
import kotlinx.android.synthetic.main.fragment_first_screen.view.*
import kotlinx.android.synthetic.main.fragment_second.view.*

class SecondScreen : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_second, container, false)

        val viewPager = activity?.findViewById<ViewPager2>(R.id.viewPager)

        view.tv_btn_next2.setOnClickListener {
            viewPager?.currentItem = 2
        }
        return view
    }


}