package `10_estructura_condicional_when`

fun main() {
    println("ingrese primer nota")
    val nota1 = readln().toInt()
    println("ingrese segunda nota")
    val nota2 = readln().toInt()
    println("ingrese tercera nota")
    val nota3 = readln().toInt()
    val promedio = (nota1+nota2+nota3) / 3
    when {
        promedio >= 7 -> println("promocionado")
        promedio >= 4 -> println("regular")
        else -> println("reprobado")
    }

}