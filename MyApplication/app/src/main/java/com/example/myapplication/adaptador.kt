package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class adaptador(fa:FragmentActivity):FragmentStateAdapter(fa) {



    override fun getItemCount(): Int =3

    override fun createFragment(position: Int): Fragment {

        var fragmento = BlankFragment()

        fragmento.arguments = Bundle().apply {
            putInt(ARG_OBJECT,position)
        }

        return fragmento
    }

    companion object{
        private const val ARG_OBJECT ="object"
    }

}