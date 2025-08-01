package `23_POO_Metodos`

class Temperaturas {
    private val temperaturas = DoubleArray(7)

    fun cargarDatos() {
        for (i in temperaturas.indices) {
            print("Ingrese temperatura del día ${i + 1}: ")
            temperaturas[i] = readln().toDouble()
        }
        mostrarMaxima()
        mostrarMinima()
    }

    private fun mostrarMaxima() {
        val maxima = temperaturas.maxOrNull() ?: 0.0
        println("La temperatura máxima es: $maxima")
    }

    private fun mostrarMinima() {
        val minima = temperaturas.minOrNull() ?: 0.0
        println("La temperatura mínima es: $minima")
    }
}

fun main() {
    val temperaturas = Temperaturas()
    temperaturas.cargarDatos()
}
.