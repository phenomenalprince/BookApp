package com.wiki.book.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.wiki.book.R

class AboutAppFragment : Fragment() {

    lateinit var aboutApp: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_about_app, container, false)

        aboutApp = view.findViewById(R.id.txtAboutApp)

        return view
    }

}