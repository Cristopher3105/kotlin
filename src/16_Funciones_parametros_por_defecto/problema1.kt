package `16_Funciones_parametros_por_defecto`

fun suma(n : Int = 2, sumInicial : Int = 0, num1: Int = 0): Int {
    var total = sumInicial + num1
    for ( i in 1..n){
        println("digite un valor")
        val num = readln().toInt()
        total += num
    }
    return total
}
fun main(){
    println("digite entre 2 y 5 digitos")
    println("cuantos digitos desea ingresar")
    val num = readln().toInt()
    val total = suma(num)
    println("la suma total de todos los digitos es: $total")
}

