package com.example.astrocore.activities

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.astrocore.R

class HomeFragment : Fragment() {
    private lateinit var layout1: View
    private lateinit var layout2: View
    private lateinit var layout3: View
    private lateinit var persontage1: TextView
    private lateinit var persontage2: TextView
    private lateinit var persontage3: TextView
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView: View = inflater.inflate(R.layout.fragment_home, container, false)
        Log.d("AboutMovieFragment.java", "The onCreateView method called")
        layout1 = rootView.findViewById(R.id.mercurylayout)
        layout2 = rootView.findViewById(R.id.venuslayout)
        layout3 = rootView.findViewById(R.id.earthlayout)
        persontage1 = rootView.findViewById(R.id.mercurypersontage)
        persontage2 = rootView.findViewById(R.id.venuspersontage)
        persontage3 = rootView.findViewById(R.id.earthpersontage)
        return rootView
    }
}