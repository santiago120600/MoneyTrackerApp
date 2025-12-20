package io.github.santiago120600.moneytracker.domain.model

import java.math.BigDecimal

data class Transfer(
    val id: Int,
    val fromAccountId: Int,
    val toAccountId: Int,
    val amount: BigDecimal,
    val date: Long,
    val description: String?,
    val createdDate: Long = System.currentTimeMillis(),
    val modifiedDate: Long = System.currentTimeMillis()
)
