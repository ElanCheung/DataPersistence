package edu.farmingdale.alrajab.bcs421.database

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import edu.farmingdale.alrajab.bcs421.R

class DBAdapter(private val nameReading: ArrayList<User>) : RecyclerView.Adapter<DBAdapter.ViewHolder>() {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val fnameTextView: TextView = view.findViewById(R.id.tvLayoutFirst)
        val lnameTextView: TextView = view.findViewById(R.id.tvLayoutLast)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.itemlayout, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.fnameTextView.text = nameReading[position].firstName
        holder.lnameTextView.text = nameReading[position].lastName
    }
    override fun getItemCount() = nameReading.size

}