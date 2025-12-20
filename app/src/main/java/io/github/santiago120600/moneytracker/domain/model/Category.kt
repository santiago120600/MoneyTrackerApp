package io.github.santiago120600.moneytracker.domain.model

data class Category(
    val id: Int,
    val name: String,
    val icon: String,
    val iconColor: String,
    val createdDate: Long = System.currentTimeMillis(),
    val modifiedDate: Long = System.currentTimeMillis()
)