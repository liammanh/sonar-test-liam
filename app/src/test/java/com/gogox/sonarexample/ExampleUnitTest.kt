package com.gogox.sonarexample

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun divide_isCorrect() {
        assertEquals(2, 4 / 2)
    }

    @Test
    fun minus_isCorrect() {
        assertEquals(2, 4 - 2)
    }

    @Test
    fun multiple_isCorrect() {
        assertEquals(8, 4 * 2)
    }
}