package com.david.data.repository

import com.david.domain.model.UserDomainModel
import com.david.domain.network.NetworkService
import com.david.domain.network.ResultWrapper
import com.david.domain.repository.UserRepository

class UserRepositoryImpl(private val networkService: NetworkService) : UserRepository {
    override suspend fun register(email: String, password: String, name: String) =
        networkService.register(email, password, name)

    override suspend fun login(email: String, password: String) =
        networkService.login(email, password)
}