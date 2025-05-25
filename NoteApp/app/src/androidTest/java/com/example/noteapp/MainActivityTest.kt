package com.example.noteapp

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    /* Test case: Memastikan tombol tambah muncul di tampilan utama */
    @Test
    fun testAddButtonDisplayed() {
        onView(withId(R.id.btnAdd)).check(matches(isDisplayed()))
    }

    /* Test case: Menambahkan catatan dan memastikan teks muncul */
    @Test
    fun testAddNoteFunctionality() {
        onView(withId(R.id.inputNote)).perform(typeText("Catatan Baru"), closeSoftKeyboard())
        onView(withId(R.id.btnAdd)).perform(click())
        onView(withText("Catatan Baru")).check(matches(isDisplayed()))
    }
}
