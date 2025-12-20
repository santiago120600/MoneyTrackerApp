package io.github.santiago120600.moneytracker.data.local.dao

import androidx.room.*
import io.github.santiago120600.moneytracker.data.local.entity.Installment

@Dao
interface InstallmentDAO {
    @Query("SELECT * FROM installment ORDER BY id ASC")
    fun getInstallmentList(): List<Installment>

    @Query("SELECT * FROM installment WHERE id = :id")
    suspend fun getInstallmentById(id: Int): Installment

    @Insert
    suspend fun insertInstallment(installment: Installment)

    @Update
    suspend fun updateInstallment(installment: Installment)

    @Delete
    suspend fun deleteInstallment(installment: Installment)
}