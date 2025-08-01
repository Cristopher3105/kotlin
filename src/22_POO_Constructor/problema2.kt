package `22_POO_Constructor`

class Libro(val titulo: String, val autor: String, val paginas: Int) {
    var leidas = 0

    fun leer(n: Int) {
        leidas += n
        if (leidas > paginas) leidas = paginas
        println("Quedan ${paginas - leidas} páginas por leer.")
    }

    fun infoLibro() {
        println("Título: $titulo")
        println("Autor: $autor")
        println("Páginas: $paginas")
        println("Leídas: $leidas")

    }

}


