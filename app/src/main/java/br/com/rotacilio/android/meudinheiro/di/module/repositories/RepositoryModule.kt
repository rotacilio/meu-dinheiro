package br.com.rotacilio.android.meudinheiro.di.module.repositories

import br.com.rotacilio.android.meudinheiro.data.repository.HomeRepository
import org.koin.dsl.module

val repoModule = module {
     single { HomeRepository(get()) }
}