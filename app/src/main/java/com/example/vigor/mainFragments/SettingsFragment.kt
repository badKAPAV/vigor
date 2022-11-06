package com.example.vigor.mainFragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.vigor.R

class SettingsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_settings, container, false)

        val bt_acc_settings = view.findViewById<CardView>(R.id.bt_account_settings)
        bt_acc_settings.setOnClickListener {
            findNavController().navigate(R.id.action_settingsFragment_to_accountSettingsFragment)       //to go to appointment booking page
        }
            val bt_help = view.findViewById<CardView>(R.id.bt_help)
            bt_help.setOnClickListener {
                findNavController().navigate(R.id.action_settingsFragment_to_helpFragment)       //to go to appointment booking page
            }
            return view
        }

    }