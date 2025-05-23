package `14_funciones_con_retorno`

fun calcularPromedio(a: Int, b: Int, c: Int): Double {
    return (a + b + c) / 3.0
}
fun main(){
    val a = 10
    val b = 20
    val c = 30
    val promedio = calcularPromedio(a, b, c)
    println("el promedio es: $promedio")
}
