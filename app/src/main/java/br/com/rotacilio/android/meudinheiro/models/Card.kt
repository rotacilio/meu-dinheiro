package br.com.rotacilio.android.meudinheiro.models

import com.squareup.moshi.Json

data class Card(
    @Json(name = "id") val cardId: Long = 0L,
    @Json(name = "nickname") var nickname: String? = null,
    @Json(name = "due_day") val dueDay: Int = 0,
    @Json(name = "best_day") val bestDay: Int = 0,
    @Json(name = "flag") var flag: CardFlag? = null
)
