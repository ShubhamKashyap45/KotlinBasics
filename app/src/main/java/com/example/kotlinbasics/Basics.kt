package com.example.kotlinbasics

fun main(){

    val name = readln()

    makeCoffee(1, "Shubham")
    makeCoffee(2, "Aditya")
    makeCoffee(3, name)
}

fun makeCoffee(sugarCount : Int, name: String){
    if (sugarCount == 1){
        println("Coffee with $sugarCount spoons of sugar for $name")
    } else {
        println("Coffee with $sugarCount spoons of sugar for $name")
    }
}