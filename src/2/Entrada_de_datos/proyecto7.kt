package `2`.Entrada_de_datos

/* se debe desarrollar un programa que pida el ingreso del precio de un articulo y la cantidad que lleva el cliente.
y mostrar lo que que debe abonar el comprador

 */
fun main(){
    print("ingrese el proceso del producto")
    val precio: Double = readln(). toDouble()
    print("ingrese la cantidad de productos:")
    val cantidad: Int = readln().toInt()
    val total: Double = precio * cantidad
    println("el total a pagar es $total")


}