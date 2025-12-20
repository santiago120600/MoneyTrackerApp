package io.github.santiago120600.moneytracker.data.local.entity

import androidx.room.Embedded
import androidx.room.Relation

data class AccountWithTransactions(
    @Embedded val account: Account,
    @Relation(
        parentColumn = "id",
        entityColumn = "account_id"
    )
    val transactions: List<Transaction>
)
