package `9_estructura_repetitiva_for`

fun main() {
    println("ingrese un numero del 1 al 10")
    val numero = readLine()?.toInt()?: 0
    if(numero in 1..10) {
        for (i in 1..12){
            val resultado = numero * i
            println("$resultado")
        }
    }else{
        println("numero fuera de rango. debe ser entre 1 y 10")
    }

}
