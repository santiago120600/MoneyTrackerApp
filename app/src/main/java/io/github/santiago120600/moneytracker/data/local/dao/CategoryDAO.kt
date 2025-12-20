package io.github.santiago120600.moneytracker.data.local.dao

import androidx.room.*
import io.github.santiago120600.moneytracker.data.local.entity.Category

@Dao
interface CategoryDAO {
    @Query("SELECT * FROM category ORDER BY id ASC")
    fun getCategoryList(): List<Category>

    @Query("SELECT * FROM category WHERE id = :id")
    suspend fun getCategoryById(id: Int): Category
 
    @Insert
    suspend fun insertCategory(category: Category)
 
    @Update
    suspend fun updateCategory(category: Category)
 
    @Delete
    suspend fun deleteCategory(category: Category)
}