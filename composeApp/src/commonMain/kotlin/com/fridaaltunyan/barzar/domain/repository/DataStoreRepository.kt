package com.fridaaltunyan.barzar.domain.repository

interface DataStoreRepository {
    suspend fun isFirstLaunch(): Boolean?
    suspend fun setFirstLaunch(value: Boolean)
}