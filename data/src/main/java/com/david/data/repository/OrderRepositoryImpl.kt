package com.david.data.repository

import com.david.domain.model.AddressDomainModel
import com.david.domain.model.OrdersListModel
import com.david.domain.network.NetworkService
import com.david.domain.network.ResultWrapper
import com.david.domain.repository.OrderRepository

class OrderRepositoryImpl(private val networkService: NetworkService) : OrderRepository {
    override suspend fun placeOrder(
        addressDomainModel: AddressDomainModel,
        userId: Long
    ): ResultWrapper<Long> {
        return networkService.placeOrder(addressDomainModel, userId)
    }

    override suspend fun getOrderList(userId: Long): ResultWrapper<OrdersListModel> {
        return networkService.getOrderList(userId)
    }
}