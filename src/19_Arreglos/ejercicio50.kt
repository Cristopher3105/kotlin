package `19_Arreglos`

fun main(){
    val arreglo = IntArray(10)
    for (i in arreglo.indices){
        println("ingrese elemento")
        arreglo[1] = readln().toInt()
    }
    for (elemento in arreglo)
        println(elemento)
    //********************************
    //interando con metodo withindex
    for ((indice, elemento)in arreglo.withIndex())
        println("en el indice $indice se almacena el "+"elemnto $elemento")
}