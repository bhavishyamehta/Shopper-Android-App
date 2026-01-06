package com.david.domain.repository

import com.david.domain.model.CategoriesListModel
import com.david.domain.network.ResultWrapper

interface CategoryRepository {
    suspend fun getCategories(): ResultWrapper<CategoriesListModel>
}