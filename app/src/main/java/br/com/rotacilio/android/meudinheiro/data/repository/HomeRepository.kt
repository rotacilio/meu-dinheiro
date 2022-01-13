package br.com.rotacilio.android.meudinheiro.data.repository

import br.com.rotacilio.android.meudinheiro.data.api.helpers.ApiHelper

class HomeRepository(private val apiHelper: ApiHelper) {
    suspend fun getAllCards() = apiHelper.getAllCards()
}