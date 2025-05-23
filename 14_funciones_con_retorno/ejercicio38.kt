package `14_funciones_con_retorno`

fun retornarMayor(v1: Int, v2: Int): Int {
    if (v1 > v2)
        return v1
    else
        return v2
}
fun main(){
    println("ingrese el primer valor")
    val valor1 = readln().toInt()
    println("ingrese el segundo valor")
    val valor2 = readln().toInt()
    println("el mayor entre $valor1 y $valor2 es ${retornarMayor(valor1, valor2)}")

}