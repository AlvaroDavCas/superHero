package edu.iesam.superhero.feature.users.domain

class UsersUseCase (private val userRepository: UserRepository) {

    operator fun invoke(): List<User> {
        return userRepository.obtainUsers()
    }

}