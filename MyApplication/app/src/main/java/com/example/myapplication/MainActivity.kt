package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.style.TabStopSpan
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    lateinit var vplayaut:ViewPager2
    lateinit var tblayaut:TabLayout

    private val adatador by lazy {
        adaptador(this)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        vplayaut=findViewById(R.id.vp_layaout)
        tblayaut=findViewById(R.id.tb_layaot)

        vplayaut.adapter = adatador
        var mitabla = TabLayoutMediator(tblayaut,vplayaut,TabLayoutMediator.TabConfigurationStrategy{
            tab,position ->
            when (position) {
                0->{
                  tab.text="1"
                }
                1->{
                   tab.text="2"
                }
                2->{
                    tab.text="3"
                }
            }
        })
        mitabla.attach()


    }
}