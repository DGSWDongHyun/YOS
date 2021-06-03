package kr.hs.dgsw.donghyeon.yos.widget.extensions

import android.view.View
import android.widget.Adapter
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.airbnb.lottie.LottieAnimationView
import com.bumptech.glide.Glide

class BindingAdapter {
    companion object {

        @BindingAdapter("bind:setAdapter")
        @JvmStatic
        fun setAdapter(recyclerView: RecyclerView?, adapter: RecyclerView.Adapter<*>?) {
            recyclerView?.adapter = adapter
            recyclerView?.layoutManager = LinearLayoutManager(recyclerView?.context, LinearLayoutManager.HORIZONTAL, false)
        }

        @BindingAdapter("bind:refreshStatus")
        @JvmStatic
        fun refreshStatus(swipeRefreshLayout: SwipeRefreshLayout?, isCompleted : Boolean) {
            if(isCompleted)
                swipeRefreshLayout?.isRefreshing = false
        }

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