package kr.hs.dgsw.donghyeon.yos.viewmodel.adapters

import android.text.Layout
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import kr.hs.dgsw.donghyeon.domain.entity.subdata.CompetitiveData
import kr.hs.dgsw.donghyeon.yos.R
import kr.hs.dgsw.donghyeon.yos.base.view.BaseAdapter
import kr.hs.dgsw.donghyeon.yos.databinding.ItemPositionBinding

class PositionAdapter(val positionArrayList: ArrayList<CompetitiveData> = arrayListOf())
    : BaseAdapter<PositionViewHolder, ItemPositionBinding, PositionViewModel>(positionArrayList) {

    fun setData(positionArrayList: ArrayList<CompetitiveData>) {
        this.positionArrayList.run {
            clear()
            addAll(positionArrayList)
        }
        notifyDataSetChanged()
    }

    override val viewModel: PositionViewModel
        get() = PositionViewModel()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PositionViewHolder
            = PositionViewHolder(ItemPositionBinding.inflate(LayoutInflater.from(parent.context)), viewModel)

    override fun onBindViewHolder(holder: PositionViewHolder, position: Int) {
        holder.bind(positionArrayList[position])
    }
}

class PositionViewHolder(viewDataBinding : ViewDataBinding, val viewModel : PositionViewModel) : RecyclerView.ViewHolder(viewDataBinding.root) {
    fun bind(data : CompetitiveData) {
        viewModel.bind(data)
    }
}