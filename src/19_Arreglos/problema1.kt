package `19_Arreglos`

fun main(){
    //definir el arreglo de enteros
    val arreglo = IntArray(8)
    //cargar el arreglo
    for (i in arreglo.indices) {
        println("ingrese el elemento ${i + 1}:")
        arreglo[i] = readLine()?.toIntOrNull() ?: 0
    }
        //variables para acumular valores
        var acumuladoTotal = 0
        var acumuladoMayores36 = 0
        var cantidadMayores50 = 0
        //analizar cada elemento del arrglo
        for (elemento in arreglo){
            acumuladoTotal += elemento
            if (elemento > 36){
                acumuladoMayores36 += elemento
            }
            if (elemento > 50){
                cantidadMayores50++
            }
        }
    //imprimir resultados
    println("valor acumulado de todos los elementos: $acumuladoTotal")
    println("valor acumulado de los elementos mayores a 36: $acumuladoMayores36")
    println("cantidad de valores mayores a 50: $cantidadMayores50")


    }