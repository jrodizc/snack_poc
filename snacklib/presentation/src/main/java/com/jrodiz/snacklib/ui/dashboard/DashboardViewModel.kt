package com.jrodiz.snacklib.ui.dashboard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.jrodiz.core.GreetingFetcher
import javax.inject.Inject

class DashboardViewModel @Inject constructor(
    private val greetingFetcher: GreetingFetcher
) : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "This is dashboard Fragment"
    }
    val text: LiveData<String> = _text
    val greeting: String
        get() = greetingFetcher.invoke()
}
