package `11_estructura_condicional_when_argumento`

fun main() {
    println("ingrese un valor entero entre 1 y 5")
    val valor = readln().toInt()
    when (valor) {
        1 -> println("uno")
        2 -> println("dos")
        3 -> println("tres")
        4 -> println("cuatro")
        5 -> println("cinco")
        else -> println("valor fuera de rango")
    }
}