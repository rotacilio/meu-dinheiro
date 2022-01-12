package br.com.rotacilio.android.meudinheiro.ui.home.expenses

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import br.com.rotacilio.android.meudinheiro.databinding.FragmentExpensesBinding

class ExpensesFragment : Fragment() {

    private lateinit var binding: FragmentExpensesBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentExpensesBinding.inflate(inflater, container, false)
        return binding.root
    }

    companion object {
        fun newInstance(): ExpensesFragment = ExpensesFragment()
    }
}