package br.com.rotacilio.android.meudinheiro.utils

import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import br.com.rotacilio.android.meudinheiro.R
import br.com.rotacilio.android.meudinheiro.data.model.Card

@BindingAdapter("cardFlag")
fun ImageView.setCardFlag(card: Card) {
    setImageResource(
        if (card.flag?.flagId == 1L) R.mipmap.ic_mastercard else R.mipmap.ic_visa
    )
}

@BindingAdapter("cardDueDay")
fun TextView.setCardDueDay(card: Card) {
    val res = context.applicationContext.resources
    text = String.format(
        res.getString(R.string.due_day_text),
        card.dueDay.toString()
    )
}

@BindingAdapter("cardBestDay")
fun TextView.setCardBestDay(card: Card) {
    val res = context.applicationContext.resources
    text = String.format(
        res.getString(R.string.best_day_text),
        card.bestDay.toString()
    )
}
