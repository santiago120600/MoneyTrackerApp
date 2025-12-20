package io.github.santiago120600.moneytracker.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.ColumnInfo
import java.math.BigDecimal

@Entity(tableName = "installment_purchase")
data class InstallmentPurchase(
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "account_id") val accountId: Int,
    @ColumnInfo(name = "category_id") val categoryId: Int?,
    @ColumnInfo(name = "total_amount") val totalAmount: BigDecimal,
    @ColumnInfo(name = "number_of_installments") val numberOfInstallments: Int,
    @ColumnInfo(name = "installment_amount") val installmentAmount: BigDecimal,
    @ColumnInfo(name = "description") val description: String?,
    @ColumnInfo(name = "purchase_date") val purchaseDate: Long,
    @ColumnInfo(name = "next_payment_date") val nextPaymentDate: Long?,
    @ColumnInfo(name = "remaining_installments") val remainingInstallments: Int,    
    @ColumnInfo(name = "created_date") val createdDate: Long = System.currentTimeMillis(),
    @ColumnInfo(name = "modified_date") val modifiedDate: Long = System.currentTimeMillis()
)