package com.mahdikaseatashin.navigationexample.second

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.mahdikaseatashin.navigationexample.R
import com.mahdikaseatashin.navigationexample.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    companion object{
        private const val TAG = "SecondFragment"
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val usernameFragmentArgs by navArgs<SecondFragmentArgs>()

        // Inflate the layout for this fragment
        val binding : FragmentSecondBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_second,container,false)

        binding.tvUsernameSecondFragment.text = usernameFragmentArgs.username

        binding.btnEndSecondFragment.setOnClickListener {
            findNavController().navigate(SecondFragmentDirections.actionSecondFragmentToHomeFragment2())
        }

        return binding.root
    }
}
