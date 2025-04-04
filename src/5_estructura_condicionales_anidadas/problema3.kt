package `5_estructura_condicionales_anidadas`

fun main() {
    print("ingrese la cantidad total de preguntas")
    val totalPreguntas = readln().toInt()
    print(" ingrese la cantidad de preguntas correctas")
    val preguntasCorecctas = readln().toInt()
    val porcentaje = 10
    (preguntasCorecctas.toDouble()/ totalPreguntas.toDouble()) * 100
    println("el porcentaje de respuestas correctas es: $porcentaje")
    if (porcentaje >= 90) {
        println("nivel: execelente")
    } else if (porcentaje >= 80) {
        println("nivel: bueno")
    } else if (porcentaje >= 70) {
        println("nivel: regular")
    } else {
        println("nivel: insuficiente")

    }
}