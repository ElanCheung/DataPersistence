package edu.farmingdale.alrajab.bcs421.sharedPreferences

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import edu.farmingdale.alrajab.bcs421.MainActivity
import edu.farmingdale.alrajab.bcs421.R

class SharedPreferencesActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shared_preferences)

        val sharedPreferences = getSharedPreferences("sharedPrefs", Context.MODE_PRIVATE)
        val firstEditText = findViewById<EditText>(R.id.etFirst)
        val lastEditText = findViewById<EditText>(R.id.etLast)
        val saveButton = findViewById<Button>(R.id.bn_save)
        val readButton = findViewById<Button>(R.id.bn_read)
        val backButton = findViewById<Button>(R.id.bn_back)
        val firstTextView = findViewById<TextView>(R.id.tvOutputFirst)
        val lastTextView = findViewById<TextView>(R.id.tvOutputLast)

        //Load saved data when activity starts
        //firstEditText.setText(sharedPreferences.getString("first", ""))
        //lastEditText.setText(sharedPreferences.getString("last", ""))

        saveButton.setOnClickListener {
            //Save data to sharedpreferences
            with(sharedPreferences.edit()) {
                putString("first", firstEditText.text.toString())
                putString("last", lastEditText.text.toString())
                apply()
            }
        }

        readButton.setOnClickListener {
            //Update output textviews when read button is clicked
            "First name: ${sharedPreferences.getString("first", "")}".also { firstTextView.text = it }
            "Last name: ${sharedPreferences.getString("last", "")}".also { lastTextView.text = it }
        }

        backButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}