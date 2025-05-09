package `7estructura_repetitiva_while`

fun main() {



    print("ingrese un valor")
    val valor = readln().toInt()
    var x = 1
    while (x <= valor) {
        println(x)
        x = x + 1
    }
}