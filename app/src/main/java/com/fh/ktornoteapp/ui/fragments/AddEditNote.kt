package com.fh.ktornoteapp.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.fh.ktornoteapp.R
import com.fh.ktornoteapp.databinding.FragmentAddEditNoteBinding


class AddEditNote : BaseFragment(R.layout.fragment_add_edit_note) {

    private lateinit var binding:FragmentAddEditNoteBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding= FragmentAddEditNoteBinding.bind(view)
    }

}