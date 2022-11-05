package com.example.vigor.mainFragments

import android.os.Bundle
import android.text.Layout
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.example.vigor.R

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_home, container, false)
        val button=view.findViewById<Button>(R.id.bt_appointment_form)
        button.setOnClickListener{
            findNavController().navigate(R.id.action_homeFragment_to_appointmentFormFragment)       //to go to appointment booking page
        }
        return view
    }

}