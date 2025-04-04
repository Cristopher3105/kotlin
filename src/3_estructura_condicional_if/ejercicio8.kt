package `3_estructura_condicional_if`

fun main() {
   print("ingrese primer valor:")
    val valor1 = readln().toInt()
    print("ingrese segundo valor:")
    val valor2 = readln().toInt()
    val mayor = if (valor1 > valor2) valor1 else valor2
    print("el mayor entre $valor1 y $valor2 es $mayor ")
}