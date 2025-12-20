package io.github.santiago120600.moneytracker.domain.model

data class Installment(
    val id: Int,
    val purchaseId: Int,
    val amount: Double,
    val dueDate: Long,
    val paidDate: Long,
    val status: String,
    val transactionId: Int?,
    val createdDate: Long = System.currentTimeMillis(),
    val modifiedDate: Long = System.currentTimeMillis()
)
