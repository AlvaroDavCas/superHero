package edu.iesam.superhero.feature.superHero.domain

interface SuperHeroRepository {

    fun obtainSuperHero(): List<SuperHero>

}