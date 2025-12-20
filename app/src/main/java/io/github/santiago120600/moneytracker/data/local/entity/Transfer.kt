package io.github.santiago120600.moneytracker.data.local.entity

import androidx.room.Entity
import androidx.room.ColumnInfo
import androidx.room.PrimaryKey
import java.math.BigDecimal

@Entity(tableName = "transfer")
data class Transfer(
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "source_account_id") val sourceAccountId: Int,
    @ColumnInfo(name = "destination_account_id") val destinationAccountId: Int,
    @ColumnInfo(name = "amount") val amount: BigDecimal,
    @ColumnInfo(name = "transfer_date") val transferDate: String?,
    @ColumnInfo(name = "description") val description: String?,
    @ColumnInfo(name = "created_date") val createdDate: Long = System.currentTimeMillis(),
    @ColumnInfo(name = "modified_date") val modifiedDate: Long = System.currentTimeMillis()
)