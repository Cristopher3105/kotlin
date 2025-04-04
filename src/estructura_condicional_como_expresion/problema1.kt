package estructura_condicional_como_expresion

fun main() {
    print("ingrese un numero entero")
    val variable1: Int = readln().toInt()
    print("ngrese otro numero")
    val variable2: Int = readln().toInt()
    if (variable1 > variable2) {
        print("el mayor es $variable1")

}    else   {

    print("el mayor es $variable2")
   }


}