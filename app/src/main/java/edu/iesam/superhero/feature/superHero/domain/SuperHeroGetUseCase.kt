package edu.iesam.superhero.feature.superHero.domain

class SuperHeroGetUseCase (val superHeroRepository: SuperHeroRepository){

    operator fun invoke(): List<SuperHero> {
        return superHeroRepository.obtainSuperHero()
    }

}