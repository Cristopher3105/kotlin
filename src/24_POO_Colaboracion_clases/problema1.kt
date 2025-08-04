package `24_POO_Colaboracion_clases`

class Libro(val titulo: String) {
    private var prestado = false

    fun prestar() {
        if (!prestado) {
            prestado = true
            println("El libro '$titulo' ha sido prestado.")
        } else {
            println("El libro '$titulo' ya está prestado.")
        }
    }

    fun devolver() {
        if (prestado) {
            prestado = false
            println("El libro '$titulo' ha sido devuelto.")
        } else {
            println("El libro '$titulo' no necesita ser devuelto.")
        }
    }

    fun estado() {
        val estado = if (prestado) "prestado" else "disponible"
        println("El libro '$titulo' está $estado.")
    }
}

class Biblioteca {
    private val libro1 = Libro("El Señor de los Anillos")
    private val libro2 = Libro("Harry Potter")
    private val libro3 = Libro("La Sombra del Viento")

    fun operar() {
        libro1.prestar()
        libro2.prestar()
        libro3.prestar()
        libro1.devolver()
        libro2.prestar()
        libro3.devolver()
    }

    fun revisarEstado() {
        println("Estado de los libros:")
        libro1.estado()
        libro2.estado()
        libro3.estado()
    }
}

fun main() {
    val biblioteca = Biblioteca()
    biblioteca.operar()
    biblioteca.revisarEstado()
}