package com.example.secondproject

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.secondproject.databinding.ActivityMyPocketFragmentBinding

class MyPocketFragment : Fragment() {
    lateinit var binding: ActivityMyPocketFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = ActivityMyPocketFragmentBinding.inflate(layoutInflater)
        return binding.root
    }
}