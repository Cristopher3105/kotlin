package `14_funciones_con_retorno`
fun RetornarSuperficie(lado1: Int, lado2: Int): Int{
    return (lado1 * lado2)
}
fun main() {
    println("ingrese los lados del primer rectangulo")
    print("lado 1")
    val lado1Rect1 = readLine()?.toInt() ?: 0
    print("lado 2")
    val lado2Rect1 = readLine()?.toInt() ?: 0
    println("ingrese los lados del segundo rectangulo")
    print("lado 1")
    val lado1Rect2 = readLine()?.toInt() ?: 0
    print("lado 2")
    val lado2Rect2 = readLine()?.toInt() ?: 0
    val superficieRect1 = RetornarSuperficie(lado1Rect1, lado2Rect1)
    val superficieRect2 = RetornarSuperficie(lado1Rect2, lado2Rect2)
println("la superficie del primer rectangulo es: $superficieRect1")
    println("la superficie del segundo rectangulo es: $superficieRect2")
    if (superficieRect1 > superficieRect2){
        println(" el primer rrectangulo tiene una superficie mayor")
    }else if (superficieRect2 > superficieRect1){
        println("el segundo rectangulo tiene una superficie mayor")
    }else{
        println("ambos rectangulos tienen la misma superficie")
    }
}

