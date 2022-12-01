package com.jrodiz.snacklib.domain

import com.jrodiz.snacklib.core.GreetingFetcher
import com.jrodiz.snacklib.core.GreetingRepository
import javax.inject.Inject

class GreetingFetcherUseCase @Inject constructor(
    private val greetingRepository: GreetingRepository
) : GreetingFetcher {

    override fun invoke(): String {
        return greetingRepository.getGreeting()
    }
}