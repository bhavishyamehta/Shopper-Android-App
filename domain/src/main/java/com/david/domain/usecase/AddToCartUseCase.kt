package com.david.domain.usecase

import com.david.domain.model.request.AddCartRequestModel
import com.david.domain.repository.CartRepository

class AddToCartUseCase(private val cartRepository: CartRepository) {
    suspend fun execute(request: AddCartRequestModel, userId: Long) = cartRepository.addProductToCart(request, userId)
}