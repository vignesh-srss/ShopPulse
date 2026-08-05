package srss.softwares.shoppulse.core.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "products")
data class Product(
    @PrimaryKey
    val id: String,
    val title: String,
    val price: Double,
    val imageUrl: String,
    val category: String,
    val rating: Double,
    val isFavorite: Boolean = false
)
