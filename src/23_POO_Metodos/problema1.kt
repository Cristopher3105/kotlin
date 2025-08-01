package `23_POO_Metodos`

class Notas {
    private val notas = IntArray(4)

    fun cargarNotas() {
        for (i in notas.indices) {
            print("Ingrese nota del estudiante ${i + 1}: ")
            notas[i] = readln().toInt()
        }
        promedioNotas()
        aprobados()
    }

    private fun promedioNotas() {
        val promedio = notas.sum().toDouble() / notas.size
        println("El promedio de las notas es: $promedio")
    }

    private fun aprobados() {
        val aprobados = notas.count { it >= 70 }
        println("Cantidad de estudiantes aprobados: $aprobados")
    }
}

fun main() {
    val notas = Notas()
    notas.cargarNotas()
}