package io.github.santiago120600.moneytracker.data.local.entity

import androidx.room.Embedded
import androidx.room.Relation

data class CategoryWithInstallmentPurchases(
    @Embedded val category: Category,
    @Relation(
        parentColumn = "id",
        entityColumn = "category_id"
    )
    val installmentPurchases: List<InstallmentPurchase>
)
