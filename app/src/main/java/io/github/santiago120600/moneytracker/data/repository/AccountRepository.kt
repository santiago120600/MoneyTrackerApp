package io.github.santiago120600.moneytracker.data.repository

import io.github.santiago120600.moneytracker.data.local.dao.AccountDAO
import io.github.santiago120600.moneytracker.data.mapper.toEntity
import io.github.santiago120600.moneytracker.data.mapper.toModel
import io.github.santiago120600.moneytracker.domain.model.Account as AccountModel

class AccountRepository(private val accountDao: AccountDAO) {

    suspend fun getAllAccounts(): List<AccountModel> {
        return accountDao.getAccountList().map { it.toModel() }
    }

    suspend fun getAccountById(id: Int): AccountModel {
        return accountDao.getAccountById(id).toModel()
    }

    suspend fun insertAccount(account: AccountModel) {
        accountDao.insertAccount(account.toEntity())
    }
    suspend fun updateAccount(account: AccountModel) {
        accountDao.updateAccount(account.toEntity())
    }

    suspend fun deleteAccount(account: AccountModel) {
        accountDao.deleteAccount(account.toEntity())
    }
}
