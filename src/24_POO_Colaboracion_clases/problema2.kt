package `24_POO_Colaboracion_clases`

class Estudiante(val nombre: String) {
    private var asistencias = 0

    fun registrarAsistencia() {
        asistencias++
    }

    fun imprimir() {
        println("Estudiante: $nombre, Asistencias: $asistencias")
    }
}

class Clase {
    private val estudiante1 = Estudiante("Juan")
    private val estudiante2 = Estudiante("María")
    private val estudiante3 = Estudiante("Pedro")

    fun marcarAsistencia() {
        estudiante1.registrarAsistencia()
        estudiante2.registrarAsistencia()
        estudiante3.registrarAsistencia()
    }

    fun reporte() {
        println("Reporte de asistencias:")
        estudiante1.imprimir()
        estudiante2.imprimir()
        estudiante3.imprimir()
    }
}

fun main() {
    val clase = Clase()
    clase.marcarAsistencia()
    clase.marcarAsistencia()
    clase.reporte()
} 