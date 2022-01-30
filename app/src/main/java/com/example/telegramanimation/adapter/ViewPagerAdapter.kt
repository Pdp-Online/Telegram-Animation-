package com.example.telegramanimation.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.telegramanimation.fragment.Fragment1
import com.example.telegramanimation.fragment.Fragment2
import com.example.telegramanimation.fragment.Fragment3

class ViewPagerAdapter(fragmentManager: FragmentManager):FragmentPagerAdapter(fragmentManager) {


    private val fragments: MutableList<Fragment> = ArrayList()

    fun add(fragment: Fragment) {
        fragments.add(fragment)
    }

    override fun getCount(): Int {
        return fragments.size
    }

    override fun getItem(position: Int): Fragment {
        return fragments[position]
    }



}