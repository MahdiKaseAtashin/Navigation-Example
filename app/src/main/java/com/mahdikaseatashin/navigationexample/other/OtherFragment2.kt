package com.mahdikaseatashin.navigationexample.other

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.mahdikaseatashin.navigationexample.R
import com.mahdikaseatashin.navigationexample.databinding.FragmentOther2Binding
import com.mahdikaseatashin.navigationexample.databinding.FragmentOtherBinding
import com.mahdikaseatashin.navigationexample.second.SecondFragmentArgs

class OtherFragment2 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val testModelFragmentArgs by navArgs<OtherFragment2Args>()
        val testModel = testModelFragmentArgs.testModel
        Toast.makeText(context, "ID : ${testModel.id}\nUsername : ${testModel.username}", Toast.LENGTH_SHORT).show()

        // Inflate the layout for this fragment
        val binding: FragmentOther2Binding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_other2, container, false)

        return binding.root
    }
}
