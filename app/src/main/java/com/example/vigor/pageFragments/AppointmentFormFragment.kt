package com.example.vigor.pageFragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import com.example.vigor.R
import com.example.vigor.databinding.FragmentAppointmentFormBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class AppointmentFormFragment : Fragment() {

    private lateinit var binding:FragmentAppointmentFormBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= FragmentAppointmentFormBinding.inflate(inflater, container, false)

        val category=resources.getStringArray(R.array.categories)
        val arrayAdapterCategory=ArrayAdapter(requireContext(),R.layout.drop_down,category)
        binding.autoCompleteCategory.setAdapter(arrayAdapterCategory)

        val doctor=resources.getStringArray(R.array.doctors)
        val arrayAdapterDoctor=ArrayAdapter(requireContext(),R.layout.drop_down,doctor)
        binding.autoCompleteDoctor.setAdapter(arrayAdapterDoctor)

        val chamber=resources.getStringArray(R.array.chambers)
        val arrayAdapterChamber=ArrayAdapter(requireContext(),R.layout.drop_down,chamber)
        binding.autoCompleteChamber.setAdapter(arrayAdapterChamber)

        val payment=resources.getStringArray(R.array.payment_type)
        val arrayAdapterPayment=ArrayAdapter(requireContext(),R.layout.drop_down,payment)
        binding.autoCompletePayment.setAdapter(arrayAdapterPayment)

        return binding.root
    }

}