package `20_funciones_tipo_arreglo`

fun main(){
    println("ingrese el tamaño del arreglo")
    val n = readln()?.toInt() ?: 0
    val arreglo = crearYcargarArreglo(n)
    val suma = sumarElementos(arreglo)
    println("la suma de los elementos del arreglo es: $suma")


}
fun crearYcargarArreglo(n: Int): IntArray {
    val arreglo = IntArray(n)
    for (i in arreglo.indices){
        println("ingrese el elemento ${i + 1}")
        arreglo[i] = readLine()?.toInt() ?: 0

    }
    return arreglo

}
fun sumarElementos(arreglo : IntArray): Int{
    var suma = 0
    for(elemento in arreglo){
        suma += elemento
    }
    return suma
}
