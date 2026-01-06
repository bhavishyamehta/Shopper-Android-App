package com.david.domain.repository

import com.david.domain.model.Product
import com.david.domain.model.ProductListModel
import com.david.domain.network.ResultWrapper

interface ProductRepository {
   suspend fun getProduct(category:Int?): ResultWrapper<ProductListModel>
}