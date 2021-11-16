package com.fh.ktornoteapp.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.fh.ktornoteapp.R
import com.fh.ktornoteapp.databinding.FragmentNotesBinding


class Notes : BaseFragment(R.layout.fragment_notes) {

    private lateinit var binding:FragmentNotesBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding= FragmentNotesBinding.bind(view)
    }

}