package com.example.usermanagementmvvm.viewmodel

import androidx.lifecycle.ViewModel
import com.example.usermanagementmvvm.data.UsersModel
import com.example.usermanagementmvvm.repository.RepositoryImpl
import com.example.usermanagementmvvm.repository.UsersRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow


//view model like bridge between view and model , hold logic and observe data / change data
class UserViewModel : ViewModel() {

    //instance from repo to tack operation like add , delete , clear and get
    val repositoryImpl: UsersRepository = RepositoryImpl()

    /*
       -usr input filed // It holds a single value and emits updates to collectors whenever the value changes
       -mack it privet for encapsulated
       - and usd state management to update ui
    */
    private val _name = MutableStateFlow("")

    // mack name public for used in ui  and used stateFlow to red only
    val name: StateFlow<String> = _name
    private val _email = MutableStateFlow("")
    val email: StateFlow<String> = _email

    //to handel input from user and validation error
    private val _nameError = MutableStateFlow(false)
    val nameError: StateFlow<Boolean> = _nameError
    private val _emailError = MutableStateFlow(false)
    val emailError: StateFlow<Boolean> = _emailError

    //Handel UI State used sealed
    private val _UiState =MutableStateFlow<UiState>(UiState.Loading)
    val uiState:StateFlow<UiState> = _UiState

    //Search query and filtered users
    private val _filteredUsers =MutableStateFlow<List<UsersModel>>(emptyList())
    val filteredList:StateFlow<List<UsersModel>> = _filteredUsers

    private val _searchQuery = MutableStateFlow("")
    val searchQuery: StateFlow<String> = _searchQuery







}