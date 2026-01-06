package com.david.domain.repository

import com.david.domain.model.CartItemModel
import com.david.domain.model.CartModel
import com.david.domain.model.CartSummary
import com.david.domain.model.request.AddCartRequestModel
import com.david.domain.network.ResultWrapper

interface CartRepository {
    suspend fun addProductToCart(
        request: AddCartRequestModel, userId: Long
    ): ResultWrapper<CartModel>

    suspend fun getCart(userId: Long): ResultWrapper<CartModel>
    suspend fun updateQuantity(cartItemModel: CartItemModel, userId: Long) : ResultWrapper<CartModel>
    suspend fun deleteItem(cartItemId: Int, userId: Long) : ResultWrapper<CartModel>
    suspend fun getCartSummary(userId: Long): ResultWrapper<CartSummary>
}