package ru.netology

fun main() {
    val likes = 32
    val one = "человеку"
    val many = "людям"

    val ending = if (likes % 10 == 1 && likes % 100 != 11) one else many
    println("Понравилось $likes $ending")
}