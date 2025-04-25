package `6_condiciones_compuestas_operadores_log`

fun main() {
    print("ingrese un valor:")
    val val1: Int = readln().toInt()
    print("ingrese otro valor:")
    val val2: Int = readln().toInt()
    print("ingese otro valor:")
    val val3: Int = readln().toInt()
    val mayor = if ( val1 > val2 && val1 > val3)val1 else if (val2 > val3) val2 else val3
    val menor = if (val1 < val2 && val1 < val3) val1 else if (val2 < val3) val2 else val3
    print("el mayor es: $mayor")
       print("el menor es $menor")

}
