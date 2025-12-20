package io.github.santiago120600.moneytracker.data.local.entity

import androidx.room.Entity
import androidx.room.ColumnInfo
import androidx.room.PrimaryKey
import java.math.BigDecimal

@Entity(tableName = "money_transaction")
data class Transaction(
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "amount") val amount: BigDecimal,
    @ColumnInfo(name = "account_id") val accountId: Int,
    @ColumnInfo(name = "category_id") val categoryId: Int?,
    @ColumnInfo(name = "description") val description: String?,
    @ColumnInfo(name = "transaction_date") val transactionDate: Long,
    @ColumnInfo(name = "transaction_type") val transactionType: String,
    @ColumnInfo(name = "created_date") val createdDate: Long = System.currentTimeMillis(),
    @ColumnInfo(name = "modified_date") val modifiedDate: Long = System.currentTimeMillis()
)