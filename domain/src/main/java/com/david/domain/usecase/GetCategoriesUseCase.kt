package com.david.domain.usecase

import com.david.domain.repository.CategoryRepository

class GetCategoriesUseCase(private val repository: CategoryRepository) {
    suspend fun execute() = repository.getCategories()
}