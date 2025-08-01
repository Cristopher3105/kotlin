package `23_POO_Metodos`

class Numeros {
    private val numeros = IntArray(6)

    fun leerNumeros() {
        for (i in numeros.indices) {
            print("Ingrese número ${i + 1}: ")
            numeros[i] = readln().toInt()
        }
        contarPositivos()
        contarNegativos()
    }

    private fun contarPositivos() {
        val positivos = numeros.count { it > 0 }
        println("Cantidad de números positivos: $positivos")
    }

    private fun contarNegativos() {
        val negativos = numeros.count { it < 0 }
        println("Cantidad de números negativos: $negativos")
    }
}

fun main() {
    val numeros = Numeros()
    numeros.leerNumeros()
}