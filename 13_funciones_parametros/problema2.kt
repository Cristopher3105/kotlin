package `13_funciones_parametros`

fun ordenarMenorMayor(a: Int, b: Int, c: Int){
    when{
        a <= b&& a <= c->{
            if(b<=c) {
                println("ordenados de menor a mayor : $a, $b, $c")
            }else{
                println("ordenados de menor a mayor: $a, $c, $b")

            }
        }
        b<= a && b<= c->{
            if (a <= c) {
                println("ordenados de menor a mayor: $b, $a, $c")
            }else{
                println("ordenados de menor a mayor: $b, $c; $a")
            }
        }
        else -> {
            if (a <= b) {

                println(" ordenados de menor a mayor: $c, $a, $b")
            }else{
                println("ordenados de menor a mayor: $c, $b, $a")
         }
        }
    }
}
fun main(){
    println("ingrese el primer numero")
    val a = readLine()?.toIntOrNull() ?: 0
    println("ingrese el segundo numero")
    val b= readLine()?.toIntOrNull() ?: 0
    println("ingrese el tercer numero")
    val c = readLine()?.toIntOrNull() ?: 0
    ordenarMenorMayor(a, b, c)
} 