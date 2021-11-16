package com.fh.ktornoteapp.ui.fragments

import android.os.Bundle
import android.view.View
import com.fh.ktornoteapp.R
import com.fh.ktornoteapp.databinding.FragmentAuthBinding


class Auth : BaseFragment(R.layout.fragment_auth) {

    private lateinit var binding: FragmentAuthBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentAuthBinding.bind(view)
    }


}