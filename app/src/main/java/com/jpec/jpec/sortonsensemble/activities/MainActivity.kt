package com.jpec.jpec.sortonsensemble.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import com.jpec.jpec.sortonsensemble.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setFlipperImage()
    }

    private fun loadImages(){
        val banImgs = listOf(R.drawable.db, R.drawable.hxh)
        for (img in banImgs){
            val imageView = ImageView(this)
            imageView.setBackgroundResource(img)
            viewFlipper.addView(imageView)
        }
    }

    private fun setFlipperImage(){
        loadImages()
        viewFlipper.setFlipInterval(4000)
        viewFlipper.isAutoStart = true
        viewFlipper.inAnimation = AnimationUtils.loadAnimation(this, android.R.anim.slide_in_left)
        viewFlipper.outAnimation = AnimationUtils.loadAnimation(this, android.R.anim.slide_out_right)
    }
}
