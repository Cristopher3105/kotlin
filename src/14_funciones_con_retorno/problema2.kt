package `14_funciones_con_retorno`


fun retornarSuperficie(lado1: Int, lado2: Int): Int {
    return lado1 * lado2
}
fun main() {
    val lado1 = 5
    val lado2 = 10
    val superficie = retornarSuperficie(lado1, lado2)
    println("la superficie del rectanguloes: $superficie")
}