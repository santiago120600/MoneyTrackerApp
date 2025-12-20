package io.github.santiago120600.moneytracker.data.local.entity

import androidx.room.Embedded
import androidx.room.Relation

data class InstallmentPurchaseWithInstallments(
    @Embedded val installmentPurchase: InstallmentPurchase,
    @Relation(
        parentColumn = "id",
        entityColumn = "purchase_id"
    )
    val installments: List<Installment>
)
