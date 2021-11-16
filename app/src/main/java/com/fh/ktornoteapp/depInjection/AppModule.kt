package com.fh.ktornoteapp.depInjection

import android.content.Context
import androidx.room.Room
import com.fh.ktornoteapp.api.BasicAuthInterceptor
import com.fh.ktornoteapp.api.NoteApi
import com.fh.ktornoteapp.room.NoteDao
import com.fh.ktornoteapp.room.NoteDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
interface AppModule {


    @Singleton
    @Provides
    fun provideNoteDatabase(@ApplicationContext app: Context) =
        Room.databaseBuilder(app, NoteDatabase::class.java, "Note_db")
            .build()


    @Singleton
    @Provides
    fun provideNoteDao(noteDatabase: NoteDatabase): NoteDao =
        noteDatabase.noteDao()

    @Singleton
    @Provides
    fun provideBaseAuth() = BasicAuthInterceptor()


    @Singleton
    @Provides
    fun provideRetrofit(basicAuthInterceptor: BasicAuthInterceptor): Retrofit {
        val loggingInterceptor = HttpLoggingInterceptor()
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY)

        val client = OkHttpClient.Builder()
            .addInterceptor(loggingInterceptor)
            .addInterceptor(basicAuthInterceptor)
            .build()



        return Retrofit.Builder()
            .baseUrl("")
            .addConverterFactory(GsonConverterFactory.create())
            .client(client)
            .build()
    }


    @Singleton
    @Provides
    fun provideNoteApi(retrofit: Retrofit): NoteApi = retrofit.create(NoteApi::class.java)


}