package srss.softwares.shoppulse.feature.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.stateIn
import srss.softwares.shoppulse.core.model.Product

class HomeViewModel : ViewModel() {

    // Temporary mock stream representing cached or fetched e-commerce products
    val products: StateFlow<List<Product>> = flow {
        emit(
            listOf(
                Product(
                    id = "1",
                    title = "Wireless Noise-Canceling Headphones",
                    price = 299.99,
                    imageUrl = "",
                    category = "Electronics",
                    rating = 4.8,
                    isFavorite = true
                ),
                Product(
                    id = "2",
                    title = "Ergonomic Mechanical Keyboard",
                    price = 129.99,
                    imageUrl = "",
                    category = "Accessories",
                    rating = 4.6,
                    isFavorite = false
                ),
                Product(
                    id = "3",
                    title = "Ultra-Wide Gaming Monitor",
                    price = 499.99,
                    imageUrl = "",
                    category = "Displays",
                    rating = 4.9,
                    isFavorite = false
                )
            )
        )
    }.stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(5000),
        initialValue = emptyList()
    )
}
