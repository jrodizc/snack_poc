package com.jrodiz.snacklib.di

import com.jrodiz.snacklib.ui.dashboard.DashboardFragment
import dagger.Module
import dagger.Subcomponent

@Subcomponent
interface SnackLibPresentationComponent {
    @Subcomponent.Factory
    interface Factory {
        fun create(): SnackLibPresentationComponent
    }

    fun inject(fragment: DashboardFragment)
}

@Module(
    subcomponents = [SnackLibPresentationComponent::class],
    includes = [SnackLibDataModule::class, SnackLibDomainModule::class]
)
class SnackLibPresentationModule