package `6_condiciones_compuestas_operadores_log`

fun main() {

    print("ingrese el dia:")
    val dia1 = readln().toInt()
    print("ingrese el mes:")
    val mes1 = readln().toInt()
    print("ingrese el año:")
    val año1 = readln().toInt()
    if (mes1 == 12 && dia1 >= 25) {
        print("la fecha corresponde a Navidad.")
    }  else {
        print("la  fecha NO corresponde a Navidad.")
    }
}