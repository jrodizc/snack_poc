package com.jrodiz.domain

import com.jrodiz.core.GreetingFetcher
import com.jrodiz.core.GreetingRepository
import javax.inject.Inject

class GreetingFetcherUseCase @Inject constructor(
    private val greetingRepository: GreetingRepository
) : GreetingFetcher {

    override fun invoke(): String {
        return greetingRepository.getGreeting()
    }
}