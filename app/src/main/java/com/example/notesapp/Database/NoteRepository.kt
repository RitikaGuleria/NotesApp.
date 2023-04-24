package com.example.notesapp.Database

import androidx.lifecycle.LiveData
import com.example.notesapp.Models.Note

//This class will act as intermediate between MainActivity and Database
class NoteRepository(private val noteDAO: NoteDAO) {

    val allNotes : LiveData<List<Note>> = noteDAO.getAllNotes()

    suspend fun insert(note:Note)
    {
        noteDAO.insert(note)
    }
    suspend fun delete(note: Note)
    {
        noteDAO.delete(note)
    }
    suspend fun update(note: Note)
    {
        noteDAO.update(note.id,note.title,note.note)
    }
}