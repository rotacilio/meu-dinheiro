package br.com.rotacilio.android.meudinheiro.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.rotacilio.android.meudinheiro.R
import br.com.rotacilio.android.meudinheiro.data.model.Card

class CardsListAdapter : RecyclerView.Adapter<CardsListAdapter.CardViewHolder>() {

    var data = listOf<Card>()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.cards_list_item, parent, false)
        return CardViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        val item = data[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int = data.size

    class CardViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val cardFlag = itemView.findViewById<ImageView>(R.id.idImgViewFlagIcon)
        private val cardNickname = itemView.findViewById<TextView>(R.id.idTxtViewCardNickname)
        private val cardDueDay = itemView.findViewById<TextView>(R.id.idTxtViewCardDueDay)
        private val cardBestDay = itemView.findViewById<TextView>(R.id.idTxtViewCardBestDay)

        fun bind(card: Card) {
            cardFlag.setImageResource(
                if (card.flag?.flagId == 1L) R.mipmap.ic_mastercard else R.mipmap.ic_visa)
            cardNickname.text = card.nickname
            cardDueDay.text = String.format(itemView.context.getString(R.string.due_day_text), card.dueDay.toString())
            cardBestDay.text = String.format(itemView.context.getString(R.string.best_day_text), card.bestDay.toString())
        }
    }
}
