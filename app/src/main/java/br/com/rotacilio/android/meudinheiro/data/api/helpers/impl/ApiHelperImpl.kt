package br.com.rotacilio.android.meudinheiro.data.api.helpers.impl

import br.com.rotacilio.android.meudinheiro.data.api.helpers.ApiHelper
import br.com.rotacilio.android.meudinheiro.data.api.services.ApiService
import br.com.rotacilio.android.meudinheiro.data.model.Card
import retrofit2.Response

class ApiHelperImpl(private val apiService: ApiService) : ApiHelper {
    override suspend fun getAllCards(): Response<List<Card>> = apiService.getAllCards()
}