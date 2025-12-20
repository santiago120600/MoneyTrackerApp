package io.github.santiago120600.moneytracker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModelProvider
import io.github.santiago120600.moneytracker.ui.theme.MoneyTrackerTheme
import io.github.santiago120600.moneytracker.data.local.db.MoneyTrackerDatabase
import io.github.santiago120600.moneytracker.data.repository.*
import io.github.santiago120600.moneytracker.ui.account.AccountScreen
import io.github.santiago120600.moneytracker.ui.account.AccountViewModel
import io.github.santiago120600.moneytracker.ui.account.AccountViewModelFactory

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

         // Initialize database
        val database = MoneyTrackerDatabase.getDatabase(this)
        val accountDao = database.accountDao()
        val accountRepository = AccountRepository(accountDao)

        val viewModelFactory = AccountViewModelFactory(accountRepository)
        val accountViewModel = ViewModelProvider(this, viewModelFactory)[AccountViewModel::class.java]

        setContent {
            MoneyTrackerTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    AccountScreen(viewModel = accountViewModel)
                }
            }
        }
    }
}