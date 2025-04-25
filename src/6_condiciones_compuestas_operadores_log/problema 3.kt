package `6_condiciones_compuestas_operadores_log`

fun main() {
     print("ingresa elprimer numero")
    val num1 : Int = readln().toInt()
    print("ingresa numero")
    val num2 : Int = readln().toInt()
    print("ngrese numero")
    val num3 : Int = readln().toInt()
    if(num1 < 10 && num2 < 10 && num3 < 10)
        print("todos los numeros son menores a diez")
    else
        print("todos los numeros son mayores a diez")




}