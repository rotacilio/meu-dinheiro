package br.com.rotacilio.android.meudinheiro.ui.home.cards

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.com.rotacilio.android.meudinheiro.data.model.Card
import br.com.rotacilio.android.meudinheiro.data.repository.HomeRepository
import br.com.rotacilio.android.meudinheiro.utils.NetworkHelper
import br.com.rotacilio.android.meudinheiro.utils.Resource
import kotlinx.coroutines.launch

class CardsViewModel(
    private val homeRepository: HomeRepository,
    private val networkHelper: NetworkHelper
) : ViewModel() {

    private val _cards = MutableLiveData<Resource<List<Card>>>()
    val cards: LiveData<Resource<List<Card>>> get() = _cards

    init {
        fetchCards()
    }

    private fun fetchCards() {
        viewModelScope.launch {
            _cards.postValue(Resource.loading(null))
            if (networkHelper.isNetworkConnected()) {
                homeRepository.getAllCards().let {
                    if (it.isSuccessful) {
                        _cards.postValue(Resource.success(it.body()))
                    } else {
                        _cards.postValue(Resource.error(it.errorBody().toString(), null))
                    }
                }
            } else {
                _cards.postValue(Resource.error("No internet connection", null))
            }
        }
    }

}