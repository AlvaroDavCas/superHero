package edu.iesam.superhero.feature.users.presentation

import androidx.lifecycle.ViewModel
import edu.iesam.superhero.feature.users.domain.UsersUseCase

class ListViewModel(private val getUsersUseCase: UsersUseCase): ViewModel() {

    fun getUsers() = getUsersUseCase.invoke()

}