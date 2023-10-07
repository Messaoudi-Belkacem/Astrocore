package com.example.astrocore.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.astrocore.Adapters.MercuryAdapter
import com.example.astrocore.Adapters.VenusAdapter
import com.example.astrocore.Data.PlanetInfo
import com.example.astrocore.R

class VenusActivity : AppCompatActivity() {
    private lateinit var rv : RecyclerView
    private lateinit var newArray : ArrayList<PlanetInfo>
    private lateinit var adapter: VenusAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_venus)

        val rec=findViewById<RecyclerView>(R.id.rc1)
        rec.layoutManager= LinearLayoutManager(baseContext, RecyclerView.VERTICAL,false)


        adapter= VenusAdapter(baseContext)
        rec.adapter=adapter
    }
}