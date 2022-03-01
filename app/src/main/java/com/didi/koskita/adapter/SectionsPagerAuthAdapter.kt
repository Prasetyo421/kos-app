package com.didi.koskita.adapter

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.didi.koskita.fragment.SignInFragment
import com.didi.koskita.fragment.SignUpFragment

class SectionsPagerAuthAdapter(activity: AppCompatActivity): FragmentStateAdapter(activity) {
    override fun getItemCount(): Int = 2

    override fun createFragment(position: Int): Fragment {
        Log.i("test", position.toString())
        var fragment: Fragment? = null
        when (position){
            0 -> {
                fragment = SignInFragment.newInstance(position)
//                fragment = SignInFragment()
//                fragment.arguments = Bundle().apply {
//                    putInt(SignInFragment.ARG)
//                }
            }
            1 -> fragment = SignUpFragment.newInstance(position)
        }

        return fragment as Fragment
    }
}