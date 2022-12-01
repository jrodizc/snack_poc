package com.jrodiz.externalsnackpoc

import android.app.Application
import com.jrodiz.snacklib.di.SnackLibPresentationComponent
import com.jrodiz.snacklib.di.SnackLibPresentationComponentProvider
import com.jrodiz.snacklib.di.SnackLibPresentationModule
import dagger.Component

@Component(modules = [SnackLibPresentationModule::class])
interface ApplicationComponent {
    fun snackLibPresentationComponent(): SnackLibPresentationComponent.Factory

    fun inject(activity: MainActivity)
}

class AndroidApplication : Application(), SnackLibPresentationComponentProvider {
    val appComponent = DaggerApplicationComponent.create()

    override fun onCreate() {
        super.onCreate()
    }

    override fun getSnackLibPresentationComponent(): SnackLibPresentationComponent {
        return appComponent.snackLibPresentationComponent().create()
    }
}