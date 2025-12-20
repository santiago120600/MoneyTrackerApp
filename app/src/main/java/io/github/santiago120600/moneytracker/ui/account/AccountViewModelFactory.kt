package io.github.santiago120600.moneytracker.ui.account

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import io.github.santiago120600.moneytracker.data.repository.AccountRepository

class AccountViewModelFactory(private val repository: AccountRepository) : ViewModelProvider.Factory
{

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(AccountViewModel::class.java)) {
            return AccountViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}