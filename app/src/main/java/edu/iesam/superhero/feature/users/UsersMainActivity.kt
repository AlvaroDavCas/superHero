package edu.iesam.superhero.feature.users

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import edu.iesam.superhero.R
import edu.iesam.superhero.feature.users.data.UserDataRepository
import edu.iesam.superhero.feature.users.data.local.UserMemLocalDataSource
import edu.iesam.superhero.feature.users.domain.UsersUseCase
import edu.iesam.superhero.feature.users.presentation.ListViewModel




class UsersMainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listViewModel = ListViewModel(UsersUseCase(UserDataRepository(UserMemLocalDataSource())))
        Log.d(TAG, "onCreate: ${listViewModel.getUsers()}")


        val inputName = findViewById<TextView>(R.id.input_name)
        inputName.text = listViewModel.getUsers().first().name



    }

    companion object {

        val TAG = UsersMainActivity::class.java.simpleName

    }

}