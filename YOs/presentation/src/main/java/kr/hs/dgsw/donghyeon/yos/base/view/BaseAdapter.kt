package kr.hs.dgsw.donghyeon.yos.base.view

import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.RecyclerView

abstract class BaseAdapter<VH : RecyclerView.ViewHolder, VB : ViewDataBinding, VM : ViewModel>(val arrayList: ArrayList<*>) : RecyclerView.Adapter<VH>() {

    abstract val viewModel : VM

    override fun getItemCount(): Int = arrayList.size
}