package com.david.domain.usecase

import com.david.domain.repository.CartRepository

class CartSummaryUseCase(private val repository: CartRepository) {
    suspend fun execute(userId: Long) = repository.getCartSummary(userId)
}