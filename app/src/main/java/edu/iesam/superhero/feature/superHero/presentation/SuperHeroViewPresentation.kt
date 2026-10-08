package edu.iesam.superhero.feature.superHero.presentation

import androidx.lifecycle.ViewModel
import edu.iesam.superhero.feature.superHero.domain.SuperHero
import edu.iesam.superhero.feature.superHero.domain.SuperHeroGetUseCase

class SuperHeroViewPresentation (val superHeroGetUseCase: SuperHeroGetUseCase): ViewModel(){

    fun getSuperHero(): List<SuperHero> = superHeroGetUseCase.invoke()

}