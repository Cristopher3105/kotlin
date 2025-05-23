package `14_funciones_con_retorno`


fun retornarsuperficie(lado: Int): Int {
    val sup = lado + lado
    return sup
}
fun main() {
    println("ingrese el valor del lado del cuadrado:")
    val lado = readln().toInt()
    val superficie = readln().toInt()
    println("la superficie del cuadrado es $superficie")
}