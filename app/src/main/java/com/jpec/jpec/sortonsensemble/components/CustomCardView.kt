package com.jpec.jpec.sortonsensemble.components

import android.content.Context
import android.util.AttributeSet
import androidx.constraintlayout.widget.ConstraintLayout
import com.jpec.jpec.sortonsensemble.R
import kotlinx.android.synthetic.main.custom_card_view.view.*

class CustomCardView(context: Context, attrs: AttributeSet) : ConstraintLayout(context, attrs){

    //The init tag will be automatically executed after the instantiation of the object in Kotlin
    init {
        inflate(context, R.layout.custom_card_view, this)

        val attributes = context.obtainStyledAttributes(attrs, R.styleable.CustomCardView)
//        imageView.setImageDrawable(attributes.getDrawable(R.styleable.BenefitView_image))
        title.text = attributes.getString(R.styleable.CustomCardView_title)
        contentText.text = attributes.getString(R.styleable.CustomCardView_contentText)

        //Don't forget to recycle the attributes, it is necessary for android memory management
        attributes.recycle()

    }
}