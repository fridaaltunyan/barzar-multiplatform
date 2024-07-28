package com.fridaaltunyan.barzar.di

import com.fridaaltunyan.barzar.data.repository.DataStoreRepositoryImpl
import com.fridaaltunyan.barzar.domain.repository.DataStoreRepository
import com.fridaaltunyan.barzar.domain.usecases.CheckFirstLaunchUseCase
import com.fridaaltunyan.barzar.domain.usecases.CheckFirstLaunchUseCaseImpl
import com.fridaaltunyan.barzar.presentation.screens.onboarding.OnBoardingViewModel
import org.koin.compose.viewmodel.dsl.viewModelOf
import org.koin.core.module.Module
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

expect val platformModule: Module

val sharedModule = module {
    singleOf(::DataStoreRepositoryImpl).bind<DataStoreRepository>()
    factory <CheckFirstLaunchUseCase>{ CheckFirstLaunchUseCaseImpl(get()) }
    viewModelOf(::OnBoardingViewModel)
}