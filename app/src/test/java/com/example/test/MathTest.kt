package com.example.test

import junit.framework.TestCase.assertEquals
import org.junit.After
import org.junit.Before
import org.junit.Test

class MathTest {

    private var math: Math? = null

    @Before
    fun init() {
        math = Math()
    }

    @Test
    fun simpleAddTest() {
        assertEquals("5", math?.add("3", "2"))
    }

    @Test
    fun simpleSymbolTest() {
        assertEquals("type only digits!", math?.add("2jj", "2"))
    }

    @Test
    fun simpleWithPositiveTest() {
        assertEquals("4", math?.add("+2", "2"))
    }

    @Test
    fun simpleWithNegativeTest() {
        assertEquals("-1", math?.add("2", "-3"))
    }

    @Test
    fun simpleEmptyTest() {
        assertEquals("type only digits!", math?.add("+2", ""))
    }

    @Test
    fun simpleDivideTest() {
        assertEquals("4", math?.divide("8", "2"))
    }

    @Test
    fun simpleSymbolDivision() {
        assertEquals("type only digits!", math?.divide("2aa", "2"))
    }

    @Test
    fun simpleZeroDivision() {
        assertEquals("0!", math?.divide("2", "0"))
    }

    @Test
    fun simpleFloatDivision() {
        assertEquals("4.5", math?.divide("9", "2"))
    }

    @Test
    fun simpleWholeDivision() {
        assertEquals("2", math?.divide("4", "2"))
    }


    @After
    fun detach() {
        math = null
    }
}