package com.fridaaltunyan.barzar.presentation.screens.onboarding

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.fridaaltunyan.barzar.domain.usecases.CheckFirstLaunchUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class OnBoardingViewModel(
    private val checkFirstLaunchUseCase: CheckFirstLaunchUseCase,
) : ViewModel() {
    private val _isFirstLaunch = MutableStateFlow<Boolean?>(null)
    val isFirstLaunch = _isFirstLaunch.asStateFlow()

    init {
        viewModelScope.launch {
            _isFirstLaunch.value = checkFirstLaunchUseCase()
        }
    }
}