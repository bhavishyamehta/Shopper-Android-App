package com.david.domain.repository

import com.david.domain.model.AddressDomainModel
import com.david.domain.model.OrdersListModel
import com.david.domain.network.ResultWrapper

interface OrderRepository {
    suspend fun placeOrder(addressDomainModel: AddressDomainModel, userId: Long) : ResultWrapper<Long>
    suspend fun getOrderList(userId: Long): ResultWrapper<OrdersListModel>
}