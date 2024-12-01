package com.example.usermanagementmvvm.repository

import com.example.usermanagementmvvm.data.UsersModel
import kotlinx.coroutines.delay


// implement Repo to handel operation between view model  and model like bridge between view model and data layer
/*
 class would implement this interface and handle the actual data operations
 */
class RepositoryImpl : UsersRepository {

    // list to display user  remove data , add  and do clear all list
    val users = mutableListOf<UsersModel>()

    // fun to return list and add data to model layer
    //suspend is key word to active coroutine scope to use asynchronous and run with out block main thread and call another coroutine fun
    override suspend fun addUser(usersModel: UsersModel): List<UsersModel> {
        // delay is a coroutine  fun to give time with out blocking main thread
        delay(3000)
        users.add(usersModel)
        return users
    }

    // fun to return list from data layer and display all of usr
    override suspend fun getUser(): List<UsersModel> {
        delay(3000)
        return users
    }

    // clear all list
    override suspend fun clearUsers(): List<UsersModel> {
        delay(3000)
        users.clear()
        return users
    }

    //delete one index user from list
    override suspend fun deleteUser(usersModel: UsersModel): List<UsersModel> {
        delay(3000)
        users.remove(usersModel)
        return users
    }
}