package br.com.rotacilio.android.meudinheiro.di.module.services

import br.com.rotacilio.android.meudinheiro.data.api.helpers.ApiHelper
import br.com.rotacilio.android.meudinheiro.data.api.helpers.impl.ApiHelperImpl
import br.com.rotacilio.android.meudinheiro.data.api.services.ApiService
import org.koin.dsl.module
import retrofit2.Retrofit

val apiServicesModule = module {
    single { provideApiService(get()) }
}

val helpersModule = module {
    single<ApiHelper> { ApiHelperImpl(get()) }
}

val servicesModule = listOf(
    apiServicesModule,
    helpersModule
)

private fun provideApiService(retrofit: Retrofit): ApiService = retrofit.create(ApiService::class.java)

private fun provideApiHelper(apiHelper: ApiHelper): ApiHelper = apiHelper
