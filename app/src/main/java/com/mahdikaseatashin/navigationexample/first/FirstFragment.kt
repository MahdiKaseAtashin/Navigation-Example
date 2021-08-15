package com.mahdikaseatashin.navigationexample.first

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.mahdikaseatashin.navigationexample.R
import com.mahdikaseatashin.navigationexample.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentFirstBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_first, container, false
        )
        binding.btnStartFirstFragment.setOnClickListener {
            val username = binding.edtUsernameFirstFragment.text.toString()
            if (username.isNotEmpty())
                findNavController().navigate(FirstFragmentDirections.actionFirstFragmentToSecondFragment(username))
            else
                binding.edtUsernameFirstFragment.error = "Username can not be empty!"
        }

        return binding.root
    }

}
