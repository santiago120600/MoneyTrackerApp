package io.github.santiago120600.moneytracker.data.local.dao

import androidx.room.*
import io.github.santiago120600.moneytracker.data.local.entity.Transfer

@Dao
interface TransferDAO {
    @Query("SELECT * FROM transfer ORDER BY id ASC")
    suspend fun getTransferList(): List<Transfer>

    @Query("SELECT * FROM transfer WHERE id = :id")
    suspend fun getTransferById(id: Int): Transfer

    @Insert
    suspend fun insertTransfer(transfer: Transfer)

    @Update
    suspend fun updateTransfer(transfer: Transfer)

    @Delete
    suspend fun deleteTransfer(transfer: Transfer)
}