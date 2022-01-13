package br.com.rotacilio.android.meudinheiro.di.module

import android.content.Context
import br.com.rotacilio.android.meudinheiro.di.module.api.apiModule
import br.com.rotacilio.android.meudinheiro.di.module.repositories.repoModule
import br.com.rotacilio.android.meudinheiro.di.module.services.servicesModule
import br.com.rotacilio.android.meudinheiro.di.module.viewModels.viewModelModule
import br.com.rotacilio.android.meudinheiro.utils.NetworkHelper
import org.koin.android.ext.koin.androidContext
import org.koin.core.module.Module
import org.koin.dsl.module

val appModule = module {
    single { provideNetworkHelper(androidContext()) }
}

private fun provideNetworkHelper(context: Context) = NetworkHelper(context)

val modules = arrayListOf<Module>().apply {
    add(appModule)
    add(apiModule)
    addAll(servicesModule)
    add(repoModule)
    add(viewModelModule)
}

