package io.github.santiago120600.moneytracker.data.local.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import androidx.room.Room
import io.github.santiago120600.moneytracker.data.local.dao.*
import io.github.santiago120600.moneytracker.data.local.entity.*
import io.github.santiago120600.moneytracker.util.Converters
import android.content.Context

@Database(
        entities =
                [
                        Account::class,
                        Category::class,
                        Transaction::class,
                        Transfer::class,
                        InstallmentPurchase::class,
                        Installment::class],
        version = 1,
        exportSchema = false
)
@TypeConverters(Converters::class)
abstract class MoneyTrackerDatabase : RoomDatabase() {

        abstract fun accountDao(): AccountDAO
        abstract fun categoryDao(): CategoryDAO
        abstract fun transactionDao(): TransactionDAO
        abstract fun transferDao(): TransferDAO
        abstract fun installmentPurchaseDao(): InstallmentPurchaseDAO
        abstract fun installmentDao(): InstallmentDAO

        companion object {
                @Volatile 
                private var INSTANCE: MoneyTrackerDatabase? = null

                fun getDatabase(context: Context): MoneyTrackerDatabase {
                        return INSTANCE ?: synchronized(this) {
                                val instance = Room.databaseBuilder(
                                                        context.applicationContext,
                                                        MoneyTrackerDatabase::class.java,
                                                        "money_tracker_database"
                                ).build()
                                INSTANCE = instance
                                instance
                        }
                }
        }
}
