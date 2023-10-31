package edu.farmingdale.alrajab.bcs421

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import edu.farmingdale.alrajab.bcs421.database.DatabaseActivity
import edu.farmingdale.alrajab.bcs421.databinding.ActivityMainBinding
import edu.farmingdale.alrajab.bcs421.files.FileActivity
import edu.farmingdale.alrajab.bcs421.sharedPreferences.SharedPreferencesActivity

class MainActivity : AppCompatActivity() {

    // create binding view true - make sure to add it to the module build.gradle
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.databaseBtn.setOnClickListener {  processDatabase()}

        binding.filesBtn.setOnClickListener { processFiles() }

        binding.btnSharedpref.setOnClickListener { processSharedPreferences() }

        // TODO 01:SP Add another button for saving data using Shared Preferences
        //done
        // TODO 02:SP Make an activity that accept the User's first and last name and save/read/update
        //  the shared preference
        //done
        // TODO 03:DB Edit the Database page so that you store  the first name and last name of the
        //  user input (EditView)
        //done
        // TODO 04:DB Update an existing name with a new one
        //Cant figure this out, come back later to this
        // TODO 05:DB Read from the files and write to the DB
        //done
        // TODO 06: Push your code to GitHub and submit the link

    }

    /**
     * Move to the file activity
     */
    private fun processFiles() {
        startActivity( Intent(this, FileActivity::class.java) )
    }

    /**
     * Move to the database activity
     */
    private fun processDatabase() {
        startActivity( Intent(this, DatabaseActivity::class.java) )
    }

    /**
     * Move to the sharedPreferences activity
     */
    private fun processSharedPreferences() {
        startActivity( Intent(this, SharedPreferencesActivity::class.java) )
    }
}