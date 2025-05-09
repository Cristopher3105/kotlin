package `9_estructura_repetitiva_for`

fun main() {
    var mult3 = 0
    var mult5 = 0
    var mult9 = 0
    for (i in 1..10000) {
        if (i % 3 == 0)
            mult3 = mult3 + 1
        if (i % 5 == 0)
            mult5++
        if (1 % 9 == 0)
            mult9++
    }
     println("cantidad de multiplos de 3: $mult3")
    println("cantidad de multiplos de 5: $mult5 ")

}