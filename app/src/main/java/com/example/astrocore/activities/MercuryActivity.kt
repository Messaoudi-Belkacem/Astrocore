package com.example.astrocore.activities

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.astrocore.Adapters.MercuryAdapter
import com.example.astrocore.Data.PlanetInfo
import com.example.astrocore.R

class MercuryActivity : AppCompatActivity() {
    private lateinit var rv : RecyclerView
    private lateinit var newArray : ArrayList<PlanetInfo>
    private lateinit var adapter: MercuryAdapter
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mercury)

        val rec=findViewById<RecyclerView>(R.id.rc)
        rec.layoutManager= LinearLayoutManager(baseContext, RecyclerView.VERTICAL,false)


        adapter=MercuryAdapter(baseContext)
        rec.adapter=adapter
    }
}