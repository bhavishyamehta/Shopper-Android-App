package com.david.domain.usecase

import com.david.domain.model.AddressDomainModel
import com.david.domain.network.ResultWrapper
import com.david.domain.repository.OrderRepository

class PlaceOrderUseCase(val orderRepository: OrderRepository) {
    suspend fun execute(addressDomainModel: AddressDomainModel, userId: Long) =
        orderRepository.placeOrder(addressDomainModel, userId)
}