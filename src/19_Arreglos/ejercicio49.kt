package `19_Arreglos`

fun main(){
    val arreglo = IntArray(5)
    for (i in arreglo.indices){
        println("ingrese elemento")
        arreglo[i] = readln().toInt()
    }
    println("primera componente del arreglo ${arreglo[0 ]}")
    println("ultima componente del "+"arreglo ${arreglo[arreglo.lastIndex]}")
}