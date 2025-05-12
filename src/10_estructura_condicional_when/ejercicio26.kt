package `10_estructura_condicional_when`

fun main() {
    println("ingrese coordena x del punto")
    val x = readln().toInt()
    println("ingrese coordenada y del punto")
    val y = readln().toInt()
    when {
        x > 0 && y > 0 -> println("primer cuadrante")
        x < 0 && y < 0 -> println("primer cuadrante")
            x > 0 && y > 0 -> println("primer cuadrante")
        x < 0 && y > 0 -> println("primer cuadrante")
        x > 0 && y > 0 -> println("primer cuadrante")
    }
}