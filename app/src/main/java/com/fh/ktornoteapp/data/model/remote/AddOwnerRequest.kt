package com.fh.ktornoteapp.data.model.remote

data class AddOwnerRequest(
    val owner: String,
    val noteID: String
)