package com.jrodiz.snacklib.di

import com.jrodiz.snacklib.core.GreetingRepository
import com.jrodiz.snacklib.data.GreetingRemoteRepository
import dagger.Binds
import dagger.Module

@Module
interface SnackLibDataModule {

    @Binds
    fun providesRemoteRepository(greetingRemoteRepository: GreetingRemoteRepository): GreetingRepository
}