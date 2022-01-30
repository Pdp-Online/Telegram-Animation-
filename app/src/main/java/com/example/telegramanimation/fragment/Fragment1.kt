package com.example.telegramanimation.fragment

import android.os.Bundle
import android.provider.Contacts.SettingsColumns.KEY
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.airbnb.lottie.LottieAnimationView
import com.example.telegramanimation.R


class Fragment1 : Fragment() {


    private val KEY = "key"

    companion object{
        fun newInstance(n:Int): Fragment1{
            val fragment1 = Fragment1()
            val bundle = Bundle()
            bundle.putInt(KEY,n)
            fragment1.arguments = bundle
            return fragment1
        }
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_1, container, false)
        initViews(view)

        return view
    }


    private fun initViews(view: View) {


    }



}