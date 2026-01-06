package com.david.data.model.response

import kotlinx.serialization.Serializable

@Serializable
data class OrdersListResponse(
    val `data`: List<OrdersListData>,
    val msg: String
) {
    fun toDomainResponse(): com.david.domain.model.OrdersListModel {
        return com.david.domain.model.OrdersListModel(
            `data` = `data`.map { it.toDomainResponse() },
            msg = msg
        )
    }
}