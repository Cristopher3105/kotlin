package `2`.Entrada_de_datos
fun main(){
/*
escribir un prgrama en el cual se ingresan cuatro numeros enteros, calcular e informar la suma de los primeros
y el producto del tercero y el cuarto

 */
println("ingrese otro numero:")
    val variable1: Int = readln().toInt()
    println("ingrese otro numero:")
    val variable2: Int = readln().toInt()
    println("ingrese otror numero:")
    val variable3: Int = readln().toInt()
     println("ingrese otro numero")
    val variable4: Int = readln().toInt()
    val suma: Int = variable1 + variable2
    val producto: Int = variable3 * variable4
    println("la suma de $variable1 y $variable2 es $suma")
    println("el producto de $variable3 X $variable4 es $producto")
}