package br.com.rotacilio.android.meudinheiro.ui.home.cards

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.rotacilio.android.meudinheiro.components.BaseFragment
import br.com.rotacilio.android.meudinheiro.databinding.FragmentCardsBinding

class CardsFragment : BaseFragment() {

    private lateinit var binding: FragmentCardsBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCardsBinding.inflate(inflater, container, false)
        return binding.root
    }

    companion object {
        fun newInstance(): CardsFragment = CardsFragment()
    }
}