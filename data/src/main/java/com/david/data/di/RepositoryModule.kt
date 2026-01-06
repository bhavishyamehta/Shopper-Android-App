package com.david.data.di

import com.david.domain.repository.CategoryRepository
import com.david.data.repository.CategoryRepositoryImpl
import com.david.data.repository.ProductRepositoryImpl
import com.david.domain.repository.CartRepository
import com.david.domain.repository.OrderRepository
import com.david.domain.repository.ProductRepository
import com.david.domain.repository.UserRepository
import org.koin.dsl.module

val repositoryModule = module {
    single<ProductRepository> { ProductRepositoryImpl(get()) }
    single<CategoryRepository> { CategoryRepositoryImpl(get()) }
    single<CartRepository> { com.david.data.repository.CartRepositoryImpl(get()) }
    single<OrderRepository> {com.david.data.repository.OrderRepositoryImpl(get()) }
    single<UserRepository> { com.david.data.repository.UserRepositoryImpl(get()) }
}