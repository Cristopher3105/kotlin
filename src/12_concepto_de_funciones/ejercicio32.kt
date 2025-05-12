package `12_concepto_de_funciones`

fun presentacion() {
    println("programa que permite cargar dos valores por teclado" )
    println("efectua la suma de los valores")
    println("muestra el resultado de la suma")
    println("*************")

}
fun cargarSumar() {
    println("ingrese el primer valor")
    val valor1= readln().toInt()
    println("ingrese el segundo valor")
    val valor2 = readln().toInt()
    val suma = valor1 + valor2
    println("la suma de los dos valores es $suma")
}
fun finalizacion() {
    println("**************")
    println("gracias por utilizar este programa")

}
fun main() {
    presentacion()
    cargarSumar()
    finalizacion()
}