package kr.hs.dgsw.donghyeon.yos.view.custom

import android.content.Context
import android.graphics.Canvas
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import kr.hs.dgsw.donghyeon.yos.R

class LoadingProgressView @JvmOverloads
    constructor(context: Context, attrs: AttributeSet? = null, defStyle: Int = 0 ) : ConstraintLayout(context, attrs, defStyle) {

    init {
        init()
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
    }

    private fun init() {
        val layoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val view = layoutInflater.inflate(R.layout.view_progress, this, false)
        addView(view)
    }
}