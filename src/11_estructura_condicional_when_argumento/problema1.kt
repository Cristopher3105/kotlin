package `11_estructura_condicional_when_argumento`

fun main() {
    var sinHijos = 0
    var unHijo = 0
    var dosHijos = 0
    var masDeDosHijos = 0
    for (i in 1..10){
        println("ingrese la cantidad de hijos de la familia $i")
        val cantidadHijos = readLine()?.toInt() ?: 0

        when (cantidadHijos){
            0 ->sinHijos++
            1 ->unHijo++
            2 ->dosHijos++
            else ->masDeDosHijos++
        }
    }
    println("familias sin hijos: $sinHijos")
    println("familias con 1 hijo: $unHijo")
    println("familias con 2 hijos: $dosHijos")
    println("familias con mas de 2 hijos: $masDeDosHijos")
}