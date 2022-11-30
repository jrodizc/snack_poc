package com.jrodiz.data

import com.jrodiz.core.GreetingRepository
import javax.inject.Inject

class GreetingRemoteRepository @Inject constructor() : GreetingRepository {
    override fun getGreeting(): String {
        return "Greeting from new layer"
    }
}