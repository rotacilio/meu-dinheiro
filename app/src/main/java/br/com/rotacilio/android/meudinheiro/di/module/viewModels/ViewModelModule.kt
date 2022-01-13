package br.com.rotacilio.android.meudinheiro.di.module.viewModels

import br.com.rotacilio.android.meudinheiro.ui.home.cards.CardsViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
     viewModel { CardsViewModel(get(), get()) }
}