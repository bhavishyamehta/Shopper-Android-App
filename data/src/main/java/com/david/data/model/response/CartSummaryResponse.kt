package com.david.data.model.response

import kotlinx.serialization.Serializable


@Serializable
data class CartSummaryResponse(
    val `data`: Summary,
    val msg: String
) {
    fun toCartSummary() = com.david.domain.model.CartSummary(
        data = `data`.toSummaryData(),
        msg = msg
    )
}