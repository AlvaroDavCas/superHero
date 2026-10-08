package edu.iesam.superhero.feature.users.data.local

import edu.iesam.superhero.feature.users.domain.User

class UserMemLocalDataSource {

    private val localUsers = mutableListOf(User("Pepito", "Doe", "12345689Z"),
        User("Paco", "Perez", "12564789g"))

    fun getAll() = localUsers

}