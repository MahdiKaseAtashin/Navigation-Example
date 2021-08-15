package com.mahdikaseatashin.navigationexample.other

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.mahdikaseatashin.navigationexample.R
import com.mahdikaseatashin.navigationexample.databinding.FragmentOtherBinding
import com.mahdikaseatashin.navigationexample.model.TestModel

class OtherFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        val binding: FragmentOtherBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_other, container, false)

        val testModel = TestModel(1,"Mahdi_K3F")
        binding.btnOtherFragment.setOnClickListener {
            findNavController().navigate(OtherFragmentDirections.actionOtherFragmentToOtherFragment2(testModel))
        }

        return binding.root
    }
}
