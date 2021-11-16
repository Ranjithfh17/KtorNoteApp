package com.fh.ktornoteapp.room

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.fh.ktornoteapp.data.model.Note
import kotlinx.coroutines.flow.Flow

@Dao
interface NoteDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertNote(note: Note)


    @Query("DELETE FROM notes WHERE id = :notedId")
    suspend fun deleteNoteById(notedId:String)


    @Query("DELETE FROM notes WHERE isSynced = 1")
    suspend fun deleteAllSyncedNote()


    @Query("SELECT * FROM notes WHERE id =:notedId")
    fun observeNoteById(notedId: String):LiveData<Note>



    @Query("SELECT * FROM notes WHERE id =:notedId")
    suspend fun getNoteById(notedId: String):Note?


    @Query("SELECT * FROM notes ORDER BY date DESC")
    fun getAllNotes():Flow<List<Note>>


    @Query("SELECT * FROM notes WHERE isSynced = 0")
    suspend fun getAllUnSyncedNotes():List<Note>





}