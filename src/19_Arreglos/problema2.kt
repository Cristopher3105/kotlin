package `19_Arreglos`

fun main(){
    //definir los arreglos de enteros
    val arreglo1 = IntArray(4)
    val arreglo2 = IntArray(4)
    val arreglosuma = IntArray(4)
    //cagar el primer arreglo
    println("ingrese los elementos del primer arreglo: ")
    for (i in arreglo1.indices){
        println("elemento ${i + 1}: ")
        arreglo1[i] = readLine()?.toIntOrNull() ?: 0
    }
    //cargar el egundo arreglo
    println("ingrese los elementos del segundo arreglo")
    for(i in arreglo2.indices){
        println("elemento ${i + 1}: ")
        arreglo2[i] = readLine()?.toIntOrNull() ?: 0

    }
    //calcular la suma elemento a elemento
    for (i in arreglo2.indices){
        arreglosuma[i] = arreglo1[i] + arreglo2[i]
        println("Suma: $arreglosuma")
    }
    //imprimir resultados
    println("arreglo 1: ${arreglo1.joinToString()}")
    println("arreglo 2: ${arreglo2.joinToString()}")
    println("arreglo suma: ${arreglosuma.joinToString()}")
}