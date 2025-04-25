package `6_condiciones_compuestas_operadores_log`

fun main() {
    print("ingresa elprimer numero")
    val num1: Int = readln().toInt()
    print("ingresa numero")
    val num2: Int = readln().toInt()
    print("ngrese numero")
    val num3: Int = readln().toInt()
    if (num1 < 10 || num2 < 10 || num3 < 10)
        print("algun numero es menor a diez")
    else
        print("no tiene ningun numero menor a diez")
}