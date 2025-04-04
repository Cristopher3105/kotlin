package `5_estructura_condicionales_anidadas`

fun main() {
    print("ingresa un numero entero positivo de hasta tres cifras:")
    val numero = readln().toInt()
    if (numero < 0) {
        println("error: el numero debe ser positivo.")
} else if (numero < 10) {
        println("el numero tiene 1 cifra.")
    } else if ( numero < 100) {
        println("el numero tiene 2 cifras.")
    } else if (numero < 1000) {
        println("el numero tiene 3 cifras.")
    } else{
        println ("error: el numero tiene mas de 3 cifras")
    }

}