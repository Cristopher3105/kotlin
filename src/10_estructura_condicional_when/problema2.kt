package `10_estructura_condicional_when`

fun main() {
var num1 = 0
var num2 = 0
var num3 = 0
    var total = 0
for(i in 1..5){
    println("digite un numero")
    val num1 = readln().toInt()
    println("digte un numero")
    val num2 = readln().toInt()
    println("digte un numero")
    val num3 = readln().toInt()
    when{
        num1 > num2 && num1 > num3 -> {
            total += num2
        }
        num2 > num1 && num2 > num3 -> {
            total += num2
        }
        else -> {
            total+= num3
        }
    }
   }
}
