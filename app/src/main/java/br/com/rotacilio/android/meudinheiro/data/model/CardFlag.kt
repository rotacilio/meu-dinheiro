package br.com.rotacilio.android.meudinheiro.data.model

import com.squareup.moshi.Json

data class CardFlag(
    @Json(name = "id") val flagId: Long = 0,
    @Json(name = "name") var flagName: String? = null,
)
