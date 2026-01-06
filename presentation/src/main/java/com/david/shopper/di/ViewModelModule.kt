package com.david.shopper.di

import androidx.lifecycle.ViewModel
import com.david.shopper.ui.feature.account.login.LoginViewModel
import com.david.shopper.ui.feature.account.register.RegisterViewModel
import com.david.shopper.ui.feature.cart.CartViewModel
import com.david.shopper.ui.feature.home.HomeViewModel
import com.david.shopper.ui.feature.orders.OrdersViewModel
import com.david.shopper.ui.feature.product_details.ProductDetailsViewModel
import com.david.shopper.ui.feature.summary.CartSummaryViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel{
        HomeViewModel(get(), get())
    }
    viewModel{
        ProductDetailsViewModel(get())
    }
    viewModel{
        CartViewModel(get(), get(), get())
    }
    viewModel{
        CartSummaryViewModel(get(), get())
    }
    viewModel{
        OrdersViewModel(get())
    }
    viewModel{
        LoginViewModel(get())
    }
    viewModel{
        RegisterViewModel(get())
    }

}