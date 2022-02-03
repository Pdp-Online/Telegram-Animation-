package com.example.telegramanimation.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import androidx.viewpager.widget.ViewPager.OnPageChangeListener
import com.airbnb.lottie.LottieAnimationView
import com.example.telegramanimation.R
import com.example.telegramanimation.adapter.ViewPagerAdapter
import com.example.telegramanimation.fragment.*
import com.google.android.material.tabs.TabLayout


class MainActivity() : AppCompatActivity() {

    private var viewPagerAdapter: ViewPagerAdapter? = null
    private var viewPager: ViewPager? = null
    private var tabLayout: TabLayout? = null

    private lateinit var lottieView:LottieAnimationView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()

    }

    private fun initViews() {

        lottieView = findViewById(R.id.lottie)

        viewPager = findViewById(R.id.viewPager_main)
        viewPagerAdapter = ViewPagerAdapter(supportFragmentManager)



        viewPagerAdapter!!.add(Fragment1())
        viewPagerAdapter!!.add(Fragment2())
        viewPagerAdapter!!.add(Fragment3())
        viewPagerAdapter!!.add(Fragment4())
        viewPagerAdapter!!.add(Fragment5())
        viewPagerAdapter!!.add(Fragment6())


        viewPager!!.setOnPageChangeListener(object : OnPageChangeListener {
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
                when(position) {
                    0 -> { lottieView.setAnimation("telegram.json") }
                    1 -> { lottieView.setAnimation("telegram_speed.json") }
                    2 -> { lottieView.setAnimation("telegram_free.json") }
                    3 -> { lottieView.setAnimation("telegram_powerful.json") }
                    4 -> { lottieView.setAnimation("telegram_security.json") }
                    5 -> { lottieView.setAnimation("telegram_cloud_based.json") }
                }
                lottieView.playAnimation()



            }

            override fun onPageSelected(position: Int) {


            }

            override fun onPageScrollStateChanged(state: Int) {

            }
        })

        viewPager!!.adapter = viewPagerAdapter

        tabLayout = findViewById(R.id.tab_main)
        tabLayout!!.setupWithViewPager(viewPager)






    }

}