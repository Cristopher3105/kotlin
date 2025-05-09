package `9_estructura_repetitiva_for`

fun main() {
    var suma = 0
    for (i in 1 ..10 ) {
        print(" ingrese numero $i:")
        val numero = readLine()?.toInt()?:0
        if (i > 5){
            suma+=numero

        }
    }
    print("la suma de los ultimos 5 numeros  es: $suma")
}