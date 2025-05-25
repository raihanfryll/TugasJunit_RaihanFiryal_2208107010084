package com.example.noteapp

import org.junit.Assert.*
import org.junit.Test

class NoteLogicTest {

    /* Test case: Menambahkan catatan baru ke dalam list */
    @Test
    fun testAddNote() {
        val notes = mutableListOf<String>()
        notes.add("Belajar Unit Test")
        assertTrue(notes.contains("Belajar Unit Test"))
    }

    /* Test case: Menghapus catatan dari list */
    @Test
    fun testRemoveNote() {
        val notes = mutableListOf("Catatan 1", "Catatan 2")
        notes.remove("Catatan 1")
        assertFalse(notes.contains("Catatan 1"))
    }
}
