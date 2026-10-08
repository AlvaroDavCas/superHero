package edu.iesam.superhero.feature.superHero.data

import edu.iesam.superhero.feature.superHero.data.local.SuperHeroMemLocalDataSource
import edu.iesam.superhero.feature.superHero.domain.SuperHero
import edu.iesam.superhero.feature.superHero.domain.SuperHeroRepository

class SuperHeroDataRepository (val localDataSource: SuperHeroMemLocalDataSource): SuperHeroRepository {

    override fun obtainSuperHero(): List<SuperHero> {
        return localDataSource.getAll()
    }


}