package io.github.santiago120600.moneytracker.data.local.entity

import androidx.room.Embedded
import androidx.room.Relation

data class DestinationAccountWithTransfers(
    @Embedded val account: Account,
    @Relation(
        parentColumn = "id",
        entityColumn = "destination_account_id"
    )
    val transfers: List<Transfer>
)
