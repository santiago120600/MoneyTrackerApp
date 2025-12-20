package io.github.santiago120600.moneytracker.domain.model

import java.math.BigDecimal

data class Transaction(
    val id: Int,
    val amount: BigDecimal,
    val accountId: Int,
    val categoryId: String,
    val description: String?,
    val date: Long,
    val type: String,
    val note: String?,
    val createdDate: Long = System.currentTimeMillis(),
    val modifiedDate: Long = System.currentTimeMillis()
)
