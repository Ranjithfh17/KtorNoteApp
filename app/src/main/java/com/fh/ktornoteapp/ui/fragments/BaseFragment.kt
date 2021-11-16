package com.fh.ktornoteapp.ui.fragments

import androidx.fragment.app.Fragment
import com.google.android.material.snackbar.Snackbar

abstract class BaseFragment(id:Int):Fragment(id){

    fun showSnackbar(text: String) {
        Snackbar.make(
            requireView(),
            text,
            Snackbar.LENGTH_LONG
        ).show()
    }


}