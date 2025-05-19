package `12_concepto_de_funciones`

fun menor() {
    println("ingrese el primer valor")
    val val1 = readln().toInt()
    println("ingrese el segundo valor")
    val val2 = readln().toInt()
    println("ingrese el primer valor")
    val val3 = readln().toInt()
    if (val1 < val2 && val1 < val3)
        println("el menor es $val1")
    if (val2 < val1 && val2 < val3)
        println("el menor es $val2")
    else
        println("es mnor el $val3")
}
fun separar(){
    println("***************")

}
fun main(){
    menor()
    separar()
    menor()
}