package edu.farmingdale.alrajab.bcs421.database

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import edu.farmingdale.alrajab.bcs421.R

class ReadData : AppCompatActivity() {

    private lateinit var dbHelper: NameRepository
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: DBAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_read_data)

        //todo:01 create layout for each item
        //todo:02 then you need adapter

        //Initalize dbHelper
        dbHelper = NameRepository.getInstance(this)

        //Initalize recyclerview
        recyclerView = findViewById(R.id.recyclerView)

        //Fetch data from database
        val userList = dbHelper.getAll() as ArrayList<User>

        //Initalize the adapter with the data
        adapter = DBAdapter(userList)

        //Setup recylerview
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter

    }
}

