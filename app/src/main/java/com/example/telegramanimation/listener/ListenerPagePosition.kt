package com.example.telegramanimation.listener

import androidx.viewpager.widget.ViewPager
import kotlin.properties.Delegates

open class ListenerPagePosition : ViewPager.SimpleOnPageChangeListener() {

    private var currentPage:Int = 0

    override fun onPageSelected(position: Int) {
        currentPage = position
    }

    fun getCurrentPage():Int {
        return currentPage
    }
}