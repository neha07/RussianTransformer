package com.example.noteapp

import org.junit.Test

import org.junit.Assert.*


class RussianPeasantMultiplicationTrasformerTest {
    @Test
    fun testRmp() {
        val transformer = RussianPeasantMultiplicationTransformer()

        // Test case 1: 5 * 3
        val result1 = transformer.rmp(5, 3)
        assertEquals(15, result1)

        // Test case 2: 7 * 9
        val result2 = transformer.rmp(7, 9)
        assertEquals(63, result2)

        // Test case 3: 0 * 10
        val result3 = transformer.rmp(0, 10)
        assertEquals(0, result3)

        // Test case 4: 12 * 4
        val result4 = transformer.rmp(12, 4)
        assertEquals(48, result4)

        // Test case 5: 1 * 1
        val result5 = transformer.rmp(1, 1)
        assertEquals(1, result5)
    }
}