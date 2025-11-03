package com.example.unish

fun main() {
    val dictionary = mapOf(
        "apple" to "A fruit",
        "cat" to "A small animal",
        "book" to "A set of written pages"
    )

    print("Enter a word: ")
    val word = readLine()

    println(dictionary[word] ?: "Word not found")
}
