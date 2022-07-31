package com.didi.koskita.presentation.home

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.didi.koskita.presentation.reminder.ReminderFragment
import com.didi.koskita.presentation.rule.RuleFragment

class SectionsPagerHomeAdapter(fragment: Fragment): FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int = 2

    override fun createFragment(position: Int): Fragment {
        var fragment: Fragment? = null
        when(position){
            0 -> {
                fragment = ReminderFragment()
            }
            1 -> {
                fragment = RuleFragment()
            }
        }

        return fragment as Fragment
    }
}