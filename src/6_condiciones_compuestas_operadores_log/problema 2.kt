package `6_condiciones_compuestas_operadores_log`

fun main() {
    print("ingrese el primer valor:")
val valor1  = readln().toInt()
    print("ingrese el segundo valor")
    val valor2 = readln().toInt()
    print("ingrese el tercer valor")
    val valor3 = readln().toInt()
    if (valor1 == valor2 && valor2 == valor3) {
        val cubo = valor1 * valor1 * valor1
        print("los tres valores son iguales. el cubo del numero es: $cubo")
    } else {
        print("los tres valores no son iguales")
    }

}


