package io.github.santiago120600.moneytracker.data.local.dao

import androidx.room.*
import io.github.santiago120600.moneytracker.data.local.entity.InstallmentPurchase

@Dao
interface InstallmentPurchaseDAO {
    @Query("SELECT * FROM installment_purchase ORDER BY id ASC")
    suspend fun getInstallmentPurchaseList(): List<InstallmentPurchase>

    @Query("SELECT * FROM installment_purchase WHERE id = :id")
    suspend fun getInstallmentPurchaseById(id: Int): InstallmentPurchase

    @Insert
    suspend fun insertInstallmentPurchase(installmentPurchase: InstallmentPurchase)

    @Update
    suspend fun updateInstallmentPurchase(installmentPurchase: InstallmentPurchase)

    @Delete
    suspend fun deleteInstallmentPurchase(installmentPurchase: InstallmentPurchase)

}