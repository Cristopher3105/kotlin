package `25_POO_Modificadores_private_y_public`

class operaciones
private var valor1: Int = 0
private var valor2: Int = 0
fun cargar(){
    println("ingrese primer valor")
    valor1 = readln().toInt()
    println("ingrese segundo valor")
    valor1 = readln().toInt()
    sumar()
    restar()
}
private fun sumar(){
    val suma = valor1 + valor2
    println("la suma de $valor1 y $valor2 es $suma")

}
private fun restar(){
    val resta = valor1 - valor2
    val suma = valor1 - valor2
    println("LA SUMA DE $valor1 Y $valor2 es $suma")
}

