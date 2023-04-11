package com.vishal2376.cyclone.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.vishal2376.cyclone.R
import com.vishal2376.cyclone.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentHomeBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.layoutHelp.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_helpFragment)
        }

        binding.layoutPrecautions.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_precautionsFragment)
        }

        binding.layoutMap.setOnClickListener {
            Toast.makeText(requireContext(), "Implementing soon", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}