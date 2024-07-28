package com.fridaaltunyan.barzar.domain.usecases

import com.fridaaltunyan.barzar.domain.repository.DataStoreRepository

interface CheckFirstLaunchUseCase {
    suspend operator fun invoke(): Boolean
}

class CheckFirstLaunchUseCaseImpl(
    private val repository: DataStoreRepository,
) : CheckFirstLaunchUseCase {
    override suspend fun invoke(): Boolean {
        return repository.isFirstLaunch().also {
            if (it == true) {
                repository.setFirstLaunch(false)
            }
        } == true
    }

}