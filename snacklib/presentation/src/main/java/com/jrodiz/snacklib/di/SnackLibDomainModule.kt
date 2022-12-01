package com.jrodiz.snacklib.di

import com.jrodiz.snacklib.core.GreetingFetcher
import com.jrodiz.snacklib.domain.GreetingFetcherUseCase
import dagger.Binds
import dagger.Module

@Module
interface SnackLibDomainModule {
    @Binds
    fun providesUseCase(greetingFetcherUseCase: GreetingFetcherUseCase): GreetingFetcher
}