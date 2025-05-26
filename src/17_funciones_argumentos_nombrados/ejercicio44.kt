package `17_funciones_argumentos_nombrados`

fun calcularSueldo(nombre: String, costoHora: Double,cantidadHoras: Int){
    val sueldo = costoHora * cantidadHoras
    println("$nombre trabajo $cantidadHoras horas, se le paga por hora $costoHora por lo tanto le corresponde" + "un sueldo de $sueldo")
}
fun main (){
    calcularSueldo("juan", 10.5, 120)
    calcularSueldo(costoHora = 12.0, cantidadHoras = 40, nombre = "ana")
    calcularSueldo(cantidadHoras = 90, nombre = "luis", costoHora = 7.25)
}