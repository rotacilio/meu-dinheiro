package br.com.rotacilio.android.meudinheiro.data.api.helpers

import br.com.rotacilio.android.meudinheiro.data.model.Card
import retrofit2.Response

interface ApiHelper {
    suspend fun getAllCards(): Response<List<Card>>
}