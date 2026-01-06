package com.david.domain.usecase


import com.david.domain.model.OrdersListModel
import com.david.domain.repository.OrderRepository

class OrderListUseCase(
    private val repository: OrderRepository
) {
    suspend fun execute(userId: Long) = repository.getOrderList(userId)
}