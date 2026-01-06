package com.david.data.repository

import com.david.domain.model.ProductListModel
import com.david.domain.network.NetworkService
import com.david.domain.network.ResultWrapper
import com.david.domain.repository.ProductRepository

class ProductRepositoryImpl(private val networkService: NetworkService) : ProductRepository {
    override suspend fun getProduct(category:Int?): ResultWrapper<ProductListModel> {
        return networkService.getProducts(category)
    }
}