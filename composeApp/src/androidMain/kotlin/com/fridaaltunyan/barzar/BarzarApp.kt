package com.fridaaltunyan.barzar

import android.app.Application
import com.fridaaltunyan.barzar.di.initKoin
import org.koin.android.ext.koin.androidContext

class BarzarApp : Application() {
    override fun onCreate() {
        super.onCreate()
        initKoin {
            androidContext(this@BarzarApp)
        }
    }
}