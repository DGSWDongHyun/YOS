package kr.hs.dgsw.donghyeon.yos.view.fragments

import android.view.View
import androidx.lifecycle.Observer
import androidx.navigation.fragment.navArgs
import kr.hs.dgsw.donghyeon.yos.R
import kr.hs.dgsw.donghyeon.yos.base.view.BaseFragment
import kr.hs.dgsw.donghyeon.yos.databinding.FragmentSearchedBinding
import kr.hs.dgsw.donghyeon.yos.viewmodel.fragments.SearchedViewModel
import kr.hs.dgsw.donghyeon.yos.viewmodelfactory.fragments.SearchedViewModelFactory
import kr.hs.dgsw.donghyeon.yos.widget.extensions.fragment.getViewModel
import javax.inject.Inject

class SearchedFragment @Inject constructor(

) : BaseFragment<FragmentSearchedBinding, SearchedViewModel>() {

    val searchedResult : SearchedFragmentArgs by navArgs()

    @Inject
    lateinit var viewModelFactory: SearchedViewModelFactory

    override val viewModel: SearchedViewModel
        get() = getViewModel(viewModelFactory)
    override val layoutRes: Int
        get() = R.layout.fragment_searched

    override fun observeViewModel(view: FragmentSearchedBinding) {
        with(viewModel) {
            loadSearchedResponse(searchedResult.type, searchedResult.battleTag)
        }
    }
}