package `11_estructura_condicional_when_argumento`

fun main() {
    println("ingrese un valor entero positivo comprendido entre " + " 1 y 99999")
    val valor = readln().toInt()
    when (valor) {
        in 1..9 -> println("tiene 1 digito")
        in 10..99 -> println("tiene 2 digitos")
        in 100..999 -> println("tiene 3 digitos")
        in 1000..9999 -> println("tiene 4 digitos")
        in 10000..99999 -> println("tiene 5 digitos")
        else -> println("no se encuentra comprendido en el rango " + "indicado")

    }
}