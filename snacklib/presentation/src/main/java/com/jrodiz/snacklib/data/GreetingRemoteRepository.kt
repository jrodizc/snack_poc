package com.jrodiz.snacklib.data

import com.jrodiz.snacklib.core.GreetingRepository
import javax.inject.Inject

class GreetingRemoteRepository @Inject constructor() : GreetingRepository {
    override fun getGreeting(): String {
        return "Greeting from new layer :=)"
    }
}