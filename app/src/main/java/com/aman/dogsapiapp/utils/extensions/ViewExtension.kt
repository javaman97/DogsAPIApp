package com.aman.dogsapiapp.utils.extensions

import android.content.Context
import android.view.View
import android.widget.ImageView
import com.bumptech.glide.Glide


fun ImageView.load(imageUrl: String, context:Context) {
//   this.load(imageUrl){
//       placeholder(R.drawable.loading_dog)
//       error(R.drawable.dog_error)
//   }

    Glide.with(context)
        .load(imageUrl)
        .into(this)

}

fun View.setVisible(){
    this.visibility = View.VISIBLE
}

fun View.setInvisible(){
    this.visibility = View.INVISIBLE
}