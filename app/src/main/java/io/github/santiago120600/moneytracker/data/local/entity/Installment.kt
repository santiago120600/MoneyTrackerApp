package io.github.santiago120600.moneytracker.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.ColumnInfo
import java.math.BigDecimal

@Entity(tableName = "installment")
data class Installment(
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "purchase_id") val purchaseId: Int,
    @ColumnInfo(name = "amount") val amount: BigDecimal,
    @ColumnInfo(name = "due_date") val dueDate: Long?,
    @ColumnInfo(name = "paid_date") val paidDate: Long?,
    @ColumnInfo(name = "status") val status: String,
    @ColumnInfo(name = "transaction_id") val transactionId: Int?,
    @ColumnInfo(name = "created_date") val createdDate: Long = System.currentTimeMillis(),
    @ColumnInfo(name = "modified_date") val modifiedDate: Long = System.currentTimeMillis()
)