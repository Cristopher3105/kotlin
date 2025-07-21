package `21_POO_Conceptos`

class alumno {
    var nombre: String = ""
    var nota: Int = 0
    fun inicializar() {
        println("ingrese el numero del alumno:")
        nombre = readLine()?: ""
        println("ingrese la nota del alumno")
        nota = readLine()?.toInt() ?: 0
    }
    fun imprimir(){
        println("nombre: $nombre")
        println("nota: $nota")
    }
    fun mostrarResultado() {
        if (nota >= 7) {
            println("$nombre esta aprobado con una nota de $nota")

        } else {
            println("$nombre esta reprobado con una nota de $nota")

        }
    }
}
fun main(){
    val alumno1 = alumno()
    val alumno2 = alumno()
    println("ingrese los datos del primer alumno")
    alumno1.inicializar()
    println("ingrese los datos del segundo alumno")
    alumno2.inicializar()
    println("datos del primer alumno")
    alumno1.imprimir()
    alumno1.mostrarResultado()
    println("datos del segundo alumno")
    alumno2.imprimir()
    alumno2.mostrarResultado()











}