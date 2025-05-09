package `9_estructura_repetitiva_for`

fun main() {
    var equilatero = 0
    var isosceles = 0
    var escalenos = 0
    println(" ingrese la cantidad de triangulos")
    val n= readLine()?.toInt() ?: 0
    for (i in 1..n ) {
        println("ingrese el lado 1 del triangulo $i")
        val lado1 = readLine()?.toInt()?: 0
        print(" ingrese el lado 2 del triangulo")
        val lado2 = readLine()?.toInt()?: 0
        println("ingrese el lado 3 del triangulo $i")
        val lado3 = readLine()?.toInt()?: 0
        if(lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1){
            if(lado1 == lado2 && lado2 == lado3){
                println("el triangulo $i es equilatero")
                equilatero++
            }else if (lado1 == lado2  )
    }
}