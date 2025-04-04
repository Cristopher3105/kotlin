package `5_estructura_condicionales_anidadas`

fun main() {
   print("ingresa un numero entero")
   val numero = readln().toInt()
    if (numero > 0 ){
        println("el numero es positivo")
    } else if ( numero == 0) {
        println ("el numero es nulo (cero)")
    } else {
        println("el numero es negativo")
    }


}