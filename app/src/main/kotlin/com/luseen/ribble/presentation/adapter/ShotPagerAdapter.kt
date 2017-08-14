package com.luseen.ribble.presentation.adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.luseen.ribble.di.scope.PerActivity
import com.luseen.ribble.presentation.screen.popular_shot.PopularShotFragment
import com.luseen.ribble.presentation.screen.recent_shot.RecentShotFragment
import javax.inject.Inject

/**
 * Created by Chatikyan on 06.08.2017.
 */
@PerActivity
class ShotPagerAdapter @Inject constructor(fragmentManager: FragmentManager) : FragmentPagerAdapter(fragmentManager) {

    private val titles = listOf("Popular", "Recent")

    override fun getItem(position: Int): Fragment {
        return if (position == 0)
            PopularShotFragment.newInstance()
        else
            RecentShotFragment()
    }

    override fun getCount(): Int = titles.count()

    override fun getPageTitle(position: Int): CharSequence {
        return titles[position]
    }
}