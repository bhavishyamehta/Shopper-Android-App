package com.david.domain.usecase

import com.david.domain.model.CartItemModel
import com.david.domain.model.CartModel
import com.david.domain.network.ResultWrapper
import com.david.domain.repository.CartRepository

class DeleteProductUseCase(private val cartRepository: CartRepository) {
    suspend fun execute(cartItemId: Int, userId: Long) = cartRepository.deleteItem(cartItemId, userId)
}