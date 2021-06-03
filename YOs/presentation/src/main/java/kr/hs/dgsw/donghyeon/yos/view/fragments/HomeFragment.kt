package kr.hs.dgsw.donghyeon.yos.view.fragments

import android.widget.SearchView
import androidx.navigation.fragment.findNavController
import kr.hs.dgsw.donghyeon.yos.R
import kr.hs.dgsw.donghyeon.yos.base.view.BaseFragment
import kr.hs.dgsw.donghyeon.yos.databinding.FragmentHomeBinding
import kr.hs.dgsw.donghyeon.yos.viewmodel.fragments.HomeViewModel
import kr.hs.dgsw.donghyeon.yos.viewmodelfactory.fragments.HomeViewModelFactory
import kr.hs.dgsw.donghyeon.yos.widget.extensions.fragment.getViewModel
import javax.inject.Inject

class HomeFragment @Inject constructor(

) : BaseFragment<FragmentHomeBinding, HomeViewModel>() {

    @Inject
    lateinit var viewModelFactory : HomeViewModelFactory

    override val viewModel: HomeViewModel
        get() = getViewModel(viewModelFactory)
    override val layoutRes: Int
        get() = R.layout.fragment_home

    override fun observeViewModel(view: FragmentHomeBinding) {
        view.searchProfileView.setQuery("ØBJƐCŦEĐ-1215", false)

        view.searchProfileView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                if(!query.isNullOrEmpty()) {
                    findNavController().navigate(HomeFragmentDirections.actionArgs("pc", query))
                }
                return true
            }

            override fun onQueryTextChange(newText: String?): Boolean = false // no task on here.
        })
    }
}