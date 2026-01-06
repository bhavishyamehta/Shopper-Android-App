package com.david.data.model.response

import com.david.data.model.DataProductModel
import kotlinx.serialization.Serializable

@Serializable
data class ProductListResponse(
    val `data`: List<DataProductModel>,
    val msg: String
){
    fun toProductList() = com.david.domain.model.ProductListModel(
        products = `data`.map { it.toProduct() },
        msg = msg
    )
}