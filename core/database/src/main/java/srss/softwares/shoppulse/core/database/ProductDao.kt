package srss.softwares.shoppulse.core.database

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Upsert
import kotlinx.coroutines.flow.Flow
import srss.softwares.shoppulse.core.model.Product

@Dao
interface ProductDao {

    // Exposing data as Flow for reactive UI updates across the app
    @Query("SELECT * FROM products")
    fun getAllProducts(): Flow<List<Product>>

    @Upsert
    suspend fun insertProducts(products: List<Product>)

    @Query("UPDATE products SET isFavorite = :isFavorite WHERE id = :productId")
    suspend fun updateFavoriteStatus(productId: String, isFavorite: Boolean)
}
