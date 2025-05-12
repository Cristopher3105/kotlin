package `10_estructura_condicional_when`

fun main() {
    println("ingrese tres lados de un triangulo")
    println("ingrese el lado 1")
    val lad1 = readln().toInt()
    println("ingree lado 2")
    val lad2 = readln().toInt()
    println("ingrese el lado 3")
    val lad3 = readln().toInt()
    when{
        lad1 == lad2 && lad2 == lad3 -> println("el triangulo es equilatero")
        lad1 == lad2 || lad2 == lad3 || lad1 == lad3 -> println("el triangulo es isoceles")
        else -> println("el triangulo es escalante")
    }
}