package kr.hs.dgsw.donghyeon.yos.widget.extensions.activity

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

fun AppCompatActivity.finishAndStartActivity(intent : Intent, activity: Activity) {
    activity.finish()
    activity.startActivity(intent)
}

inline fun <reified T: ViewModel> AppCompatActivity.getViewModel(factory: ViewModelProvider.Factory): T {
    return ViewModelProvider(this, factory)[T::class.java]
}