package br.com.rotacilio.android.meudinheiro.ui.home.expenses

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.rotacilio.android.meudinheiro.components.BaseFragment
import br.com.rotacilio.android.meudinheiro.databinding.FragmentExpensesBinding

class ExpensesFragment : BaseFragment() {

    private lateinit var binding: FragmentExpensesBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentExpensesBinding.inflate(inflater, container, false)
        return binding.root
    }
}