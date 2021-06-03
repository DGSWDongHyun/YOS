package kr.hs.dgsw.donghyeon.yos.viewmodel.adapters

import android.text.Layout
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
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

class PositionViewHolder(val view : ItemPositionBinding, val viewModel : PositionViewModel) : RecyclerView.ViewHolder(view.root) {
    fun bind(data : CompetitiveData) {
        viewModel.bind(data)

        Glide.with(view.tierImageView.context).load(data.rankIcon).into(view.tierImageView)
        Glide.with(view.roleIcon.context).load(data.roleIcon).into(view.roleIcon)
        view.srTextView.text = "${data.scoreRole}점"
        view.roleName.text = roleConverter(data.role!!)
    }

    fun roleConverter(role : String) : String {
        return if(role == "damage") "딜러" else if(role == "support") "힐러" else "탱커"
    }
}