package `27_POO_Data_class`
import kotlin.random.Random

data class Butaca(val numero: Int, var ocupada: Boolean) {
    override fun toString(): String {
        return "Butaca"
    }
}

fun main() {

    val butacas = List(5) { Butaca(it + 1, false) }


    println("Lista inicial:")
    println(butacas)


    repeat(2) {
        val numeroButaca = Random.nextInt(1, 6)
        val butaca = butacas.find { it.numero == numeroButaca }
        if (butaca != null && !butaca.ocupada) {
            butaca.ocupada = true
        } else {

            var nuevoNumero: Int
            do {
                nuevoNumero = Random.nextInt(1, 6)
                val nuevaButaca = butacas.find { it.numero == nuevoNumero }
                if (nuevaButaca != null && !nuevaButaca.ocupada) {
                    nuevaButaca.ocupada = true

                }
            } while (true)
        }
    }


    println("\nLista después de vender butacas:")
    for ((numero, ocupada) in butacas) {
        println("Butaca $numero → ${if (ocupada) "ocupada" else "libre"}")
    }


    val copiaButacas = butacas.map { it.copy() }
    println("\n¿Son las listas iguales? ${butacas == copiaButacas}")
    println("¿Son las referencias iguales? ${butacas === copiaButacas}")


    println("\nLista con toString personalizado:")
    println(butacas)
}