package com.example.unish

fun main() {
    val dictionary = mapOf(
        "apple" to "A fruit",
        "cat" to "A small animal",
        "computer" to "An electronic device"
    )

    print("Enter a word: ")
    val word = readLine()

    println(dictionary[word] ?: "Word not found")
}
