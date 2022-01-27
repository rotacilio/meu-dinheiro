package br.com.rotacilio.android.meudinheiro.ui.home.cards

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.rotacilio.android.meudinheiro.adapters.CardsListAdapter
import br.com.rotacilio.android.meudinheiro.components.BaseFragment
import br.com.rotacilio.android.meudinheiro.databinding.FragmentCardsBinding
import br.com.rotacilio.android.meudinheiro.utils.Status
import org.koin.android.viewmodel.ext.android.viewModel

class CardsFragment : BaseFragment() {

    private val viewModel: CardsViewModel by viewModel()
    private lateinit var binding: FragmentCardsBinding
    private lateinit var adapter: CardsListAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCardsBinding.inflate(inflater, container, false)
        adapter = CardsListAdapter()
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.idRecyclerViewCards.adapter = adapter
        setupObservers()
    }

    private fun setupObservers() {
        viewModel.apply {
            cards.observe(viewLifecycleOwner) {
                when (it.status) {
                    Status.ERROR -> {
                        Log.e(TAG, "Error: ${it.message}")
                    }
                    Status.LOADING -> {
                        Log.i(TAG, "loading cards...")
                    }
                    Status.SUCCESS -> {
                        Log.d(TAG, "Cards: ${it.data?.size}")
                        it.data?.let { cards ->
                            adapter.data = cards
                        }
                    }
                }
            }
        }
    }

    companion object {
        const val TAG = "[CardsFragment]"
    }
}