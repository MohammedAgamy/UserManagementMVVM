package com.example.usermanagementmvvm.viewmodel

import com.example.usermanagementmvvm.data.UsersModel

sealed class UiState {

    object Loading : UiState()  // Represents the loading state
    data class Success(val users: List<UsersModel>, val message: String = "") :
        UiState()  // Represents a successful data fetch

    data class Error(val message: String) :
        UiState()  // Represents an error state with an error message
}