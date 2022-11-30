package com.jrodiz.domain.di

import com.jrodiz.core.GreetingFetcher
import com.jrodiz.domain.GreetingFetcherUseCase
import dagger.Binds
import dagger.Module

@Module
interface SnackLibDomainModule {
    @Binds
    fun providesUseCase(greetingFetcherUseCase: GreetingFetcherUseCase): GreetingFetcher
}