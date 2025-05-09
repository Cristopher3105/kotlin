package estructura_repetitiva_while

fun main() {
    var x = 1
    var suma = 0
    while (x <= 10) {
        print("ingrese un valor:")
        val valor = readln().toInt()
        suma = suma + valor
        x = x + 1
    }
println("la suma de los 10 valores ingresados es $suma")
    val promedio = suma / 10
    println("el promedio es $promedio")

}