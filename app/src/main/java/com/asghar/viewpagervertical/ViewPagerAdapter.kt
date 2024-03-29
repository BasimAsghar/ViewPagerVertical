package com.asghar.viewpagervertical

import android.annotation.SuppressLint
import android.content.Context
import android.support.v4.view.PagerAdapter
import android.support.v4.view.ViewPager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView

class ViewPagerAdapter(private val context : Context) : PagerAdapter() {
    private var layoutInflater : LayoutInflater? = null
    val Image = arrayOf(R.drawable.beginnerballerbg , R.drawable.desiredleaguebg , R.drawable.exercisebg, R.drawable.beginnerballerbg , R.drawable.desiredleaguebg , R.drawable.exercisebg)

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view ===  `object`
    }

    override fun getCount(): Int {
        return Image.size
    }

    @SuppressLint("InflateParams")
    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        layoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val v = layoutInflater!!.inflate(R.layout.viewpager_activity , null)
        val image = v.findViewById<View>(R.id.imageview) as ImageView
        //Overrode ViewPage with VerticalViewPage so no longer need to rotate
        //v.rotation = -90f

        image.setImageResource(Image[position])
        val vp = container as ViewPager
        //vp.rotation = 90F
        vp.addView(v , 0)


        return v

    }


    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        val vp = container as ViewPager
        val v = `object` as View
        vp.removeView(v)
    }
}