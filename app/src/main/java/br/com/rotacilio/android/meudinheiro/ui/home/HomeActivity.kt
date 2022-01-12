package br.com.rotacilio.android.meudinheiro.ui.home

import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import br.com.rotacilio.android.meudinheiro.R
import br.com.rotacilio.android.meudinheiro.components.BaseActivity
import br.com.rotacilio.android.meudinheiro.databinding.ActivityHomeBinding

class HomeActivity : BaseActivity() {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityHomeBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val navController = findNavController(R.id.myNavHostFragment)
        binding.idHomeBottomNavView.setupWithNavController(navController)
    }
}