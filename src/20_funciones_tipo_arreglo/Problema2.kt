package `20_funciones_tipo_arreglo`

fun main(){
    println("ingrese el tamaño del arreglo:")
    val n = readLine()?.toInt()?: 0
    val arreglo = cargarArreglo(n)
    val menor = encontrarMenor(arreglo)
    println("el menor elemento del arreglo es: $menor")
    if (seRepite(arreglo,menor)){
        println("el menor elemento se repite dentro del arreglo")


    } else {
        println("el menor elemento no se repite dentro del arreglo")
    }
}
fun cargarArreglo(n: Int): IntArray{
    val arreglo = IntArray(n)
    for(i in arreglo.indices){
        println("ingrese el elemento ${i+1}")
        arreglo[i] = readLine()?.toInt() ?: 0
    }
    return arreglo
}
fun encontrarMenor(arreglo: IntArray): Int{
    var menor = arreglo[0]
    for (elemento in arreglo){
        if(elemento < menor){
            menor = elemento
        }
    }
    return menor
}
fun seRepite(arreglo: IntArray, elemento: Int): Boolean{
    var conteo = 0
    for ( e in arreglo){
        if(e == elemento){
            conteo++
        }
    }
    return conteo > 1
}