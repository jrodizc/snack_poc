package com.jrodiz.externalsnackpoc

import android.app.Application
import com.jrodiz.data.di.SnackLibDataModule
import com.jrodiz.domain.di.SnackLibDomainModule
import dagger.Component

@Component(modules = [SnackLibDataModule::class, SnackLibDomainModule::class])
interface ApplicationComponent {
    fun inject(activity: MainActivity)
}

class AndroidApplication : Application() {
    val appComponent = DaggerApplicationComponent.create()

    override fun onCreate() {
        super.onCreate()
    }
}