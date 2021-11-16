package com.fh.ktornoteapp.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.fh.ktornoteapp.R
import com.fh.ktornoteapp.databinding.FragmentNoteDetailsBinding


class NoteDetails : BaseFragment(R.layout.fragment_note_details) {

    private lateinit var binding:FragmentNoteDetailsBinding


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding= FragmentNoteDetailsBinding.bind(view)
    }


}