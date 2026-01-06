package com.david.domain.di

import com.david.domain.usecase.AddToCartUseCase
import com.david.domain.usecase.CartSummaryUseCase
import com.david.domain.usecase.DeleteProductUseCase
import com.david.domain.usecase.GetCartUseCase
import com.david.domain.usecase.GetCategoriesUseCase
import com.david.domain.usecase.GetProductUseCase
import com.david.domain.usecase.LoginUseCase
import com.david.domain.usecase.OrderListUseCase
import com.david.domain.usecase.PlaceOrderUseCase
import com.david.domain.usecase.RegisterUseCase
import com.david.domain.usecase.UpdateQuantityUseCase
import org.koin.dsl.module

val useCaseModule = module {
    factory { GetProductUseCase(get()) }
    factory { GetCategoriesUseCase(get()) }
    factory { AddToCartUseCase(get()) }
    factory { GetCartUseCase(get()) }
    factory { UpdateQuantityUseCase(get()) }
    factory { DeleteProductUseCase(get()) }
    factory { CartSummaryUseCase(get()) }
    factory { PlaceOrderUseCase( get()) }
    factory { OrderListUseCase(get()) }
    factory { LoginUseCase(get()) }
    factory { RegisterUseCase(get()) }
}