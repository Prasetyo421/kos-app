package com.didi.koskita.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.StringRes
import androidx.viewpager2.widget.ViewPager2
import com.didi.koskita.MainActivity
import com.didi.koskita.R
import com.didi.koskita.adapter.SectionsPagerAuthAdapter
import com.didi.koskita.databinding.ActivityAuthenticateBinding
import com.didi.koskita.helper.ZoomOutPageTransformer
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayout.OnTabSelectedListener
import com.google.android.material.tabs.TabLayoutMediator
import timber.log.Timber

class AuthenticateActivity : AppCompatActivity() {
    lateinit var binding: ActivityAuthenticateBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAuthenticateBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val sectionsPagerAdapter = SectionsPagerAuthAdapter(this)
        val viewPager: ViewPager2 = binding.viewpagger
        viewPager.setPageTransformer(ZoomOutPageTransformer())
        viewPager.adapter = sectionsPagerAdapter
        val tabs = binding.tabs
        TabLayoutMediator(tabs, viewPager){tab, position ->
            tab.text = resources.getString(TAB_TITTLES[position])
            Timber.i("tab: $position")
        }.attach()
//
//        with(binding){
//            tabs.addOnTabSelectedListener(TabLayout.ViewPagerOnTabSelectedListener())
//            viewPager.addOnLayoutChangeListener()
//        }

        binding.btnAuth.setOnClickListener {
            Intent(this, MainActivity::class.java).also { startActivity(it) }
        }

        binding.tabs.addOnTabSelectedListener(object : OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {
                Timber.i("tab: ${tab?.position}")
                when(tab?.position){
                    0 -> binding.btnAuth.text = resources.getString(R.string.sign_in)
                    1 -> binding.btnAuth.text = resources.getString(R.string.sign_up)
                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
                Timber.i("untab: ${tab?.position}")
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
                TODO("Not yet implemented")
            }

        })



    }

    companion object{
        @StringRes
        private val TAB_TITTLES = intArrayOf(
            R.string.sign_in,
            R.string.sign_up
        )
    }
}