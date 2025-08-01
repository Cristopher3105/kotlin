package `23_POO_Metodos`

class operaciones{
    var valor1: Int = 0
    var valor2: Int = 0

     fun cargar() {
        println("ingrese primer valor")
        valor1 = readln().toInt()
        println("ingrese segudno valor")
        valor2 = readln().toInt()
        sumar()
        restar()
    }
    fun sumar() {
        val suma = valor1 + valor2
        println("la suma de $valor1 y $valor2 es $suma")

    }
    fun restar(){
        val resta = valor1 - valor2
        println("la resta de $valor1 y  $valor2 es $resta")
    }
}
fun main() {
    val operaciones1 = operaciones()
    operaciones1.cargar()
}