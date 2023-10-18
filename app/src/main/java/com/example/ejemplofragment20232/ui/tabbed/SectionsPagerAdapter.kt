package com.example.ejemplofragment20232.ui.tabbed

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.ejemplofragment20232.R
import com.example.ejemplofragment20232.ui.batman.BatmanFragment
import com.example.ejemplofragment20232.ui.flash.FlashFragment
import com.example.ejemplofragment20232.ui.superman.SupermanFragment
import com.example.ejemplofragment20232.ui.wonderwoman.WonderWomanFragment

private val TAB_TITLES = arrayOf(
    R.string.batman_date,
    R.string.flash_date,
    R.string.superman_date,
    R.string.wonderwoman_date,
)

class SectionsPagerAdapter (private val context: Context, fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        return when(position) {
            0 -> BatmanFragment()
            1 -> FlashFragment()
            2 -> SupermanFragment()
            else -> WonderWomanFragment()
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return context.resources.getString(TAB_TITLES[position])
    }

    override fun getCount(): Int {
        return 4
    }

}


