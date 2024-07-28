package com.fridaaltunyan.barzar.di

import com.fridaaltunyan.barzar.data.dataStore
import org.koin.core.module.Module
import org.koin.dsl.module

actual val platformModule: Module = module {
    single { dataStore(get()) }
}