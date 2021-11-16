package com.fh.ktornoteapp.api

import com.fh.ktornoteapp.data.model.Note
import com.fh.ktornoteapp.data.model.remote.AccountRequest
import com.fh.ktornoteapp.data.model.remote.AddOwnerRequest
import com.fh.ktornoteapp.data.model.remote.DeleteNoteRequest
import com.fh.ktornoteapp.data.model.remote.SimpleResponse
import okhttp3.ResponseBody
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface NoteApi {

    @POST("/register")
    suspend fun register(
        @Body accountRequest: AccountRequest
    ): SimpleResponse


    @POST("/login")
    suspend fun login(
        @Body accountRequest: AccountRequest
    ): SimpleResponse


    @POST("/addNote")
    suspend fun addNote(
        @Body note: Note
    ): ResponseBody


    @POST("/deleteNote")
    suspend fun deleteNote(
        @Body deleteNoteRequest: DeleteNoteRequest
    ): ResponseBody


    @POST("/addOwnerToNote")
    suspend fun addOwnerToNote(
        @Body addOwnerRequest: AddOwnerRequest
    ): SimpleResponse


    @GET("/getNotes")
    suspend fun getNotes(): List<Note>


}