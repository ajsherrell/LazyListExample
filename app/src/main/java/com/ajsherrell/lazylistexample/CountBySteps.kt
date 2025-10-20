package com.ajsherrell.lazylistexample

// Create a list of numbers that counts by a given int, or step.
// Stop the list at 1000.
class CountBySteps(private val step: Int) : Iterable<Int> {
    override fun iterator(): Iterator<Int> {
        return object : Iterator<Int> {
            private var current = 0

            override fun hasNext(): Boolean {
                return current <= 1000
            }

            override fun next(): Int {
                val value = current
                current += step
                return value
            }
        }
    }
}