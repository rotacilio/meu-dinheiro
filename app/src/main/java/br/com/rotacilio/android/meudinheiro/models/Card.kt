package br.com.rotacilio.android.meudinheiro.models

data class Card(
    val cardId: Long,
    val nickname: String,
    val dueDay: Long,
    val bestDay: Long,
    val flag: CardFlag,
)
