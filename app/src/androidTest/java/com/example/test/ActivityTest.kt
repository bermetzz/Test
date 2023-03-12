package com.example.test

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import kotlinx.coroutines.runBlocking
import org.junit.Rule
import org.junit.Test

class ActivityTest {
    @Rule
    @JvmField
    var rule: ActivityScenarioRule<*> = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun simpleAdd() {
        runBlocking {
            Espresso.onView(withId(R.id.firstEt)).perform(ViewActions.typeText("4"))
            Espresso.onView(withId(R.id.firstEt)).perform(ViewActions.closeSoftKeyboard())
            Espresso.onView(withId(R.id.secondEt)).perform(ViewActions.typeText("5"))
            Espresso.onView(withId(R.id.secondEt)).perform(ViewActions.closeSoftKeyboard())
            Espresso.onView(withId(R.id.calculateBtn)).perform(ViewActions.click())
            Espresso.onView(withId(R.id.resultTv)).check(ViewAssertions.matches(ViewMatchers.withText("9")))
        }
    }
}