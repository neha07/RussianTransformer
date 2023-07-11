package com.example.noteapp

class RussianPeasantMultiplicationTransformer {
    fun rmp(x: Int, y: Int): Int {
        val products = mutableListOf<Int>()
        var left = x
        var right = y

        while (left >= 1) {
            if (left % 2 != 0) {
                products.add(right)
            }
            left /= 2
            right *= 2
        }

        return products.sum()
    }
}