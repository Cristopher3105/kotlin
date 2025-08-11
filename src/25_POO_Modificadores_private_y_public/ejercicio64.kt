package `25_POO_Modificadores_private_y_public`

class Dado{
private var valor: Int = 1
public fun tirar(){
    valor = ((Math.random() *6)+1).toInt()
}
fun imprimir(){
    separador()
    println("valor del dado: $valor")
    separador()
}
private fun separador() = println("***************")
}
fun main() {
    val dado1 = Dado()
    dado1.tirar()
    dado1.imprimir()
}