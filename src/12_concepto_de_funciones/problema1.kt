package `12_concepto_de_funciones`

fun calcularCuadrado() {
    println("ingrese un numero")
    val numero = readLine()?.toInt() ?: 0
    val cuadrado = numero * numero
    println("el cuadrado de $numero es $cuadrado")
}
fun calcularproducto() {
    println("ingrese el primer numero")
    val num1 = readLine()?.toInt() ?: 0
    println("ingrese el segundo numero")
    val num2 = readLine()?.toInt() ?: 0
    val producto = num1 * num2
    println(" el producto de $num1 y $ num2 es $producto")
}
fun main() {
    calcularCuadrado()
    calcularproducto()
}
