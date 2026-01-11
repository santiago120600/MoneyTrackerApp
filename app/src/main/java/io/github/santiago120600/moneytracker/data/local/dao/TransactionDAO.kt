package io.github.santiago120600.moneytracker.data.local.dao

import androidx.room.*
import io.github.santiago120600.moneytracker.data.local.entity.Transaction

@Dao
interface TransactionDAO {
    @Query("SELECT * FROM money_transaction ORDER BY id ASC")
    suspend fun getTransactionList(): List<Transaction>

    @Query("SELECT * FROM money_transaction WHERE id = :id")
    suspend fun getTransactionById(id: Int): Transaction

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTransaction(transaction: Transaction)

    @Update
    suspend fun updateTransaction(transaction: Transaction)
    
    @Delete
    suspend fun deleteTransaction(transaction: Transaction)
}