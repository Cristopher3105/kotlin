package `9_estructura_repetitiva_for`

fun main() {
    println("ingrese la cantidad de triangulos")
    val n= readLine()?.toIntOrNull() ?: 0
    var triangulosMayorA12 =0
    for (i in 1.. n) {
        println("ingrese la base del triangulo $i")
        val base = readLine()?.toDoubleOrNull()?: 0.0
        println("ingrese la altura del triangulo $i")
        val altura = readLine()?.toDoubleOrNull()?: 0.0
        val superficie =(base * altura) /2
        println("triangulo $i")
        println("base: $base")
        println("altura: $altura")
        println("superficie: $superficie")
        if (superficie > 12){
            triangulosMayorA12
        }
    }
    println("cantidad de triangulos con superficie mayor a 12: $triangulosMayorA12")

}