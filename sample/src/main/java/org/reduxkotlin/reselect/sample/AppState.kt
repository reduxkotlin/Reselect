package org.reduxkotlin.reselect.sample

data class AppState(
    val counter: Int = 0,
    val isLoading: Boolean = false
)