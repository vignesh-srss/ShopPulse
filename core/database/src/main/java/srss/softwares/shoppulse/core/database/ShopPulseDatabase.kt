package srss.softwares.shoppulse.core.database

import androidx.room.Database
import androidx.room.RoomDatabase
import srss.softwares.shoppulse.core.model.Product

@Database(entities = [Product::class], version = 1, exportSchema = false)
abstract class ShopPulseDatabase : RoomDatabase() {

    abstract fun productDao(): ProductDao

    companion object {
        const val DATABASE_NAME = "shoppulse_db"
    }
}
