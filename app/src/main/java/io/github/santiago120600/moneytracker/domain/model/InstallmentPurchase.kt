package io.github.santiago120600.moneytracker.domain.model

import java.math.BigDecimal

data class InstallmentPurchase(
    val id: Int,
    val accountId: Int,
    val categoryId: Int?,
    val totalAmount: BigDecimal,
    val numberOfInstallments: Int,
    val installmentAmount: BigDecimal,
    val description: String?,
    val purchaseDate: Long,
    val nextPaymentDate: Long?,
    val remainingInstallments: Int,
    val createdDate: Long = System.currentTimeMillis(),
    val modifiedDate: Long = System.currentTimeMillis()
)
