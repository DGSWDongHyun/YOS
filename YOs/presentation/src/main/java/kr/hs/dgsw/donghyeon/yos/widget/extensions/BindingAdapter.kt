package kr.hs.dgsw.donghyeon.yos.widget.extensions

import android.view.View
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.airbnb.lottie.LottieAnimationView
import com.bumptech.glide.Glide

class BindingAdapter {
    companion object {

        @BindingAdapter("bind:visibleToView")
        @JvmStatic
        fun visibleView(view : View?, hasVisible : Boolean) {
            view?.visibility = if(hasVisible) View.VISIBLE else View.GONE
        }

        @BindingAdapter("bind:loadImage")
        @JvmStatic
        fun bindImage(imageView : ImageView?, url : String?) {
            Glide.with(imageView!!.context).load(url).into(imageView)
        }
    }
}