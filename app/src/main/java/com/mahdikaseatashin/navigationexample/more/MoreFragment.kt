package com.mahdikaseatashin.navigationexample.more

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.mahdikaseatashin.navigationexample.R
import com.mahdikaseatashin.navigationexample.databinding.FragmentMoreBinding


class MoreFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentMoreBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_more, container, false)

        binding.btnStartMoreFragment.setOnClickListener {
            findNavController().navigate(MoreFragmentDirections.actionMoreFragmentToNavGraphTest())
        }

        return binding.root
    }
}
