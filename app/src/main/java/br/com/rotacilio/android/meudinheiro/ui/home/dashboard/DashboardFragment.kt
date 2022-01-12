package br.com.rotacilio.android.meudinheiro.ui.home.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.rotacilio.android.meudinheiro.components.BaseFragment
import br.com.rotacilio.android.meudinheiro.databinding.FragmentDashboardBinding

class DashboardFragment : BaseFragment() {

    private lateinit var binding: FragmentDashboardBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDashboardBinding.inflate(inflater, container, false)
        return binding.root
    }

    companion object {
        fun newInstance(): DashboardFragment = DashboardFragment()
    }
}