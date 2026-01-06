package com.david.data.repository

import com.david.domain.model.CategoriesListModel
import com.david.data.model.CategoryDataModel
import com.david.domain.network.NetworkService
import com.david.domain.network.ResultWrapper
import com.david.domain.repository.CategoryRepository

class CategoryRepositoryImpl(val networkService: NetworkService) : CategoryRepository {
    override suspend fun getCategories(): ResultWrapper<CategoriesListModel> {
        return networkService.getCategories()
    }
}