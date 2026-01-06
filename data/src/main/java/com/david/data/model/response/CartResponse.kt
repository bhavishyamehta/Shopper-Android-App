package com.david.data.model.response


import kotlinx.serialization.Serializable

@Serializable
data class CartResponse (
    val data: List<CartItem>,
    val msg: String,
) {
    fun toCartModel(): com.david.domain.model.CartModel {
        return com.david.domain.model.CartModel(
            data = data.map { it.toCartItemModel() },
            msg = msg
        )
    }
}