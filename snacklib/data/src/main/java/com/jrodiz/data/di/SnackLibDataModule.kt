package com.jrodiz.data.di

import com.jrodiz.core.GreetingRepository
import com.jrodiz.data.GreetingRemoteRepository
import dagger.Binds
import dagger.Module

@Module
interface SnackLibDataModule {

    @Binds
    fun providesRemoteRepository(greetingRemoteRepository: GreetingRemoteRepository): GreetingRepository
}