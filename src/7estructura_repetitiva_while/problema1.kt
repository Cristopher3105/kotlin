package estructura_repetitiva_while

fun main() {
 var mayor=0
 var menor=0
 var x=0
 while(x <= 9) {
     println("ingresar una nota")
     var nota= readln().toInt()
     if(nota >= 7){
         mayor = mayor + 1
     }else
         menor = menor + 1
     x = x +1
     nota = 0
 }
    println("las notas mayores son $mayor")
    println("las notas menores son $menor")
}