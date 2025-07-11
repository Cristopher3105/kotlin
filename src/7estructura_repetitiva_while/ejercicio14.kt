package `7estructura_repetitiva_while`

import proyecto_kotlin.registrarNota

fun main() {

    val estudiantes = mutableListOf<String>()
    val notas = mutableListOf<Int>()

    println("Sistema de calificaciones")
    println("Ingresa los datos de 5 estudiantes:\n")

    for (i in 1..5) {
        print("Nombre del estudiante #$i: ")
        val nombre = readLine().toString()
        estudiantes.add(nombre)

        val nota = registrarNota(nombre)
        notas.add(nota)

        val clasificacion = when (nota) {
            in 90..100 -> "Excelente"
            in 80..89 -> "Buena"
            in 70..79 -> "Aprobada"
            else -> "Reprobada"
        }
        println("Nota de $nombre: $nota - $clasificacion\n")
    }

    val aprobados = notas.count { it >= 70 }
    val reprobados = notas.size - aprobados
    val promedio = notas.sum().toDouble() / notas.size

    var notaMaxima = notas[0]
    var notaMinima = notas[0]
    for (nota in notas) {
        if (nota > notaMaxima) notaMaxima = nota
        if (nota < notaMinima) notaMinima = nota
    }

    println("Resumen general:")
    println("Estudiantes aprobados: $aprobados")
    println("Estudiantes reprobados: $reprobados")
    println("Promedio general: ${"%.2f".format(promedio)}")
    println("Nota más alta: $notaMaxima")
    println("Nota más baja: $notaMinima")
}
