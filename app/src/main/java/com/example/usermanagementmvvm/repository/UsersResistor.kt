package com.example.usermanagementmvvm.repository

import com.example.usermanagementmvvm.data.UsersModel
// Repo to handel operation when user tack action
interface UsersRepository {
  /*  (suspend) is key word to active coroutine scope to use asynchronous and run with out block main thread
      and call another coroutine fun*/
    suspend fun addUser(usersModel: UsersModel):List<UsersModel> // add user from user name and email
    suspend fun getUser():List<UsersModel> // for gat List from User
    suspend fun clearUsers():List<UsersModel> // clear our list
    suspend fun deleteUser(usersModel: UsersModel):List<UsersModel> //delete user from our list

}