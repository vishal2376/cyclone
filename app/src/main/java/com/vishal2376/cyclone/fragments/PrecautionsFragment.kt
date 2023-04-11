package com.vishal2376.cyclone.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.vishal2376.cyclone.databinding.FragmentPrecautionsBinding

class PrecautionsFragment : Fragment() {

    private var _binding: FragmentPrecautionsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentPrecautionsBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tvPrecautionsDesc.text =
            "1.Stay tuned to weather updates Keep an eye on the latest weather updates, especially if there is a cyclone warning in your area. Follow reliable sources like the local weather bureau, news outlets, and government websites for accurate information. \n\n2.Prepare an emergency kit  Create an emergency kit with essential supplies like first aid kit, water, non-perishable food, flashlight, and spare batteries. Keep it in an easily accessible place in case you need to evacuate your home quickly. \n\n3.Secure your property  Secure loose objects and debris in your surroundings, especially those that can be easily carried by strong winds, such as outdoor furniture, garden tools, and toys. Secure windows, doors, and shutters properly to prevent damage to your property.\n\n4.Evacuate if necessary  If you are advised to evacuate, do so immediately. Don't wait until the last minute, as conditions can change quickly, making it difficult or dangerous to leave.\n\n5.Stay indoors  During the cyclone, stay indoors and avoid going outside, as it can be extremely dangerous. If you must go outside, wear protective clothing, such as a raincoat, and avoid walking or driving through floodwaters.\n\n6.Keep your phone charged  Make sure your phone is fully charged, and keep a power bank handy in case of power outages. This will ensure that you can stay connected with your loved ones and emergency services during the cyclone.\n\n7.Follow instructions from authorities  Listen to and follow the instructions of the authorities, such as emergency services, local council, and police. They have the expertise and experience to handle emergency situations.\n\n8.Stay calm  Finally, stay calm and don't panic. Cyclones can be scary, but keeping a clear head will help you make the right decisions and stay safe."
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}