package io.github.santiago120600.moneytracker.domain.model

import java.math.BigDecimal

data class Account(
    val id: Int,
    val name: String,
    val balance: BigDecimal,
    val closingDay: Long?,
    val dueDay: Long?,
    val createdDate: Long = System.currentTimeMillis(),
    val modifiedDate: Long = System.currentTimeMillis()
)