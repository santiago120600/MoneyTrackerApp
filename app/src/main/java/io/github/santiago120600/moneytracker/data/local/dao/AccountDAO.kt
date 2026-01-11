package io.github.santiago120600.moneytracker.data.local.dao

import androidx.room.*
import io.github.santiago120600.moneytracker.data.local.entity.Account
import io.github.santiago120600.moneytracker.data.local.entity.AccountWithTransactions

@Dao
interface AccountDAO {
    @Query("SELECT * FROM account ORDER BY id ASC") suspend fun getAccountList(): List<Account>

    @Query("SELECT * FROM account WHERE id = :id") suspend fun getAccountById(id: Int): Account

    @Transaction
    @Query("SELECT * FROM account")
    suspend fun getAccountsWithTransactions(): List<AccountWithTransactions>

    @Insert suspend fun insertAccount(account: Account)

    @Update suspend fun updateAccount(account: Account)

    @Delete suspend fun deleteAccount(account: Account)
}
