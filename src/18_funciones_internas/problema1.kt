package `18_funciones_internas`

fun encontrarMayor(a: Int, b: Int): Int{
    return if (a > b) a else b

}

fun main(){
    for(i in 1..5){
        print("ingrese el primer numero del par $i")
        val a = readln().toInt()
        print("ingrese el segundo numero del par $i")
        val b = readln().toInt()
        val mayor = encontrarMayor(a,b)
        println("el mayor entre   $a y $b es: $mayor")
        println()

    }

}