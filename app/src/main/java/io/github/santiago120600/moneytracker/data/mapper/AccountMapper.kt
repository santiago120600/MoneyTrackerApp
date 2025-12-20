package io.github.santiago120600.moneytracker.data.mapper

import io.github.santiago120600.moneytracker.data.local.entity.Account as Account
import io.github.santiago120600.moneytracker.domain.model.Account as AccountModel

fun AccountModel.toEntity(): Account {
    return Account(
            id = id,
            name = name,
            balance = balance,
            closingDay = closingDay,
            dueDay = dueDay,
            createdDate = createdDate,
            modifiedDate = modifiedDate
    )
}

fun Account.toModel(): AccountModel {
    return AccountModel(
            id = id,
            name = name,
            balance = balance,
            closingDay = closingDay,
            dueDay = dueDay,
            createdDate = createdDate,
            modifiedDate = modifiedDate
    )
}
