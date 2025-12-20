package io.github.santiago120600.moneytracker.data.local.entity

import androidx.room.Embedded
import androidx.room.Relation

data class SourceAccountWithTransfers(
    @Embedded val account: Account,
    @Relation(
        parentColumn = "id",
        entityColumn = "source_account_id"
    )
    val transfers: List<Transfer>
)
