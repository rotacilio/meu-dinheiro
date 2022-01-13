package br.com.rotacilio.android.meudinheiro.data.api.services

import br.com.rotacilio.android.meudinheiro.data.model.Card
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("cards")
    suspend fun getAllCards(): Response<List<Card>>
}