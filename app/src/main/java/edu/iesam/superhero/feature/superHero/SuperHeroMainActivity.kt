package edu.iesam.superhero.feature.superHero

import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import edu.iesam.superhero.feature.users.UsersMainActivity
import edu.iesam.superhero.R
import edu.iesam.superhero.feature.superHero.data.SuperHeroDataRepository
import edu.iesam.superhero.feature.superHero.data.local.SuperHeroMemLocalDataSource
import edu.iesam.superhero.feature.superHero.domain.SuperHeroGetUseCase
import edu.iesam.superhero.feature.superHero.presentation.SuperHeroViewPresentation



class SuperHeroMainActivity : AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_superherolist)

            val superHeroViewPresentation = SuperHeroViewPresentation(SuperHeroGetUseCase(SuperHeroDataRepository(SuperHeroMemLocalDataSource())))
            Log.d(TAG, "onCreate: ${superHeroViewPresentation.getSuperHero()}")

//            val inputName = findViewById<TextView>(R.id.input_name)
//            inputName.text = superHeroViewPresentation.getSuperHero()[0].name
//            inputName.text = superHeroViewPresentation.getSuperHero()[1].name


            val superHeroes = superHeroViewPresentation. getSuperHero()

            findViewById<ConstraintLayout>(R.id.super1)
                .findViewById<TextView>(R. id.label_name).text = superHeroes[0].name

            findViewById<TextView>(R.id.super1)
                .findViewById<TextView>(R.id.input_name).text = superHeroes[0].slug
        }

        companion object {

            val TAG = UsersMainActivity::class.java.simpleName

        }
}