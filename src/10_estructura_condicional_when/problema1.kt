package `10_estructura_condicional_when`

fun main() {
    println("ingrese un numero entero")
    val numero = readLine()?.toInt() ?: 0
    when {
        numero > 0 -> println("el numero es positivo")
        numero < 0 -> println("el numero es negativo")
        else -> println("el numero es nulo(cero).")
    }

}